package MiniProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TextBoardContent {
    // 게시판 객체
    private int id;
    private String name;
    private String body;
    private LocalDateTime currentDateTime;

    // 생성자
    public TextBoardContent(int id, String name, String body){
        this.id = id;
        this.name = name;
        this.body = body;

    }


    //
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


    public void testList(int id, String name) {
        this.id = id;
        this.name = name;

    }


}
