package pz_16_2;

public enum SessionType {
    WEEKDAY(0.2),
    WEEKEND(0.1),
    HOLIDAY(0.0);

    private final double discount;

    SessionType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}