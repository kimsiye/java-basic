package MiniProject;

import java.util.Scanner;

public class TxtBdSummary {

    Scanner sc = new Scanner(System.in);
    TxtBdApp txtBdAppRun = new TxtBdApp();

    public void run(){
        while (true) {
            System.out.println("기능 : exit, add, list, update, delete, detail, search, signup, login");
            String command ;
            if (txtBdAppRun.loginUser != null ){
                User user = txtBdAppRun.loginUser;
                System.out.printf("명령어 입력[" +
                        user.getUserId()+"(" +
                        user.getUserNickname()+")] : ");
                command = sc.nextLine();
            }else{
                System.out.printf("명령어 입력 : ");
                command = sc.nextLine();
            }


            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                txtBdAppRun.plus();
                // new로 만들어서 객체로 사용하지 않고
                // 클래스에서 바로 붙여서 사용하면 static이 붙음
            } else if (command.equals("list")) {
                txtBdAppRun.list();
            } else if(command.equals("update")){
                txtBdAppRun.update();
            }else if(command.equals("delete")){
                txtBdAppRun.delete();
            }else if(command.equals("detail")){
                txtBdAppRun.detail();
            }else if(command.equals("search")) {
                txtBdAppRun.search();
            }else if(command.equals("signup")){
                txtBdAppRun.signup();
            }else if(command.equals("login")){
                txtBdAppRun.login();
            }
    }



    }
}
