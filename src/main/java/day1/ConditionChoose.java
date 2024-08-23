package day1;

public class ConditionChoose {
    public static void main(String[] args) {
        // 택일 구조

        // 남여(양자택일)

        // 학적(사자택일)
        // 선택이 되면 나머지를 따질 필요가 없다.
        int age;
        age = 15;

        if (age <= 13) {
            System.out.println("초등");
        } else if (age <= 16) {
            System.out.println("중등");
        } else if (age <= 19) {
            System.out.println("고등");
        } else {
            System.out.println("성인");
        }
        // else 넣으면서 한 묶음이 됨
        // else로 if 두개를 묶는다 > 조건을 효율적으로 쓸 수 있음
        // 마지막을 제외한 모든것이 거짓일 때 나머지에서 완료 되도록
        // 조건없이 else만 넣으면 된다.

        // 성적(오자택일)

        // 점수가 90 ~ 100 : A
        // 점수가 80 ~ 89 : B
        // 점수가 70 ~ 79 : C
        // 점수가 60 ~ 69 : D
        // 점수가 60 미만 : F
        int score;
        score = 55;

        if (score < 60) {
            System.out.println("F");
        } else if (score <= 69) {
            System.out.println("D");
        } else if (score <= 79) {
            System.out.println("C");
        } else if (score <= 89) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }


        // ctrl + alt + L : 줄맞추기
    }
}
