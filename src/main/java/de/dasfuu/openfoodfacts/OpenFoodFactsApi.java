package de.dasfuu.openfoodfacts;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * To use it via injection.
 *
 * {@code
 *     @Inject
 *     @RestClient
 *     MyRemoteService myRemoteService;
 *
 *     public void doSomething() {
 *         Set<MyRemoteService.Extension> restClientExtensions = myRemoteService.getExtensionsById("io.quarkus:quarkus-rest-client");
 *     }
 * }
 */
@RegisterRestClient(configKey="openfoodfacts-api")
public interface OpenFoodFactsApi {


    //https://world.openfoodfacts.org/api/v0/product/8076809513388.json
    @GET
    @Path("/product/{code}.json")
    OFFProductResult getProductByCode(@PathParam("code") String productCode);

}
