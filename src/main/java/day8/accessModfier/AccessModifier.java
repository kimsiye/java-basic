package day8.accessModfier;

//접근제어자
public class AccessModifier {
    public static void main(String[] args) {
        // 자원(변수+메서드)에 접근할 수 있는 권한
        // public : 모두 사용가능
        // protected : 상속 관계 + 같은 폴더 않에 있는 객체끼리 사용 가능
        // default : 같은 폴더 않에 있는 객체끼리 사용가능
        // private : 자신만 사용가능

        // 없으면 디폴트 사용할 수 있는 대상이 제한됨

        Calculator c1 = new Calculator();
        c1.divide(); // public로 이기 때문에 접근 가능
        // c1.num2 =0; // 여기서 0을 넣은게 문제의 원인
        // 누구나 접근해서 바꿔버릴 수 있게 한 것이 문제임
        // private를 이용해 Calculator의 데이터를 보호할 수 있다.

        // c1.num2 =0;이 num1이 private이라 접근 불가능
        c1.setNum1(10); // setNum1() 매서드는 Public이라 접근 가능
        c1.setNum2(0);

        // 변수나 메서드나 같은거 아님? 근데 왜 매서드로 해야함
        // 메서드는 로직을 짤 수 있음 0이 안들어오게 안정장치를 깔 수 있음

        c1.divide(); // (10/0) 컴퓨터 세계에서 에러

        // System.out.println(c1.num1);
        // 출력 불가

        System.out.println(c1.getNum1());

        // 객체 변수 만들 때는 private를 사용함
        // 그외 필요한 것들은 메서드를 만들어서 사용

        // 객체 변수는 객체 내의 모든 메서드에 영향을 주므로 외부의 접근 일반적으로
        // private으로 막는다.
        // 변수에 접근이 필요하면 getter setter 메서드 public으로 만들어 사용한다.


    }
}
