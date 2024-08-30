package day6.nameApp4;

import java.util.ArrayList;
import java.util.Scanner;

public class NameApp4_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Person_1> personList = new ArrayList<>();
        // 명명규칙 : 아우를 수 있는 이름으로 정해야한다.
        // 이름을 보고 어떤 코드인지 알 수 있어야함
        // 변수 -> 명사(저장하려는 값과 관계있어야함), 메서드(동작) -> 동사(동작하는 것과 관계가 있어야함)


        int count = 0;

        while (true) {
            System.out.print("이름 입력 : ");
            String name = sc.nextLine();
            System.out.print("나이 입력 : ");
            int age = Integer.parseInt(sc.nextLine());

            // 입력 할 때 마다 담을 객체 생성하기
            Person_1 p1 = new Person_1();
            // 객체는 반복하여 생성할 때 만든 객체는 남지만
            // 연결고리인 p1과의 연결이 사라짐
            // 사라지지 않게 p1 연결고리를 배열리스트에 넣어줌
            // 배열리스트 add는 뒤에서 부터 저장이 됨
            // ArrayList는 반복되어 리셋이 되면 안되기 때문에
            // whlie문 밖에서 생성하고, 요소는 안에서 반복으로 넣어줌
            personList.add(p1);
            // 객체 p1안의 변수 지정해줌
            p1.name = name;
            p1.age = age;

            // 배열 안에 있는 요소 출력하기
            System.out.println(personList.get(count).name + "이름을 저장했습니다.");
            count++;

            // 객체->리모콘(참조값)
            System.out.println(p1);

            // 객체 -> 변수(상태) + 매서드 (동작)
            System.out.println(p1.age); // 직접 접근해서 가지고 와야한다.

        }


    }
}
