package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print(" 상품의 가격을 입력 하세요 (-1을 입력 하면 종료) : ");
            int price = input.nextInt();

            if (price == -1) {
                System.out.println(" 프로그램을 종료 합니다. ");
                break;
            }

            System.out.print("구매하려는 수량을 입력 하세요 : ");
            int quantity = input.nextInt();

            int totalprice = price * quantity;
            System.out.println("총비용 : " + totalprice);
        }
    }
}
