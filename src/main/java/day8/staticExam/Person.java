package day8.staticExam;

public class Person {
    int age;
    String name;
    static int avgAge = 80; //인류 평균 나이 : 80

    // 생성자는 객체 만들 때 사용하기 때문에 객체를 만들지 않아도 사용가능한
    // static 변수는 static 초기화를 따로 해준다.
    static{
        avgAge = 80;
    }

    public Person (int age, String name){
        this.name = name;
        this.age = age;
        // this.avgAge = 80;
    }
    public void introduce(){
        System.out.printf("안녕하세요 %d살 %s입니다.\n",age,name);
    }

    public static void printAvgAge(){
        System.out.printf("인루 평균 나이는 %d살입니다..\n",avgAge);
    }
    //main이랑 비슷해짐

    public static void walk(){
        System.out.printf("인루 평균 나이는 %d살입니다..\n",avgAge);
    }
}
