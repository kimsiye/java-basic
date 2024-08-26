package day2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 프로그램이 일방적으로 보여줌
        // 출력은 우리들에게 보여줌, Input은 프로그램에 넣어줌
        // 사용자가 직접 전달하는게 유용
        // Input 문법 외우기

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();// 숫자를 입력받는 명령어
        // 여기에서 멈춤 > 입력 후 enter를 눌러야 진행됨
        System.out.println("당신이 입력한 첫번째 값은 : "+num1);

        int num2 = sc.nextInt();
        System.out.println("당신이 입력한 두번째 값은 : "+num2);

        System.out.println(num1+num2);







    }
}
