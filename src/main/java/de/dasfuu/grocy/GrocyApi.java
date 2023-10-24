package de.dasfuu.grocy;

import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@RegisterRestClient(configKey="grocy-api")
@RegisterClientHeaders(GrocyHeaderFactory.class)
public interface GrocyApi {
    @GET
    @Path("/stock/products/by-barcode/{code}")
    GrocyQuery getProductByCode(@PathParam("code") String barcode);

    @GET
    @Path("/stock/products/{productId}")
    GrocyQuery getProductByID(@PathParam("productId") long id);
    @POST
    @Path("/objects/products")
    GrocyCreateResult createProduct(GrocyProduct productCode);

    @POST
    @Path("/objects/product_barcodes")
    GrocyCreateResult addBarcode(GrocyBarcode productCode);
    @POST
    @Path("/stock/products/by-barcode/{code}/add")
    List<GrocyTransactionResult> add(@PathParam("code") String barcode, GrocyTransaction productCode);
    @POST
    @Path("/stock/products/by-barcode/{code}/consume")
    List<GrocyTransactionResult> consume(@PathParam("code") String barcode, GrocyTransaction productCode);

}
