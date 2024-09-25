import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int numer1 = 2;
        int denom1 = 8;
        int numer2 = 2;
        int denom2 = 8;

        int[] answer = {0, 0};
        ArrayList<Integer> denomMeasure = new ArrayList<>();

        if (denom1 == denom2) {
            answer[0] = numer1 + numer2;
            answer[1] = denom1;

        }

        if (denom1 != denom2 && denom1 % denom2 != 0 && denom2 % denom1 != 0) {
            answer[0] = (numer1 * denom2) + (numer2 * denom1);
            answer[1] = denom1 * denom2;

        }

        if (denom1 > denom2 && denom1 % denom2 == 0) {
            answer[0] = numer2 * denom2 + numer1;
            answer[1] = denom1;

        }

        if (denom1 < denom2 && denom2 % denom1 == 0) {
            answer[0] = numer1 * denom1 + numer2;
            answer[1] = denom2;

        }

        if (answer[1] != 0) {
            for (int i = 0; i <= answer[1]; i++) {
                if (answer[1] % i == 0) {
                    denomMeasure.add(i);
                }
            }
        }

//        if(answer[0]%answer[1] == 0){
//            answer[0] = answer[0] / answer[1];
//            answer[1] = answer[1] / answer[1];
//        }

        for (int i = 0; i) {

        }

        System.out.printf("분자 : %s, 분모 : %s", answer[0], answer[1]);


    }
}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0, 0};

        if (denom1 == denom2) {
            answer[0] = numer1 + numer2;
            answer[1] = denom1;
        }

        if (denom1 > denom2 || denom1 < denom2) {
            if (denom1 > denom2) {
                if (denom1 % denom2 == 0) {
                    answer[0] = numer2 * denom2 + numer1;
                    answer[1] = denom1;
                } else {
                    answer[0] = numer2 * denom1 + numer1 * denom2;
                    answer[1] = denom1 * denom2;
                }
            } else {
                if (denom2 % denom1 == 0) {
                    answer[0] = numer1 * denom1 + numer2;
                    answer[1] = denom2;
                } else {
                    answer[0] = numer2 * denom1 + numer1 * denom2;
                    answer[1] = denom1 * denom2;
                }
            }
        }

        return answer;
    }
}