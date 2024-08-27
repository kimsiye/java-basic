package day3.methodExam;

public class Method {
    public static void main(String[] args) {
        // 문제 : 자동차가 3번 달리게 해주세요.
        // 출력 : 자동차가 달립니다.

        Car car1 = new Car();
        car1.type = "모닝";
        car1.color = "검정색";
        car1.speed = 220;

        Car car2 = new Car();
        car2.type = "소나타";
        car2.color = "흰색";
        car2.speed = 250;

        Car car3 = new Car();
        car3.type = "캐스퍼";
        car3.color = "갈색";

        //v1. 1개의 자동차가 3번 달리게 해주세요.

        car1.run();
        car1.run();
        car1.run();

        //v2. 3개의 자동차가 1번씩 달리게 해주세요.

        car1.run1();
        car2.run1();
        car3.run1();

        car1.run();
        car2.run();
        car3.run();

        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.


        // 문제 : 자동차 객체를 담을 변수를 만들어주세요.
        // 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
        // 각 자동차가 자신의 최고속력으로 달리게 해주세요.

        car1.speed();
        car2.speed();

        // 출력 : 자동차가 최대속력 220km로 달립니다.
        // 출력 : 자동차가 최대속력 250km로 달립니다.

    }
}
