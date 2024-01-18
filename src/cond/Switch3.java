package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch(grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                // break를 안쓰는 경우에 대한 switch문 예제
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("coupon = " + coupon);
    }
}
