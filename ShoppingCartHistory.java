import java.util.HashMap;

public class ShoppingCartHistory<Memento> {
    private HashMap<String, Memento> cartHistoryMap;

    public ShoppingCartHistory()
    {
       cartHistoryMap = new HashMap<String,Memento>(); 
    }

    public void addMemento(String username, Memento memento)
    {
        cartHistoryMap.put(username, memento);
    }
    
    public Memento restoreMemento(String username)
    {
         return cartHistoryMap.remove(username);
    } 

}
