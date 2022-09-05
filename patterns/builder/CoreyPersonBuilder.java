public class CoreyPersonBuilder implements PersonBuilder {
    private Person person;

    public CoreyPersonBuilder() {
        this.person = new Person();
    }

    public void buildFirstName() {
        person.setFirstName("Corey");
    }

    public void buildLastName() {
        person.setFirstName("Almonte");
    }


    public void buildAge() {
        person.setAge(24);
    }

    public Person getPerson() {
        return person;
    }
}
