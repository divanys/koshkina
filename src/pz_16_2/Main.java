package pz_16_2;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();
        Spectator spectator1 = new Spectator("Павлова", "Валерия", "Алексеевна", 18);
        Spectator spectator2 = new Spectator("неПавлова", "неВалерия", "неАлексеевна", 24);
        Performance performance1 = new Performance("Спектакль", "Бархатные ручки", 15, "21-10-2023", "16:00");
        Ticket ticket1 = new Ticket(SessionType.WEEKDAY, 700, "Амфитеатр", 3, 16);
        Ticket ticket2 = new Ticket(SessionType.WEEKDAY, 700, "Амфитеатр", 3, 15);
        ticket1.regTicket(1, spectator1, performance1);
        ticket2.regTicket(2, spectator2, performance1);
        theatre.addTicket(ticket1);
        theatre.addTicket(ticket2);
//        ticket1.printTicket(1);
        theatre.printListAllTickets();
    }
}
