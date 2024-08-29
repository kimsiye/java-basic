package day5.arrayListExam1;

import java.util.ArrayList;

public class Exam2 {
    public static void main(String[] args) {
        // 선언
        // 이름을 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
        ArrayList<String> name = new ArrayList<>();

        // add()
        // 리스트에 값을 추가해주세요.
        // "홍길동", "이순신", "황진이", "임꺽정", "강감찬", "을지문덕" 을 ArrayList에 추가 해주세요.
        name.add("홍길동");
        name.add("이순신");
        name.add("황진이");
        name.add("임꺽정");
        name.add("김깅찬");
        name.add("을지문덕");

        // size()
        // 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
        // 출력결과 : 6
        System.out.println(name.size());
        System.out.println("========");

        // get()
        // 리스트의 2,3 인덱스의 값을 출력해주세요.
        // 출력결과 : 황진이, 임꺽정
        System.out.println(name.get(2));
        System.out.println(name.get(3));
        System.out.println("========");

        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 홍길동 이순신 황진이 임꺽정 강감찬 을지문덕
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
        System.out.println("========");

        // remove()
        // 리스트에서 홍길동, 이순신을 지운 뒤, 다시 2,3 인덱스의 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
        // 출력 결과 : 강감찬, 을지문덕
        name.remove(0);
        name.remove(0); // 홍길동이 0번이었지만 지워지고 이순신이 0번째가 됨System.out.println(name.get(2));
        System.out.println(name.get(3));
        System.out.println("========");

        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 황진이 임꺽정 강감찬 을지문덕
        for(int i = 0; i<name.size(); i++){
            System.out.println(name.get(i));
        }
        System.out.println("========");

        // add()
        // 리스트에 정약용을 추가시켜주세요.
        name.add("정약용");

        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 황진이 임꺽정 강감찬 을지문덕 정약용
        for(int i = 0; i<name.size(); i++){
            System.out.println(name.get(i));
        }
        System.out.println("========");

        // set()
        // 임꺽정과 을지문덕을 신사임당과 유관순으로 바꿔주세요.
//        name.set(1, "신사임당");
//        name.set(3, "유관순");
        // ArrayList에서 찾을 때 일일이 찾지 말고 반복문을 사용하러 것
        for(int i = 0; i<name.size(); i++){
            if(name.get(i).equals("임꺽정")){
                name.set(i, "심사임당");
            }
            if(name.get(i).equals("을지문덕")){
                name.set(i, "유관순");
            }
        }

        // 리스트의 모든 값을 출력해주세요.
        // 출력 결과 : 황진이 신사임당 강감찬 유관순 정약용
        for(int i = 0; i<name.size(); i++){
            System.out.println(name.get(i));
        }
        System.out.println("========");

        // 리스트에서 황진이 신사임당 유관순만 출력해주세요.
        // 출력 결과 : 황진이 신사임당 유관순
        System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println(name.get(3));

        System.out.println("========");

    }
}
