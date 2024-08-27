package day3.methodExam;

public class Car {

    // 차종
    String type;

    // 색
    String color;

    // 속도
    int speed;


    public void run (){
        System.out.println("자동차가 달립니다");
    }
    public void run1 (){
        System.out.println(type+"자동차가 달립니다");
    }
    public void speed (){
        System.out.println("자동차가 최대속력 "+speed+"km로 달립니다");
    }

}
