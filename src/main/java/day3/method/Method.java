package day3.method;

// TxtBdApp
public class Method {
    public static void main(String[] args) {
        // 사람의 정보를 저장
        Person p1 = new Person() ;
        p1.age = 29;
        p1.name = "홍길동";

        // 변수 ->정보를 저장
        // 매서드 -> 동작을 수행
        // 객체가 수행하고 있음
        p1.walk();
        // 메서드에서 수행하고 되돌아오는 것을 리턴이라고 함
        // 생략을 해도 자동 리턴 됨. > 시작시켰던 곳으로 되돌아감
        //p1.introduce();
        p1.walk();
        p1.walk();
        p1.walk();

        Person p2 = new Person() ;
        p2.age = 30;
        p2.name = "이순신";

        p1.introduce("홍길동", 20);
        p2.introduce("이순신", 30);

        p1.introduce2();
        p2.introduce2();


    }
}
