package org.pdrake.starbucksbackend.entity;

public class OrderRef {
    private Integer itemId;
    private Integer quantity;

    public OrderRef(Integer itemId, Integer quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public Integer getItemId() {
        return itemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
