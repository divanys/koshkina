package pz_16_2;

class Ticket implements TicketPricing {
    private int numberTicket;
    private SessionType sessionType;
    private double basePrice;
    private double price;
    private String typeOfSeat;
    private int numberOfRow;
    private int numberOfSeat;
    private String lastName;
    private String middleName;
    private String firstName;
    private int ageRestriction;
    private String showName;
    private String date;
    private String time;
    private boolean isReg = false;

    public Ticket(SessionType sessionType, double basePrice, String typeOfSeat, int numberOfRow, int numberOfSeat) {
        setSessionType(sessionType);
        setBasePrice(basePrice);
        setTypeOfSeat(typeOfSeat);
        setNumberOfRow(numberOfRow);
        setNumberOfSeat(numberOfSeat);
    }

    public boolean isReg() {
        return isReg;
    }

    public void setSessionType(SessionType sessionType) {
        this.sessionType = sessionType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getTypeOfSeat() {
        return typeOfSeat;
    }

    public void setTypeOfSeat(String typeOfSeat) {
        this.typeOfSeat = typeOfSeat;
    }

    public int getNumberOfRow() {
        return numberOfRow;
    }

    public void setNumberOfRow(int numberOfRow) {
        this.numberOfRow = numberOfRow;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }


    public int getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(int numberTicket) {
        this.numberTicket = numberTicket;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // регистрация билетика
    public void regTicket(int numberTicket, Spectator spectator, Performance performance) {
        if (!isReg) {
            setNumberTicket(numberTicket);
            setShowName(performance.getShowName());
            setLastName(spectator.getLastName());
            setFirstName(spectator.getFirstName());
            setMiddleName(spectator.getMiddleName());
            setAgeRestriction(performance.getAgeRestriction());
            calculateTicketPrice(sessionType, spectator.getAge(), getBasePrice());
            setDate(performance.getDate());
            setTime(performance.getTime());
            setTime(time);

            // Проверяем возраст и возрастное ограничение
            if (spectator.getAge() >= performance.getAgeRestriction()) {
                System.out.println("Регистрация прошла успешно!\n");
                printTicket(numberTicket);
                System.out.println("Приятного просмотра!\n");
                isReg = true;
            } else {
                System.out.println("Извините, вам нельзя посетить это представление из-за возрастных ограничений.");
                isReg = false;
            }
        } else {
            System.out.println("Билет с такими данными уже зарегистрирован!");
        }
    }

    // вывод самого билетика по номеру
    public void printTicket(int numberTicket) {
        System.out.printf("Билет номер %d\nНазвание представления %s\nДата %s\nВремя %s\nФамилия %s\nИмя %s\nОтчество %s\n" +
                        "Возрастное ограничение %s\n<Тип посадочного места> %s\nРяд %d\nМесто %d\nСтоимость базовая %.2f\n" +
                        "Ваша скидка %s\nСтоимость вашего билета %.2f\n\n", numberTicket, getShowName(), getDate(), getTime(),
                getLastName(), getFirstName(), getMiddleName(), getAgeRestriction(), getTypeOfSeat(), getNumberOfRow(),
                getNumberOfSeat(), getBasePrice(), sessionType.getDiscount(),
                calculateTicketPrice(sessionType, getAgeRestriction(), getBasePrice()));
    }

    // ну че удалим Леркин интересный выходной?
    public void removeTicket(int numberTicket) {
        if (isReg && this.numberTicket == numberTicket) {
            this.numberTicket = 0;
            isReg = false;
            System.out.printf("Билет с номером %d удален.\n", numberTicket);
        } else {
            System.out.printf("Билет с номером %d не зарегистрирован!\n", numberTicket);
        }
    }

    @Override
    public double calculateTicketPrice(SessionType sessionType, int age, double basePrice) {
        switch (sessionType) {
            case WEEKDAY:
            case WEEKEND:
                price = basePrice - basePrice * sessionType.getDiscount();
                break;
            case HOLIDAY:
                price = basePrice;
                break;
        }
        return price;
    }

}