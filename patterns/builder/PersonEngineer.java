public class PersonEngineer {
    private PersonBuilder personBuilder;

    public PersonEngineer(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public Person getPerson() {
        return this.personBuilder.getPerson();
    }

    public void makePerson() {
        this.personBuilder.buildAge();
        this.personBuilder.buildFirstName();
        this.personBuilder.buildLastName();

    }
}
