package MiniProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Function {

     Scanner sc = new Scanner(System.in);

     ArrayList<TextBoardContent> textBoardList = new ArrayList<>();

     int lastestId  = 1 ;
    public Function(){
        TextBoardContent test1 = new TextBoardContent(lastestId,"안녕하세요 반갑습니다. 자바 공부중이에요.","내용모름");
        TextBoardContent test2 = new TextBoardContent(lastestId = lastestId+1,"자바 질문좀 할게요~","내용모름");
        TextBoardContent test3 = new TextBoardContent(lastestId = lastestId+1,"정처기 따야되나요?","내용모름");
        textBoardList.add(test1);
        textBoardList.add(test2);
        textBoardList.add(test3);
        lastestId++;

    }

    public  void plus() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String boardName = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String boardContent = sc.nextLine();
        System.out.println("게시물이 등록되었습니다.");
        TextBoardContent listMake = new TextBoardContent(lastestId,boardName,boardContent);
        textBoardList.add(listMake);
        listMake.setCurrentDateTime(LocalDateTime.now());
        // 시간 설정 넘겨줌

        lastestId ++;

//        TextBoardContent in =textBoardList.get(0);
//        in.setName(boardName);
//        in.setBody(boardContent);
        // 반복되면 배열의 0번째에만 입력밗이 들어감
        // 배열을 만들고 배열의 객체에 이름과 내용을 들어가게 세팅함
    }

    public  void list() {


        for(int i = 0; i < textBoardList.size(); i++){
            TextBoardContent in =textBoardList.get(i);
            System.out.println("====================");
            System.out.printf("번호 : %s \n",in.getId());
            System.out.printf("제목 : %s \n",in.getName());
        }
        System.out.println("====================");
    }

    public  void update(){
        System.out.print("수정할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        for(TextBoardContent textBoardContent : textBoardList) {
            if (textBoardContent.getId() == targetId) {
                System.out.print("제목 : ");
                String changeName = sc.nextLine();

                System.out.print("내용 : ");
                String changeBody = sc.nextLine();

//                TextBoardContent changePost = textBoardList.(targetId);
//                changePost.setName(changeName);
//                changePost.setBody(changeBody);

                System.out.printf("%d번 개시물이 수정되었습니다.", targetId);
            }
                // System.out.println("없는 게시물 번호입니다.");




        }
    }

    public  void delete(){
        // 번호가 바뀌면 안됨 하지만 ArrayList에서 당겨진다
        // 바뀌지 않는 식별용 넘버가 필요함

        System.out.print("삭제할 게시물 번호 : ");
        int selNum = Integer.parseInt(sc.nextLine()) - 1;
        if(selNum < 0 || selNum >= textBoardList.size()){
            System.out.println("없는 게시물 번호입니다.");
        }else {
            textBoardList.remove(selNum);
            System.out.printf("%d번 개시물이 삭제되었습니다.", selNum + 1);
        }

    }

    public  void detail(){
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int selNum = Integer.parseInt(sc.nextLine()) - 1;
        if(selNum < 0 || selNum >= textBoardList.size()){
            System.out.println("없는 게시물 번호입니다.");
        }else {
            System.out.println("====================");
            TextBoardContent changePost = textBoardList.get(selNum);
            System.out.printf("제목 : %s \n",changePost.getName());
            System.out.printf("내용 : %s \n",changePost.getBody());
            System.out.println("등록날짜 : "+changePost.getFormattedDateTime());
            System.out.println("====================");
        }

    }









}


//public  void update(){
//    System.out.print("수정할 게시물 번호 : ");
//    int targetId = Integer.parseInt(sc.nextLine());
//    for(TextBoardContent textBoardContent : textBoardList){
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
//            TextBoardContent changePost = textBoardList.get(selNum);
//            changePost.setName(changeName);
//            changePost.setBody(changeBody);
//
//            System.out.printf("%d번 개시물이 수정되었습니다.", selNum + 1);
//        }
//    }
//
//}