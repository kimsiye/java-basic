package day1;

public class exam_Operator {
    public static void main(String[] args) {

        if ( true ) {
            System.out.println("참1");
        }

        if ( false ) {
            System.out.println("거짓");
        }

        int a = 10;
        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("참2");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("거짓");
        }

        if ( a > 10 ) {
            System.out.println("거짓");
        }

        if ( a >= 10 ) {
            System.out.println("참3");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("참4");
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if ( c ) {
            System.out.println("거짓");
        }

        if ( c == false ) {
            System.out.println("참5");
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println("참6");
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("거짓");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("참7");
        }
    }
}
