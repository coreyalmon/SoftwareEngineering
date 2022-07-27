public class Robinhood implements Observer 
{
    private Stock stock;
    public Robinhood(Stock stock)
    {

        this.stock = stock;
    }

    public void update()
    {
        System.out.println(stock.getPrice());
    }
}
