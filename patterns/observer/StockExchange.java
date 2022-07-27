public class StockExchange implements Observer 
{
    private Stock stock;
    public StockExchange(Stock stock)
    {
        this.stock = stock;
    }


    public void update()
    {
        System.out.println(stock.getPrice());
    }
}
