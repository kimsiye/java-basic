package day6.constructorExam;

public class Person {

    // 밭간에 있는건 this를 사용
    String name;
    int age;

    public Person (){
        System.out.println("사람이 태어납니다.");
    }

    public void introduce(){
        System.out.println("안녕하세요 저는 "+age+"살 "+name+"입니다.");
    }

}
