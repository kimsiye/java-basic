package day7.comPosition;

public class Composition {
    // 로키 Composition 영상 참고
    public static void main(String[] args) {
       Kildong dong = new Kildong();
       Kilsoon soon = new Kilsoon();

       // 자바는 내가할게, 대신 너는 파이썬을 해
        // 같이 공부하는건 비효율적
       dong.java();
       soon.java(); // 길순아 자바프로그래밍 해줘

    }
}

class JavaDevelop{
    void java(){

    }
}
class Kildong extends JavaDevelop{
    public void java(){
        System.out.println("자바 22버전 프로그래밍");
    }
//    public void python(){
//        System.out.println("파이썬 프로그래밍");
//    }

}
class Kilsoon {
//    public void java(){
//        System.out.println("자바 22버전 프로그래밍");
//    }
    Kildong kildong = new Kildong(); // wjsghkqjsgh

    public void java(){
        // 길동이에게 연락(리모컨)
        kildong.java();
    } // 자바 출력하는 프로그래밍이 없지만 자바 프로그래밍하는것처럼 보임

    public void python(){
        System.out.println("파이썬 프로그래밍");
    }
}
// 자바 프로그램 업데이트 > 길동이가 배우고 길순이가 길동이 자바를 사용
// 다른 객체의 도움을 받아서 사용하는 것을 컴포지션이라고 함

class Jinee  extends JavaDevelop{
    public void java() {
        System.out.println("아주 뛰어난 자바 프로그래밍");
    }
}