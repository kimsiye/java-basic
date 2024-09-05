package MiniAnswer;

import MiniAnswer.Post.PostController;

import java.util.Scanner;



public class BoardApp {

    Scanner sc = new Scanner(System.in);
    PostController postController = new PostController();
    public void run() {

        while (true) {
            System.out.println("명령어 : ");
            String command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else if (command.equals("add")) {
                postController.add();

            } else if (command.equals("list")) {
                postController.list();

            } else if (command.equals("update")) {
                postController.update();

            } else if (command.equals("delete")) {
                postController.delete();

            } else if (command.equals("detail")) {
                postController.detail();

            } else if (command.equals("search")) {
                postController.search();
            }
        }

    }



}
