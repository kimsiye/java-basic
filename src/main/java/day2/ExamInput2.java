package day2;

import java.util.Scanner;

public class ExamInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 반복문 추가 문법

        // 반복문 강제 종료 : break

        // 반복문 강제로 다음 회차 넘기기 : continue
        // 반복문을 세밀하게 이용

//        for(int i = 1; i <= 10; i++){
//            if(i==5){
//                // break; // 조건을 걸어서 내가 빠저나가고 싶은 조건일때 씀 1,2,3,4
//                // 강재종료
//                continue; // 1,2,3,4,6,7,8,9,10 >
//            }
//            System.out.println(i);
//        }
//
//
//        // 짝수
//        for(int i = 1; i <= 10; i++){
//            if(i % 2 != 0){
//                // break; // 조건을 걸어서 내가 빠저나가고 싶은 조건일때 씀 1,2,3,4
//                // 강재종료
//                continue; // 1,2,3,4,6,7,8,9,10 >
//            }
//            System.out.println(i);
//        }


        while(true){
            System.out.print("값을 입력해주세요 : ");
            int num = sc.nextInt();
            if (num == 0){ // num이 0이면 if문 실행
                break;
            }
            System.out.println("당신이 입력한 값은 : "+num);
        }
        System.out.println("프로그램이 종료되었습니다. ");

        //입력하기 전에는 멈추기 때문에 와일문을 트루로 줘도 괜찮음





    }
}
