package com.sparta.level4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final String categoryName;
    private List<MenuItem> menuItems = new ArrayList<>();

    public Menu(String categoryName, List<MenuItem> menuItems){
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    public void getMenuItemsEl(){
        for(int i=0; i<menuItems.size(); i++){
            System.out.println((i + 1) + ". " + menuItems.get(i).getName() + "   | W " + menuItems.get(i).getPrice() + " | " + menuItems.get(i).getDescription());
        }
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
