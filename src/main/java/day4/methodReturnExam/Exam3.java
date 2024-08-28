package day4.methodReturnExam;

public class Exam3 {
    public static void main(String[] args) {
        ExamReturn3 t1 = new ExamReturn3();

        // 0은 양수로 보겠습니다.
        int no = -80;

        if(t1.isNegative(no) < 0) {

            System.out.println("음수입니다.");

        } else {

            System.out.println("양수입니다.");

        }
        // no 값을 바꿔가면서 테스트해보세요.
    }
}
