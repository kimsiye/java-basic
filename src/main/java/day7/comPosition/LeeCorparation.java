package day7.comPosition;

public class LeeCorparation {
    public static void main(String[] args) {

        // Kildong이와 Kilsoon이를 고용해서 leeCorp가 java와 python 수주가 가능하도록 해주세요.
        // Kildong2 kildong2 = new jinee;
        // 자료형이 일치해야 변수를 저장해주는데 일치하지 않아서 저장못함

        LeeCorp leeCorp = new LeeCorp();
        leeCorp.develop = new Kildong();
        leeCorp.kilsoon = new Kilsoon();

        leeCorp.java(); // 자바 프로그래밍
        leeCorp.python(); // 파이썬 프로그래밍
    }
}

class LeeCorp {
    //Kildong kildong;
    // 회사가 생기면서 길동이 자리에 생김
    // 회사르 설립하고 피워둔다음 위에 길동의 자리를 만들 수 있음
    Kilsoon kilsoon ;
    JavaDevelop develop; // 누구나 올 수 있음
    // 자바 개발자 부모 클래스를 만들고 실행시키는 코드를 만듬
    // 자바 개발자들을 자식 클래스를 만들고
    // 파일에


    public void java() {
        develop.java();
    }

    public void python() {
        kilsoon.python();
    }
}
// 수시로 바꾸고 싶은데 클래스를 매번 바꿔서 수정해야하는 것이 불편하다.


