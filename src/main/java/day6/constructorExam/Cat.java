package day6.constructorExam;

public class Cat {
    String name;
    int age;
    String kind;

    public Cat(){
        System.out.println("고양이가 태어납니다.");
    }

    public void meow() {
        System.out.printf("%d살 %s 고양이 %s가 야옹하고 웁니다.\n", age, kind, name);
        // % : 출력방식(서식문자)
        // 출력: print**f** 숫자변수 %d 문자 %s
        // 끝에 ,를 넣고 변수명을 차례대로 기입하면서 ,를 기입하여 구분하면 됨
    }
}
