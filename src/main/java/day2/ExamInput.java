package day2;

import java.util.Scanner;

public class ExamInput {
    public static void main(String[] args) {

        //Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
        //입출력 예시
        //첫번째 숫자를 입력해주세요: 12
        //두번째 숫자를 입력해주세요: 33
        //12 + 33 = 45

        Scanner sc = new Scanner(System.in);
//
//        System.out.print("첫번째 숫자를 입력해주세요. : ");
//        int num1 = sc.nextInt();
//        System.out.print("두번째 숫자를 입력해주세요. : ");
//        int num2 = sc.nextInt();
//
//        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//
//        System.out.println("==========");



        // Scanner를 이용해 입력값을 받아
        // 구구단을 원하는 단이 나오게 해주세요.

        //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

        // 4단 출력.

//        System.out.print("원하는 단을 입력해주세요 : ");
//        int dan = sc.nextInt();
//
//        System.out.println("== "+ dan +"단 ==");
//        for(int i = 1; i <= 9; i++ ){
//            System.out.println(dan+" * "+i+" = "+(dan*i));
//        }
//
//        System.out.println("==========");

        // 이름과 나이를 입력값으로 받아 자기소개를 해주세요.
        // 조건 : 성과 이름은 띄어쓰기로 구분해주세요.

        // System.out.println("이름을 입력해주세요:");
        // System.out.println("나이를 입력해주세요:");

        System.out.print("이름을 입력해주세요 :");
        String name = sc.nextLine();
        System.out.print("나이를 입력해주세요:");
        int age = sc.nextInt();

        System.out.println("안녕하세요 "+age+"세 "+name+"입니다.");




        // v1
        // 이름을 입력해주세요 : 홍 길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        System.out.print("나이를 입력해주세요:");
        int age2 = sc.nextInt();
        System.out.print("이름을 입력해주세요 :");
        String name2 = sc.nextLine();

        System.out.println("안녕하세요 "+age2+"세 "+name2+"입니다.");
        // 이름의 입력값을 받지 않고 그냥 넘어감 > 이거에 대한 해결책 숫자를 다 문자로 받고 숫자로 바꾸자

        // v2
        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.


        // 이름 입력 : 홍길동
        // 나이 입력 : 24

        // 안녕하세요 24살 홍길동입니다.

        // 숫자를 입력 받을 때 문자로 받고 숫자로 전환
        //int num = Integer.parseInt("123"); //Integer.parseInt > 문자를 숫자로 바꿈
        // System.out.println(num);


        System.out.println("이름 : ");
        int name3 = Integer.parseInt(sc.nextLine());
        System.out.println("나이 : ");
        String age3 = sc.nextLine();

        System.out.println("안녕하세요 " + age3 + "살 " + name3 + "입니다.");




    }
}
