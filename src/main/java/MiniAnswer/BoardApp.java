package MiniAnswer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {
    //main매서드와 findPostById 매서드가 같이 사용해야 하므로 main 밖에 두고 static을 붙인다.
    ArrayList<Post> posts = new ArrayList<>();

    public BoardApp(){
        // 생성자 안에서는 다양한 활동을 할 수 있음
        // 값 세팅 뿐만 아니라 로직도 추가 할 수 있음
        // 값의 초기화는 대부분 생성자엣 해주는 것을 권장합니다 다양한 로직 수행이 가능합니다.

        Post p1 = new Post(1,"aa java","내용",getCurrentDateTime(),0);
        Post p2 = new Post(2,"aa java","내용",getCurrentDateTime(),0);
        Post p3 = new Post(3,"aa java","내용",getCurrentDateTime(),0);
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);

    }
    // 일단 가져와서 적용하기
    // 적용하고 중복이 되면 매서드로 만들어서 사용하기



    public void run() {
        Scanner sc = new Scanner(System.in);
        int lastestId = 4;
        // .최근까지 저장된 아이디 값을 저장함
        // 가장 최신의 id값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획임. > 고유값으로 객체와 같이 저장

        while (true) {
            System.out.println("명령어 : ");
            String command = sc.nextLine();

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
                Post post = new Post(lastestId, title, body, getCurrentDateTime(),0);

                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
                lastestId++;

            } else if (command.equals("list")) {
                printPostList(posts);
//                System.out.println("====================");
//                for (int i = 0; i < posts.size(); i++) {
//                    System.out.println("====================");
//                    System.out.printf("제목 : %s \n", posts.get(i).getTitle());
//                    System.out.printf("내용 : %s \n", posts.get(i).getBody());
//                }
//                for (Post post : posts) {// posts 배열 5에서 첫번때부터 post에 담아줌
//                    System.out.printf("제목 : %s\n", post.getTitle());
//                    System.out.printf("내용 : %s\n", post.getBody());
//                    System.out.println("==================");
//                    // i이 사용 못함/영상 다시 확인 ㅠ
//                }

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
//                for (Post post : posts) {// posts 배열에서 하나씩 꺼내서 id 값과 일치하는지 확인
//                    if (post.getId() == targetId) {
//                        System.out.print("수정할 제목 : ");
//                        String newTitle = sc.nextLine();
//                        System.out.print("수정할 내용 : ");
//                        String newBody = sc.nextLine();
//
//                        post.setTitle(newTitle);
//                        post.setBody(newBody);
//                        System.out.println("수정이 완료되었습니다.");
//                        break;
//                    }
//                }

//                Post newPost = new Post(newTitle, newBody);
//                posts.set(targetIdx - 1, newPost); // 원하는 위치의 post를 newPost로 교체

//                Post post = posts.get(targetIdx - 1);
//                post.setTitle(newTitle);
//                post.setBody(newBody);

                Post post = findPostById(targetId);

                if (post == null) {
                    System.out.println("없는 게시물 입니다.");
                    continue;
                }

                System.out.print("수정할 제목 : ");
                String newTitle = sc.nextLine();
                System.out.print("수정할 내용 : ");
                String newBody = sc.nextLine();

                post.setTitle(newTitle);
                post.setBody(newBody);
                System.out.println("수정이 완료되었습니다.");


            } else if (command.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());

//                for (Post post : posts) {
//                    if (post.getId() == targetId) {
//                        posts.remove(post); // index가 아닌 값을 넣어서 해당 값을 삭제할 수도 있다.
//                        System.out.println("삭제가 완료되었습니다.");
//                        break;
//                    }
//                    // 객체를 넣으면 해당 객체를 삭제해줌
//                }
                Post post = findPostById(targetId);

                if (post == null) {
                    System.out.println("없는 게시물입니다.");
                    continue;
                }

                posts.remove(post);
                System.out.println("삭제가 완료되었습니다.");
            }else if(command.equals("detail")) {
                System.out.println("상세보기 할 게시물 번호");
                int targetId = Integer.parseInt(sc.nextLine());

                Post post = findPostById(targetId);

                if (post == null) {
                    System.out.println("없는 게시물입니다.");
                    continue;
                }
                // 표현 1 post.setHit(post.getHit()+1);
                post.increaseHif(); // 매서드 만들어서 +1

                System.out.printf("내용 : %s\n", post.getId());
                System.out.printf("제목 : %s\n", post.getTitle());
                System.out.printf("내용 : %s\n", post.getBody());
                System.out.printf("등록일자 : %s\n", post.getCreateDate());
                System.out.printf("조회수 : %s\n", post.getHit());



            }else if(command.equals("search")){
                System.out.println("검색 키워드 : ");
                String keyword = sc.nextLine();

                ArrayList<Post> searchedPostList = new ArrayList<>();
                for(Post post : posts) {
                    if(post.getTitle().contains(keyword)) {
                        searchedPostList.add(post);
                    }
                }
            }
        }

    }
    public Post findPostById (int id){
        // 만약 내가 찾고자 하는 게시물이 없다면?
        for (Post post : posts) {
            if (post.getId() == id) {
                //이 포맷만 같이 공용이 되면 됨
                return post;// return을 만나면 매서드 그 즉시 종료
            }
        }
        return null; //null은 없다라는 의미
    }
    public String getCurrentDateTime(){
        // 현재 날짜와 시간 가져오기
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 날짜와 시간: " + now);

        // 원하는 포맷 지정하기 (예: "yyyy-MM-dd HH:mm:ss")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 현재 날짜와 시간을 지정된 포맷으로 변환하여 저장하기
        String formattedDateTime = now.format(formatter);
        System.out.println("포맷된 날짜와 시간: " + formattedDateTime);

        return formattedDateTime;

    }
    public void printPostList(ArrayList<Post> targetList){
        System.out.println("====================");
        for (Post post : posts) {
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.printf("내용 : %s\n", post.getBody());
            System.out.println("==================");
        }
    }
}
