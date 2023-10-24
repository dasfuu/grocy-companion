package de.dasfuu.grocy;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.ext.ClientHeadersFactory;

import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

public class GrocyHeaderFactory implements ClientHeadersFactory {

    @ConfigProperty(name = "grocy.api-key")
    String grocyApiKey;

    @Override
    public MultivaluedMap<String, String> update(MultivaluedMap<String, String> multivaluedMap, MultivaluedMap<String, String> multivaluedMap1) {
        MultivaluedMap<String, String> result = new MultivaluedHashMap<>();
        result.add("GROCY-API-KEY", grocyApiKey);
        return result;
    }
}
