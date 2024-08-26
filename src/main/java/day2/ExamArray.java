package day2;

public class ExamArray {
    public static void main(String[] args) {
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(int a = 0; a < arr.length; a++){
            System.out.println(arr[a]);
        }

        System.out.println("============");

        // 배열의 모든 요소를 세번 출력해주세요.
        int[] arr2 = {1,2,3,4,5};
        for(int c = 1; c <= 3; c++){
            for(int b = 0; b < arr2.length; b++){
                System.out.println(arr2[b]);
            }
        }

        System.out.println("============");


        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        int[] arr3 = {1,2,3,4,5};
        for(int d = arr2.length-1; d >= 0; d--){
            System.out.println(arr3[d]);
        }

        System.out.println("============");

        // 배열 안의 숫자들의 합을 구해주세요.

        int[] arr4 = {10, 20, 30, 40, 50};

		/*
		// 아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
		*/

        int sum = 0 ;
        for(int e = 0; e < arr.length; e++){
            sum = sum +arr[e];
        }
        System.out.println(sum);

    }
}
