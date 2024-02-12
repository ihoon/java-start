package method;

public class Method1Ref {
    public static void main(String[] args) {
        //계산1
        int sum1 = add(5, 10);
        System.out.println("결과1출력 = " + sum1);

        System.out.println("===================");

        //계산2
        int sum2 = add(15, 20);
        System.out.println("결과2출력 = " + sum2);
    }

    //add 메서드 = 함수
    //제어자 반환타입 메서드이름(매개변수 목록){
    // 매서드 본문
    // }
    public static int add(int a, int b) { //<- 매서드선언부 : 매서드이름, 반환타입, 매개변수를 순서대로 포함함
        System.out.println(a + "+" + b);
        int sum = a + b;
        return sum;
    }
}
