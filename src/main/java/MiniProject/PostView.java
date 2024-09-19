package MiniProject;

public class PostView {
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
}
