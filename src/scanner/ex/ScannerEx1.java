package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 나이를 입력 하세요 : ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("당신의 이름을 입력 하세요 : ");
        String name = scanner.nextLine();



        System.out.println("당신의 나이는 "+ age + "이고 이름은 " + name + " 입니다.");
    }
}
