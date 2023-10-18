package pz_16_2;

class Spectator extends Person {
    public Spectator(String lastName, String firstName, String middleName, int age) {
        super(lastName, firstName, middleName, age);
    }

    public String getLastName() {
        return super.getLastName();
    }

    public String getFirstName() {
        return super.getFirstName();
    }

    public String getMiddleName() {
        return super.getMiddleName();
    }

    public int getAge() {
        return super.getAge();
    }
}