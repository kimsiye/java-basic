package day3;

public class Object {
    public static void main(String[] args) {

        // 폴더 !-> 배열
        // int[] hong = new int[3]; // > 숫자만 들어감 {20,"홍길동","서울"}로 넣고 싶은데 (>> 배열로 불가능)

        // 폴더 -> 숫자, 문자 가리지 않고 다 저장 가능한 개념 ==> 객체
        // int[] // 숫자 꾸러미 > 배열


//        int age =20;
//        String name = "홍길동";
//        String home = "서울";
//
//        int age2 =30;
//        String name2 = "이순신";
//        String home2 = "대전";
//
//        System.out.println(age+"살,"+home+" 사는 "+name+"입니다.");
//        System.out.println(age2+"살,"+home2+" 사는 "+name2+"입니다.");

        // 정보가 낱개로 있으면 섞이거나 누락이 있을 수 있음
        // 방지하기 위해 폴더를 만들어서 해당 내용을 폴더에 저장

        // 사람 정보를 어디까지 받을건지 확인하고 표현 방식에 따라 달라딤
        // 사람을 표현하는 방법은 무한가지이다.
        // 자바는 변수 저장할 때 자료형을 요구
        // 객체는 먼저 어떻게 생겼는지 정의되어야 자바가 만들어줄 수 있다, 객체 생김새를 자바에 알려줘야함
        // --> 설개도(class)를 먼저 만든다.
        // 개념을 자바에게 알려줘야함
        //

        // 배열로 사람을 표현하는데 한계가 있음 문자와 숫자를 다 같이 이용하고 싶은데 안되니깐
        // 사람에 대한 정보 값을 자바에 설계도(class)를 그려 알려줌

        // Person c;  // 폴더가 만들어졌는가? x
        // c = new Person(); // Person 설계도에 따라서 객체를 하나 만들어줘, 그리고 c변수에 담아줘
        // 새로 만든다. 클래스이름을


        // 객체, 클래스

        // 클래스 = 원본
        // 객체(인스턴스)  =  클래스의 복사본, 여기에 데이터를 집어넣음 >>  복사본을 만드는것이 new

        // 객체 구별을 위해 변수에 담는다 /  클래스(원본_ 변수명 = 뉴 객체(사본)
        Person hong = new Person();
        Person lee = new Person();

        hong.age = 20;
        hong.name = "홍길동";
        hong.home = "서울";

        lee.age = 30;
        lee.name = "이순신";
        lee.home = "대전";

        System.out.println(hong.age + "살, " + hong.home + " 사는 " + hong.name + "입니다.");
        System.out.println(lee.age + "살, " + lee.home + " 사는 " + lee.name + "입니다.");

        // 좀더 명확해짐


        // 클래스 + 매인 > 프로그램 메인, 딱 하나 만듬, 내 프로그램의 시작점
        // 클래스 > 데이터 묶음 활용, 안에 쓰는 클래스는 메인이 없이 사용







    }
}
