package day8.staticExam;

public class StaticExam {
    public static void main(String[] args) {
        //public static void main(String[] args)> 정보전달 매개변수
        //static(: 고정되어있다) 내용
        // 클래스에 만들면 static이 붙은 부분은 움직이지 않는다.
        // 통일한 정보를 접근한다.
        Person p1 = new Person(20,"홍길동");
        Person p2 = new Person(30,"이순신");

        p1.introduce();
        p2.introduce();

        p1.age++;
        p1.introduce();

        // 클래스와 객체를 따로 만드는 이유 :
        // 같은 구조인데 서로 다른 정보를 갖게 하기 위함
        // 복사본 객체를 만들어서 서로 다른 정보를 저장해야한다

        p2.introduce();

        p1.printAvgAge();
        p2.printAvgAge();

        // 인류 평균 나이 81로 정정
        // 100명일때 모든사람에게 바꿔줘야하는 것이 번거로움
        p1.avgAge=81;
        p1.printAvgAge(); // static 붙이기 전 p1의 인류 평균 나이는 81로 수정되어 출력됨 붙인 후 81로 수정되었음
        //p2.avgAge=81;
        p2.printAvgAge(); // static 붙이기 전 p2의 인류 평균 나이는 여전히 80으로 출력됨 붙인 후 81로 수정되었음

        // 객체는 자신만의 개성을 표현하기 위해 존재하지만 모든 개게가 공유하는 정보가 있을 수 있다.
        // 객체간 공유 정보를 static으로 변경

        // 매서드는 일반적으로 객체화 한 후에 사용가능하지만, static을 붙이면 class에서 바로 사용가능
        Person.printAvgAge(); // > static을 붙이면 new 없이 바로 사용가능
        // new를 하지 않아도 사용가능하므로 편리하다.
        // 공유할 목적으로 한 곳에서만 붙여야한다 ex) 나이

        // static은 꼭 필요한 경우에만 사용해야하며, 메서드에서도 static 변수를 사용할 때나 객체가
        // 가지고 있는 변수를 사용하지 않는 경우에만 static을 붙여야한다.

        // 막 쓰지 말고 모를땐 쓰지말것, 그러나 정말 공통인 부분에만 쓸것,
        // 남발하면 문제가 될 수 있음

    }


}
