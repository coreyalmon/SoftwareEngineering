public class PercentageCoupon extends Coupon{
    private double percentDeduct;
    private ShoppingLogic shoppingLogic;

    PercentageCoupon(String description, double percentDeduct, ShoppingLogic shoppingLogic){
        super(description);
        this.percentDeduct = percentDeduct;
        this.shoppingLogic = shoppingLogic;
    }

    PercentageCoupon(){
        super();
    }

    @Override
    public void cutPrice() {
        if(! isUsed){
            shoppingLogic.setSum(shoppingLogic.getSum() * (1 - percentDeduct));
            isUsed = true;
        }
    }
}
