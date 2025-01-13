package com.sparta.level4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    void start(List<Menu> menu){
        Scanner in = new Scanner(System.in);
        String[] menuArr = {"[ BURGERS MENU ]", "[ DRINKS MENU ]", "[ DESSERTS MENU ]"};

        while(true){

            System.out.println("[ MAIN MENU ]");
            for(int i=0; i<menu.size(); i++){
                System.out.println((i + 1) + ". " + menu.get(i).getCategoryName());
            }
            System.out.println("0. 종료      | 종료");

            int firstNum = in.nextInt();
            if(firstNum == 0){
                System.out.println("프로그램 종료.");
                break;
            } else if(firstNum == 1 || firstNum == 2 || firstNum == 3){
                getFirstResult(menuArr, menu, firstNum);
                getSecondResult(menu, in, firstNum);
            }  else {
                System.out.println("0 ~ 3 숫자를 입력하세요.");
                start(menu);
            }
            break;
        }
    }

    void getFirstResult(String[] menuArr, List<Menu> menu, int firstNum){
        System.out.println(menuArr[firstNum-1]);
        menu.get(firstNum-1).getMenuItemsEl();
        System.out.println("0. 뒤로가기");
    }

    void getSecondResult(List<Menu> menu, Scanner in, int firstNum){
        int secondNum = in.nextInt();
        if(secondNum == 0){
            start(menu);
        } else if(secondNum == 1 || secondNum == 2 || secondNum == 3 || secondNum == 4){
            getSelectMenu(menu, firstNum, secondNum);
            start(menu);
        } else{
            System.out.println("0 ~ 4 숫자를 입력하세요.");
            getSecondResult(menu, in, firstNum);
        }
    }
    void getSelectMenu(List<Menu> menu, int firstNum, int secondNum){
        System.out.println("선택한 메뉴 : " + menu.get(firstNum-1).getMenuItems().get(secondNum-1).getName() + " | " + menu.get(firstNum-1).getMenuItems().get(secondNum-1).getPrice() + " | " + menu.get(firstNum-1).getMenuItems().get(secondNum-1).getDescription());
        System.out.println();
    }
}
