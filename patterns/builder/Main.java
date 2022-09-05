public class Main {

    public static void main(String[] args) {
        PersonEngineer personEngineer = new PersonEngineer( new CoreyPersonBuilder());
    
        personEngineer.makePerson();
        Person corey = personEngineer.getPerson();

        System.out.println(corey.getFirstName());
    }
}
