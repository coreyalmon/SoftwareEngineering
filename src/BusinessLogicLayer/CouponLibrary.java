import java.util.ArrayList;
import java.util.List;

public class CouponLibrary {
    private List<Coupon> couponList = new ArrayList<>();

    public CouponLibrary(ShoppingLogic shoppingLogic){
        couponList.add(new ConditionalCoupon("Get $5 off after spending $40!", 5, 40, shoppingLogic));
        couponList.add(new ConditionalCoupon("Get $5 off after spending $50!", 5, 50, shoppingLogic));
        couponList.add(new PercentageCoupon("Get 20% off", .2, shoppingLogic));
        couponList.add(new FixedAmountCoupon("Get $5 off", 5, shoppingLogic));
    }

    public List<Coupon> getCouponList() {
        return couponList;
    }
}
