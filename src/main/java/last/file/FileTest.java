package last.file;

import last.Test.Member;
import last.Test.post.Post;

public class FileTest {
    public static void main(String[] args) {


        Post p1 = new Post(1, "aaa", "aaa", "20240912");

        Member m1 = new Member("hong123", "rlfehd", "홍홍길길동동");

        FileUtill fu = new FileUtill();
        JsonUtil ju = new JsonUtil();


// 1.       fu.save("hello world","test.txt");
// 1.       String content = fu.load("test.txt");

        String jsonString = ju.toPostString(p1);

        fu.save(jsonString, "test.json");
        String content = fu.load("test.json");

        Post downLoad = (Post) ju.toPostLoad(content, "last.Test.post.Post"); // json 문자열을 Post로 객체화(역직렬화)

        System.out.println(downLoad.getId());


        String memberString = ju.toPostString(m1); //member 객체화
        fu.save(memberString, "member.json");

        String memberLoad = fu.load("member.json");//문자 -> 객체
        Member member = (Member) ju.toPostLoad(memberLoad, "last.Test.Member");

        System.out.println(member.getNickname());





    }
}


