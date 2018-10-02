package ro.jademy.carrental;

public abstract class AbstractPerson {
    private String firstName;
    public String lastName;

    public AbstractPerson(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
