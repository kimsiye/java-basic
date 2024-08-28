package day4.methodReturnExam;

public class ExamReturn4 {

    public void printEven(int n) {
        for(int i = 1; i<= n; i++ ){
            if(isEven(i)){
                System.out.print(i);
            }

        }
        System.out.println();
    }

    public boolean isEven(int num) {
        return num%2 == 0;
    }
}
