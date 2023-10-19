package pz_16_2;

public class Main {
    public static void main(String[] args) {
        Spectator spectator1 = new Spectator("Павлова", "Валерия", "Алексеевна", 18);
        Performance performance1 = new Performance("Спектакль", "Бархатные ручки", 16);
        Ticket ticket1 = new Ticket(SessionType.WEEKDAY, 700, "Амфитеатр", 3, 16);
        ticket1.regTicket(1, spectator1, performance1);
        ticket1.printTicket(1);
    }
}
