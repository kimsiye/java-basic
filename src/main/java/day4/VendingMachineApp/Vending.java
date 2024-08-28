package day4.VendingMachineApp;

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
    String [] drink = {"콜라", "사이다", "커피"};
    int[] price = {1000, 1200, 800};

    // 음료 목록 확인
    public void menu (){
        System.out.println("\n== 음료수 목록 ==");
        for(int i = 0; i <= 2; i++){
            System.out.println(i+". "+drink[i]+" : "+price[i]+"원");
        }
        System.out.println("===============\n");
    }

    // 음료선택
    public void menuChoice (){
        System.out.println("\n음료수를 선택해주세요");
        int choice = sc.nextInt();
        if (disting(choice)){
            System.out.println(drink[choice]+"를 뽑으셨습니다");
            total = total - price[choice];
            System.out.println("현재 잔액은 "+total+"원 입니다\n");
        }
        else{
            System.out.println("잔액이 부족합니다.\n");
        }
    }

    // 음료 구매 가능 금액 판별
    public boolean disting(int choice){
        return total >= price[choice] ;
    }

    // 사용 종료
    public void end(){
        System.out.println("자판기 프로그램을 종료합니다. 남은 돈 "+total+"원이 반환됩니다.");
    }

}
