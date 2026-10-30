//model folder	Defines data structures/entities
package com.quickrelief.model;

public class SupplyRequest {

    private Long id;
    private String itemName;
    private int quantity;
    private String status;
    private String requestedBy;

    public SupplyRequest() {
    }

    public SupplyRequest(Long id, String itemName, int quantity,
                         String status, String requestedBy) {
        this.id = id;
        this.itemName = itemName;
        this.quantity = quantity;
        this.status = status;
        this.requestedBy = requestedBy;
    }

    public Long getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }
}

