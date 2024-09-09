package MiniProject;

public class User {
    String userId;
    String userPassword;
    String userNickname;

    public User(String userId, String userPassword, String userNickname) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userNickname = userNickname;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }
}
