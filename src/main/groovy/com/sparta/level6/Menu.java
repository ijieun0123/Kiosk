package com.sparta.level6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Menu {
    private final String categoryName;
    private List<MenuItem> menuItems = new ArrayList<>();

    public Menu(String categoryName, List<MenuItem> menuItems){
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    public void getMenuItemsEl(){
        AtomicInteger index = new AtomicInteger(0);
        menuItems.stream().forEach((item) -> {
            int i = index.getAndIncrement();
            System.out.println((i + 1) + ". " + menuItems.get(i).getName() + "   | W " + menuItems.get(i).getPrice() + " | " + menuItems.get(i).getDescription());
        });
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
