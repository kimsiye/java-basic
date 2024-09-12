package last.Test.post;

public class Post {
    private int id;
    private String title;
    private String content;
    private String nowDateTime;
    private int view = 1;

    // 생성자 여러개 만들 수 있다. 단, 매개변수 모양이 달라야함 => 생성자 오버로딩
    public Post() { //json은 객체를 받을 때 아무것도 없는 생성자로 받는 걸로 구현되어 있음..
    }

    public Post(int id, String title, String content, String nowDateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.nowDateTime = nowDateTime;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = this.view + view;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNowDateTime() {
        return nowDateTime;
    }

    public void setNowDateTime(String nowDateTime) {
        this.nowDateTime = nowDateTime;
    }
}
