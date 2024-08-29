package day5.arrayRemove;

import java.util.ArrayList;
import java.util.List;

public class ArrayRemove {
    public static void main(String[] args) {
        // 10개짜리 숫자 배열

        int[] arr = new int[10];
        // 배열에 필요한 정보 : 길이(가 정해저야함)
        // 정해지면 바꿀 수 없다, 배열의 길이는 고정되어 있다
        int count = 0; // 내가 저장한 정보의 개수를 기억하기 위함

        // 배열의 갯수랑 배열의 저장한 갯수가 다를 수 있다.
        // 내가 몇개까지 저장했는지 세야한다.
        arr[0] = 1;
        count++;

        arr[1] = 2;
        count++;

        arr[2] = 3;
        count++;

        arr[3] = 4;
        count++;

        arr[4] = 5;
        count++;

        //저장한 숫자를 출력
        for(int i = 0; i < count; i++){
            System.out.println(arr[i]);
        }

        // 1,2,3,4,5
        // 3 삭제 > 1,2,4,5
        // 3 삭제=====================

//        arr[2] = arr[3];
//        arr[3] = arr[4];
//        arr[4] = arr[5]; //...

        for(int i = 2; i < count -1; i++){
            arr[i] = arr[i+1];
        }
        count--;

        //===========================
        //3을 삭제한 결과 출력
        for(int i = 0; i < count; i++){
            System.out.println(arr[i]);
        }

        // 배열에서 요소를 삭제하는 것은 불가능.
        // 삭제된 것처럼 보이게 해야함
        // 삭제하면 뒤에 있는 요소를 가지고 와야함
        // 맨 끝에 꺼를 버리고 앞에 있는 건만 사용하고 요소의 수를 바꾸어 주어야 함

        // 배열의 단점 > 길이가 고정되어 있다.
        // 유연성이 떨어지고 삭제나 추가기능이 복잡하다.

        // 해결 -> 길이를 유동적으로 변하게 하는 배열 사용=> 동적배열(ArrayList)




    }


}
