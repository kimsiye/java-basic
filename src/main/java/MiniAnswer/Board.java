package MiniAnswer;

public class Board {



    // 이 영역을 밖으로 할려면 static을 붙여야 하는데
    // static은 공육 모적, 자바에서 기본은 non-static
    // main은 무조건 static을 붙여야 해서 핵심로직은 main에 작성하지 않는다
    // 핵심로직을 객체로 빼면 된다.
    public static void main(String[] args) {

        BoardApp boardApp = new BoardApp();
        boardApp.run();



    }



}
