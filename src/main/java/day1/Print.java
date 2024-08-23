package day1;

public class Print {

    // 주석(comment) : 사람이 보기 위한 코멘트, 컴퓨터는 무시합니다(한줄주석)
//    ㅂㅂㅂ
//        ㅂㅂㅂㅂ
//            ㅂㅂㅂ
//   여러줄 주석 : 주석 하고 싶은 곳 영역을 잡아서 ctrl + /

    public static void main(String args[]){
        // main을 찾아서 프로그램 끝과 시작을 찾는다(무조건 main 입력해야함)
        // 프로그램 명령어(코드)는 위에서 아래로 순차 실행.

        // 출력 : 어떤 값을 눈에 보이게 해줌
        //System.out.print() 괄호 안의 값을 콘솔에 출력
        System.out.print(100);
        System.out.print(777);

        // 출력 -> System.out.println() : 출력 후 줄바꿈 해주는 명령어
        System.out.println(100);
        System.out.println(777);

        // 문자의 경우는 ""를 이용해 구별해야 한다.
        // 모든걸 명렁어로 인식하기 때문에 ""으로 단순 문자라는것을 인식
        System.out.println("차태진");

        // 더하기 출력
        System.out.println(100+200);

        // 100 + 200 = 300 수식 전체를 표현하고 싶을 때
        System.out.println("100 + 200 = 300");

        // 문자 + 문자 => 이어붙이기
        // 숫자 + 숫자 => 더하기 산술 연산
        // 문자 + 숫자 => 숫자가 문자가 되어서 이어붙이기
        // 문자 + (숫자연산)
        System.out.println("100 + 200 = 100 + 200");
        System.out.println("100 + 200 = "+ 300);
        System.out.println("100 + 200 ="+ 100 + 200);
        System.out.println("100 + 200 ="+ (100 + 200));
        // 숫자를 문자화 시킨다음 이어붙임 (100 + 200 =100200)
        // 우선순위가 없어서 오른쪽부터 읽어 문자화시킴

        // 하나의 출력문에서 줄바꿈하기
        // 줄바꿈 문자 : \n
        System.out.println("안녕하세요 \n반갑습니다");

        // 구구단 2단을 System.out.println 한번만 사용해서 출력해주세요.
        // 2 x 1 = 2
        // ...
        // 2 x 9 = 18
        System.out.println("==구구단 2단==\n" +
                "2 x 1 = 2\n" +
                "2 x 2 = 4\n" +
                "2 x 3 = 6\n" +
                "2 x 4 = 8\n" +
                "2 x 5 = 10\n" +
                "2 x 6 = 12\n" +
                "2 x 7 = 14\n" +
                "2 x 8 = 16\n" +
                "2 x 9 = 18\n");

        System.out.println("==구구단 2단.v==\n" +
                "2 x 1 = "+(2*1) +
                "\n2 x 2 = "+(2*2)  +
                "\n2 x 3 = "+(2*3) +
                "\n2 x 4 = "+(2*4) +
                "\n2 x 5 = "+(2*5) +
                "\n2 x 6 = "+(2*6) +
                "\n2 x 7 = "+(2*7) +
                "\n2 x 8 = "+(2*8) +
                "\n2 x 9 = "+(2*9));


        /**
         *
         * 문서화 주석
         *
         */
        /*
            여러 줄을 주석차리함
         */



    }
}
