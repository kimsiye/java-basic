package day4.methodReturnExam;
// 1 부터 n까지 수 중 짝수인 것만 출력
// Test class에 있는 printEven과 isEven을 완성하여 해결해주세요,
public class Exam4 {
    public static void main(String[] args) {
        ExamReturn4 t1 = new ExamReturn4();

        t1.printEven(10); // 출력: 2 4 6 8 10
        t1.printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        t1.printEven(5); // 출력: 2 4
    }
}
