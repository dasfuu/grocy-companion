package de.dasfuu.grocy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GrocyProduct {

        @JsonProperty("name")
        private String name;
        @JsonProperty("description")
        private String description;
//        "product_group_id": "3",
        @JsonProperty("product_group_id")
        private int productGroupID;
        @JsonProperty("active")
        private int active = 1;
//        "qu_id_purchase": "3",
        @JsonProperty("qu_id_purchase")
        private int qu_id_purchase;
//        "qu_id_stock": "3",
        @JsonProperty("qu_id_stock")
        private int qu_id_stock;
        @JsonProperty("qu_factor_purchase_to_stock")
        private int qu_factor_purchase_to_stock = 1;;
//        "location_id": "4",
        @JsonProperty("location_id")
        private int location_id;
        @JsonProperty("shopping_location_id")
        private int shopping_location_id = 0;
        @JsonProperty("default_best_before_days")
        private int default_best_before_days = -1;
        @JsonProperty("default_best_before_days_after_open")
        private int default_best_before_days_after_open = 0;
        @JsonProperty("default_best_before_days_after_freezing")
        private int default_best_before_days_after_freezing = -1;
        @JsonProperty("default_best_before_days_after_thawing")
        private int default_best_before_days_after_thawing = 0;
        @JsonProperty("cumulate_min_stock_amount_of_sub_products")
        private int cumulate_min_stock_amount_of_sub_products = 0;
        @JsonProperty("due_type")
        private int due_type = 1;
        @JsonProperty("quick_consume_amount")
        private int quick_consume_amount = 1;
        @JsonProperty("hide_on_stock_overview")
        private int hide_on_stock_overview = 0;
        @JsonProperty("default_stock_label_type")
        private int default_stock_label_type = 0;
        @JsonProperty("calories")
        private int calories = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductGroupID() {
        return productGroupID;
    }

    public void setProductGroupID(int productGroupID) {
        this.productGroupID = productGroupID;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getQu_id_purchase() {
        return qu_id_purchase;
    }

    public void setQu_id_purchase(int qu_id_purchase) {
        this.qu_id_purchase = qu_id_purchase;
    }

    public int getQu_id_stock() {
        return qu_id_stock;
    }

    public void setQu_id_stock(int qu_id_stock) {
        this.qu_id_stock = qu_id_stock;
    }

    public int getQu_factor_purchase_to_stock() {
        return qu_factor_purchase_to_stock;
    }

    public void setQu_factor_purchase_to_stock(int qu_factor_purchase_to_stock) {
        this.qu_factor_purchase_to_stock = qu_factor_purchase_to_stock;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public int getShopping_location_id() {
        return shopping_location_id;
    }

    public void setShopping_location_id(int shopping_location_id) {
        this.shopping_location_id = shopping_location_id;
    }

    public int getDefault_best_before_days() {
        return default_best_before_days;
    }

    public void setDefault_best_before_days(int default_best_before_days) {
        this.default_best_before_days = default_best_before_days;
    }

    public int getDefault_best_before_days_after_open() {
        return default_best_before_days_after_open;
    }

    public void setDefault_best_before_days_after_open(int default_best_before_days_after_open) {
        this.default_best_before_days_after_open = default_best_before_days_after_open;
    }

    public int getDefault_best_before_days_after_freezing() {
        return default_best_before_days_after_freezing;
    }

    public void setDefault_best_before_days_after_freezing(int default_best_before_days_after_freezing) {
        this.default_best_before_days_after_freezing = default_best_before_days_after_freezing;
    }

    public int getDefault_best_before_days_after_thawing() {
        return default_best_before_days_after_thawing;
    }

    public void setDefault_best_before_days_after_thawing(int default_best_before_days_after_thawing) {
        this.default_best_before_days_after_thawing = default_best_before_days_after_thawing;
    }

    public int getCumulate_min_stock_amount_of_sub_products() {
        return cumulate_min_stock_amount_of_sub_products;
    }

    public void setCumulate_min_stock_amount_of_sub_products(int cumulate_min_stock_amount_of_sub_products) {
        this.cumulate_min_stock_amount_of_sub_products = cumulate_min_stock_amount_of_sub_products;
    }

    public int getDue_type() {
        return due_type;
    }

    public void setDue_type(int due_type) {
        this.due_type = due_type;
    }

    public int getQuick_consume_amount() {
        return quick_consume_amount;
    }

    public void setQuick_consume_amount(int quick_consume_amount) {
        this.quick_consume_amount = quick_consume_amount;
    }

    public int getHide_on_stock_overview() {
        return hide_on_stock_overview;
    }

    public void setHide_on_stock_overview(int hide_on_stock_overview) {
        this.hide_on_stock_overview = hide_on_stock_overview;
    }

    public int getDefault_stock_label_type() {
        return default_stock_label_type;
    }

    public void setDefault_stock_label_type(int default_stock_label_type) {
        this.default_stock_label_type = default_stock_label_type;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
