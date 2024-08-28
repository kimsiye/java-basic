package day4.methodReturn;

public class Test {

    public int plus(int num1, int num2){
        System.out.println(num1 + num2);
        return num1 + num2;
        // return 10; // 메서드가 리턴(돌아갈) 때 10이라는 값을 가지고 돌아감
    }
    // 숫자를 가지고 돌아갈 때는 어떤 자료형으로 가지고 돌아가야하는지 명시해야함
    // void를 자료형으로 바꿔주어야 함


    public void plus2div(int num1, int num2, int num3){
        System.out.println((num1 + num2)/num3);
    }

    public int radius (int num1){
        return num1*num1;
    }

    public double radius2 (int num1){
        return num1*num1*3.14 ;
    }

    // 선생님 풀이
    public double circleArea(int radius){
        return radius*radius*3.14;
    }
    // 정수보다 실수의 크기가 크다
    // 실수와 정수를 계산하면 무조건 실수이다.

}
