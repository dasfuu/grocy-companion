package de.dasfuu;

import de.dasfuu.grocy.*;
import de.dasfuu.openfoodfacts.OFFProduct;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class GrocyService {
    @Inject
    @RestClient
    GrocyApi grocyApi;

    public boolean checkProduct(String barcode) {
        try {
            GrocyQuery productByCode = grocyApi.getProductByCode(barcode);
            return !exists(productByCode.getErrorMessage());
        } catch (Exception e){
            if(!e.getMessage().equals("Unknown error, status code 400")) {
                e.printStackTrace();
            }
            return false;
        }
    }
    public GrocyProduct createProduct(OFFProduct offProduct) {

        String productName = offProduct.getBrands()+" "+offProduct.getProductName();
        productName = productName.trim();
        String description = offProduct.getGenericName()+" --- Inhaltsstoffe: "+offProduct.getIngredientsText();
        description = description.trim();

        GrocyProduct newProduct = new GrocyProduct();

        newProduct.setName(productName);
        newProduct.setDescription(description);
        newProduct.setProductGroupID(3);
        newProduct.setQu_id_purchase(3);
        newProduct.setQu_id_stock(3);
        newProduct.setLocation_id(4);
        newProduct.setCalories(0);

        try  {
            GrocyCreateResult createResult = grocyApi.createProduct(newProduct);

            GrocyBarcode barcode = new GrocyBarcode();
            barcode.setBarcode(offProduct.getCode());
            barcode.setProductID(createResult.getCreatedObjectID());
            grocyApi.addBarcode(barcode);

            GrocyQuery productByID = grocyApi.getProductByID(createResult.getCreatedObjectID());
            if(productByID.getErrorMessage() != null && !productByID.getErrorMessage().isBlank()){
                //Something went wrong
                return null;
            }

            return newProduct;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public boolean increaseProduct(String barcode) {
        return changeProductAmount(barcode, 1);
    }
    public boolean decreaseProduct(String barcode) {
        return changeProductAmount(barcode, -1);
    }

    public boolean changeProductAmount(String barcode, int amount) {
        GrocyTransaction transaction = new GrocyTransaction();
        transaction.setAmount(amount);

        try  {
            if(amount > 0) {
                transaction.setTransactionType(GrocyTransaction.TRANSACTION_PURCHASE);
                transaction.setAmount(Math.abs(amount));
                List<GrocyTransactionResult> result = grocyApi.add(barcode, transaction);
                return result.size() > 0;
            } else if(amount < 0){
                transaction.setTransactionType(GrocyTransaction.TRANSACTION_CONSUME);
                transaction.setAmount(Math.abs(amount));
                List<GrocyTransactionResult> result = grocyApi.consume(barcode, transaction);
                return result.size() > 0;
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }

        return true;
    }
    private boolean exists(String value) {
        return value != null && !value.isBlank();
    }
}
