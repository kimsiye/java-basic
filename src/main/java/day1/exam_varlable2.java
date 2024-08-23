package day1;

public class exam_varlable2 {
    public static void main(String[] args) {
        // 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.

        int a = 5;
        int b = 10;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
        int c;
        c = a;
        a = b;
        b = c;

        System.out.println("버전 2");
        a = 10;
        b = 5;

        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : 10
        System.out.println("b : " + b);
        // 출력 :  b : 5
    }
}
