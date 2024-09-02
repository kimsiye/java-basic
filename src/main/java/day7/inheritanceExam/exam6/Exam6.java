package day7.inheritanceExam.exam6;
/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
- D1 완료 : 클래스와 메서드를 만들어서 처리
- D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
- D2 완료 : 클래스와 메서드를 만들어서 처리
- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
- D3 완료 : 상속을 사용해서 처리
- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
- D4 완료 : 클래스와 메서드를 만들어서 처리
- D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다. 고무오리 계열은 하늘을 날 수 없게 해주세요.
- D5 완료 : 메서드 오버라이드를 사용해서 처리
- D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
*/
public class Exam6 {
    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.fly();
        // 출력 : 오리가 날개로 날아갑니다.

        Mallard mallard = new Mallard();
        mallard.fly();
        // 출력 : 오리가 날개로 날아갑니다.

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        RubberDuckTwo rubberDuckTwo = new RubberDuckTwo();
        rubberDuckTwo.fly();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
    }
}
class Bird {
    void fly() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}
class Duck extends Bird{

}
class WhiteDuck extends Bird{

}
class Mallard extends Bird{

}
class RubberDuck extends Bird {
    void fly() {
        System.out.println("저는 날 수 없어요. ㅜㅜ");
    }
    // 상속을 받되 상속 받은 매서드를 재정의함 : 매서드 오버라이드
}
class RubberDuckTwo extends RubberDuck {

}

// 오리 => 부모 클래스
// 흰오리 => 자식 클래스
// 흰오리 extends 오리 => 흰오리가 오리의 능력을 물려 받는다.
// "`흰오리`는 `오리`이다." 라고 자바에게 알려준다.

// `A 는 B 이다.` 테스트에 통과하는 것만 상속이 가능하다.
// 클래스와 객체는 명사이다.
// 메서드는 동사이다.