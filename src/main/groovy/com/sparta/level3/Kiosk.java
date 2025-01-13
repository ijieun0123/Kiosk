package com.sparta.level3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start(){

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
