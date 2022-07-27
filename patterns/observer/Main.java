public class Main
{
    public static void main(String[] args)
    {
        Stock gme = new Stock(100.97);    

        StockExchange stockExchange = new StockExchange(gme);
        Robinhood robinhood = new Robinhood(gme);

        gme.attach(stockExchange);
        gme.attach(robinhood);

        gme.notifyAllObservers();

        gme.setPrice(0.00);
        gme.notifyAllObservers();              

        gme.detach(stockExchange);
        gme.detach(robinhood);

        gme.notifyAllObservers();  
 
    }

}
