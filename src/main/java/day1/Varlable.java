package day1;

public class Varlable {
    public static void main(String[] args) {
        //  main 후 자동 출력 됨
        // 홍길동 나이가 20.
        // 홍길동 나이가 21로 올라감
        System.out.println(21);
        System.out.println(21);
        System.out.println(20); // > 오류 해결
        System.out.println(21);
        System.out.println(21);

        // 변수를 사용해서 값을 저장할 수 있다.
        // 변수는 상자, 같은 상자일때 어디에 들어있는지 모름 > 이름을 적어놔야함
        // 냉장고는 냉장고를 담을 수 있는 크기 , 담을 것에 따라 크기가 달라짐
        // 상자는 이름이 있어야하고 크키와 모양이 있으어함

        // 숫자
        // 상자(변수)를 만들어야함
        int age;//[숫자 이름 ;]

        // 값을 변수에 담아야함.
        // = 을 이용해서 저장가능
        age = 20;

        // 문자
        String name; // [문자 이름;]
        name = "홍길동";

        // 변수의 값을 꺼내서 사용
        System.out.println(age); // () 변수명을 넣으면 변수가 담겨져 있는 값이 출력됨
        System.out.println(20); // =
        System.out.println(name);

        // 안녕하세요 저는 20살 홍길동입니다. 10번 출력.
        System.out.println("안녕하세요 저는 "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요 저는 "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요 저는 "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요 저는 "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요 저는 "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요 저는 "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요 저는 "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요 저는 "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요 저는 "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요 저는 "+age+"살 "+name+"입니다.");

        // 홍길동의 나이가 21살이 되었습니다. 21살로 바꿔서 10번 출력해주세요.
        age = 21;
        System.out.println("안녕하세요 저는 "+age+"살 "+name+"입니다.");

        // 홍길동이 홍길만으로 개명을 했습니다. 바뀐 이름을 적용해서 10번 출력해주세요.
        name = "홍길만" ;
        System.out.println("안녕하세요 저는 "+age+"살 "+name+"입니다.");

        // 선생님 풀이
        // 안녕하세요 저는 20살 홍길동입니다. 10번 출력.

        // 홍길동의 나이가 21살이 되었습니다. 21살로 바꿔서 10번 출력해주세요.

        // 홍길동이 홍길만으로 개명을 했습니다. 바뀐 이름을 적용해서 10번 출력해주세요.

        int age2;
        age2 = 20;

        String name2;
        name2 = "홍길만";

        System.out.println("안녕하세요 저는 "+age2+"살 "+name2+"입니다.");
        System.out.println("안녕하세요 저는 "+age2+"살 "+name2+"입니다.");
        System.out.println("안녕하세요 저는 "+age2+"살 "+name2+"입니다.");
        System.out.println("안녕하세요 저는 "+age2+"살 "+name2+"입니다.");
        System.out.println("안녕하세요 저는 "+age2+"살 "+name2+"입니다.");
        System.out.println("안녕하세요 저는 "+age2+"살 "+name2+"입니다.");
        System.out.println("안녕하세요 저는 "+age2+"살 "+name2+"입니다.");
        System.out.println("안녕하세요 저는 "+age2+"살 "+name2+"입니다.");
        System.out.println("안녕하세요 저는 "+age2+"살 "+name2+"입니다.");
        System.out.println("안녕하세요 저는 "+age2+"살 "+name2+"입니다.");
        System.out.println("안녕하세요 저는 "+age2+"살 "+name2+"입니다.");

        // 변수 사용시 주의사항
        // 동일한 이름의 변수가 2개 이상 존재할 수 없다.
        // 변수명이 숫자나 특수기호로 시작해서는 안된다. 숫자에 한해서는 뒤쩍에 붙이는건 가능
        // 변수는 재활용 가능
            /* int a ; > 최초로 한번 만든다
            * a = 10 ;
            * a = 20 ;
             */
        // 변수는 = 기준 왼쪽, 저장할 값은 오른쪽


















    }
}
