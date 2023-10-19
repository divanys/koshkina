package pz_16_2;

class Ticket implements TicketPricing {
    private SessionType sessionType;
    private Spectator spectator;
    private double price;
    private double discount;

    public Ticket(SessionType sessionType, String showName, Spectator spectator, double price, double discount) {
        setSessionType(sessionType);
        setSpectator(spectator);
        setPrice(price);
        setDiscount(discount);
    }

    public SessionType getSessionType() {
        return sessionType;
    }

    public void setSessionType(SessionType sessionType) {
        this.sessionType = sessionType;
    }

    public Spectator getSpectator() {
        return spectator;
    }

    public void setSpectator(Spectator spectator) {
        this.spectator = spectator;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // регистрация билетика
    public void regTicket(int numberTicket, Spectator spectator) {

        System.out.printf("Билет номер %d\nНазвание представления %s\nФамилия %s\nИмя %s\nОтчество %s\n" +
                "Возрастное ограничение %s\n<Тип посадочного места> %s\nРяд %d\nМесто %d\nСтоимость %.2f\n" +
                "Скидка %s\n\nПриятного просмотра!\n", numberTicket, getShowName(), spectator.getFirstName(),
                spectator.getLastName(), spectator.getMiddleName(),);
    }

    // вывод самого билетика для конкретного пользователя
    public void printTicket(String firstName) {

    }


    @Override
    public double calculateTicketPrice(SessionType sessionType, int age, double basePrice) {
        switch (sessionType) {
            case WEEKDAY:
            case WEEKEND:
                price = basePrice * sessionType.getDiscount();
                break;
            case HOLIDAY:
                price = basePrice;
                break;
        }
        return price;
    }
}