package pz_16_2;

interface TicketPricing {
    double calculateTicketPrice(SessionType sessionType, int age, double basePrice);
}