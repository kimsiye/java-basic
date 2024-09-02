package day7.polymopism.exam1;

public class Exam1 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.나이 = 20;
        a전사.a무기 = new 활();
        a전사.a무기 = new 칼();
    }
}

class 전사 { // 부모 클래스
    int 나이;
    무기 a무기 ;
}


class 무기 {
    void a무기(){
        System.out.println("활");
    }
}

class 활 extends 무기{
    void a무기(){
        System.out.println("활");
    }
}
class 칼 extends 무기{
    void a무기(){
        System.out.println("칼");
    }
}
