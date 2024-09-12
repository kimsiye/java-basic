package last.Test;

public class Comment {
    int id;
    String body;
    String nowDateTime;

    public Comment(int id, String body, String nowDateTime) {
        this.id = id;
        this.body = body;
        this.nowDateTime = nowDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getNowDateTime() {
        return nowDateTime;
    }

    public void setNowDateTime(String nowDateTime) {
        this.nowDateTime = nowDateTime;
    }
}
