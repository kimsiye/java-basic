package day7.compositionExam;

public class Exam1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        p1.arm = new Arm();

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