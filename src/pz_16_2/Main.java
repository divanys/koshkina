package pz_16_2;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();

        Spectator spectator1 = new Spectator("Павлова", "Валерия", "Алексеевна", 18);
        Spectator spectator2 = new Spectator("неПавлова", "неВалерия", "неАлексеевна", 24);
        Spectator spectator3 = new Spectator("Кошкина", "Анастасия", "Алексеевна", 17);

        Performance performance1 = new Performance("Спектакль", "Бархатные ручки", 16, "21-10-2023", "16:00");
        Performance performance2 = new Performance("Концерт", "Рок-группа абракадабра", 18, "22-10-2023", "19:30");
        Performance performance3 = new Performance("Кукольное выступление", "Кукла Боб и кукла Джоб", 6, "23-10-2023", "12:30");

        Ticket ticket1 = new Ticket(SessionType.WEEKDAY, 700, "Амфитеатр", 3, 16);
        Ticket ticket2 = new Ticket(SessionType.HOLIDAY, 700, "Амфитеатр", 3, 15);
        Ticket ticket3 = new Ticket(SessionType.WEEKEND, 120, "Балкон", 1, 2);
        Ticket ticket4 = new Ticket(SessionType.WEEKEND, 600, "Зал", 1, 10);

        Performer performer1 = new Performer("Иванов", "Иван", "Иванович", 25, "Актёр");
        Performer performer2 = new Performer("Взрослый", "Важный", "Бумажный", 40, "Музыкант");
        Performer performer3 = new Performer("Куклова", "Кукла", "Бебибоновна", 1, "Кукла");

        Controller controller = new Controller("Smith", "John", "Doe", 30, "Awesome Show");

        ticket1.regTicket(1, spectator1, performance1);
        ticket2.regTicket(2, spectator2, performance1);
        ticket3.regTicket(3, spectator3, performance2);
        ticket4.regTicket(4, spectator3, performance3);

        performer1.registerForPerformance(performance1);
        performer1.registerForPerformance(performance3);
        performer2.registerForPerformance(performance2);
        performer3.registerForPerformance(performance3);
        performer1.printPerformer();
        performer2.unregisterFromPerformance();
        performer2.registerForPerformance(performance2);
        performer1.registerForPerformance(null);

        performance2.printPerformance();

        theatre.addTicket(ticket1);
        theatre.addTicket(ticket2);
        theatre.addTicket(ticket3);
        theatre.addTicket(ticket4);
        theatre.addTicket(ticket4);

        theatre.addPerformance(performance1);
        theatre.addPerformance(performance2);
        theatre.addPerformance(performance3);
        theatre.addPerformance(performance3);

        theatre.addPerformer(performer1);
        theatre.addPerformer(performer2);
        theatre.addPerformer(performer3);

        theatre.printListAllTickets();
        theatre.printListAllPerformances();
        theatre.printListAllPerformers();

        ticket1.printTicket(1);
        ticket1.printTicket(4);

        ticket2.removeTicket(4);
        ticket2.removeTicket(2);

        controller.findSeat(1, 5);
        controller.findRow(3);
        controller.assistWithTicket(ticket1);
        controller.providePerformanceInfo(performance1);
        controller.checkTicket(ticket1);
    }
}
