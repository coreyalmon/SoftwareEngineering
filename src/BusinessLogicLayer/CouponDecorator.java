package BusinessLogicLayer;

public class CouponDecorator {
    CouponDecorator previousCouponDecorator;

    CouponDecorator(CouponDecorator previousCouponDecorator){
        this.previousCouponDecorator = previousCouponDecorator;
    }

    public void applyCoupon(){
        if(previousCouponDecorator != null)
            previousCouponDecorator.applyCoupon();
    }
}
