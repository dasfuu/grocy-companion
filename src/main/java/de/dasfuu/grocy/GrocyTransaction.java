package de.dasfuu.grocy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GrocyTransaction {

    public static final String TRANSACTION_PURCHASE = "purchase";
    public static final String TRANSACTION_CONSUME = "consume";

    @JsonProperty("amount")
    int amount = 1;
    @JsonProperty("transaction_type")
    String transactionType;

    public int getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
