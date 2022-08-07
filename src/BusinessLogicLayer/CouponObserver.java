public class CouponObserver implements Observer {

    private ShoppingLogic shoppingLogic;
    private boolean TwoItems;
    private boolean NewUser;
    private boolean ReturningUser;

    public CouponObserver()
        {TwoItems=false;
        NewUser=false;
        ReturningUser=false;}


    public boolean isTwoItems()
    {return TwoItems;}

    public boolean isNewUser()
    {return NewUser;}

    public boolean isReturningUser()
    {return ReturningUser;}

    public void update()
    {
        if (shoppingLogic.getTotalNumberOfItems()>2)
        {TwoItems=true;}
        
        if (shoppingLogic.getUserName()==null)
        {NewUser=true;}
       
        else if (shoppingLogic.getUserName()!=null)
        {ReturningUser=true;}

      

    }
}
