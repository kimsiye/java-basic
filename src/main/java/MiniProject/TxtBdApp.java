package MiniProject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class TxtBdApp {

     Scanner sc = new Scanner(System.in);

     ArrayList<Post> PostsList = new ArrayList<>();
     //Post post = new Post();

     int lastestId  = 1 ;
    public TxtBdApp(){
        Post test1 = new Post(lastestId,"a 안녕하세요 반갑습니다. 자바 공부중이에요.","내용모름",LocalDateTime.now(),1);
        Post test2 = new Post(lastestId = lastestId+1,"a 자바 질문좀 할게요~","내용모름",LocalDateTime.now(),1);
        Post test3 = new Post(lastestId = lastestId+1,"b 정처기 따야되나요?","내용모름",LocalDateTime.now(),1);
        PostsList.add(test1);
        PostsList.add(test2);
        PostsList.add(test3);
        lastestId++;

    }

    public void plus() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String boardName = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String boardContent = sc.nextLine();
        System.out.println("게시물이 등록되었습니다.");
        Post listMake = new Post(lastestId,boardName,boardContent,LocalDateTime.now(),1);
        PostsList.add(listMake);
        listMake.setCurrentDateTime(LocalDateTime.now());
        // 시간 설정 넘겨줌

        lastestId ++;

//        Post in =textBoardList.get(0);
//        in.setName(boardName);
//        in.setBody(boardContent);
        // 반복되면 배열의 0번째에만 입력밗이 들어감
        // 배열을 만들고 배열의 객체에 이름과 내용을 들어가게 세팅함
    }

    public void list() {


        for(int i = 0; i < PostsList.size(); i++){
            Post in =PostsList.get(i);
            System.out.println("====================");
            System.out.printf("번호 : %s \n",in.getId());
            System.out.printf("제목 : %s \n",in.getName());
        }
        System.out.println("====================");
    }

    public void update(){
        System.out.print("수정할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        boolean judgment = true;
        for(Post posts : PostsList) {
            if (posts.getId() == targetId) {
                System.out.print("제목 : ");
                String changeName = sc.nextLine();

                System.out.print("내용 : ");
                String changeBody = sc.nextLine();

                posts.setName(changeName);
                posts.setBody(changeBody);

                System.out.printf("%d번 개시물이 수정되었습니다.\n", targetId);
                judgment = false;
                // 인덱스가 아니라 객체의 넘버이기 때문에 인덱스 없이 textBoardContent를 사용하여
                // 들어갈 해당 하는곳에 넣을 수 있도록 함
            }
        }
        if (judgment == true) {
            System.out.println("없는 게시물 번호입니다.");
        }
    }

    public void delete(){
        // 번호가 바뀌면 안됨 하지만 ArrayList에서 당겨진다
        // 바뀌지 않는 식별용 넘버가 필요함

        System.out.print("삭제할 게시물 번호 : ");
        int selNum = Integer.parseInt(sc.nextLine()) - 1;
        if(selNum < 0 || selNum >= PostsList.size()){
            System.out.println("없는 게시물 번호입니다.");
        }else {
            PostsList.remove(selNum);
            System.out.printf("%d번 개시물이 삭제되었습니다.", selNum + 1);
        }

    }

    public void detail(){
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int detailSelNum = Integer.parseInt(sc.nextLine()) - 1;
        Post detailPost = PostsList.get(detailSelNum);
        if(detailSelNum < 0 || detailSelNum >= PostsList.size()){
            System.out.println("없는 게시물 번호입니다.");
        }else {
            System.out.printf("======%d 게시물=======\n",detailPost.getId());
            System.out.printf("제목 : %s \n",detailPost.getName());
            System.out.printf("내용 : %s \n",detailPost.getBody());
            System.out.println("등록날짜 : "+detailPost.getFormattedDateTime());
            System.out.println("조회수 : "+detailPost.getViews());
            System.out.println("====================");
            detailPost.setViews(1);
            detailPost.commentReturn(detailSelNum);
        }
        // 만약 댓글이 있으면 출력 없으면 없습니다 하고 넘어감
        // 댓글입력 > post객체?
        while(true) {
            System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
            int funcSelNum = Integer.parseInt(sc.nextLine());
            if (funcSelNum == 1) {
                detailPost.commentMake();
            } else if (funcSelNum == 2) {
                System.out.println("[추천 기능]");
            } else if (funcSelNum == 3) {
                System.out.println("[수정 기능]");
            } else if (funcSelNum == 4) {
                System.out.println("[삭제 기능]");
            } else if (funcSelNum == 5) {
                System.out.println("상세보기 화면을 빠져나갑니다.");
                break;
            } else {
                System.out.println("없는 기능입니다.");
            }
        }
    }


    public void search (){
        System.out.print("검색 키워드를 입력해주세요 : ");
        String searchName = sc.nextLine();
        boolean judgment = true;
        for(Post posts : PostsList) {
            if(posts.getName().contains(searchName)){
                System.out.println("====================");
                System.out.printf("번호 : %s\n",posts.getId());
                System.out.printf("제목 : %s\n",posts.getName());
                judgment = false;
            }
        }
        System.out.println("====================");
        if(judgment == true){
            System.out.println("검색 결과가 없습니다.");
        }

    }

    public void commentReturn ( int id){
        boolean judgment = true;
        System.out.println("======== 댓글 ========");
        for(Post posts : PostsList){
            Post.commentReturn ( int id)

        }
    }

















}


//public  void update(){
//    System.out.print("수정할 게시물 번호 : ");
//    int targetId = Integer.parseInt(sc.nextLine());
//    for(Post textBoardContent : textBoardList){
//
//        if(selNum < 0 || selNum >= textBoardList.size()){
//            System.out.println("없는 게시물 번호입니다.");
//        }else {
//            System.out.print("제목 : ");
//            String changeName = sc.nextLine();
//
//            System.out.print("내용 : ");
//            String changeBody = sc.nextLine();
//
//            Post changePost = textBoardList.get(selNum);
//            changePost.setName(changeName);
//            changePost.setBody(changeBody);
//
//            System.out.printf("%d번 개시물이 수정되었습니다.", selNum + 1);
//        }
//    }
//
//}