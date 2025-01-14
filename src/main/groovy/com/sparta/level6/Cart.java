package com.sparta.level6;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<MenuItem> cartItems = new ArrayList<>();
    private double totalAmount;

    public Cart(List<MenuItem> cartItems) {
        this.cartItems = cartItems;
    }

    public List<MenuItem> getCartItems() {
        return cartItems;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setCartItems(List<MenuItem> cartItems) {
        this.cartItems = cartItems;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
