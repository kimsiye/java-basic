package day1;

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

        String star = " ";
        int high = 3;
        int count = 1;

        System.out.println("높이 : "+ high);
        while(count<=high){
            System.out.println(star = star + "*");
            count++;
        }

        star = " ";
        high = 5;
        count = 1;
        System.out.println("\n높이 : "+ high);
        while(count<=high){
            System.out.println(star = star + "*");
            count++;
        }

        star = " ";
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


        String star2 = " ";
        int high2 = 3;
        int count2 = 1;

        System.out.println("높이 : "+ high2);
        while(count2<=high2){
            System.out.println(star2 = star2 + "\n*");
            count2++;
        }



    }
}
