package BusinessLogicLayer;


public class ShoppingMemento extends ShoppingCart 
{
    private ShoppingCart shoppingCart; 

    public ShoppingMemento(ShoppingCart shoppingCart)
    {
       this.shoppingCart = shoppingCart;
       

    }
}
