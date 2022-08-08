package BusinessLogicLayer;

public class ConditionalCoupon extends FixedAmountCoupon{
    private int minTotal;

    ConditionalCoupon(String description, int fixedDeduct, int minTotal,  ShoppingLogic shoppingLogic, COUPON_TYPE coupon_type){
        super(description, fixedDeduct, shoppingLogic, coupon_type);
        this.minTotal = minTotal;
    }

    @Override
    public void cutPrice() {
        var shoppingLogic = super.getShoppingLogic();
        double sum = shoppingLogic.getTotalCostOfItems();
        if(minTotal < sum){
            shoppingLogic.setTotalCostOfItems(sum - super.getFixedDeduct());
        }
    }

    @Override
    public COUPON_TYPE getCouponType() {
        return super.getCouponType();
    }
}

