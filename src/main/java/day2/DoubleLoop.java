package day2;

public class DoubleLoop {
    public static void main(String[] args) {

        // while, for (대부분 for문을 많이 씀)

        //

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // for문 안에 for(이중반복문)

        // 개인이 최대한 고민할 수 있는 시간 정한다(15분, 하루, 일주일, 고민)
        // 막혀서 나아갈 수 없을 때 검색(구글, GPT)을 통해 해결
        // 직접 타이핑을 해서 원리 파악하기
        // 검색(구글, GPT)을 통해 해결 안될때 질문

        for (int num = 1; num <= 9; num++) {
            System.out.println("2 * " + num + " = " + (2 * num));
        }

        for(int dan = 1; dan <= 9; dan++){
            for (int num = 1; num <= 9; num++) {
                System.out.println(dan + " * " + num + " = " + (dan * num));
            }
        }


    }
}
