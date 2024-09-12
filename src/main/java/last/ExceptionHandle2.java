package last;

public class ExceptionHandle2 {
    public static void main(String[] args) {
        try {
            test(0);
        } catch (Exception e) {
        }
    }

    public static void test(int flag) throws Exception {
        // 예외 직접 발생시키기 -> 테스트 용도/어떤 상황에서는 프로그램 진행되는 것보다 강제로 종료시키고
        // 바로 고치는게 나을 수도 있다.(애매한 상황)

        if (flag == 1) {
            try {
                throw new Exception(); // unhangle exception, check exception > 무조건 try-catch 예외처리강제
            } catch (Exception e) {

            }
        } else if (flag == 2) {
            throw new RuntimeException(); // RuntimeException, uncheck exception > 무조건 try-catch 예외처리안해도 됨
        }

        if (flag == 1) {

            throw new Exception(); // unhangle exception, check exception > 무조건 try-catch 예외처리강제


        } else if (flag == 3) {
            throw new RuntimeException(); // RuntimeException, uncheck exception > 무조건 try-catch 예외처리안해도 됨
        }


    }
}
