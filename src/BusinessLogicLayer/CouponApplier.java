package BusinessLogicLayer;

/**
 * Coupon Decorator utilizing the Decorator Pattern
 */
public class CouponApplier {
    private CouponApplier previousCouponApplier;
    private Coupon coupon;

    public CouponApplier(Coupon coupon, CouponApplier previousCouponApplier){
        this.coupon = coupon;
        this.previousCouponApplier = previousCouponApplier;
    }

    void applyCoupon(){
        if(previousCouponApplier != null)
            previousCouponApplier.applyCoupon();
        if(coupon != null)
            coupon.cutPrice();
    }

//    public void applyCoupon(){
//        if(previousCouponApplier != null){
//            previousCouponApplier.applyCoupon();
//        }
//
//        if(coupon != null){
//            coupon.cutPrice();
//            System.out.println(coupon.getDescription());
//        }else{
//            System.out.println();
//            System.out.println();
//        }
//    }

}
