import java.util.Stack;

public class CareTaker
{
    private Stack<Memento> mementos;

    public CareTaker()
    {
       mementos = new Stack<Memento>(); 
    }

    public void addMemento(Memento memento)
    {
        mementos.push(memento);
    }
    
    public Memento restoreMemento()
    {
        return mementos.pop();
    } 
}
