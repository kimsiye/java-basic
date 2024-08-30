package day6.teacherHamburger;

import day6.Hamburger.Hamburger;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        // 일단 만들고 개선하기
        // 가지고 논다라는 생각으로 시도하기

        // 햄버거 키오스크 만들기

        ArrayList<Burger> burgers = new ArrayList<>();
        ArrayList<Burger> burgerCart = new ArrayList<>();

        Burger b1 = new Burger("버거1", 1000);
        Burger b2 = new Burger("버거2", 2000);
        Burger b3 = new Burger("버거3", 3000);
        Burger b4 = new Burger("버거4", 4000);

        burgers.add(b1);
        burgers.add(b2);
        burgers.add(b3);
        burgers.add(b4);

        Scanner sc = new Scanner(System.in);
        System.out.println("햄버거 키오스크 v1");
        while(true) {
            System.out.println("1. 햄버거 선택");
            System.out.println("2. 사이드 선택");
            System.out.println("3. 음료수 선택");
            System.out.println("4. 메뉴 취소");
            System.out.println("5. 주문 하기");
            System.out.println("====== 주문 목록 =====");

            System.out.print("버거: [");
            for(int i = 0; i < burgerCart.size(); i++) {
                System.out.print(burgerCart.get(i).name + " ");
            }
            System.out.println("]");

            System.out.println("사이드: []");
            System.out.println("음료수: []");
            System.out.println("총금액 : 0");
            System.out.print("무엇을 하시겠습니까 : ");
            int menu = Integer.parseInt(sc.nextLine());

            if(menu == 1) {
                System.out.println("=== 버거 목록 ===");
                for(int i = 0; i < burgers.size(); i++) {
                    System.out.printf("%d. %s %d\n", i + 1, burgers.get(i).name, burgers.get(i).price);
                }

                System.out.print("어떤 버거를 고르시겠습니까 : ");
                int selectNo = Integer.parseInt(sc.nextLine()); // 번호로 버거 선택

                Burger burger = burgers.get(selectNo - 1); // 선택한 번호로 버거 가져오기
                burgerCart.add(burger); // 카트에 선택한 버거 추가

            }



                // 담을 바구니 필요



        }
    }
}
