package de.dasfuu;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.runtime.Startup;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.paho.client.mqttv3.*;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.UUID;

@ApplicationScoped
@Startup
public class MQTTService {

    @ConfigProperty(name = "mqtt.host", defaultValue = "")
    String mqttHost;
    @ConfigProperty(name = "mqtt.username", defaultValue = "")
    String mqttUsername;
    @ConfigProperty(name = "mqtt.password", defaultValue = "")
    String mqttPassword;
    @ConfigProperty(name = "mqtt.topic.barcode-server", defaultValue = "")
    String barcodeServerTopic;
    @ConfigProperty(name = "mqtt.topic.barcode", defaultValue = "")
    String barcodeTopic;

    @ConfigProperty(name = "mqtt.topic.last", defaultValue = "")
    String lastTopic;

    @ConfigProperty(name = "mqtt.topic.trigger", defaultValue = "")
    String triggerTopic;
    @ConfigProperty(name = "mqtt.topic.status", defaultValue = "")
    String statusTopic;
    @ConfigProperty(name = "mqtt.client-id", defaultValue = "grocy-companion")
    String clientId;

    private MqttClient client;

    @Inject
    CompanionService companionService;

    @PostConstruct
    public void init() {
        try {
            String publisherId = clientId;
            if(publisherId.isBlank()) {
                publisherId = UUID.randomUUID().toString();
            }

            client = new MqttClient("tcp://"+mqttHost, publisherId);

            MqttConnectOptions options = new MqttConnectOptions();
            options.setAutomaticReconnect(true);
            options.setCleanSession(true);
            options.setConnectionTimeout(10);
            options.setPassword(mqttPassword.toCharArray());
            options.setUserName(mqttUsername);
            client.connect(options);

            System.out.println("MQTT Connect to "+options);

            subscribe();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void subscribe() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            System.out.println("Subscribe to "+barcodeTopic);
            client.subscribe(barcodeTopic, (s, mqttMessage) -> {
                try {
                    String barcode = new String(mqttMessage.getPayload());
                    printLast(barcode);
                    companionService.onScan(barcode);
                    sendTrigger();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Subscribe to "+barcodeServerTopic);
            client.subscribe(barcodeServerTopic, (s, mqttMessage) -> {
                try {
                    String payload = new String(mqttMessage.getPayload());
                    BarcodeServerMessage message = mapper.readValue(payload, BarcodeServerMessage.class);
                    printLast(message.getBarcode());
                    companionService.onScan(message.getBarcode());
                    sendTrigger();
                } catch (Exception e){
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printStatus(String status) {
        try {
            System.out.println(status);
            if ( !client.isConnected()) {
                return;
            }
            MqttMessage msg = new MqttMessage(status.getBytes(Charset.defaultCharset()));
            msg.setQos(2);
            msg.setRetained(false);
            client.publish(statusTopic, msg);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public void printLast(String last) {
        try {
            System.out.println(last);
            if ( !client.isConnected()) {
                return;
            }
            MqttMessage msg = new MqttMessage(last.getBytes(Charset.defaultCharset()));
            msg.setQos(2);
            msg.setRetained(false);
            client.publish(lastTopic, msg);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public void sendTrigger() {
        try {
            if ( !client.isConnected()) {
                return;
            }
            MqttMessage msg = new MqttMessage((System.currentTimeMillis()+"").getBytes(Charset.defaultCharset()));
            msg.setQos(2);
            msg.setRetained(false);
            client.publish(triggerTopic, msg);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

}
