package day1;

public class Operator {
    public static void main(String[] args) {
        // 산술 연산자
        // +, -, *,/, %
        // System.out.println(); 단축키 sout = tab

        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 % 5);

        System.out.println(10 / 3); // 나누어도 정수와 정수로 나누면 값이 정수로 나옴
        System.out.println(10.0 / 3.0); // 값이 실수로 나오게 하려면 나누는 값이 실수이여함
        // 무한이 나눌수 없기 때문에 끝 오차가 있음

        System.out.println(10 % 3); // 나머지를 구함

        // 비교 연산자 > 논리값으로 결과가 나옴
        //<, >, >=, <=, ==, !=
        System.out.println(10 > 5); // 맞음(true)
        System.out.println(10 < 5); // 틀림(false)

//        System.out.println(100); // 산술적인 숫자
//        System.out.println("100"); // 문자
//
//        System.out.println(true);
//        System.out.println("true");

        System.out.println(10 > 10); // 틀림(false)
        System.out.println(10 >= 10);// 맞음(true)
        System.out.println(10 == 10);// 맞음(true)
        System.out.println(10 != 10);// 틀림(false)
        System.out.println(!true); // 틀림(false) / ! = 뒤집힘

        // 자료형(타입)
        // 숫자 - int, 문자 - String, 숫자(실수) - double,  논리값(참/거짓)




    }
}
