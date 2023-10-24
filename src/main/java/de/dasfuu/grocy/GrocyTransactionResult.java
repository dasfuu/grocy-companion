package de.dasfuu.grocy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GrocyTransactionResult {

//    {
//        "id": 0,
//            "product_id": 0,
//            "amount": 0,
//            "best_before_date": "2023-02-12",
//            "purchased_date": "2023-02-12T21:09:18.443Z",
//            "used_date": "2023-02-12",
//            "spoiled": false,
//            "stock_id": "string",
//            "transaction_id": "string",
//            "transaction_type": "purchase",
//            "row_created_timestamp": "2023-02-12T21:09:18.443Z"
//    }

    @JsonProperty("error_message")
    String errorMessage;
    @JsonProperty("product_id")
    int productID;
    @JsonProperty("id")
    int id;
    @JsonProperty("amount")
    int amount;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
