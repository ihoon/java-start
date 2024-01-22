package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 /2;  // int / int = int
        System.out.println("div1 = " + div1);

        double div2 = 3/2; // int/int = int -> double;
        System.out.println("div2 = " + div2);

        double div3 = 3.0 /2; //double / int ->  double/int -> double/double -> double;
        System.out.println("div3 = " + div3);

        double div4 = (double) 3/2; //명시적 형변환을 사용했다 (double) int / int -> double / double로 형변환 발생
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double result = (double) a /b;
        System.out.println("result = " + result);

    }
}
