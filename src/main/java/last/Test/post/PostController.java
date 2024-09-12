package last.Test.post;

import last.Test.Comment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {
    PostRepository postRepository = new PostRepository();
    PostView postView = new PostView();

    private ArrayList<Comment> comments = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);
    private int memoryPostId = 1;
    private int memoryCommentId = 1;

    public PostController() {
        Post test1 = new Post(memoryPostId, "a 안녕하세요 반갑습니다. 자바 공부중이에요.", "내용없음", nowDateTime());
        Post test2 = new Post(memoryPostId = memoryPostId + 1, "a 자바 질문좀 할게요~", "내용없음", nowDateTime());
        Post test3 = new Post(memoryPostId = memoryPostId + 1, "정처기 따야되나요?", "내용없음", nowDateTime());
        postRepository.save(test1);
        postRepository.save(test2);
        postRepository.save(test3);
        memoryPostId++;
    }

    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String searchKeyword = sc.nextLine();

        ArrayList<Post> searchList = postRepository.searchPosts(searchKeyword);

        if (searchList.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            postView.printPostsList(searchList);
        }
    }


    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");

        int detailSelNum = getParsedInt(sc.nextLine(), -1);

        if(detailSelNum == -1){
            return;
        }

        Post post = postRepository.findPostById(detailSelNum);

        if (post == null) {
            System.out.println("존재하지 않는 게시물 번호입니다.");
            return;
        }

        postView.printPostsDetail(post);


        while (true) {
            System.out.print("상세보기 기능 번호를 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
            int detailViewSelNum = Integer.parseInt(sc.nextLine());

            if (detailViewSelNum == 1) {
                System.out.println("[댓글 기능]");
                System.out.print("댓글 내용 : ");
                String commentBody = sc.nextLine();

                Comment comment = new Comment(memoryCommentId, commentBody, nowDateTime());

                commentSave(comment);
                memoryCommentId++;

                postView.printPostsDetail(post);

                System.out.println("======= 댓글 =======");
                for (Comment comments : comments) {
                    System.out.printf("댓글 내용 : %s\n", comments.getBody());
                    System.out.printf("댓글 작성일 : %s\n", comments.getNowDateTime());
                    System.out.println("==================");
                }


            } else if (detailViewSelNum == 2) {
                System.out.println("[추천 기능]");
            } else if (detailViewSelNum == 3) {
                System.out.println("[수정 기능]");
            } else if (detailViewSelNum == 4) {
                System.out.println("[삭제 기능]");
            } else if (detailViewSelNum == 5) {
                System.out.println("목록으로 이동합니다.");
                break;
            }
        }

    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int deleteSelNum = getParsedInt(sc.nextLine(), -1);

        if(deleteSelNum == -1){
            return;
        }
        Post post = postRepository.findPostById(deleteSelNum);

        if (post == null) {
            System.out.println("존재하지 않는 게시물 번호입니다.");
            return;
        }

        System.out.printf("%d번 게시물이 삭제되었습니다.\n", post.getId());
        postRepository.delete(post);

    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int updateSelNum = getParsedInt(sc.nextLine(), -1);

        if(updateSelNum == -1){
            return;
        }

        Post post = postRepository.findPostById(updateSelNum);

        if (post == null) {
            System.out.println("존재하지 않는 게시물 번호입니다.");
            return;
        }

        System.out.print("제목 : ");
        String changeTitle = sc.nextLine();
        System.out.print("내용 : ");
        String changeContent = sc.nextLine();

        post.setTitle(changeTitle);
        post.setContent(changeContent);

        System.out.printf("%d번 게시물이 수정되었습니다.\n", post.getId());
    }

    public void list() {
        postView.printPostsList(postRepository.getPosts());
    }

    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String content = sc.nextLine();

        Post post = new Post(memoryPostId, title, content, nowDateTime());

        postRepository.save(post);

        memoryPostId++;

        System.out.print("게시물이 등록되었습니다.");
    }

    public int getParsedInt(String value, int defaultNum){
        try {
            int SelNum = Integer.parseInt(value);
            return SelNum;
        }catch (NumberFormatException e){
            System.out.println("숫자를 입력해주세요");

        }
        return defaultNum;
    }

    public void commentSave(Comment comment) {
        comments.add(comment);
    }


    public String nowDateTime() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
    }


}
