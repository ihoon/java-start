package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number);   //number는 1.5 실수
        printNumber((int) number); //int 형 매개변수 n에 double형 실수인 1.5를 대입 시도, 컴파일 오류 //명시적 형변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자 : " + n);
    }
}
