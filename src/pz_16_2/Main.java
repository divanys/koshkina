package pz_16_2;

public class Main {
    public static void main(String[] args) {
        // Создаем театр
        System.out.println("Блок: Создаем театр");
        Theatre theatre = new Theatre();

        // Создаем зрителей
        System.out.println("Блок: Создаем зрителей");
        Spectator spectator1 = new Spectator("Павлова", "Валерия", "Алексеевна", 18);
        Spectator spectator2 = new Spectator("неПавлова", "неВалерия", "неАлексеевна", 24);
        Spectator spectator3 = new Spectator("Кошкина", "Анастасия", "Алексеевна", 17);

        // Создаем представления
        System.out.println("Блок: Создаем представления");
        Performance performance1 = new Performance("Спектакль", "Бархатные ручки", 16, "21-10-2023", "16:00");
        Performance performance2 = new Performance("Концерт", "Рок-группа абракадабра", 18, "22-10-2023", "19:30");
        Performance performance3 = new Performance("Кукольное выступление", "Кукла Боб и кукла Джоб", 6, "23-10-2023", "12:30");

        // Создаем билеты
        System.out.println("Блок: Создаем билеты");
        Ticket ticket1 = new Ticket(SessionType.WEEKDAY, 700, "Амфитеатр", 3, 16);
        Ticket ticket2 = new Ticket(SessionType.HOLIDAY, 700, "Амфитеатр", 3, 15);
        Ticket ticket3 = new Ticket(SessionType.WEEKEND, 120, "Балкон", 1, 2);
        Ticket ticket4 = new Ticket(SessionType.WEEKEND, 600, "Зал", 1, 10);

        // Создаем артистов
        System.out.println("Блок: Создаем артистов");
        Performer performer1 = new Performer("Иванов", "Иван", "Иванович", 25, "Актёр");
        Performer performer2 = new Performer("Взрослый", "Важный", "Бумажный", 40, "Музыкант");
        Performer performer3 = new Performer("Куклова", "Кукла", "Бебибоновна", 1, "Кукла");

        // Создаем контроллера
        System.out.println("Блок: Создаем контроллера");
        Controller controller = new Controller("Smith", "John", "Doe", 30, "Awesome Show");

        // Регистрируем билеты
        System.out.println("\nБлок: Регистрируем билеты");
        ticket1.regTicket(1, spectator1, performance1);
        ticket2.regTicket(2, spectator2, performance1);
        System.out.println("\nБилет 3 на 18+ пользователем младше 18");
        ticket3.regTicket(3, spectator3, performance2);
        System.out.println();
        ticket4.regTicket(4, spectator3, performance3);

        // Регистрируем артистов на представления
        System.out.println("\nБлок: Регистрируем артистов на представления");
        performer1.registerForPerformance(performance1);
        performer1.registerForPerformance(performance3);
        performer2.registerForPerformance(performance2);
        performer3.registerForPerformance(performance3);

        // Выводим информацию о первом артисте (по заданию)
        System.out.println("\nБлок: Выводим информацию о первом артисте");
        performer1.printPerformer();

        // Отменяем регистрацию второго артиста с представления и регистрируем его снова
        System.out.println("\nБлок: Отменяем регистрацию второго артиста с представления и регистрируем его снова");
        performer2.unregisterFromPerformance();
        performer2.registerForPerformance(performance2);

        // Пытаемся зарегистрировать первого артиста на пустое представление
        System.out.println("\nБлок: Пытаемся зарегистрировать первого артиста на пустое представление");
        performer1.registerForPerformance(null);

        // Выводим информацию о втором представлении (по заданию)
        System.out.println("\nБлок: Выводим информацию о втором представлении");
        performance2.printPerformance();

        // Добавляем билеты в театр с проверкой на существование
        System.out.println("\nБлок: Добавляем билеты в театр с проверкой на существование");
        theatre.addTicket(ticket1);
        theatre.addTicket(ticket2);
        theatre.addTicket(ticket3);
        theatre.addTicket(ticket4);
        theatre.addTicket(ticket4);

        // Добавляем представления в театр с проверкой на существование
        System.out.println("\nБлок: Добавляем представления в театр с проверкой на существование");
        theatre.addPerformance(performance1);
        theatre.addPerformance(performance2);
        theatre.addPerformance(performance3);
        theatre.addPerformance(performance3);

        // Добавляем артистов в театр с проверкой на существование
        System.out.println("\nБлок: Добавляем артистов в театр с проверкой на существование");
        theatre.addPerformer(performer1);
        theatre.addPerformer(performer2);
        theatre.addPerformer(performer3);

        // Выводим список всех билетов в театре
        System.out.println("\nБлок: Выводим список всех билетов в театре");
        theatre.printListAllTickets();

        // Выводим список всех представлений в театре
        System.out.println("\nБлок: Выводим список всех представлений в театре");
        theatre.printListAllPerformances();

        // Выводим список всех артистов в театре
        System.out.println("\nБлок: Выводим список всех артистов в театре");
        theatre.printListAllPerformers();

        // Выводим информацию о первом билете (по заданию)
        System.out.println("\nБлок: Выводим информацию о первом билете");
        ticket1.printTicket();

        // Отменяем бронирование второго билета с проверкой на существование
        System.out.println("\nБлок: Отменяем бронирование второго билета с проверкой на существование");
        ticket2.removeTicket();
        ticket2.removeTicket();

        // Контроллер помогает зрителям найти места
        System.out.println("\nБлок: Контроллер помогает зрителям найти места");
        controller.findSeat(1, 5);
        controller.findRow(3);

        // Контроллер помогает с билетом
        System.out.println("\nБлок: Контроллер помогает с билетом 1");
        controller.assistWithTicket(ticket1);

        // Контроллер предоставляет информацию о представлении
        System.out.println("\nБлок: Контроллер предоставляет информацию о представлении 1");
        controller.providePerformanceInfo(performance1);

        // Контроллер проверяет билет
        System.out.println("\nБлок: Контроллер проверяет билет");
        System.out.println("\nбилет 1");
        controller.checkTicket(ticket1);
        System.out.println("\nбилет 2 (удалили выше)");
        controller.checkTicket(ticket2);
    }
}
