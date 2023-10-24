package de.dasfuu;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BarcodeServerMessage {

//    {
//        "id": "d135b4f2-d477-4ae9-ad4f-0d03ff78cab1",
//        "serverId": "vorratsschrank-1",
//        "date": "2023-02-12T20:49:45.674155",
//        "device": {
//            "name": "ARM CM0 USB HID Keyboard",
//            "path": "/dev/input/by-id/usb-ARM_CM0_USB_HID_Keyboard_8A2D1FD80F03-event-kbd",
//            "vendorId": " ffff",
//            "productId": " 035"
//          },
//        "barcode": "GROCY-ADD"
//    }

    @JsonProperty("id")
    String id;
    @JsonProperty("serverId")
    String serverId;
    @JsonProperty("date")
    String date;
    @JsonProperty("device")
    BarcodeServerDevice device;
    @JsonProperty("barcode")
    String barcode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BarcodeServerDevice getDevice() {
        return device;
    }

    public void setDevice(BarcodeServerDevice device) {
        this.device = device;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public static class BarcodeServerDevice {
        @JsonProperty("name")
        String name;
        @JsonProperty("path")
        String path;
        @JsonProperty("vendorId")
        String vendorId;
        @JsonProperty("productId")
        String productId;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getVendorId() {
            return vendorId;
        }

        public void setVendorId(String vendorId) {
            this.vendorId = vendorId;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }
    }
}
