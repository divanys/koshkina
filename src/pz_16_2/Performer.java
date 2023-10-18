package pz_16_2;

class Performer extends Person implements Employee {
    private String performanceName;

    public Performer(String lastName, String firstName, String middleName, int age, String performanceName) {
        super(lastName, firstName, middleName, age);
        setPerformanceName(performanceName);
    }

    public void setPerformanceName(String performanceName) {
        this.performanceName = performanceName;
    }

    @Override
    public String getPerformanceName() {
        return performanceName;
    }
}