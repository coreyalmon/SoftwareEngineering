public abstract class  Coupon {
    private String description;
    protected boolean isUsed = false;

    public Coupon( String description) {
        this.description = description;
    }

    public Coupon(){}

    public abstract void cutPrice();
}
