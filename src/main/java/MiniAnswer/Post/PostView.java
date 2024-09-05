package MiniAnswer.Post;

import java.util.ArrayList;

// Post와 관련하여 보여지는 것들을 묶음
public class PostView {


    public void printPostList(ArrayList<Post> targetList) {
        System.out.println("====================");
        for (Post post : targetList) {
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.printf("내용 : %s\n", post.getBody());
            System.out.println("==================");
        }
    }

    public void printPosDetail(Post post) {
        System.out.printf("내용 : %s\n", post.getId());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("등록일자 : %s\n", post.getCreateDate());
        System.out.printf("조회수 : %s\n", post.getHit());
    }


}
