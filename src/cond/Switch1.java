package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grage = 2;

        int coupon;

        if (grage == 1) {
            coupon = 1000;
        }else if(grage == 2) {
            coupon = 2000;
        } else if (grage == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }

        System.out.println("발급받은 쿠폰" + coupon);

    }
}
