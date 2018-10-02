package ro.jademy.carrental;

public class Salesman extends AbstractPerson {

    private String userName;
    private String pass;

    public Salesman(String firstName, String lastName,
                    String userName, String pass) {
        super(firstName, lastName);

        this.userName = userName;
        this.pass = pass;
    }


    public String getUserName() {
        return userName;
    }

    public String getPass() {
        return pass;
    }


}
