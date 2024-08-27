package day3;

// 명명규칙
// 클래스 명은 대문자로 시작
// 의미가 바뀔 때 대문자로 구분. 두 단어 이상의 조합으로 이름 지을 때
// 단어 의미가 바뀌면 바뀌는 단어의 앞문자를 대문자로
// 카멜표길법 : 단어의 앞에만 대문자로 만듬
// 함수나 변수는 소문자로 시작함

import java.util.Scanner;

public class NameApp2 {
    public static void main(String[] args) {

        // 명령어 입력 : help
        // add : 이름 입력
        // list : 이름 목록
        // exit : 종료
        // 명령어 입력 : add
        // 이름을 입력해주세요 : john
        // john이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // 1. john
        // =====================
        // 명령어 입력 : add
        // 이름을 입력해주세요 : tomas
        // tomas이 명부에 저장되었습니다.
        // 명령어 입력 : add
        // 이름을 입력해주세요 : chris
        // chris이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // 1. john
        // 2. tomas
        // 3. chris
        // =====================
        // 명령어 입력 : exit
        // 이름 프로그램이 종료됩니다.


        // 기능 순서
        // 4. help > 입력 후 3개 선택지
        // 1. add : 이름 추가 > 배열에 담기
        // 2. list : 배열 출력
        // 3. exit : 종료
        // 5. 명령어
        // 전체 묶음 if 조건일 때 가능하도록

        // 자바에서 문자값 비교는 변수명.equals("문자")
        // "문자" == "문자2" 틀린 비교
        // "문자1".equals("문자") 올바른 비교

        Scanner sc = new Scanner(System.in);

        // 변수 설정은 밖에 빼놓고 안에 변수명으로 사용하기
        int count = 0;
        String name;
        int output;
        int age;

        // 받을 배열 길이 저장
        String[] nameArr = new String[10];
        int[] ageArr = new int[10];
        // 사용자가 입력하기 입력전가지 모를때 갯수 임의로 넣기
        // []에는 배열을 얼마나 담을건지 숫자를 넣어야 함
        // 비어있을 때 숫자는 0, 문자는 null


        while (true) {
            System.out.println("\n명령어 : help, add, list, exit");
            System.out.println("명령어 입력 :");
            String commend = sc.nextLine();

            if (commend.equals("help")) {
                // 4. help > 명령어 종류 기능안내
                System.out.println("add : 이름 입력");
                System.out.println("list : 이름 목록");
                System.out.println("exit : 종료");
            } else if (commend.equals("add")) {
                System.out.print("\n이름을 입력하세요 : ");
                name = sc.nextLine();
                System.out.print("\n나이를 입력하세요 : ");
                age = Integer.parseInt(sc.nextLine());

                // 입력값 저장 ** 중요

                nameArr[count] = name;
                ageArr[count] = age;
                System.out.println(nameArr[count] + "이름을 저장했습니다.");
                count++;

            } else if (commend.equals("list")) {
                System.out.println("\n===== 이름, 나이 목록 ======");
                output = 0;
                while (output <= count - 1) {
                    System.out.println((output + 1) + ". " + nameArr[output]+", "+ageArr[output]);
                    output++;
                }
                System.out.println("=====================");
            } else if (commend.equals("exit")) {
                System.out.println("\n이름 프로그램이 종료됩니다.");
                break;
            } else {
                System.out.println("\n해당하는 명령어가 없습니다. 다시 입력해주세요.");
            }
        }

        {
            //        // 4. help > 명령어 종류 기능안내
//        System.out.print("add : 이름 입력");
//        System.out.print("list : 이름 목록");
//        System.out.print("exit : 종료");
//
//        // 1. add
//        // 입력 받을 값
//        System.out.print("이름을 입력하세요 : ");
//        String name = sc.nextLine();
//        // 받을 배열 길이 저장
//        String[] arr = new String [10]; // []에는 배열을 얼마나 담을건지 숫자가옴
//        // 입력값 저장
//        int count = 0;
//        while (count < arr.length){
//            arr[count] = name;
//            System.out.println(arr[count]+"이름을 저장했습니다.");
//            count++;
//            break;
//        }
//
//        // 2.list : 배열 출력
//        System.out.println("===== 이름 목록 ======");
//        int output = 0;
//        while (output <= count-1){
//            System.out.println((output+1)+". "+arr[output]);
//            output ++;
//        }
//        System.out.println("=====================");
//
//
//        // 3. exit : 종료
//        System.out.print("이름 프로그램이 종료됩니다.");
        }

        // 선생님 풀이
        {
//            Scanner sc = new Scanner(System.in);
//
//            while(true) {
//                System.out.print("명령어 : ");
//                String command = sc.nextLine();
//
//                if(command.equals("help")) {
//                    System.out.println("help");
//                } else if(command.equals("add")) {
//                    System.out.println("add");
//                } else if(command.equals("list")) {
//                    System.out.println("list");
//                } else if(command.equals("exit")) {
//                    System.out.println("exit");
//                }
//            }
//
//            // "문자1" == "문자2"  틀린 비교
//            // "문자1".equals("문자2") 올바른 비교
        }
        {
//            String command = sc.nextLine();
//
//            if(command.equals("help")) {
//                System.out.println("help");
//                System.out.println("add : 이름 추가");
//                System.out.println("list : 이름 목록 확인");
//                System.out.println("exit : 종료");
//            } else if(command.equals("add")) {
//                System.out.println("add");
//            } else if(command.equals("list")) {
//                System.out.println("list");
//            } else if(command.equals("exit")) {
//                System.out.println("exit");
//                System.out.println("이름 프로그램이 종료됩니다.");
//                break;
//            }
        }
        {
//            while(true) {
//
//                System.out.print("명령어 : ");
//                String command = sc.nextLine();
//
//                @@ -50,10 +50,12 @@ public static void main(String[] args) {
//                    System.out.println("list : 이름 목록 확인");
//                    System.out.println("exit : 종료");
//                } else if(command.equals("add")) {
//                    System.out.println("add");
//                    System.out.println("이름을 입력해주세요 : ");
//                    name = sc.nextLine();
//                    System.out.println(name + "이 명부에 저장되었습니다.");
//
//                } else if(command.equals("list")) {
//                    System.out.println("list");
//                    System.out.println(name);
//
//                } else if(command.equals("exit")) {
//                    System.out.println("이름 프로그램이 종료됩니다.");
//                }
        }
        {
//            // 배열이 어려우면 일단 한명의 이름을 저장하고 출력해본다.
//            Scanner sc = new Scanner(System.in);
//            String name = "";
////        String name = ""; // 변수를 배열로 교체
//            String[] names = new String[5];
//            int index = 0;
//
//            while(true) {
//
//                System.out.print("명령어 : ");
//                @@ -51,11 +54,15 @@ public static void main(String[] args) {
//                    System.out.println("exit : 종료");
//                } else if(command.equals("add")) {
//                    System.out.println("이름을 입력해주세요 : ");
//                    name = sc.nextLine();
//                    System.out.println(name + "이 명부에 저장되었습니다.");
//
//                    names[index] = sc.nextLine();
//                    System.out.println(names[index] + "이 명부에 저장되었습니다.");
//                    index++;
//
//                } else if(command.equals("list")) {
//                    System.out.println(name);
//                    for(int i = 0; i < index; i++) {
//                        System.out.println(names[i]);
//                    }
//
//                } else if(command.equals("exit")) {
//                    System.out.println("이름 프로그램이 종료됩니다.");
        }
        // git 빨간색 (직전코드에서 삭제)
        // git 초록색 (직전코드에서 추가)


    }

}
