public class NewTeacher {
    // https://cafe.daum.net/cometojava

    // spring
    /*
    세팅되어 있는 조립식으로 가져다 써서 만드는 것
    스프링하려면 자바를 이해해야함
    리엑트 - 자바스크립트 네트워크
    데이터 조작

    */
    /*
    다양한 분야와 업무를 폭 넓게 알것
    전산 시스템을 경험해보는게 좋음

    cpu - 뇌 연산
    **메모리** - 기억 저장, 활동 처리, 책을 펼치는 곳
    - 메모리 관리를 잘 해야함
    - 전기가 통하고 안통하고 01을 사용해서 컴퓨터가 돌아감
    - 비트들을 회로에 잡어넣어 16기가 8기가 됨
    - 1000bate > 1kbate 1000kbate > 1mabate 1000mabate > 1gabate
    HDD,SDD - 책 가방

    하드웨어 위에 운영체제를 깔아둠
    운영체제 위에 한글 프로그램 동작 > 유기적인 연동
    한글 프로그램 > 메모리공간에 뜸

    작업관리자 > 프로세스(현재 실행중인 프로그램) > 현재 돌아가는 프로그램을 알 수 있음

    운영체제 위에 java 운영체제 자바실행환경, 자바실행도구 (jdk, jre)설치
    jre java runtime : 자바 실행 환경
    jdk : 자바 개발 도구(명령어들)

    .java > javac(.java 실행 후 컴퓨터가 알아듣는 걸로 바뀜) >.class(실행파일)

    자바버전 주로 11버전을 위주로 씀

    - 자바 버전 설치
    1. 오라클에 들어가서 자바 깔기 (버전)
https://www.oracle.com/kr/ > 하드웨어 및 소프트웨어 java >
https://www.oracle.com/kr/java/technologies/javase/jdk11-archive-downloads.html (자바 11버전)
    2. 버전이 올라가면 실행안되는 경우가 있어서 버전 레벨업을 안함 > 운영체제에 돌아가는 플랫폼 설치

    - 이클립스 설치
https://www.eclipse.org/downloads/
Install your favorite desktop IDE packages > 다운로드 > installer > Eclipse IDE for Enterprise Java and Web Developers (자바 + 웹)
installation Folder > D드라이브에 delve폴더 만들어서 경로 지정 후 다운로드
directory as workspace > 작업장소 연걸 (D드라이브에 delve폴더 > eclipse workspace(새로 만듬))



    자바 특징
    1. 운영체제에서 독립적이다.

    클래스의 이름의 첫글자는 대문자

    * 공유폴더 실행 \\E강의장00

    .class 실행파일을 만들어서 실행되는 거임


     */

    public void run()
    {
        System.out.println("김시연");

        // 실행 (Ctrl+F11) > 콘솔에 출력됨

        /*
         * 자바 객체지향언어
         *
         * 1948 컴퓨터 만들어짐
         * 0100100
         * c언어 > 문자로 쓸 수 있어서 만들고 컴파일함, 줄글로 작성
         * - c++ : c언어를 객체적으로 쓸 수 있도록 보안
         * 문자가 있으면 각각을 단위로 만들어서 객체로 씀
         * - 제임스 고슬린 c언어를 가지고 java로 만듬
         *
         * 자바 쓸려면 자바환경을 만들어야함
         * 처음에는 임베디드로 사용
         * 인터넷이 나오면서 자바가 대중화됨
         * jsp로 특화됨 / java/jsp 웹에 특화되어 남음
         *
         *
         * 자바 특징
         * 1. 객체 지향 언어
         * 객체들로 조립하여 만들기 때문에 / 데이터 > 객체
         * 데이터의 묶음을 가지고 와서 씀
         *
         * 객체 만들기 > 설계도 (class) > 설계도를 만들려면 문법이 필요함
         *
         * 2. 다향성 , 상속성, 자동화
         *
         * 변수 : 메모리 상에 가상공간, 변수에 무엇을 담기위한 공간, 값을 바꿀 수 있음
         * - 각 특성에 맞는 값을 담아주어야함(메모리를 효율적으로 사용하기 위해서)
         *
         * 상수 : 한번 담아 놓으면 바꿀 수 없음
         *
         * 변수와 메서드(함수)로 프로그램 만듬.
         *
         */

        // 숫자형 변수 a의 값은 1입니다.
        // a의 값이 1이면 참이고, 2이면 거짓입니다 라는 코드를 작성해보세요.

        int a = 1;

        if(a ==1){
            System.out.println(true);
        }else if(a ==1)

        {
            System.out.println(false);
        }

        //sysout+ctrl+space : System.out.println();

        //반복문  : for, while, do while(수행하고 반복시킴)

//		for(초기식;증감식;반복식)) {
//
//		}

        // 1을 10번을 출력하시오
        for(
                int i = 1;
                i <=10;i++)

        {
            System.out.println("1");
        }


//		초기식;
//		while(증가식) {
//			실행코드
//			반복식;
//		}

        int i = 1;
        while(i <=10)

        {
            System.out.println("2");
            i++;
        }


        /*
         *
         * - 인터넷 : 연결 망
         * http://(웹 프로토콜) > 통신 규약에 네이버라고 씀 원래는 아이피를 썼음
         * 아이피를 외우기 힘들어서 도메인에 아이피를 담기게 함
         * 해당되는 네임서버에가서 아이피를 바꿔서 찾아감
         * 하이퍼 텍스트
         * ftp : 파일만 주고 받는 경로 (프로토콜)
         *
         * (Dns, 웹서버 가지고있는 웹 문서를 요청)
         * 도메인 뒤에 네이버가 가지고 있는 파일 요청 > 클라이언트에 보내즘
         * 서버를 주는 것 : 서버
         * 서버를 받는 것 : 클라이언트
         *
         * 클라이언트 요청 > 서버 (리퀘스트)
         * 서버 응답 > 클라이언드 (리스폰스)
         *
         * index 프로그램을 실행시켜서 네이버 서버가 보내줌
         * 네이버 페이지 안에서 문서를 올리면 제공하는 웹 서버에 올리면 클라이언트가 요청했을 때 해당 내용을 줌
         * 웹서버 설치, 파일, 만들어야함 회원정보를 담는 데이터베이스 서버 필요
         * 메인서버를 알아서 도메인 서버를 알아야함
         * 도메인은 판매하는 곳에서 사면 됨, 도메인을 통해서 웹서버로 감
         *
         *
         * 1. 도메인 사기
         * 2. 웹서버
         * 3. 데이터베이스 서버
         *
         * 웹서버에서 문서 만들기 (웹문서)
         *
         * html > 브라우저가 읽을 수 있는 언어
         * (웹디자인 영역>퍼블리싱, 자바스크립트&제이쿼리 동적으로 글자가 움직이게 하는거)
         *
         * https://www.w3schools.com/
         *
         * 태그란 코드를 쓴 것 html의 기능을 실행시킴 >기능을 가지고 있는 객체
         *
         * <!DOCTYPE html>  html 5버전을 의미
         * <html></ html> > 문서의 시작과 끝
         * head 영역 > title 태그를 사용해서 제목 지정
         * body 영역 > 글 그림을 보여줌
         *
         * 한쌍의 태그로 만들어짐
         * <h></h> > 태그 : 글자를 키우는 태그(제목)
         * <p></p> > 문단 테그 없으면 옆으로 쭉 써짐
         * <html> > 문서의 시작
         * <br> > 줄바꿈 표시
         * a 테크 링크 생성
         * <a href = "사이트링크"> 링크에 나타낼 이름 </a>
         * > a 객체가 생성되면서 사용됨 , 객체 속성 중에 위치로 옮기는 링크 기능이 있음
         * 링크로 들어감
         *
         * <img src = " width="800px" height="800px">
         * < 이미지태크 이미지속성 = "이미지 위치" "넓이 속성" "높이 속성">
         * c:
         * d: a
         * 상대 경로 : 나를 기준으로 어디에 있느냐에 위치지정.testpng
         * 절대 경로 : 나와 상관없이 최고 위치에서 해당 이미지파일까지 모든것을 계산하는것
         * 서버에 올릴려면 절대 경로로 올리는 것이 좋음
         *
         *  px : picture cell 그림들의 원소 (화소가 많으면 더 화질이 좋음)
         *
         *  글자 크기, 색 조절
         *  <p style = "color: 색;font-size:폰트사이즈">
         *  삼원색 말고 다른 색을 쓰고 싶다면 색상코드를 사용함 색에 색상코드를 입력
         *
         *  <span > > 포함시켜서 한줄로 만듬
         *  <div></div> > 공간 영역을 나타냄
         *
         *  table 행과 열로 이루어지는 집합채
         *  <table>
         *  <tr> > 행
         *  <td> </td> 한칸
         *  </tr>
         *  </table>
         *
         *
         *  브라우저에서 나타내는 소스이지 서버에 있는 소스는 아님
         *  서버
         *  개발자 도구나 페이지 소스를 통해서 화면을 확인할 수 있음
         *
         *  border : 테두리
         *  background-color : 배경색
         *  <td colspan = "2"> : 칸을 합침
         *
         *
         *
         *
         * 서버에 데이터를 요청해서 가지고오는것
         * 100명이 있는 것처럼 데이터를 만들고 막 들어가서 트래픽 공격을 하는것  : 디도스
         *
         * META > 구글이나, 네이버에 올려서 검색하여 들어올 수 있게 함. 검색엔진 검색리스트 만들어줌
         * 브라우저나 검색 엔진, 또는 다른 웹 서비스가 페이지의 내용에 대한 정보를 제공
         *
         * 브라우저는 한번 정보를 가져오면 저장되어있는 것들을 가지고 옴
         *
         * f5 : 브라우저에 저장된 정보를 먼저 보여줌/ 안고쳐지면 브라우저에 저장되어있는 것을 보여주는 것임
         * 새로 불러왔을 때 저장되어 있는 정보를 가지고 올 수 있음으로
         * 캐시 기록을 삭제하고 불러올 수 있다
         *
         * ctrl+f5 : 저장되어잇지 않는걸 가지고 옴
         * 메모장 > 모든파일 저장 > test.html
         *
         *
         *
         *
         *
         *
         *
         */
    }


}
