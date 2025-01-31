package com.sparta.level6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> cartItems = new ArrayList<>();
    private Cart cart = new Cart(cartItems);
    private Scanner in = new Scanner(System.in);

    void start(List<Menu> menu){

        String[] menuArr = {"[ BURGERS MENU ]", "[ DRINKS MENU ]", "[ DESSERTS MENU ]"};

        while(true){

            System.out.println("[ MAIN MENU ]");
            for(int i=0; i<menu.size(); i++){
                System.out.println((i + 1) + ". " + menu.get(i).getCategoryName());
            }
            System.out.println("0. 종료      | 종료");

            if(!cart.getCartItems().isEmpty()){
                System.out.println("[ ORDER MENU ]");
                System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
            }

            int firstNum = in.nextInt();
            if(firstNum == 0){
                System.out.println("프로그램 종료.");
                break;
            } else if(firstNum == 1 || firstNum == 2 || firstNum == 3){
                getBurgersDrinksDessertsMenu(menuArr, menu, firstNum);
                getSelectMenuAndCart(menu, firstNum);
            } else if (firstNum > 3 && cart.getCartItems().isEmpty()){
                System.out.println("0 ~ 3 숫자를 입력하세요.");
                start(menu);
            } else if (firstNum < 6 && firstNum > 3 && !cart.getCartItems().isEmpty()){
                getOrder(firstNum, menu);
                break;
            } else {
                System.out.println("0 ~ 5 숫자를 입력하세요.");
                start(menu);
            }
            break;
        }
    }

    void getBurgersDrinksDessertsMenu(String[] menuArr, List<Menu> menu, int firstNum){
        System.out.println(menuArr[firstNum-1]);
        menu.get(firstNum-1).getMenuItemsEl();
        System.out.println("0. 뒤로가기");
    }

    void getSelectMenuAndCart(List<Menu> menu, int firstNum){
        int secondNum = in.nextInt();
        if(secondNum == 0){
            start(menu);
        } else if(secondNum == 1 || secondNum == 2 || secondNum == 3 || secondNum == 4){
            getSelectMenu(menu, firstNum, secondNum);
            getCart(menu, firstNum, secondNum);
        } else{
            System.out.println("0 ~ 4 숫자를 입력하세요.");
            getSelectMenuAndCart(menu, firstNum);
        }
    }

    void getCart(List<Menu> menu, int firstNum, int secondNum){
        int thirdNum = in.nextInt();

        if(thirdNum == 1) {
            System.out.println("장바구니에 추가되었습니다.");

            String name = menu.get(firstNum-1).getMenuItems().get(secondNum-1).getName();
            double price = menu.get(firstNum-1).getMenuItems().get(secondNum-1).getPrice();

            boolean isExist = cart.getCartItems().stream().anyMatch(item -> item.getName().equals(name));

            if(isExist) {
                for(MenuItem menuItem : cart.getCartItems()){
                    if(menuItem.getName().equals(name)) menuItem.setAmount(menuItem.getAmount() + 1);
                }
            } else{
                cart.getCartItems().add(new MenuItem(name, price, 1));
            }

            for(MenuItem item : cart.getCartItems()){
                System.out.println(item.getName() + " | " + item.getPrice() + " | " + item.getAmount());
            }
            System.out.println();

        } else if(thirdNum == 2){
            System.out.println("취소되었습니다.");
            System.out.println();
        } else {
            System.out.println("1 ~ 2 숫자를 입력하세요.");
            getCart(menu, firstNum, secondNum);
        }

        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        start(menu);
    }

    void getOrder(int firstNum, List<Menu> menu){
        if(firstNum == 4){
            System.out.println("아래와 같이 주문하시겠습니까 ?");
            System.out.println();
            System.out.println("[ Orders ]");
            for(MenuItem item : cart.getCartItems()){
                System.out.println(item.getName() + " | " + item.getPrice() + " | " + item.getAmount());
            }
            System.out.println("[ Total ]");
            double totalAmount = 0;
            for (MenuItem item : cart.getCartItems()){
                totalAmount += item.getAmount() * item.getPrice();
            }
            System.out.println("W " + totalAmount);
            System.out.println();
            System.out.println("1. 주문      2. 메뉴판");

            int fourthNum = in.nextInt();
            if(fourthNum == 1){
                getSale(totalAmount);
            } else if(fourthNum == 2){
                start(menu);
            }
        } else if(firstNum == 5){
            cart.getCartItems().clear();
            System.out.println("주문이 취소되었습니다.");
            System.out.println();
            start(menu);
        }
    }

    void getSale(double totalAmount){
        System.out.println("할인 정보를 입력해주세요.");
        System.out.println("1. 국가유공자 : 10%");
        System.out.println("2. 군인     :  5%");
        System.out.println("3. 학생     :  3%");
        System.out.println("4. 일반     :  0%");

        int fifthNum = in.nextInt();
        if(fifthNum == 1){
            System.out.println("주문이 완료되었습니다. 금액은 W " + totalAmount * ( 1 - Sale.PERSON_OF_NATIONAL_MERIT.getDiscountRate() / 100 ) + " 입니다.");
        } else if(fifthNum == 2){
            System.out.println("주문이 완료되었습니다. 금액은 W " + totalAmount * ( 1 - Sale.SOLDIER.getDiscountRate() / 100 ) + " 입니다.");
        } else if(fifthNum == 3){
            System.out.println("주문이 완료되었습니다. 금액은 W " + totalAmount * ( 1 - Sale.STUDENT.getDiscountRate() / 100 ) + " 입니다.");
        } else if(fifthNum == 4){
            System.out.println("주문이 완료되었습니다. 금액은 W " + totalAmount * ( 1 - Sale.GENERAL.getDiscountRate() / 100 ) + " 입니다.");
        } else {
            System.out.println("1 ~ 4 숫자를 입력하세요.");
            getSale(totalAmount);
        }
    }

    void getSelectMenu(List<Menu> menu, int firstNum, int secondNum){
        System.out.println("선택한 메뉴 : " + menu.get(firstNum-1).getMenuItems().get(secondNum-1).getName() + " | " + menu.get(firstNum-1).getMenuItems().get(secondNum-1).getPrice() + " | " + menu.get(firstNum-1).getMenuItems().get(secondNum-1).getDescription());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까 ?");
        System.out.println("1. 확인        2. 취소");
    }
}
