package de.dasfuu.grocy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GrocyBarcode {
//    {
//        "id": 6,
//            "product_id": 10,
//            "barcode": "8076809513388",
//            "qu_id": 5,
//            "amount": 1,
//            "shopping_location_id": null,
//            "last_price": null,
//            "row_created_timestamp": "2022-01-23 18:11:22",
//            "note": "EAN"
//    }

    @JsonProperty("product_id")
    long productID;
    @JsonProperty("barcode")
    String barcode;
    @JsonProperty("amount")
    int amount = 1;
    @JsonProperty("shopping_location_id")
    String shoppingLocationID = "";
    @JsonProperty("note")
    String note = "EAN";

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getShoppingLocationID() {
        return shoppingLocationID;
    }

    public void setShoppingLocationID(String shoppingLocationID) {
        this.shoppingLocationID = shoppingLocationID;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
