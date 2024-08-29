package day5.VendingMachineApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Vending {

    // 사용 변수 모음
    int total = 0; // 모든 코인을 담는 곳

    // 프린터 구문
    Scanner sc = new Scanner(System.in);

    // 돈 투입
    public void incoin (){
        System.out.print("\n돈을 투입해주세요. : ");
        int coin = sc.nextInt();
        System.out.println("현재 투입된 금액은 "+coin+"원 입니다.\n");
        total = total + coin;
    }

    // 잔액 확인
    public void totalcoin(){
        System.out.println("\n현재 잔액은 "+total+"원 입니다\n");
    }

    // 음료수
//    배열
//    String [] drink = {"콜라", "사이다", "커피"};
//    int[] price = {1000, 1200, 800};
//    int[] count = {1,1,2};

    // Arraylist
    ArrayList<String> drink = new ArrayList<>() {{
        add("콜라");
        add("사이다");
        add("커피");
    }};
    ArrayList<Integer> price = new ArrayList<>() {{
        add(1000);
        add(1200);
        add(800);
    }};
    ArrayList<Integer> count = new ArrayList<>() {{
        add(1);
        add(1);
        add(2);
    }};


    // 음료 목록 확인
    public void menu (){
        System.out.println("\n== 음료수 목록 ==");
        for(int i = 0; i <= 2; i++){
            System.out.println(i+". "+drink.get(i)+" : "+price.get(i)+"원, " +
                    "남은 수량 : "+count.get(i));
        }
        System.out.println("===============\n");
    }

    // 음료선택
    public void menuChoice (){
        System.out.println("\n음료수를 선택해주세요");
        int choice = sc.nextInt();
        if (disting(choice)){
           if(count.get(choice) != 0) {
               System.out.println(drink.get(choice) + "를 뽑으셨습니다");
               total = total - price.get(choice);
               drinkChoice(choice);
               System.out.println("현재 잔액은 " + total + "원 입니다\n");
           }else{
               System.out.println("남아 있는 "+drink.get(choice)+"가 없습니다.\n");
           }
        }
        else{
            System.out.println("잔액이 부족합니다.\n");
        }
    }

    // 음료 구매 가능 금액 판별
    public boolean disting(int choice){
        return total >= price.get(choice) ;
    }

    // 음료 구매 가능 수량 조절(선택하면 줄어듬)
    public int drinkChoice (int choice){
        return count.set (choice, count.get(choice) - 1);
    }


    // 사용 종료
    public void end(){
        System.out.println("자판기 프로그램을 종료합니다. 남은 돈 "+total+"원이 반환됩니다.");
    }

}
