package day7.constructerchain;

public class ConsturcterChain {
    public static void main(String[] args) {
        WhiteDuck d1 = new WhiteDuck();
        d1.fly();

    }
}

// 덕을 먼저 생성 후 화이터 덕 생성
class Duck{
    public Duck(){
        System.out.println("Duck이 생성됩니다.");
    }
    public void fly(){
        System.out.println("오리가 납니다.");
    }
}

class  WhiteDuck extends Duck {
    public WhiteDuck(){
        System.out.println("WhiteDuck이 생성됩니다.");
    }
    public void fly(){
        System.out.println("오리가 안 납니다.");
    }
    // 부모에 물려받은 매서드를 이름만 같되 내용을 바꾸면
    // 자식이 수정한 매서드가 실행됨
    // 동일한 매서드가 있을 때 자기자신의 매서드를 우선적으로 사용하함
    // 상속은 부모 객체를 만들고 위에 자식 객체가 만들어진다.
    // 자신이 가지고 있는 매서드를 우선적으로 사용한다.
}
