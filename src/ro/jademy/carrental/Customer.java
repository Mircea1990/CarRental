package ro.jademy.carrental;

public class Customer extends AbstractPerson {

   private int buget;

    public Customer(String firstName, String lastName,int buget) {
        super(firstName, lastName);
        this.buget = buget;
        this.lastName = lastName;
    }

    public int getBuget(){
        return getBuget();
    }
}
