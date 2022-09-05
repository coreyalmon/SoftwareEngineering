public class Main {

    public static void main(String[] args) {
        CoreyPersonBuilder coreyPersonBuilder = new CoreyPersonBuilder();
        PersonEngineer personEngineer = new PersonEngineer(coreyPersonBuilder);
    
        personEngineer.makePerson();
        Person corey = personEngineer.getPerson();

        System.out.println(corey.getFirstName());
    }
}
