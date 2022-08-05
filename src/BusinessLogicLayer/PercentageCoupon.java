package BusinessLogicLayer;

public class PercentageCoupon extends Coupon {
    private double percentDeduct;
    private ShoppingLogic shoppingLogic;


    public PercentageCoupon(String description, double percentDeduct, ShoppingLogic shoppingLogic, COUPON_TYPE coupon_type){
        super(description, coupon_type);
        this.percentDeduct = percentDeduct;
        this.shoppingLogic = shoppingLogic;
    }

    public PercentageCoupon(){
        super();
    }

    @Override
    public void cutPrice() {
        shoppingLogic.setTotalCostOfItems(shoppingLogic.getTotalCostOfItems() * (1 - percentDeduct));
    }

    public COUPON_TYPE getCouponType() {
        return super.getCoupon_type();
    }
}
