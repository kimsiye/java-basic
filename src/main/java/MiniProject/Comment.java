package MiniProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Comment {
    private int id;
    private String content;
    private LocalDateTime currentDateTime;

    public Comment(int id, String content, LocalDateTime currentDateTime) {
        this.id = id;
        this.content = content;
        this.currentDateTime = currentDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(LocalDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public String getFormattedDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return currentDateTime.format(formatter);
    }
}
