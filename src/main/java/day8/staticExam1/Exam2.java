package day8.staticExam1;

public class Exam2 {

    static int num = 10;

    public static void main(String[] args) {

        // int num = 10;
        System.out.println(num); // 출력 : 10
        // static 붙인 것은 static이 붙여야만 활용할 수 있다.
        // static이 붙은 매서드는 static이 붙지 않은 것은 사용불가

        // printValue("안녕");
        // 출력 : 안녕
    }
    public static void printValue(int str){
        System.out.println(str);
    }
}

//class PrintValue{
//    public static void  printValue(String hello){
//        System.out.println(hello);
//    }
//}