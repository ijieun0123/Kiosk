package com.sparta.level6;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<MenuItem> cartItems = new ArrayList<>();

    public Cart(List<MenuItem> cartItems) {
        this.cartItems = cartItems;
    }

    public List<MenuItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<MenuItem> cartItems) {
        this.cartItems = cartItems;
    }
}
