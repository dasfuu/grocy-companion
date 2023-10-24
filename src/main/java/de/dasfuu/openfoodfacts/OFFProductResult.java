package de.dasfuu.openfoodfacts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OFFProductResult {

    @JsonProperty("code")
    private String code;
    @JsonProperty("status")
    private int status;
    @JsonProperty("status_verbose")
    private String status_verbose;

    @JsonProperty("product")
    private OFFProduct product;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus_verbose() {
        return status_verbose;
    }

    public void setStatus_verbose(String status_verbose) {
        this.status_verbose = status_verbose;
    }

    public OFFProduct getProduct() {
        return product;
    }

    public void setProduct(OFFProduct product) {
        this.product = product;
    }
}
