package de.dasfuu;

import de.dasfuu.grocy.GrocyApi;
import de.dasfuu.grocy.GrocyQuery;
import de.dasfuu.openfoodfacts.OpenFoodFactsApi;
import de.dasfuu.openfoodfacts.OFFProductResult;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class GreetingResource {

    @Inject
    @RestClient
    OpenFoodFactsApi openFoodFactsApi;
    @Inject
    @RestClient
    GrocyApi grocyApi;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public OFFProductResult test() {
        OFFProductResult productByCode = openFoodFactsApi.getProductByCode("8711327373105");
        return productByCode;
    }
}