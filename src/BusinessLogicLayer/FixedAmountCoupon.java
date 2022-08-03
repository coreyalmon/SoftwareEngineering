public class FixedAmountCoupon extends Coupon{
    private int fixedDeduct;
    private ShoppingLogic shoppingLogic;

    FixedAmountCoupon(String description, int fixedDeduct, ShoppingLogic shoppingLogic){
        super(description);
        this.fixedDeduct = fixedDeduct;
        this.shoppingLogic = shoppingLogic;
    }

    @Override
    public void cutPrice() {
        if(! isUsed){
            shoppingLogic.setSum(shoppingLogic.getSum() - fixedDeduct);
            isUsed = true;
        }
    }

    public ShoppingLogic getShoppingTracker() {
        return shoppingLogic;
    }

    public int getFixedDeduct() {
        return fixedDeduct;
    }
}
