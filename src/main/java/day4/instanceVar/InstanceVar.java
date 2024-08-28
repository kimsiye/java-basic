package day4.instanceVar;

public class InstanceVar {
    public static void main(String[] args) {

        // 매개변수를 이용해 동작을 다체롭게
        // 단점 : 매개변수를 일일이 넣어야함, 같은 것을 넣을때 오류오타가 있을 수 있음
        Person p1 = new Person();
        p1.name = "홍길동";



        //        p1.intro("홍기동");

        Person p2 = new Person();
//        p2.intro("이순신");
//
//        p1.walk("홍기동");
//        p2.walk("이순신");
//
        // 여러개의 객체가 하나의 메서드를 활용하고자 할때
        // 두개 이상의 매서드가 공유해야하는 변수로 활용할 수 있다.
        // 매서드 안에서 만들어지는 변수 -> 지역변수





    }
}
