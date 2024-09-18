package MiniProject;

import java.util.ArrayList;

public class PostRepository {
   private ArrayList<Post> PostsList = new ArrayList<>();

   public void save (Post post){
      PostsList.add(post);
   }


}
