package last.Test;

public class Member {
    String loginId;
    String loginPw;
    String nickname;

    public Member() {

    }

    public Member(String loginId, String loginPw, String nickname) {
        this.loginId = loginId;
        this.loginPw = loginPw;
        this.nickname = nickname;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPw() {
        return loginPw;
    }

    public void setLoginPw(String loginPw) {
        this.loginPw = loginPw;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
