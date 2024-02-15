package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액확인| 4.종료 ");
            System.out.println("----------------------------------");
            System.out.print("선택 : ");

            int choice = scanner.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력 하세요 : ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력 하세요: ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재의 잔액은 " + balance + "원입니다.");
                    break;
                case 4:
                    System.out.println("시스템을 종료 합니다.");
                    return; //return 가능 (메서드에서 밖으로 나가 버림)
                            // break를 하는 경우 while문안에서 빠져나오지 못해 while문에서 지속 돌아감
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금 하여 총" + balance+ "원의 잔액이 낭았습4니다");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(balance + "에서 " + amount + " 출금 되었습니다.");
            return balance;
        } else {
            System.out.println("잔액이 부족 합니다.");
            return balance;
        }

    }
}
