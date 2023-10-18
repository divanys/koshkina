package pz_16_1;

public class Administrator extends Person {
    public Administrator(String lastName, String firstName, String middleName, int age) {
        super(lastName, firstName, middleName, age);
    }

    public void informVisitors(String message) {
        System.out.println(message);
    }
}