package day8.accessModfierExam.Exam2;
// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
// 조건 : 사람 클래스에서 출력할 수 없습니다.
public class Exam2 {
    public static void main(String[] args) {
        Person p1 = new Person();

        // 구현시작
        p1.setId(20);

        System.out.printf("제 번호는 %d 입니다.\n",p1.getId());
        // 구현끝

        // 출력 : 제 번호는 20 입니다.
    }
}
class Person {
    private int id;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.
    public void setId(int id){
        this.id = id;
    }
    //int는 숫자 외에 있으면 안되고 숫자만 리턴 할 수 있어야함
    public int getId(){
        return id;
    }

}