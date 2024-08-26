package day2;

import java.util.Scanner;

public class ExamInput3 {
    public static void main(String[] args) {

        // == 계산기 프로그램 v1 ==
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 1
        // 첫번째 숫자를 입력해주세요 : 22
        // 두번째 숫자를 입력해주세요 : 44
        // 결과 : 22 + 44 = 66
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 3(입력)
        // 첫번째 숫자를 입력해주세요 : 2(입력)
        // 두번째 숫자를 입력해주세요 : 4(입력)
        // 결과 : 2 * 4 = 8
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 6(입력)
        // 그런 기능은 존재하지 않습니다.
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 7(입력)
        // 그런 기능은 존재하지 않습니다.
        // 기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : 5(입력)

        // 계산기 프로그램을 종료합니다.


        // 기능
        // 1. 더하기 + 인풋 >  결과
        // 2. 빼기 + 인풋 >  결과
        // 3. 곱하기 + 인풋 >  결과
        // 4. 나누기 + 인풋 >  결과
        // 5. 종료기능
        // 6. 기능 외
        // 7. 같은 값 조건일때, 아닐때
        // 8. 사칙연산 인풋
        // + 반복조건 5일때 정지

        Scanner sc = new Scanner(System.in);

        // + 반복조건 값이 5일때 정지
        while(true){
            // 8. 사칙연산 인풋
            System.out.println("== 계산기 프로그램 v1 ==");
            System.out.print("기능을 선택해주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : ");
            int choice = sc.nextInt();

            // 7. 조건값이 들어왔을 때 선택
            if(choice == 1 ){
                // 1. 더하기 계산
                System.out.print("첫번째 숫자를 입력해주세요 : ");
                int add1 = sc.nextInt();
                System.out.print("두번째 숫자를 입력해주세요 : ");
                int add2 = sc.nextInt();
                System.out.println("결과 : "+add1+" + "+add2+" = "+(add1+add2));

            }
            else if (choice == 2) {
                // 2. 빼기 계산
                System.out.print("첫번째 숫자를 입력해주세요 : ");
                int sub1 = sc.nextInt();
                System.out.print("두번째 숫자를 입력해주세요 : ");
                int sub2 = sc.nextInt();
                System.out.println("결과 : "+sub1+" - "+sub2+" = "+(sub1-sub2));

            }
            else if (choice ==3) {
                // 3. 곱하기 계산
                System.out.print("첫번째 숫자를 입력해주세요 : ");
                int mult1 = sc.nextInt();
                System.out.print("두번째 숫자를 입력해주세요 : ");
                int mult2 = sc.nextInt();
                System.out.println("결과 : "+mult1+" * "+mult2+" = "+(mult1*mult2));

            }
            else if (choice == 4) {
                // 4. 나누기 계산
                System.out.print("첫번째 숫자를 입력해주세요 : ");
                int div1 = sc.nextInt();
                System.out.print("두번째 숫자를 입력해주세요 : ");
                int div2 = sc.nextInt();
                System.out.println("결과 : "+div1+" ÷ "+div2+" = "+(div1/div2));
            }
            else if (choice == 5) {
                // 5. 종료기능
                System.out.println("계산기 프로그램을 종료합니다.");
                break;
            }else{
                // 6. 기능 외
                System.out.println("그런 기능은 존재하지 않습니다.");
            }
        }



//        // 1. 더하기 계산
//        System.out.print("첫번째 숫자를 입력해주세요 : ");
//        int add1 = sc.nextInt();
//        System.out.print("두번째 숫자를 입력해주세요 : ");
//        int add2 = sc.nextInt();
//        System.out.println("결과 : "+add1+" + "+add2+" = "+(add1+add2));
//
//        // 2. 빼기 계산
//        System.out.print("첫번째 숫자를 입력해주세요 : ");
//        int sub1 = sc.nextInt();
//        System.out.print("두번째 숫자를 입력해주세요 : ");
//        int sub2 = sc.nextInt();
//        System.out.println("결과 : "+sub1+" - "+sub2+" = "+(sub1-sub2));
//
//        // 3. 곱하기 계산
//        System.out.print("첫번째 숫자를 입력해주세요 : ");
//        int mult1 = sc.nextInt();
//        System.out.print("두번째 숫자를 입력해주세요 : ");
//        int mult2 = sc.nextInt();
//        System.out.println("결과 : "+mult1+" * "+mult2+" = "+(mult1*mult2));
//
//        // 4. 나누기 계산
//        System.out.print("첫번째 숫자를 입력해주세요 : ");
//        int div1 = sc.nextInt();
//        System.out.print("두번째 숫자를 입력해주세요 : ");
//        int div2 = sc.nextInt();
//        System.out.println("결과 : "+div1+" ÷ "+div2+" = "+(div1/div2));
//
//        // 5. 종료기능
//        System.out.println("그런 기능은 존재하지 않습니다.");
//
//        // 6. 기능 외
//        System.out.println("계산기 프로그램을 종료합니다.");

    }
}
