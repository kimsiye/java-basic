package day8.accessModfier;

public class Calculator {
    private int num1 = 10;
    private int num2 = 2;

    // 메서드는 변수를 사용해서 작동하는게 대부분
    // 객체의 변수에 잘못된 정보가 들어오면 메서드가 고장난다.
    // 객체의 변수는 함부로 바꾸면 안된다.
    public void divide(){
        System.out.println(num1/num2);
    }

    // 숫자의 값을 설정하는 매서드를 만듬
    // public을 사용하지 않고, private로 변경되어 임의로 변경할 수 없어서

    // setter
    // 명명규칙 set변수명() -> 카멜표기법
    // 변수명 > 클래스의 변수 이름
    // 도구의 도움을 받을 수 없음 이렇게 만들어진다고 생각하고
    // 구동되기 때문에

    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        if(num2 == 0){
            System.out.println("0은 나눌 수 없습니다. 가본값인 1로 초기화합니다.");
            num2 = 1;
        }
        this.num2 = num2;
    }

    // getter
    // 명명규칙 get변수명() -> 카멜표기법
    public int getNum1 (){
        return num1;
    }
}
