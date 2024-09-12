package last.file;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    public String toPostString (Object object){
        // 직렬화할 객체 정의
        // Post p1 = new Post(1,"aaa","aaa","20240912");

        // ObjectMapper 생성
        ObjectMapper objectMapper = new ObjectMapper(); // 문자로 바꿔주는 역할

        try {
            // 객체를 JSON 문자열로 변환
            String jsonString = objectMapper.writeValueAsString(object);
            return jsonString;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }
//
//    public String toPostString (Post post){
//        // 직렬화할 객체 정의
//        // Post p1 = new Post(1,"aaa","aaa","20240912");
//
//        // ObjectMapper 생성
//        ObjectMapper objectMapper = new ObjectMapper(); // 문자로 바꿔주는 역할
//
//        try {
//            // 객체를 JSON 문자열로 변환
//            String jsonString = objectMapper.writeValueAsString(post);
//            return jsonString;
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//

//    public String toPostString (Member member){
//        // 직렬화할 객체 정의
//        // Post p1 = new Post(1,"aaa","aaa","20240912");
//
//        // ObjectMapper 생성
//        ObjectMapper objectMapper = new ObjectMapper(); // 문자로 바꿔주는 역할
//
//        try {
//            // 객체를 JSON 문자열로 변환
//            String jsonString = objectMapper.writeValueAsString(member);
//            return jsonString;
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }

//    public Member toMemberLoad(String memberString){
//
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        try {
//            Member deserializedPerson = objectMapper.readValue(memberString,Member.class);
//            return deserializedPerson;
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//
//    }
//
//    public Post toPostLoad(String jsonString){
//
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        try {
//            Post deserializedPerson = objectMapper.readValue(jsonString,Post.class);
//            return deserializedPerson;
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//
//    }

    public Object  toPostLoad(String jsonString, String className){

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Class<?>  clazz = Class.forName(className);
            return objectMapper.readValue(jsonString,clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return null;

    }


}
// 자바의 대부분의 정보는 객체라는 형태로 구좌화(얼려져)있다.
// 파일은 기본적으로 텍스트로 저장된다.
// 자바의 객체를 바로 텍스르토 저장 불가능
// 자바의 객체를 먼저 텍스르(문자)화 시켜야함 => 직렬화(Serializable)
// 텍스트를 불려와서 자바의 객체 형태로 만드는 것 => 역진렬화(Deserializable)


// 객체 진열화 -> jackson 라이브러리를 이용해 객체 json 문자화 하기



// Serializable : 자바끼리 통신만 가능하고 다른건 안됨, 보안문제가 있어서 안씀
// 웹어서는 JSON를 표준으로 사용
// 라이브러리 : 남들이 만들어놓은거 가져다 쓰는거

/*
 라이브러리 추가 방법 > 검색하거나 주변에서 듣기
 1. 원하는 라이브러리를 찾아서 다운로드 받는다.
 2. 얻은 라이브러리 파일을 내 프로젝트에 추가
 3. 클래스나 메서드에서 import 하여 사용.

 자바 하는 사람이라면 필수 : maven repository (자바계 앱스토어)
 // jar : 압축파일
 // Gradle로 만들었기 때문에 Gradle로 복붙하면 됨
 // build.gradle > dependencies에 추가 > 코끼리
 */

// 매서드 오버로딩 => 매개변수 모양만 다르면 동일한 이름의 매서드 여러개 만들기 가능
