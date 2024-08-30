package day6.constructor;

public class Constructor {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.age = 20;
//        p1.name = "홍길동";
//
//        p1.introduce();

        // 겍체를 만들고 나서 변수를 잘 세팅 해야한다. 그렇지 않으면 객체는 재대로 동작하지 않는다.
        // 객체 변수 세팅은 필수
        // 사람은 실수로 위와 같은 필수 작업을 누락할 수도 있다.
        // 객체가 만들어 질 때 반드시 실행하는 코드를 세팅할 수 있다 > 생성자 이용
//        Person p2 = new Person();
//
        new Person();
        new Person();
        new Person();

        Person p1 = new Person("홍길동", 20); // << 매개변수를 넘겨야 생성됨
        p1.introduce();
        // 생성자가 있으면 객체가 생길때마다 나타나는 거라서 누락을 방지할 수 있음
        // 조건없는 생성자는 무조건 같은것만 출력한다.
        Person p2 = new Person("이순신", 30); // << 매개변수를 넘겨야 생성됨
        p2.introduce();
        Person p3 = new Person("임꺽정", 40); // << 매개변수를 넘겨야 생성됨
        p3.introduce();

        // 생성자를 만들면 new person(); 은 못 만든다 무조건 매개변수에 넣을 인자가 있어야함

    }

}
