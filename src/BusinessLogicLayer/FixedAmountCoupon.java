package BusinessLogicLayer;

public class FixedAmountCoupon extends Coupon {
    private int fixedDeduct;
    private ShoppingLogic shoppingLogic;


    FixedAmountCoupon(String description, int fixedDeduct, ShoppingLogic shoppingLogic, COUPON_TYPE coupon_type){
        super(description, coupon_type);
        this.fixedDeduct = fixedDeduct;
        this.shoppingLogic = shoppingLogic;
    }

    @Override
    public void cutPrice() {
        shoppingLogic.setTotalCostOfItems(shoppingLogic.getTotalCostOfItems() - fixedDeduct);
    }

    public ShoppingLogic getShoppingLogic() {
        return shoppingLogic;
    }

    public int getFixedDeduct() {
        return fixedDeduct;
    }

    public COUPON_TYPE getCouponType() {
        return super.getCoupon_type();
    }
}
