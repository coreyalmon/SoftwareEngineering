public class ConditionalCoupon extends FixedAmountCoupon{
    private int minTotal;

    ConditionalCoupon(String description, int fixedDeduct, int minTotal,  ShoppingLogic shoppingLogic){
        super(description, fixedDeduct, shoppingLogic);
        this.minTotal = minTotal;
    }

    @Override
    public void cutPrice() {
        var shoppingTracker = super.getShoppingTracker();
        double sum = shoppingTracker.getSum();
        if(! isUsed && minTotal < sum){
            shoppingTracker.setSum(sum - super.getFixedDeduct());
        }
    }
}
