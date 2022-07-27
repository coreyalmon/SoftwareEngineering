// Go back to the first name after changing it twice.
public class Main
{
    public static void main(String[] args)
    {
        
        Originator org = new Originator();
        String first = "Alyssa";
        org.setName(first);
        System.out.println("first name is: " + org.getName());
    
        //State of name is saved    
        CareTaker careTaker = new CareTaker();
        careTaker.addMemento(new Memento(org));

        // New name for name
        String second = "Corey";
        org.setName(second);
        System.out.println("second name is: " + org.getName());

        // new name is saved
        careTaker.addMemento(new Memento(org));
        
        //Third name for name
        String third = "Cat";
        org.setName(third);
        System.out.println("third name is: " + org.getName());
 

        //rolling back to second name
        org = careTaker.restoreMemento();
        System.out.println("Second name is: " + org.getName());
        
              
        org = careTaker.restoreMemento(); 
        System.out.println("First name is: " + org.getName()); 
    }

}
