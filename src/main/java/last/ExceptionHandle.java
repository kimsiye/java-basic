package last;

import java.util.ArrayList;

public class ExceptionHandle { // 예외처리
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("apple");
        arr.add("banana");
        arr.add("orange");

        //IndexOutOfBoundsException > 인덱스의 경게를 알려줌, 경고와 경고멘트를 띄우고 꺼버림
        //자바는 예외상황이 생기면 멈추고 Exception을 띄운다.

        // 얽혀있고 복잡한 것들
        // 실수해도 꺼져버림

        // 숫자 > 문자 입력 예외발생

        try {
            System.out.println(arr.get(3)); //> 에러 // 예외발생코드
        } catch (IndexOutOfBoundsException e) {

        }
        // 오류날 것 같은 에러를 시도하고 해당 오류를 잡으면 ~~해줘
        // 종료하는게 아니라 catch로 잡고 아래코드 실행함

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안돼요.");
        }

        try {
            System.out.println(arr.get(3));
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안돼요.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스를 벗어났습니다.");
        }finally { // 마지막 끝에 붙이는 것
            System.out.println("여기는 무조건 실행되고 끝남");
        }
        // 예외 발생코드 2개
        //catch을 여러개 붙여서 쓸 수 있다.

        // best try - catch를 최대한 사용 안하는게 좋다.
        // 몇가지 사황을 제외하고는 try-catch 사용 안하고 if로 처리 다 가능함.
        // 최대한 한곳에서 처리하고 받아서 처리

        // Post의 detail에서 상세보기 숫자를 입력 받는 곳에 문자를 넣었을 때
        // 숫자를 입력하라고 문구가 뜨고 다시 명령어로 전환시킴



//
//        public void detail() {
//            System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
//
//            int detailSelNum = getParsedInt(sc.nextLine(), -1);
//
//            if(detailSelNum == -1){
//                return; // 조건이 참일 때 호출한 곳으로 돌아감 함수를 종료하고 호출한 곳으로 값을 반환
//            }
//
//            Post post = postRepository.findPostById(detailSelNum);
//
//            if (post == null) {
//                System.out.println("존재하지 않는 게시물 번호입니다.");
//                return;
//            }
//
//            postView.printPostsDetail(post);
//
//        }
        //        public int getParsedInt(String value, int defaultValue){
//            try {
//                int parsedInt = Integer.parseInt(value);
//                return parsedInt;
//            }catch (NumberFormatException e){
//                System.out.println("숫자만 입력해주세요.");
//            }
//
//            return defaultValue; // defaultValue은 넣어도 무방한 숫자
//        }

        /*
        상세보기 번호 입력 안내 문구 출력
        숫자 문자 받는 메서드 실행

        ==
        매서드에 문자(선택된 숫자나 오류인 문자), 문자를 넣었을 때 반환될 숫자 > 이 숫자는 프로그램 내에서 의미없는 숫자여야함
        문자를 받아 숫자로 변환하는 코드가 에러 없이 실행되었을 때 입력 받은 숫자를 반환함

        문자를 받아 숫자로 변환되는 코드가 문자를 받아 에러가 실행되었을 때
        숫자를 입력하라는 문구가 나오고
        프로그램 내에서 의미없는 숫자를 반환시킴
        ==

        만약 반환된 숫자가 의미없는 숫자일 때 detail 코드 진행을 종료시킴
         */







    }
}
