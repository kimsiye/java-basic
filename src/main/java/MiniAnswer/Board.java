package MiniAnswer;

import MiniProject.TextBoardContent;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Post> posts = new ArrayList<>();
        int lastestId = 1;
        // .최근까지 저장된 아이디 값을 저장함
        // 가장 최신의 id값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획임. > 고유값으로 객체와 같이 저장


        String command;
        while (true) {
            System.out.println("명령어 : ");
            command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                System.out.println("게시물 제목을 입력해주세요");
                String title = sc.nextLine();
                System.out.println("게시물 내용을 입력해주세요");
                String body = sc.nextLine();

                // 1부터 1씩 증가 : 쉬운방법 (id값은 중복되면 안됨, 고유해야함)

                // title 과 body를 묶을 수 있는 배열리스트

//                Post post = new Post();
//                post.setTitle(title);
//                post.setBody(body);

                // 생성자 이용 예시
                Post post = new Post(lastestId, title, body);

                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
                lastestId++;

            } else if (command.equals("list")) {
                System.out.println("====================");
//                for (int i = 0; i < posts.size(); i++) {
//                    System.out.println("====================");
//                    System.out.printf("제목 : %s \n", posts.get(i).getTitle());
//                    System.out.printf("내용 : %s \n", posts.get(i).getBody());
//                }
                for (Post post : posts) {// posts 배열 5에서 첫번때부터 post에 담아줌
                    System.out.printf("제목 : %s\n", post.getTitle());
                    System.out.printf("내용 : %s\n", post.getBody());
                    System.out.println("==================");
                    // i이 사용 못함/영상 다시 확인 ㅠ
                }

            } else if (command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());
                // 인덱스와 상관 없음

                // 논리연산자
                // 조건1 || 조건2 -> 조건1 조건2 둘 중 하나만 만족해도 실행
                // 조건1 && 조건2 -> 조건1 조건2가 동시에 만족(모두 만족)해야만
                // 둘중에 하나만 맞으면 실행|| , 둘다 맞으면 실행 && : 논리연산자
//                if (targetIdx < 0 || targetIdx >= posts.size()) {
//                    System.out.println("없는 게시물 입니다.");
//                    continue;
//                }
                for (Post post : posts) {// posts 배열에서 하나씩 꺼내서 id 값과 일치하는지 확인
                    if (post.getId() == targetId) {
                        System.out.print("수정할 제목 : ");
                        String newTitle = sc.nextLine();
                        System.out.print("수정할 내용 : ");
                        String newBody = sc.nextLine();

                        post.setTitle(newTitle);
                        post.setBody(newBody);
                        System.out.println("수정이 완료되었습니다.");
                        break;
                    }
                }

//                Post newPost = new Post(newTitle, newBody);
//                posts.set(targetIdx - 1, newPost); // 원하는 위치의 post를 newPost로 교체

//                Post post = posts.get(targetIdx - 1);
//                post.setTitle(newTitle);
//                post.setBody(newBody);

                System.out.println("수정이 완료되었습니다.");

            } else if (command.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());

                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        posts.remove(post); // index가 아닌 값을 넣어서 해당 값을 삭제할 수도 있다.
                        System.out.println("삭제가 완료되었습니다.");
                        break;
                    }
                    // 객체를 넣으면 해당 객체를 삭제해줌
                }

            }
        }


    }
}
