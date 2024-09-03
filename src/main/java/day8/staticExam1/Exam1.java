package day8.staticExam1;

public class Exam1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "홍길동";
        person1.age = 22;

        person1.introduce();
        // 출력 : 저는 22살 홍길동 입니다.

        Person person2 = new Person();
        person2.name = "홍길순";
        person2.age = 25;

        person2.introduce();
        // 출력 : 저는 25살 홍길순 입니다.

        person1.introduce();
        // 출력 : 저는 22살 홍길동 입니다.
    }
}

class Person {

    int age;
    String name;

    public void introduce() {
        System.out.println("저는 " + age + "살 " + name + " 입니다.");
    }
}