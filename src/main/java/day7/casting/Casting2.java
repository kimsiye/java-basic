package day7.casting;

public class Casting2 {
    public static void main(String[] args) {
    // 형변환은 유사한 타입에서만 가능

    String str = "hihi";
    int num = 10;

    //num = (int)str; // 이건 만도 안되는 형변환

    // 객체간의 형변환
        Dog d1 = new Dog();
        d1.bark();

        Cat c1 = new Cat();
        c1.meow();
        // d1 = c1; //Dog 변수에 Cat이 대입될 수 없다.
        // 개를 고양이라고 할 수 없음 하지만 개와 고양이를 동물로 할 수 있음

        // 자동형변환 ()하고 직접형변환 안함 => 안전
        Animal a1 = d1; // Animal 타입 변수에 Dog가 대입되었다(x)
        // Dog가 Animal로 모습을 바꿔서 대입() > 관계가 있기에 변환이 가능
        a1 = c1;

        // 객체간의 형변환은 상속 관계에서만 허용

        c1 = (Cat)a1; // Animal을 Cat으로 수동형변환 = > 위험

        // Dog는 Animal을 포함하여 만들었기 때문에 Dog속성만 없애면 되기 때문에 안전함
        // Animal에 변화가 없음

        // a1에는 개나 고양이가 무엇이 들어 있는지 알 수 없음
        // 강제로 바꿔서 개를 고양이를 넣으면 에러가 남

        // 자식 객체가 부모객체로 모습을 바꾸는 것은 안전하다.
        // 자식은 부모의 기능을 무조건 가지고 있기 때문에

        // 부모 객체가 자식 객체로 모습을 바꾸는 것은 위험하다.
        // 부모 객체는 여러 자식 객체 포함할 수 있기 때문에

    }
}
class Animal{
    public void eat(){
        System.out.println("먹다.");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("멍멍");
    }
}
class Cat extends Animal{
    public void meow(){
        System.out.println("야옹");
    }
}
