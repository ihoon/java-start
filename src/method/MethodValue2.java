package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출전, number: " + number); //5
        chageNumber(number);
        System.out.println("4. changeNumber 호출후, number = " + number); //5
    }

    public static void chageNumber(int number) {
        System.out.println("2. chageNumber 변경 전, number: " + number); //5
        number = number * 2;
        System.out.println("3. chageNumber 변경 후, number: " + number); //10
    }
}
