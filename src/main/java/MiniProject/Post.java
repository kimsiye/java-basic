package MiniProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class Post {
    // 게시판 객체
    private int id;
    private String name;
    private String body;
    private LocalDateTime currentDateTime;
    private String nickName;
    private int views = 0;
    private int lastestId  = 1 ;

    Scanner sc = new Scanner(System.in);
    // 댓글 배열
    ArrayList<Comment> commentList = new ArrayList<>();

    // 댓글 만들기
    public void commentMake (){
        System.out.print("댓글 내용 : ");
        String comment = sc.nextLine();
        Comment c1 = new Comment(lastestId,comment,getCurrentDateTime());
        commentList.add(c1);
        lastestId++;

    }

    public  void  commentReturn ( ){
        //return commentList ;

        if(commentList.isEmpty()) {
            return;
        }else{
            System.out.println("======== 댓글 ========");
            for (Comment commentReturn : commentList) {
                if (this.id == id) {
                    System.out.printf("댓글내용 : %s\n", commentReturn.getContent());
                    System.out.printf("댓글 작성일 : %s\n", commentReturn.getFormattedDateTime());
                    System.out.println("====================");
                }
            }

        }
    }



    // 생성자
    public Post(int id, String name, String body, LocalDateTime currentDateTime,
                int views, String nickName){
        this.id = id;
        this.name = name;
        this.body = body;
        this.currentDateTime = currentDateTime;
        this.views = views;
        this.nickName = nickName;
    }


    // getter setter

    public int getLastestId() {
        return lastestId;
    }

    public void setLastestId(int lastestId) {
        this.lastestId = lastestId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views + 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(LocalDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    // 메서드
    public String getFormattedDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        return currentDateTime.format(formatter);
    }




    // post에 댓글 배열을 만들고 댓글 객체를 만들어서 댓글 배열에 담은 다음 일괄 출력

}

