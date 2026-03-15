package org.pdrake.starbucksbackend.entity;

import java.util.ArrayList;

public class Cart {
    private Integer id;
    private Integer userId;
    private Integer storeId;
    private ArrayList<ItemRef> products = new ArrayList<>();

    public Cart(Integer userId, Integer storeId) {
        this.userId = userId;
        this.storeId = storeId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getStoreId() {
        return storeId;
    }
}
