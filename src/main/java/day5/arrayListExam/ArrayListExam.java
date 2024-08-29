package day5.arrayListExam;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {

        // 생성

        int[] arr = new int[5]; // 길이 5인 숫자 배열 생성

        //ArrayList
        // <자료형>
        ArrayList<Integer> list =  new ArrayList<>();
        //========================

        // 추가
        // 배열 -> 추가x
        // ArrayList -> 추가
        // 가장 앞에서부터 추가됨
        list.add(1); // 0번 방에 추가
        list.add(2); // 1번 방에 추가

        //===================
        // 조회
        // 배열
        System.out.println(arr[0]); // arr 배열의 0번방 조회
        System.out.println(arr[1]); // arr 배열의 1번방 조회
        System.out.println(arr[2]); // arr 배열의 2번방 조회

        // ArrayList
        System.out.println(list.get(0)); // list 배열의 0번방 조회
        System.out.println(list.get(1)); // list 배열의 1번방 조회
//        System.out.println(list.get(2)); // list 배열의 2번방 조회
//        -> 2번방이 존재하지 않기 때문에 에러남
        // 에러 :  2번방이 존자하지 않기 때문에, 생성된 만큼만 출력이 가능함

       //==================================
        // 수정
        // 배열
        arr[0] = 10; // arr 배열의 0번 방의 값을 10으로 수정.
        System.out.println(arr[0]);
        // ArrayList
        list.set(0, 10); // list 배열의 0번 방의 값을 10으로 수정.
        System.out.println(list.get(0));

        //=================
        // 삭제
        // 배열 삭제 없음
        // 10은 삭제되고 2만 남겨지고 2는 0번방이 됨
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.remove(0); // 0번방의 값을 삭제. 삭제하면 뒤에 있는 요소들이 앞으로 땡겨짐

        System.out.println(list.get(0));
        // System.out.println(list.get(1));
        // 삭제로 인해 1번방이 존재하지 않기 때문에 에러가 남


        //=======================
        // 데이터 개수 확인하는 방법
        // 배열 > length를 제공하기는 하지만 데이터의 개수랑 무관, 따로 내가 변수에 직접 보관해야함
        // ArrayLIst
        System.out.println(list.size()); // 1
        list.add(2);
        list.add(3);
        System.out.println(list.size()); // 3
        
        //========================

        // 배열보다 ArrayList가 사용성이 훨신 편하므로 ArrayList를 주로 사용하고
        // 성능이 중요한 부분에서는 배열을 사용한다
        // 배열이 더 속도가 더 빠르다.



    }
}
