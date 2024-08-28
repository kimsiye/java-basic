package day4.methodReturn;

public class Return {
    public static void main(String[] args) {
        // 매서드는 값을 표현할 수도 있고, 아닐 수도 있다.


        // 매서드는 값을 리턴할 수 있는데 리턴 값이 필요한 이유는
        // 매서드가 리턴한 값을 다양하게 2차작업 할 수 있기 때문
        Test t1 = new Test();
        t1.plus(10,20); // 30

        // 10, 20 더한 값에서 2로 나누고 싶다

        t1.plus2div(10,20,2);
        int num = t1.plus(10,20);
        System.out.println(num);
        System.out.println(num/2);

        // 10,20 더한 값에서 2배로 하고 싶다.
        System.out.println(num*2);

        // 문제. Test에 원의 넓이 구하는 메서드 만들기
        // 원의 넓이 : 반지름 * 반지름 * 3.14
        Test t2 = new Test();
        // 반지름이 5인 원의 넓이 :
        int radius = t2.radius(5);
        System.out.println(radius * 3.14);
        // 반지름이 10인 원의 넓이 :
        radius = t2.radius(10);
        System.out.println(radius * 3.14);
        // 반지름이 5인 원의 넓이를 3으로 나눈 값 :
        radius = t2.radius(3);
        System.out.println(radius * 3.14/2);
        // 반지름이 10인 원의 넓이를 2배로 증가시킨 값
        radius = t2.radius(10);
        System.out.println(radius * 3.14*2);

        // 문제. Test에 원의 넓이 구하는 메서드 만들기
        // 원의 넓이 : 반지름 * 반지름 * 3.14
        Test t3 = new Test();
        // 반지름이 5인 원의 넓이 :
        double radius2 = t3.radius2(5);
        System.out.println(radius2);
        // 반지름이 10인 원의 넓이 :
        radius2 = t3.radius2(10);
        System.out.println(radius2);
        // 반지름이 5인 원의 넓이를 3으로 나눈 값 :
        radius2 = t3.radius2(3);
        System.out.println(radius2/2);
        // 반지름이 10인 원의 넓이를 2배로 증가시킨 값
        radius2 = t3.radius2(10);
        System.out.println(radius2*2);

        // 선생님 풀이
        double result = t1.circleArea(5);
        System.out.println(result);

        double result2 = t1.circleArea(10);
        System.out.println(result2);

        System.out.println(result/3);

        System.out.println(result2/2);

    }
}
