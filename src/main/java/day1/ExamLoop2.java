package day1;

import java.sql.SQLOutput;

public class ExamLoop2 {
    public static void main(String[] args) {

        System.out.println("문제 1 \n\n");
// 문제 : 구구단 작성
// 조건 : 짝수번째만 곱하기
/* 출력예시 :

  2 * 2 = 4
  2 * 4 = 8
  2 * 6 = 12
  2 * 8 = 16

  ...

  9단까지 이런식으로 나오면 됩니다.

*/
        for (int dan = 1; dan <= 9; dan++){
            System.out.println("== "+dan+"단 == ");
            for(int num = 2; num <=8; num+=2){
                System.out.println(dan+" * "+num+" = "+(dan*num));
            }
        }

        System.out.println("\n\n 문제 2 \n\n");
// 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.

    /*  입출력 예시
    n은 4, m은 20, limit는 10

    5 * 2 = 10
    5 * 4 = 20
    5 * 6 = 30
    5 * 8 = 40
    5 * 10 = 50

    7 * 2 = 14
    7 * 4 = 28
    7 * 6 = 42
    7 * 8 = 56
    7 * 10 = 70
    ...
    ...
    19 * 2 = 38
    19 * 4 = 76
    19 * 6 = 114
    19 * 8 = 152
    19 * 10 = 190

1. 짝수 곱 출력
2. N~M까지 범위 중 홀수단만 출력
     */


        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        while(n<=m){
            if(n%2 !=0) {
                System.out.println("== "+n+"단 == ");
                for (int num2 = 2; num2 <= limit; num2 += 2) {
                    System.out.println(n + " * " + num2 + " = "+(n + num2));
                }
            }
            n++;
        }

        System.out.println("\n\n 문제 3 \n\n");

        // 출력
    /*
    높이 : [3]

    *
    **
    ***


    */

    /*

    높이 : [5]

    *
    **
    ***
    ****
    *****

    */

    /*

    높이 : [7]

    *
    **
    ***
    ****
    *****
    ******
    *******

    */

        String star = "";
        int high = 3;
        int count = 1;

        System.out.println("높이 : "+ high);
        while(count<=high){
            System.out.println(star = star + "*");
            count++;
        }

        star = "";
        high = 5;
        count = 1;
        System.out.println("\n높이 : "+ high);
        while(count<=high){
            System.out.println(star = star + "*");
            count++;
        }

        star = "";
        high = 7;
        count = 1;
        System.out.println("\n높이 : "+ high);
        while(count<=high){
            System.out.println(star = star + "*");
            count++;
        }

        System.out.println("\n\n 문제 4 \n\n");



// 출력
    /*

    높이 : [3]

      *
     **
    ***

    */

    /*

    높이 : [5]

        *
       **
      ***
     ****
    *****

    */

    /*

    높이 : [7]

          *
         **
        ***
       ****
      *****
     ******
    *******

    */


//        String star2 = " ";
//        int high2 = 3;
//        int count2 = 1;
//
//        System.out.println("높이 : "+ high2);
//        while(count2<=high2){
//            System.out.println(star2 = star2 - " " + "*");
//            count2++;
//        }

//        star2 = " ";
//        String blank = "   ";
//        high2 = 3;


//        for (int blank_count = 1; blank_count<= high2; blank_count++){
//            for (int star_count = 1; star_count <= high2; star_count++) {
//                blank = blank + " ";
//                star2 = star2 + "*" ;
//                System.out.println(star2 = blank + star2);
//            }
//        }


//        for (int star_count = 1; star_count <= high2; star_count++) {
//            for (int blank_count = 3; blank_count<= high2; blank_count--){
//                blank =  " ";
//            }
//            star2 = star2 + "*" ;
//            System.out.println(star2 = blank + star2);
//        }



//        String Square = "ㅁㅁㅁ";
//        for (int hh = 1; hh <=-3; hh--){
//            System.out.println(Square = Square - "ㅁ");
//        }
//
        String Square = "ㅁ";
//        for (int hh = 1; hh <=3; hh++){
//            System.out.print(Square);
//        }
//        System.out.println(" ");
//        Square = "ㅁ";
//        for (int hh = 1; hh <=2; hh++){
//            System.out.print(Square);
//        }
//        System.out.println(" ");
//        Square = "ㅁ";
//        for (int hh = 1; hh <=1; hh++){
//            System.out.print(Square);
//        }
//        System.out.println(" ");
//
//        Square = "ㅁ";
//        for (int hh = 1; hh <=3; hh++){
//            System.out.print(Square);
//        }
//        System.out.println(" ");
//        Square = "ㅁ";
//        for (int hh = 1; hh <=2; hh++){
//            System.out.print(Square);
//        }
//        System.out.println(" ");
//        Square = "ㅁ";
//        for (int hh = 1; hh <=1; hh++){
//            System.out.print(Square);
//        }
//        System.out.println(" ");
//
//        Square = "ㅁ";
//        for (int hh = 1; hh <=3; hh++){
//            System.out.print(Square);
//        }
//        System.out.println(" ");


//        Square = "ㅁ";
//        for (int aa = 3; aa >= 1; aa--){
//            for (int hh = 1; hh <=aa; hh++){
//                System.out.print(Square);
//            }
//            System.out.println(" ");
//        }
        // ㅁ는 반복의 수만큼 출력이 된다 ㅁ가 3번이면 ㅁㅁㅁ, ㅁ가 2번이면 ㅁㅁ
        // ㅁ의 반복의 수를 변수를 주어서 3->1로 내려가게 반복을 주었다

//
//        String Star = " ";
//
//        for (int h = 1; h <=3; h++){
//            System.out.println(Star = Star + "*");
//        }

//        Square = "ㅁ";
//        String Star = " ";


//        for (int aa = 3; aa >= 1; aa--){
//            for (int hh = 1; hh <=aa; hh++){
//                System.out.print(Square);
//            }
//            for (int h = 3; aa <= h; h--){ >> 이 조건이 aa 조건이랑 같다는 것을 알게됨
//                System.out.println(Star = Star + "*");
//            }
//        }
//
//
//
//        Square = "ㅁ";
//        String Star = " ";
//
//
//        for (int aa = 3; aa >= 1; aa--){
//            for (int hh = 1; hh <=aa; hh++){
//                System.out.print(Square);
//            }
//
//            System.out.println(Star = Star + "*");
//
//        }



        String blank = " ";
        String Star2 = "";


        for (int aa = 8; aa >= 1; aa--){
            for (int hh = 1; hh <=aa; hh++){
                System.out.print(blank);
            }
            System.out.println(Star2 = Star2 + "*");
        }



        // " " 공백 풀방일때, 별이 없고



        // 3각형 힌트
        // 규칙성을 찾을 것
        // 공백, 별 > 공백도 그려야함 > System.out.println(" ");

        System.out.println("\n\n 문제 5 \n\n");

        String Star = "";

        int bb = 3;

        for (int hhh = 1; hhh <=bb; hhh++){
            System.out.println(Star = Star + "*");
        }
        for (int aa = bb-1; aa >= 1; aa--) {
            for (int hh = 1; hh <= aa; hh++) {
                System.out.print("*");
            }
            System.out.println( );
        }

        // 출력
        /*


         *
         **
         *


         */


        // 출력
        /*


         *
         **
         ***
         **
         *


         */


        // 출력
        /*


         *
         **
         ***
         ***
         **
         *


         */



















    }
}
