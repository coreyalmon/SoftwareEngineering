import java.util.List;
import java.util.ArrayList;

public class Stock implements Observable
{
    private double price;    
    private List<Observer> observers;
    
    public Stock(double price)
    {
        observers = new ArrayList<Observer>();
        this.price = price;
    }
    

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void attach(Observer observer)
    {
        observers.add(observer);
    }

    public void detach(Observer observer)
    {
        observers.remove(observer);
    }

    public void notifyAllObservers() 
    {
        for(Observer observer : observers)
        {
            observer.update();
        }
    }

}
