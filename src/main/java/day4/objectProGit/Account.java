package day4.objectProGit;

public class Account {
    public static void main(String[] args) {
        AccountExam a1 = new AccountExam();

        a1.deposit(1000); // 1000원을 예금했습니다.
        a1.deposit(2000); // 2000원을 예금했습니다.
        a1.deposit(3000); // 3000원을 예금했습니다.

        int money = a1.withdraw(400);
        System.out.println(money); // 400

        int remainder = a1.getRemainder();
        System.out.println(remainder); // 5600

        money = a1.withdraw(1400);
        System.out.println(money); // 1400

        remainder = a1.getRemainder();
        System.out.println(remainder); // 4200
    }
}

// 이미 존재하는 기능이 있으면 따로 적지 않고 메서드를 불러와서 사용할 수 있다.
