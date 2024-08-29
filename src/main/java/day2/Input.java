package day2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 프로그램이 일방적으로 보여줌
        // 출력은 우리들에게 보여줌, Input은 프로그램에 넣어줌
        // 사용자가 직접 전달하는게 유용
        // Input 문법 외우기

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();// 숫자를 입력받는 명령어
        // 여기에서 멈춤 > 입력 후 enter를 눌러야 진행됨
        System.out.println("당신이 입력한 첫번째 값은 : "+num1);

        int num2 = sc.nextInt();
        System.out.println("당신이 입력한 두번째 값은 : "+num2);

        System.out.println(num1+num2);

//`int choice = sc.nextInt();`와 `int choice = Integer.parseInt(sc.nextLine());`는
// 모두 사용자로부터 정수를 입력받는 방법이지만, 사용 상황에 따라 어느 것이 더 나은지 달라집니다.
//
//### 1. `int choice = sc.nextInt();`
//
//        - **장점**:
//        - `nextInt()`는 사용자 입력을 바로 `int` 타입으로 변환하므로 추가적인 변환 작업이 필요하지 않습니다.
//                - 간단하고 직관적입니다.
//
//        - **단점**:
//        - 입력을 받는 동안 입력 버퍼에 남아 있는 개행 문자(`\n`)를 무시하지 않기 때문에,
//        이후에 `nextLine()`을 사용할 때 예상치 못한 결과를 초래할 수 있습니다.
//        - 잘못된 형식(예: 사용자가 정수가 아닌 문자를 입력한 경우)의 입력을 받으면
//        예외(`InputMismatchException`)를 던집니다.
//
//### 2. `int choice = Integer.parseInt(sc.nextLine());`
//
//        - **장점**:
//        - `nextLine()`은 입력 버퍼를 모두 읽어오므로,
//        입력 버퍼 문제(특히 `nextInt()` 사용 후 개행 문자가 남아 있는 문제)를 피할 수 있습니다.
//        - 사용자가 입력한 데이터 전체를 문자열로 받고, 이후 필요한 형식으로 변환할 수 있습니다.
//        이로 인해 입력 오류를 더 쉽게 처리할 수 있습니다.
//
//                - **단점**:
//        - 입력된 데이터가 올바른 정수 형식이 아닐 경우,
//        `NumberFormatException`이 발생할 수 있습니다.
//        - 문자열을 정수로 변환하는 추가적인 작업이 필요합니다.
//
//### 어느 것이 더 나은가?
//
//        - **단순한 정수 입력 처리**: 만약 사용자가 정확히 정수만 입력할 것으로 예상된다면,
//        `sc.nextInt()`가 더 간단하고 직관적입니다.
//        - **더 복잡한 입력 처리**: 만약 입력 형식에 유연성이 필요하거나,
//        `nextInt()` 이후 다른 문자열 입력을 처리해야 한다면,
//        `sc.nextLine()`을 사용하여 모든 입력을 먼저 문자열로 받고
//        나중에 필요한 형식으로 변환하는 것이 더 안전할 수 있습니다.
//
//### 결론
//
//        일반적인 경우에는 `sc.nextInt()`를 사용하는 것이 좋지만,
//        이후의 입력을 처리해야 하거나 입력 오류를 쉽게 관리하고 싶다면
//        `Integer.parseInt(sc.nextLine())`를 사용하는 것이 더 나을 수 있습니다.


        String line = sc.nextLine();
        System.out.println(line);
        String word = sc.next();
        System.out.println(word);
        double d = sc.nextDouble();
        System.out.println(d);

        boolean bool = sc.nextBoolean();
        System.out.println(bool);

    }
}
