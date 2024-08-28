package day2;

public class Array {
    public static void main(String[] args) {

        // 모든 변수를 출력하려면 모든 걸 출력하는것들을 만들어야함

        int a = 10;
        int b = 10;

        // 변수가 많아지면 변수를 관리하고 변수를 사용하기 힘듬
        // 1. 변수명이 많아져서 힘듬 => 변수명을 한개만 쓰면 됨
        // 2. 변수가 많아서 다 사용하기 힘듬 => 반복문을 사용하면 됨

        // 결론 : 배열을 사용하면 됨

        // int(하나의 숫자)  arr = 10,20,30,40,50 > 변수에는 하나의 값만 가능
        int[] arr = {10, 20, 30, 40, 50, 60,};

        // 배열은 0부터 시작한다
        // 배열은 입력된 순서대로 저장되다

        System.out.println(arr[3]); // 대괄호를 치고 순번 넣기
        System.out.println(arr[1]);

        // arr[3] => 하나의 변수로 쓸 수 있음

        System.out.println("=========");
        System.out.println(arr[2]);
        arr[2] = 100; // 배열의 특징 위치와 값을 새로운 값으로 대입 가능
        System.out.println(arr[2]);
        System.out.println("=========");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]); // 규칙 : 숫자 증가가 일정함
        System.out.println("=========");
        for(int i = 0; i <= 4; i++){
            System.out.println(arr[i]);
        }
        System.out.println("=========");
        System.out.println("=========");

        // 숫자 10,20,30,40,50,60,70,80,90,100
        // 배열에 저장하고 출력

        int[] arrTwo = {10,20,30,40,50,60,70,80,90,100};
//        for(int c = 0; c<=9; c++){
//            // 0부터 시작하기 때문에 9부터 시작, 넘어가면 에러가 나옴
//            System.out.println(arrTwo[c]);
//        }

        for(int c = 0; c<arrTwo.length; c++){
            System.out.println(arrTwo[c]);
        }

        // 배열의 길이 정보 확인
        System.out.println(arrTwo.length); // 1부터 세줌 > 인덱스로 바꿀려면 마지막 숫자에서 -1로 생각

        // 내가 저장할 값이 몇개인지 모를 때. 개수를 알아도 구체적인 값을 모를 때
        // 비어있는 배열을 만들어 넣고 나중에 값을 저장할 수도 있어야함

        // 10개짜리 비어있는 배열을 만들기
        int[] arr3 = {0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(arr3.length);
        arr3[0] = 30;

        // 1000개짜리 비어있는 배열을 만들기
        int[] arr4 = new int[10]; // =int[] arr3 = {0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(arr4.length);

        arr4[4] = 10; // 중간에 값 저장

        // 숫자 배열
        //int[] arr5 = {1,2,20.1}; // 숫자 꾸러미 이기 때문에 숫자만 저장자능, 다른 타입불가능

        // 문자 배열
        String[] arr6 = {"apple", "banana","orange"};

        // 논리 배열
        boolean[] arr7 = {true};




















    }
}

