package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("이름을 입력 하세요(종료를 입력 하면 종료): ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            }

            System.out.print(" 나이를 입력 하세요 ");
            int age = input.nextInt();
            input.nextLine(); // 숫자 입력 후의 줄바꿈 자리

            System.out.print("입력한 이름 : " + name + ", 나이 " + age);
        }
    }
}
