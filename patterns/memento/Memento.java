public class Memento extends Originator
{

    Memento(Originator originator)
    {
        this.name = originator.name;        
    }
}
