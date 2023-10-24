package de.dasfuu;

import de.dasfuu.openfoodfacts.OFFProduct;
import de.dasfuu.openfoodfacts.OFFProductResult;
import de.dasfuu.openfoodfacts.OpenFoodFactsApi;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class OFFService {
    @Inject
    @RestClient
    OpenFoodFactsApi openFoodFactsApi;
    public OFFProduct getProduct(String code) {
        try {
            OFFProductResult productByCode = openFoodFactsApi.getProductByCode(code);
            if(productByCode.getStatus() == 1) {
                OFFProduct product = productByCode.getProduct();

                if(exists(product.getProductNameDe())) {
                    product.setProductName(product.getProductNameDe());
                }
                if(exists(product.getIngredientsTextDe())) {
                    product.setIngredientsText(product.getIngredientsTextDe());
                }
                if(exists(product.getGenericNameDe())) {
                    product.setGenericName(product.getGenericNameDe());
                }

                return product;
            }

            return null;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    private boolean exists(String value) {
        return value != null && !value.isBlank();
    }

}
