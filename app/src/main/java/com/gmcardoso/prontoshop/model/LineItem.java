package com.gmcardoso.prontoshop.model;

/**
 * Created by guilherme on 18/04/2017.
 */

public class LineItem extends Product {
    private int quantity;

    public LineItem() {}

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSumPrice() {
        return getSalePrice() * quantity;
    }
}
