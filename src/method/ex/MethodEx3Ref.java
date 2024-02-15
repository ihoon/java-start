package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        //입금 1000
        balance = deposit(balance, 1000);
        balance = withdraw(balance, 10001);
        //출금 2000
        System.out.println(" 최종 잔액: " + balance + "원입니다.");
    }
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액은 " + balance + "원입니다.");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액은 " + balance + "원입니다.");
            return balance;
        } else {
            System.out.println(amount + "원을 출금 하려고 하였으나 잔액이 부족합니다. ");
            return balance;
        }

    }
}
