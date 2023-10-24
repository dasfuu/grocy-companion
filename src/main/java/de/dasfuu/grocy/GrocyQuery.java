package de.dasfuu.grocy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GrocyQuery {

//    {
//        "product": {
//        "id": "10",
//                "name": "Barilla Arrabbiata",
//                "description": "Tomatensauce mit Chilischoten - Tomatenfruchtfleisch 82%, Tomatenmarkkonzentrat 7,9%, Sonnenblumenöl, rote Gemüsepaprika, Knoblauch, Salz, Petersilie, Zucker, Chillischoten 0,1%",
//                "product_group_id": "12",
//                "active": "1",
//                "location_id": "2",
//                "shopping_location_id": "",
//                "qu_id_purchase": "5",
//                "qu_id_stock": "5",
//                "qu_factor_purchase_to_stock": "1.0",
//                "min_stock_amount": "4",
//                "default_best_before_days": "-1",
//                "default_best_before_days_after_open": "0",
//                "default_best_before_days_after_freezing": "-1",
//                "default_best_before_days_after_thawing": "0",
//                "picture_file_name": "rj1z4uic7yw5kpb97xqa892e05f0-1628-4f38-8eec-8c46eac06faa.jpeg",
//                "enable_tare_weight_handling": "0",
//                "tare_weight": "0.0",
//                "not_check_stock_fulfillment_for_recipes": "0",
//                "parent_product_id": null,
//                "calories": "0",
//                "cumulate_min_stock_amount_of_sub_products": "0",
//                "due_type": "1",
//                "quick_consume_amount": "1.0",
//                "hide_on_stock_overview": "0",
//                "default_stock_label_type": "0",
//                "should_not_be_frozen": "0",
//                "row_created_timestamp": "2022-01-23 18:11:22",
//                "treat_opened_as_out_of_stock": "1"
//    },
//        "product_barcodes": [
//        {
//            "id": "6",
//                "product_id": "10",
//                "barcode": "8076809513388",
//                "qu_id": null,
//                "amount": "1.0",
//                "shopping_location_id": "",
//                "last_price": null,
//                "row_created_timestamp": "2022-01-23 18:11:22",
//                "note": "EAN"
//        }
//  ],
//        "last_purchased": "2023-01-20",
//            "last_used": "2023-02-01",
//            "stock_amount": "9",
//            "stock_value": "0.0",
//            "stock_amount_opened": "0",
//            "stock_amount_aggregated": "9.0",
//            "stock_amount_opened_aggregated": "0.0",
//            "default_quantity_unit_purchase": {
//        "id": "5",
//                "name": "Glas",
//                "description": "",
//                "row_created_timestamp": "2022-01-23 19:12:18",
//                "name_plural": "Gläser",
//                "plural_forms": null
//    },
//        "quantity_unit_stock": {
//        "id": "5",
//                "name": "Glas",
//                "description": "",
//                "row_created_timestamp": "2022-01-23 19:12:18",
//                "name_plural": "Gläser",
//                "plural_forms": null
//    },
//        "last_price": null,
//            "avg_price": null,
//            "oldest_price": null,
//            "last_shopping_location_id": null,
//            "default_shopping_location_id": "",
//            "next_due_date": "2999-12-31",
//            "location": {
//        "id": "2",
//                "name": "Vorratsschrank  Lebensmittel",
//                "description": "",
//                "row_created_timestamp": "2022-01-21 18:27:48",
//                "is_freezer": ""
//    },
//        "average_shelf_life_days": 357062,
//            "spoil_rate_percent": 0,
//            "is_aggregated_amount": "0",
//            "has_childs": false
//    }

    @JsonProperty("error_message")
    String errorMessage;
    @JsonProperty("stock_amount")
    String stockAmount;
    @JsonProperty("last_purchased")
    String lastPurchased;
    @JsonProperty("last_used")
    String lastUsed;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(String stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getLastPurchased() {
        return lastPurchased;
    }

    public void setLastPurchased(String lastPurchased) {
        this.lastPurchased = lastPurchased;
    }

    public String getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(String lastUsed) {
        this.lastUsed = lastUsed;
    }
}
