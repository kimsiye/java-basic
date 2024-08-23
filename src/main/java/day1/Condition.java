package day1;

public class Condition {
    public static void main(String[] args) {
        // 조건
        // if(조건){참일때 실행할 코드}
        // 조건이 참일때만 코드가 실행이 됨
        // alt + shite 로 왔다갔다 할 수 있음
        if(false){
            System.out.println("안녕");
        }

        if(true){
            System.out.println("안녕");
        }

        int num;
        num = 15;

        if(num > 10) {
            System.out.println("num이 10보다 크다");
        }

        int money;
        money = 1000;

        // 1만원 이상 : 치킨
        // 1만원 미만 : 떡볶이

        if(money >= 10000){
            System.out.println("치킨을 먹어요");
        }
        if(money < 10000){
            System.out.println("떡볶이을 먹어요");
        }

        // "맑음: 날씨가 맑습니다. 나들이 나가세요."
        // "흐림: 날씨가 흐립니다. 집에 계세요."
        // "비 : 날씨가 비가 옵니다. 우산을 챙기세요."
        // "눈 : 날씨가 눈이 옵니다. 눈사람 만들어보세요."

        int weather;
        weather = 1; // 1. 맑음, 2. 흐림, 3. 비, 4. 눈

        // 실행될 경우의 수가 4 > if문 4개

        if(weather == 1){
            System.out.println("맑음: 날씨가 맑습니다. 나들이 나가세요.");
        }
        if(weather == 2){
            System.out.println("흐림: 날씨가 흐립니다. 집에 계세요.");
        }
        if(weather == 3){
            System.out.println("비 : 날씨가 비가 옵니다. 우산을 챙기세요.");
        }
        if(weather == 4){
            System.out.println("눈 : 날씨가 눈이 옵니다. 눈사람 만들어보세요.");
        }

        // 나이에 따른 학적 표현
        // 초등학생, 중학생, 고등학생, 성인
        // 13 이하 초등학생
        // 16 이하는 중학생
        // 19 이하는 고등학생
        // 20 이상은 성인

        // if문 중첩
        int age;
        age = 16;

        if (age <= 13){
            System.out.println("초등학생");
        }
        if (age <= 16){
            if(age > 13){
            System.out.println("중학생");
            }
        }
        if (age <= 19){
            if(age > 16) {
                System.out.println("고등학생");
            }
        }
        if (age >= 20){
            System.out.println("성인");
        }


    }
}
