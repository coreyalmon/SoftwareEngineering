package BusinessLogicLayer;

public abstract class Coupon {
    private String description;
    private COUPON_TYPE coupon_type;

    public Coupon( String description, COUPON_TYPE coupon_type) {
        this.description = description;
        this.coupon_type = coupon_type;
    }

    public String getDescription() {
        return description;
    }

    public abstract void cutPrice();
    public COUPON_TYPE getCoupon_type(){
        return coupon_type;
    }
}
