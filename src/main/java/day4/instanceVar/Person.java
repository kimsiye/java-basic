package day4.instanceVar;

public class Person {
    // 2. 매서드에 공유 변수를 넣어서 활용하는 방식
    // 두개 이상의 매서드가 공유해야하는 변수로 활용할 수 있다.
    // 인스턴스 변수는 인스턴스가 제거될 때 같이 사라진다.
    // 인스턴스는 리모콘을 잃어버리면 사라진다.
    // 객체의 상태와 관련이 있으면 인스턴스 변수 사용,
    // 하나의 메서드에만 국한해서 사용하는 경우에는 매게변수 사용
    String name;

    // 자바는 같은 변수가 있을 때 안에 있는 변수를 사용한다.
    public void intro(){
        System.out.println("안녕하세요. "+name+"입니다.");
    }
    public void walk (){
        System.out.println(name+"이 걷습니다.");
    }


//    // 1. 매개 변수를 넣어서 구분하는 방식
//    // 매서드 안에서 만들어지는 변수 -> 지역변수
      // 지역변수는 메서드 (함수가 종료되면 사라진다)
//    public void intro(String name){
//        System.out.println("안녕하세요. "+name+"입니다.");
//    }
//    public void walk (String name){
//        System.out.println(name+"이 걷습니다.");
//    }

}
