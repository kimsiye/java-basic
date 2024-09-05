package MiniAnswer.Post;

import java.util.ArrayList;

// 창고 관리 (Model)
public class PostRepository {
    // 창고에 Post에 저장하거나 삭제하거나 수정하는것은 PostRepository가 담당
    //main매서드와 findPostById 매서드가 같이 사용해야 하므로 main 밖에 두고 static을 붙인다.
    private ArrayList<Post> posts = new ArrayList<>();

    // post를 받을 수 있는 동작
    // 누군가에게 Post를 넘겨받아서 창고(ArrayList)에 저장해주는 기능
    //  어떤 것이 다른곳에서 써야된다면 private에서 publie으로 바꿈
    public void save(Post post){ // post를 넘겨줌
        posts.add(post);
    }

    // 자신이 가지고 있는 창고(ArrayList)의 내용물을 다른 누군가에게 전달
    public ArrayList<Post> getPosts() {
        return posts;
    }

    // 자신이 가지고 있는 창고(ArrayList) 보관 방의 번호를 받아서 제거
    public void delete(Post post) {
        posts.remove(post);
    }

    public ArrayList<Post> getPostByKeyword(String keyword){
        ArrayList<Post> searchedPostList = new ArrayList<>();
        for (Post post : posts) {
            if (post.getTitle().contains(keyword)) {
                searchedPostList.add(post);
            }
        }
        return searchedPostList;
    }

    public Post findPostById (int id){

        // 만약 내가 찾고자 하는 게시물이 없다면?
        for (Post post : posts) {
            if (post.getId() == id) {
                //이 포맷만 같이 공용이 되면 됨
                return post;// return을 만나면 매서드 그 즉시 종료
            }
        }
        return null; //null은 없다라는 의미
    }

}
