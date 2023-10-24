package de.dasfuu.grocy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GrocyCreateResult {
    @JsonProperty("created_object_id")
    long createdObjectID;

    public long getCreatedObjectID() {
        return createdObjectID;
    }
    public void setCreatedObjectID(long createdObjectID) {
        this.createdObjectID = createdObjectID;
    }

}
