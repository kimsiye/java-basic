package day1;

public class Loop {
    public static void main(String[] args) {
        // 동일한 코드를 반복할 때 사용

//        whlie (참조건일 때 실행){
//            System.out.println("안녕하세요");
//        }

        int count = 0 ;
        count = 0;

//        while(count == 0){
//            System.out.println("안녕하세요");
//            count = 1; // (변수가 바뀌고 거짓이기 때문에 실행이 한번만 됨)
//        }

        while(count < 10){
            System.out.println("안녕하세요");
            count++ ; // 변수++ > 변수에 1씩 증가
        }


        int count2 = 0; // 변수를 만듬과 동시에 저장

        while(count2 < 10){
            System.out.println(count2);
            count2++;
        }

        // for < 시작할 변수, 범위 조건, 증가감소 를 한번에
        for(int count3 = 0; count3 <10; count3++){
            System.out.println("화이팅");
        }

        for(int i = 1; i<=100; i++){
            System.out.println(i);
        }

    }
}
