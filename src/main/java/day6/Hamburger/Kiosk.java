package day6.Hamburger;

import day6.VendingMachineApp.Drink;
import day6.teacherHamburger.Burger;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {

    Scanner sc = new Scanner(System.in);

    int total = 0;

    // 키오스트 첫 스타트
    public void introduce() {
        System.out.println("햄버거 키오스크");
        System.out.println("1. 햄버거 선택");
        System.out.println("2. 사이드 선택");
        System.out.println("3. 음료수 선택");
        System.out.println("4. 메뉴 취소");
        System.out.println("5. 주문 하기");
        System.out.println(" ====== 주문 목록 =====");
        System.out.print("버거: [ ");
        for (int i = 0; i < burgerCart.size(); i++) {
            Hamburger outputBurger = burgerCart.get(i);
            System.out.print(outputBurger.name + " ");
        }
        System.out.println("] ");
        System.out.print("사이드 : [");
        for (int i = 0; i < sidesCart.size(); i++) {
            Sides outputSides = sidesCart.get(i);
            System.out.print(outputSides.name + " ");
        }
        System.out.println("] ");
        System.out.println("음료수 : [");
        for (int i = 0; i < drinksCart.size(); i++) {
            Drinks outputDrinks = drinksCart.get(i);
            System.out.print(outputDrinks.name + " ");
        }
        System.out.println("] ");
        System.out.printf("총금액 : %d \n", total);
        System.out.print("무엇을 하시겠습니까 : ");
    }

    // 배열리스트
    // 배열은 관련있는거끼리 묶어서 사용하는게 효율적이다
    // 그러지 않는데 배열에 배열을 넣으면 더 복잡해질 수 있음

    ArrayList<Hamburger> hamburArr = new ArrayList<>();
    ArrayList<Hamburger> burgerCart = new ArrayList<>();
    ArrayList<Sides> sidesArr = new ArrayList<>();
    ArrayList<Sides> sidesCart = new ArrayList<>();
    ArrayList<Drinks> drinksArr = new ArrayList<>();
    ArrayList<Drinks> drinksCart = new ArrayList<>();


    public Kiosk() {
        Hamburger hambur1 = new Hamburger("한우불고기버거", 6000);
        Hamburger hambur2 = new Hamburger("치즈버거", 3000);
        Hamburger hambur3 = new Hamburger("치킨버거", 3500);
        Hamburger hambur4 = new Hamburger("새우버거", 3200);

        hamburArr.add(hambur1);
        hamburArr.add(hambur2);
        hamburArr.add(hambur3);
        hamburArr.add(hambur4);

        Sides sides1 = new Sides("감자튀김", 1800);
        Sides sides2 = new Sides("치즈스틱", 2000);
        Sides sides3 = new Sides("치킨너겟", 2500);
        Sides sides4 = new Sides("오징어링", 2700);

        sidesArr.add(sides1);
        sidesArr.add(sides2);
        sidesArr.add(sides3);
        sidesArr.add(sides4);

        Drinks drinks1 = new Drinks("콜라", 1000);
        Drinks drinks2 = new Drinks("에이드", 2000);
        Drinks drinks3 = new Drinks("커피", 1500);
        Drinks drinks4 = new Drinks("쉐이크", 2500);

        drinksArr.add(drinks1);
        drinksArr.add(drinks2);
        drinksArr.add(drinks3);
        drinksArr.add(drinks4);

    }


    // 햄버거
    public void hamburger() {
        System.out.println("\n=== 햄버거 목록 ===");
        for (int i = 0; i < hamburArr.size(); i++) {
            Hamburger hamburger = hamburArr.get(i);
            System.out.println((i + 1) + ". " + hamburger.name + " " + hamburger.price);
        }
        System.out.println(" ==================");
        System.out.print("어떤 버거를 고르시겠습니까?");
        // 선택
        int selectNum = Integer.parseInt(sc.nextLine());
        // 햄버거 클래스 새로운 햄버거 변수에 햄버거 리모컨 담기
        Hamburger burger = hamburArr.get(selectNum - 1);
        burgerCart.add(burger); //폴더 전체 이동
        System.out.printf("%s를 고르셨습니다. \n", burger.name);
        total += burger.price;

    }

    // 사이드
    public void sides() {
        System.out.println("=== 사이드 목록 ===");
        for (int i = 0; i < sidesArr.size(); i++) {
            Sides sidemenu = sidesArr.get(i);
            System.out.println((i + 1) + ". " + sidemenu.name + " " + sidemenu.price);
        }
        System.out.println("==================");
        System.out.print("어떤 사이드를 고르시겠습니까?");
        int selectNo = Integer.parseInt(sc.nextLine());
        Sides sides = sidesArr.get(selectNo - 1);
        sidesCart.add(sides);
        System.out.printf("%s를 고르셨습니다.\n", sides.name);
        total += sides.price;

    }

    // 음료수
    public void drink() {
        System.out.println("=== 음료수 목록 ===");
        for (int i = 0; i < drinksArr.size(); i++) {
            Drinks drinks = drinksArr.get(i);
            System.out.println((i + 1) + ". " + drinks.name + " " + drinks.price);
        }
        System.out.println("=================");
        //선택
        int selectNo = Integer.parseInt(sc.nextLine());
        Drinks drink = drinksArr.get(selectNo - 1);
        drinksCart.add(drink);
        System.out.printf("%s를 고르셨습니다.\n", drink.name);
        total += drink.price;


    }

}
