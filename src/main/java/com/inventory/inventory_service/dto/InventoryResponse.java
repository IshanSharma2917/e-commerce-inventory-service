package com.inventory.inventory_service.dto;

public class InventoryResponse {

    private String skucode;
    private boolean isInstock;

    public String getSkucode() {
        return skucode;
    }

    public void setSkucode(String skucode) {
        this.skucode = skucode;
    }

    public boolean isInstock() {
        return isInstock;
    }

    public void setInstock(boolean isInstock) {
        this.isInstock = isInstock;
    }

    public InventoryResponse(String skucode, boolean isInstock) {
        super();
        this.skucode = skucode;
        this.isInstock = isInstock;
    }

    public InventoryResponse() {
        super();
    }
}