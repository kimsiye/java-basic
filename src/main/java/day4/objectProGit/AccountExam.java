package day4.objectProGit;

public class AccountExam {
//    int bankbook = 0;
//    int money = 0;
//
//    // 돈 들어옴
//    public void deposit (int num){
//        System.out.println(num+"원이 예금됐습니다");
//        bankbook = bankbook + num;
//        // System.out.println("통장잔액 : "+ bankbook);
//    }
//
//    // 추가 입금
//    public int withdraw (int num){
//        bankbook = bankbook + num;
//        money = num * 2;
//        return num ;
//    }
//
//    // 출금
//    public int getRemainder (){
//        bankbook = bankbook - money ;
//        return bankbook ;
//    }

    // 선생님 풀이
    // 처음 들어온 돈 담아줄 곳 필요
    int remainder = 0;

    public void deposit(int money){
        remainder = remainder + money;
        System.out.println(money +"원을 예금했습니다.");
    }

    // 출금
    public int withdraw(int money){
        remainder = remainder - money;
        return money;
    }

    // 잔액
    public int getRemainder(){
        return remainder;
    }

    //void는 출력할 때 , int return할 때 참 거짓 다 나오게 해야함


}
