package pz_16_2;

class Ticket implements TicketPricing {
    private SessionType sessionType;
    private String showName;
    private Spectator spectator;
    private double price;
    private double discount;

    public Ticket(SessionType sessionType, String showName, Spectator spectator, double price, double discount) {
        setSessionType(sessionType);
        setShowName(showName);
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

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
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

    @Override
    public double calculateTicketPrice(SessionType sessionType, int age, double basePrice) {
        return 0;
    }
}