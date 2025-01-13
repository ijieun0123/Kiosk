package com.sparta.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<MenuItem> menuItems = new ArrayList<>();

        MenuItem menu1 = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menu2 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menu3 = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menu4 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        menuItems.add(menu1);
        menuItems.add(menu2);
        menuItems.add(menu3);
        menuItems.add(menu4);

        while(true){

            System.out.println("[ SHAKESHACK MENU ]");
            for(int i=0; i<menuItems.size(); i++){
                System.out.println((i + 1) + ". " + menuItems.get(i).getName() + "   | W " + menuItems.get(i).getPrice() + " | " + menuItems.get(i).getDescription());
            }
            System.out.println("0. 종료      | 종료");
            System.out.println("메뉴를 선택하세요.");

            Scanner in = new Scanner(System.in);
            int inputNum = in.nextInt();

            if(inputNum == 0){
                System.out.println("프로그램을 종료");
                break;
            } else if(inputNum == 1){
                System.out.println("선택한 메뉴 : " + menuItems.get(0).getName() + " | W " + menuItems.get(0).getPrice() + " | " + menuItems.get(0).getDescription());
                System.out.println();
            } else if(inputNum == 2){
                System.out.println("선택한 메뉴 : " + menuItems.get(1).getName() + " | W " + menuItems.get(1).getPrice() + " | " + menuItems.get(1).getDescription());
                System.out.println();
            } else if(inputNum == 3){
                System.out.println("선택한 메뉴 : " + menuItems.get(2).getName() + " | W " + menuItems.get(2).getPrice() + " | " + menuItems.get(2).getDescription());
                System.out.println();
            } else if(inputNum == 4){
                System.out.println("선택한 메뉴 : " + menuItems.get(3).getName() + " | W " + menuItems.get(3).getPrice() + " | " + menuItems.get(3).getDescription());
                System.out.println();
            } else {
                System.out.println("0 ~ 4 까지 숫자를 입력하세요.");
            }
        }
    }
}
