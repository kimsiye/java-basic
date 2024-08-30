package day6.constructor;

public class Person {
    int age; // 이거를 사용하지 않고 아래 하위에 있는 같은 이름의 변수를 사용하게 됨
    // 이름을 다르게 만들거나
    // this를 부튼 변수는 클래스에 있는 변수를 가크림 안 붙은건 안에 있는 변수를 사용함
    String name;

    // 생성자
    // 클래스 명과 동일이름의 특수한 매서드 ==> 생성자
    // public 클래스 이름과 동일
    // void와 같은 자료형 타입 입력도 없고 리턴타입도 없음
    // 객체가 new로 생성되면 생성자는 무조건 실행된다
    // 생성자는 메서드 중 가장 위에 있어야 한다.(위치)
    public Person() {
        System.out.println("사람이 한명 태어납니다.");
        age = 20;
        name = "홍길동";
    }

    // 정할 수 없는 것은 매개변수로 넣어준다
    public Person(String nameParam, int ageParam) {
        System.out.println("사람이 한명 태어납니다.");
        age = ageParam;
        name = nameParam;
    }

    public void introduce(){
        System.out.println("안녕하세요. 저는 "+age+"살 "+name+"입니다.");
    }
}
