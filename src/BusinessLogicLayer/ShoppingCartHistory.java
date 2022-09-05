package BusinessLogicLayer;
import java.util.Stack;

public class ShoppingCartHistory
{
    private Stack<ShoppingMemento> mementos;

    public ShoppingCartHistory()
    {
       mementos = new Stack<ShoppingMemento>(); 
    }

    public void addMemento(ShoppingMemento memento)
    {
        mementos.push(memento);
    }
    
    public ShoppingMemento restoreMemento()
    {
        return mementos.pop();
    } 
}


   
