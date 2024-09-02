package day7.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.breathe();

        Cat c1 = new Cat();
        c1.meow();
        c1.breathe();

        Person p1 = new Person();
        p1.introduce();
        p1.breathe();

    }
}

class Dog extends Animal{ // 동물에 있는 개념을 물려줌
    public void bark() {
        System.out.println("멍멍짓다");
    }
//    public void breathe(){
//        System.out.println("숨쉬다~");
//    }
}
class  Animal{
    // 동물이 가지고 있는 공통적인 특징을 넣을 것
    public void  breathe(){
        System.out.println("숨쉬다."); // 공통 분모를 여기에서 수정하면 됨
    }
}

class Cat extends Animal{
    public void meow() {
        System.out.println("야옹");
    }
//    public void breathe(){
//        System.out.println("숨쉬다");
//    }
}

// 클래스를 만들다 보면 공통적인 부분이 있지만 달라서 만들어지는 부분이 있음
// 공통적이 기능을 공통분모를 같이 관리할 수 있게 만들어줘야함다
// 숨쉬다라는 기능이 중복됨 >> 중복은 프로그램에 있어서 기피해야할 문제임
// 중복을 어떻게 없애느냐가 중요 과제임

//> 클래스 안에 중복되는 속성(매서드)를 한곳에 모아서 컨트롤 할 수 있게 만듬

// 개는 동물의 확장된 부분이다.

// 사람 만들어서 숨귀게 해보기
class Person extends Animal{
    public void introduce(){
        System.out.println("안녕하세요");
    }
}

// 상속 ->
// 부모클래스 - 자식클래스
// 부모 객체 - 자식객체
// 상위클래스 - 하위클래스