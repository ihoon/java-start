package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 몇단을 보여 드릴 까요?");
        int n = scanner.nextInt();

        System.out.println(n + "구구단");
        for (int i = 1; i <= 9;  i++) {

            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
