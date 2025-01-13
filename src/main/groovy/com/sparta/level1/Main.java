package com.sparta.level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] menuArr = {
                "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거",
                "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
                "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거",
                "0. 종료      | 종료"
        };

        while(true){

            System.out.println("[ SHAKESHACK MENU ]");
            for(String menu : menuArr){
                System.out.println(menu);
            }
            System.out.println("메뉴를 선택하세요.");

            Scanner in = new Scanner(System.in);
            int inputNum = in.nextInt();

            if(inputNum == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if(inputNum == 1){
                System.out.println("선택한 메뉴 : " + menuArr[0]);
                System.out.println();
            } else if(inputNum == 2){
                System.out.println("선택한 메뉴 : " + menuArr[1]);
                System.out.println();
            } else if(inputNum == 3){
                System.out.println("선택한 메뉴 : " + menuArr[2]);
                System.out.println();
            } else if(inputNum == 4){
                System.out.println("선택한 메뉴 : " + menuArr[3]);
                System.out.println();
            } else{
                System.out.println("0 ~ 4 숫자를 입력하세요.");
                System.out.println();
            }
        }
    }
}
