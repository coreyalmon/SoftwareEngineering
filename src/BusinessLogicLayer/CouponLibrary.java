package BusinessLogicLayer;

import BusinessLogicLayer.Coupon;

import java.util.ArrayList;
import java.util.List;

public class CouponLibrary {
    private List<Coupon> couponList = new ArrayList<>();

    public CouponLibrary(ShoppingLogic shoppingLogic){
        couponList.add(new FixedAmountCoupon("New user get $10 off!", 10, shoppingLogic, COUPON_TYPE.COUPON_TYPE_NEW_USER));
        couponList.add(new PercentageCoupon("Two or more items, 20% off ", .2, shoppingLogic, COUPON_TYPE.COUPON_TYPE_TWO_OR_MORE_ITEMS));
        couponList.add(new FixedAmountCoupon("Returning user, get $5 off", 5, shoppingLogic, COUPON_TYPE.COUPON_TYPE_RETURN_USER));
    }

    public List<Coupon> getCouponList() {
        return couponList;
    }
}
