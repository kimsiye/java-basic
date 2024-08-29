package day5.practice2;
// 다시 한번 풀어보기

import java.util.ArrayList;

public class Exam3 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person();
        p3.age = 41;
        p3.name = "을지문덕";

        Person p4 = new Person();
        p4.age = 32;
        p4.name = "황진이";

        ArrayList<Person> listPerson = new ArrayList<>();

        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p4);

        // 컨트롤러 아닌 버전
        for(int i = 0; i < listPerson.size(); i++){
            System.out.println("안녕하세요. 저는 "+listPerson.get(i).age+"살 "+listPerson.get(i).name+"입니다.");
        }

        System.out.println("=================");
        // 컨트롤러 복사본 인 버전
        for(int i = 0; i < listPerson.size(); i++){
            Person p = listPerson.get(i);
            System.out.println("안녕하세요. 저는 "+p.age+"살 "+p.name+"입니다.");
        }

        System.out.println("=================");
        // 컨트롤러 복사본 인 버전 + 메서드 사용
        for(int i = 0; i < listPerson.size(); i++){
            Person p = listPerson.get(i);
            p.introduce();
        }



        // 1. 네 사람을 ArrayList에 저장
        // 2. 네 사람에게 자기소개 시키기 (자기소개 문구 : 안녕하세요 ~~살 ~~~입니다.)
        // 3. 30대인 사람에게만 자기소개 시키기

    }
}
