package MiniAnswer;

public class Post {
    private int id;
    private String title;
    private String body;
    private String createDate;
    private int hit;

    // 생성자 이용


    public Post(int id, String title, String body, String createDate, int hit) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.createDate = createDate;
        this.hit = hit;
    }

    public void increaseHif(){
        this.hit++;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //alt + ins getter + setter 만들기
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
