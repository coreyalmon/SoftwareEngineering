package BusinessLogicLayer;

/**
 * Coupon Decorator utilizing the Decorator Pattern
 */
public class CouponApplier extends CouponDecorator{
    Coupon coupon;
    
    public CouponApplier(Coupon coupon, CouponApplier previousCouponApplier){
        super(previousCouponApplier);
        this.coupon = coupon;
    }

    public void applyCoupon(){
        super.applyCoupon();
        if(coupon != null)
            coupon.cutPrice();
    }
}
