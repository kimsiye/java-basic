package day3;

public class VariableScope {
    public static void main(String[] args) {
        // 역영(지역)
        // 변수는 지역에서 만들어진다.
        // {}
        // for,while 지역이 만들어짐

       // 변수는 해당 지역에서만 살아있다. 사용가능

       int a = 10 ;

        System.out.println(a);

        if(true){
            // 다른영역이지만 하위 영역이기에 변수의 영향을 받음
            System.out.println(a);
            int c = 0;
        }

        {
            int b = 20;
            System.out.println(b);
            // 하위 영역은 상위 영역에 영향을 줄 수 없다
            // 하위 영역 외의 영역에는 영향을 주지 않는다
        }
        // System.out.println(b); > 에러


        // ** 좀 놓쳐서 영상보고 좀 보완할 것

        // 서로 다른 지역에서 변수를 공유하고 싶으면 두 지역을 포함하는 더 큰지역에 변수를 만들어라





    }
}
