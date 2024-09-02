package day7.compositionExam;

public class Exam1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        p1.arm = new Arm(); // 원시타입이 아닌 객체타입> Arm 타입

        System.out.println(p1.arm.length + "cm");
        // 출력 : 100cm
    }
}

class Person{
    Arm arm;
    int age;

}

class Arm{
    int length = 100;
}

// 객체가 가지고 있는 변수와 메서드
// () > 있으면 매서드
// 객체에 있는 요소들에 접근할 수 있다.

// 객체 안에 객체가 있어서 타고타고 들어갈 수 있다.