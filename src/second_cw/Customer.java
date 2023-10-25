package second_cw;


class Customer extends Person {

    private final String whoIs = "Customer😘";

    public Customer(String lastName, String firstName, String middleName, int age) {
        super(lastName, firstName, middleName, age);
    }


    public String getWhoIs() {
        return whoIs;
    }

    public void printInfo() {
        System.out.printf("\nФамилия: %s\n" +
                "Имя: %s\n" +
                "Отчество: %s\n" +
                "Должность: %s\n" +
                "Возраст: %d\n", getLastName(), getFirstName(), getMiddleName(), getWhoIs(), getAge());
    }
}