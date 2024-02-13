package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출전, num1: " + num1); //5
        num1 = chageNumber(num1);
        System.out.println("2. changeNumber 호출후, num1 = " + num1); //10
    }

    public static int chageNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
