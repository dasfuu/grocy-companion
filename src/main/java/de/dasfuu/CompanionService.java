package de.dasfuu;

import de.dasfuu.grocy.GrocyProduct;
import de.dasfuu.openfoodfacts.OFFProduct;
import de.dasfuu.openfoodfacts.OFFProductResult;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.xml.bind.SchemaOutputResolver;

@ApplicationScoped
public class CompanionService {
    @Inject
    OFFService offService;
    @Inject
    GrocyService grocyService;
    
    @Inject
    MQTTService mqttService;
    
    public static ScannerMode currentMode;
    public void onScan(String barcode) {
        System.out.println("Scan: "+barcode);

        if(barcode.startsWith("GROCY-") || barcode.startsWith("SET-")) {
            if(barcode.equals("GROCY-ADD")) {
                currentMode = ScannerMode.INCREASE;
            } else if(barcode.equals("GROCY-REMOVE")) {
                currentMode = ScannerMode.DECREASE;
            }

            return;
        }

        onProductScan(barcode);

    }

    private void onProductScan(String barcode) {
        switch (currentMode) {
            case INCREASE -> increaseProduct(barcode);
            case DECREASE -> decreaseProduct(barcode);
        }
    }

    private void increaseProduct(String barcode) {
        boolean existsInGrocy = grocyService.checkProduct(barcode);

        if(!existsInGrocy) {
            OFFProduct offProduct = offService.getProduct(barcode);
            if(offProduct == null) {
                status("Produkt nicht gefunden.");
                return;
            }
            GrocyProduct product = grocyService.createProduct(offProduct);
            if(product != null){
                status("Neues Produkt: "+product.getName());
            } else {
                status("Fehler beim Anlegen des Produktes: "+offProduct.getProductName());
                return;
            }
        }

        if(grocyService.increaseProduct(barcode)){
            if(existsInGrocy) {
                status("Produkt erhöht");
            }
        } else {
            status("Fehler beim erhöhen");
        }

    }
    private void decreaseProduct(String barcode) {
        boolean existsInGrocy = grocyService.checkProduct(barcode);

        if(!existsInGrocy) {
            OFFProduct offProduct = offService.getProduct(barcode);
            if(offProduct == null) {
                status("Produkt nicht gefunden.");
                return;
            }
            GrocyProduct product = grocyService.createProduct(offProduct);
            if(product != null){
                status("Neues Produkt: "+product.getName());
            } else {
                status("Fehler beim Anlegen des Produktes: "+offProduct.getProductName());
                return;
            }
        }

        if(existsInGrocy) {
            if(grocyService.decreaseProduct(barcode)){
                status("Produkt verringert");
            } else {
                status("Fehler beim verringern");
            }
        }
    }

    public void status(String message) {
        mqttService.printStatus(message);
    }


}
