package MiniProject;

import java.util.Scanner;

public class TextBoardRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function textBoardFunction = new Function();

        // equals() 문자열 같은지 확인
        while (true) {
            System.out.println("기능 : exit, add, list, update, delete, detail ");
            System.out.print("명령어 입력 : ");
            String command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                textBoardFunction.plus();
                // new로 만들어서 객체로 사용하지 않고
                // 클래스에서 바로 붙여서 사용하면 static이 붙음
            } else if (command.equals("list")) {
                textBoardFunction.list();
            } else if(command.equals("update")){
                textBoardFunction.update();
            }else if(command.equals("delete")){
                textBoardFunction.delete();
            }else if(command.equals("detail")){
                textBoardFunction.detail();
            }

        }

    }
}
