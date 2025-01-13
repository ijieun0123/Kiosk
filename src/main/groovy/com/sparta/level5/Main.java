package com.sparta.level5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> burgerItems = new ArrayList<>();
        List<MenuItem> drinkItems = new ArrayList<>();
        List<MenuItem> dessertItems = new ArrayList<>();

        Menu burgers = new Menu("Burgers", burgerItems);
        Menu drinks = new Menu("Drinks", drinkItems);
        Menu desserts = new Menu("Desserts", dessertItems);

        Kiosk kiosk = new Kiosk();

        burgers.getMenuItems().add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.getMenuItems().add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.getMenuItems().add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.getMenuItems().add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        drinks.getMenuItems().add(new MenuItem("Coke", 1.2, "코카콜라"));
        drinks.getMenuItems().add(new MenuItem("Cider", 1.1, "사이다"));
        drinks.getMenuItems().add(new MenuItem("Americano", 1.3, "아메리카노"));
        drinks.getMenuItems().add(new MenuItem("Fanta", 1.2, "환타"));

        desserts.getMenuItems().add(new MenuItem("Cake", 5.5, "케이크"));
        desserts.getMenuItems().add(new MenuItem("Pie", 6.0, "파이"));
        desserts.getMenuItems().add(new MenuItem("Ice Cream", 3.5, "아이스크림"));
        desserts.getMenuItems().add(new MenuItem("Potato Chips", 1.9, "감자칩"));

        List<Menu> menu = new ArrayList<>();

        menu.add(burgers);
        menu.add(drinks);
        menu.add(desserts);

        kiosk.start(menu);
    }
}
