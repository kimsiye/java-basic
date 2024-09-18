package MiniProject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class TxtBdApp {

    Scanner sc = new Scanner(System.in);

    PostRepository postRepository = new PostRepository();
    ArrayList<User> UsersList = new ArrayList<>();
    User loginUser;


    int lastestId = 1;
    boolean userLogin;

    public TxtBdApp() {
        Post test1 = new Post(lastestId, "a 안녕하세요 반갑습니다. 자바 공부중이에요.", "내용모름", LocalDateTime.now(), 1, "이순신");
        Post test2 = new Post(lastestId = lastestId + 1, "a 자바 질문좀 할게요~", "내용모름", LocalDateTime.now(), 1, "홍길동");
        Post test3 = new Post(lastestId = lastestId + 1, "b 정처기 따야되나요?", "내용모름", LocalDateTime.now(), 1, "aaa");
        postRepository.save(test1);
        postRepository.save(test2);
        postRepository.save(test3);
        lastestId++;

    }

    public void plus() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String boardName = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String boardContent = sc.nextLine();
        String printNickname;
        if (userLogin == true) {
            printNickname = loginUser.getUserNickname();
            System.out.printf("작성자 : %s \n", printNickname);

        } else {
            printNickname = null;
            System.out.println("작성자 : 비회원");
        }
        System.out.println("게시물이 등록되었습니다.");
        Post listMake = new Post(lastestId, boardName, boardContent, LocalDateTime.now(), 1, printNickname);
        postRepository.save(listMake);
        listMake.setCurrentDateTime(LocalDateTime.now());

        lastestId++;


    }


    public void list() {
        for (Post post : postRepository.getPostsArr()) {
            System.out.println("====================");
            System.out.printf("번호 : %s \n", post.getId());
            System.out.printf("제목 : %s \n", post.getName());
        }
        System.out.println("====================");
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        postChange(targetId);
    }


    public void delete() {
        // 번호가 바뀌면 안됨 하지만 ArrayList에서 당겨진다
        // 바뀌지 않는 식별용 넘버가 필요함

        System.out.print("삭제할 게시물 번호 : ");
        int selNum = Integer.parseInt(sc.nextLine());

        Post postResult = findPostById(selNum);

        if (postResult == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else{
            System.out.printf("%d번 개시물이 삭제되었습니다.\n", postResult.getId());
            postRepository.remove(postResult);
        }


    }

    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int detailSelNum = Integer.parseInt(sc.nextLine());

        Post postResult = findPostById(detailSelNum);

        if (postResult == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else{
            detailPrint(postResult);
            commentChoice(postResult);
        }

    }


    // 만약 댓글이 있으면 출력 없으면 없습니다 하고 넘어감
    // 댓글입력 > post객체?


    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String searchName = sc.nextLine();
        boolean judgment = true;
        for (Post posts : `PostsList) {
            if (posts.getName().contains(searchName)) {
                System.out.println("====================");
                System.out.printf("번호 : %s\n", posts.getId());
                System.out.printf("제목 : %s\n", posts.getName());
                judgment = false;
            }
        }
        System.out.println("====================");
        if (judgment == true) {
            System.out.println("검색 결과가 없습니다.");
        }

    }

    public void signup() {
        System.out.println("=== 회원 가입을 진행합니다 ===");
        System.out.print("아이디를 입력하세요 : ");
        String userId = sc.nextLine();
        System.out.print("비밀번호를 입력하세요 : ");
        String userPassword = sc.nextLine();
        System.out.print("닉네임을 입력하세요 : ");
        String userNickname = sc.nextLine();
        System.out.println("=== 회원 가입이 완료되었습니다 ===");
        User listMake = new User(userId, userPassword, userNickname);
        UsersList.add(listMake);


    }

    public void login() {
        System.out.print("아이디 : ");
        String userId = sc.nextLine();
        System.out.print("비밀번호 : ");
        String userPassword = sc.nextLine();
        for (User users : UsersList) {
            if (users.getUserId().equals(userId) && users.getUserPassword().equals(userPassword)) {
                System.out.printf("%s님 환영합니다!\n", users.getUserNickname());
                loginUser = new User(userId, userPassword, users.getUserNickname());
                userLogin = true;

            } else {
                System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");
                userLogin = false;
            }

        }
    }

    //-------------------------------------------
    public void detailPrint(Post post) {

        System.out.printf("======%d 게시물=======\n", post.getId());
        System.out.printf("제목 : %s \n", post.getName());
        System.out.printf("내용 : %s \n", post.getBody());
        System.out.println("등록날짜 : " + post.getFormattedDateTime());
        System.out.println("조회수 : " + post.getViews());
        System.out.println("작성자 : " + post.getNickName());
        System.out.println("====================");
        post.setViews(1);
        post.commentReturn();


    }

    public void commentChoice(Post post) {

        while (true) {
            System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
            int funcSelNum = Integer.parseInt(sc.nextLine());
            if (funcSelNum == 1) {
                post.commentMake();
                System.out.println("댓글이 성공적으로 등록되었습니다.");
                detailPrint(post);
            } else if (funcSelNum == 2) {
                System.out.println("[추천 기능]");

            } else if (funcSelNum == 3) {

                if (loginUser.getUserNickname() == null) {
                    System.out.println("로그인 하세요. 자신의 게시물만 수정/삭제 할 수 있습니다.");
                    detailPrint(post);
                    return;
                }

                boolean found = false;

                if (loginUser.getUserNickname().equals(post.getNickName())) {
                    postChangeByDetail(post);
                    detailPrint(post);
                    found = true;
                }


                if (found == false) {
                    System.out.println("자신의 게시물만 수정/삭제 할 수 있습니다.");
                    detailPrint(post);
                    break;
                }


            } else if (funcSelNum == 4) {

                if (loginUser.getUserNickname() == null) {
                    System.out.println("로그인 하세요. 자신의 게시물만 수정/삭제 할 수 있습니다.");
                    detailPrint(post);
                    return;
                }

                boolean found = false;

                if (loginUser.getUserNickname().equals(post.getNickName())) {
                    PostsList.remove(post);
                    System.out.printf("%d번 개시물이 삭제되었습니다.\n", post.getId());
                    found = true;
                }


                if (found == false) {
                    System.out.println("자신의 게시물만 수정/삭제 할 수 있습니다.");
                    detailPrint(post);
                    break;
                }

            } else if (funcSelNum == 5) {

                System.out.println("상세보기 화면을 빠져나갑니다.");
                break;
            } else {
                System.out.println("없는 기능입니다.");
            }
        }
    }

    public void postChange(int targetId) {
        boolean judgment = true;
        for (Post posts : PostsList) {
            if (posts.getId() == targetId) {
                System.out.print("제목 : ");
                String changeName = sc.nextLine();

                System.out.print("내용 : ");
                String changeBody = sc.nextLine();

                posts.setName(changeName);
                posts.setBody(changeBody);

                System.out.printf("%d번 개시물이 수정되었습니다.\n", targetId);
                judgment = false;
                // 인덱스가 아니라 객체의 넘버이기 때문에 인덱스 없이 textBoardContent를 사용하여
                // 들어갈 해당 하는곳에 넣을 수 있도록 함
            }
        }
        if (judgment == true) {
            System.out.println("3 없는 게시물 번호입니다.");
        }
    }

    public void postChangeByDetail(Post post) {

        System.out.print("제목 : ");
        String changeName = sc.nextLine();

        System.out.print("내용 : ");
        String changeBody = sc.nextLine();

        post.setName(changeName);
        post.setBody(changeBody);

        System.out.printf("%d번 개시물이 수정되었습니다.\n", post.getId());

    }

    public Post findPostById(int selNum) {
        for (Post post : postRepository.getPostsArr()) {
            if(post.getId() == selNum){
                return post;
            }
        }
        return null;
    }

}














































