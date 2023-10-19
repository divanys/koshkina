package pz_16_2;

class Controller extends Person implements Employee {
    private String performanceName;

    public Controller(String lastName, String firstName, String middleName, int age, String performanceName) {
        super(lastName, firstName, middleName, age);
        setPerformanceName(performanceName);
    }

    public void setPerformanceName(String performanceName) {
        this.performanceName = performanceName;
    }

    public void findSeat(int numberOfRow, int numberOfSeat) {
        System.out.printf("Контролёр помогает вам найти место в ряду %d, место %d.\n", numberOfRow, numberOfSeat);
    }

    public void findRow(int numberOfRow) {
        System.out.printf("Контролёр помогает вам найти ряд номер %d.\n", numberOfRow);
    }

    public void assistWithTicket(Ticket ticket) {
        System.out.printf("Контролёр помогает с билетом на представление \"%s\".\n", ticket.getShowName());
    }

    public void providePerformanceInfo(Performance performance) {
        System.out.printf("Информация о представлении:\nНазвание: %s\nТип: %s\nВозрастное ограничение: %d\n",
                performance.getShowName(), performance.getShowType(), performance.getAgeRestriction());
    }

    public void checkTicket(Ticket ticket) {
        if (ticket.isReg()) {
            System.out.println("Билет действителен.");
        } else {
            System.out.println("Билет не зарегистрирован.");
        }
    }

    @Override
    public String getPerformanceName() {
        return performanceName;
    }
}