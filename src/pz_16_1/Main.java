package pz_16_1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем объект библиотеки
        Library library = new Library();

        // Создаем несколько книг, журналов и газет
        Book book1 = new Book("Книга 1", "Автор 1", 2);
        Book book2 = new Book("Книга 2", "Автор 2", 1);
        Book book3 = new Book("Книга 3", "Автор 6", 4);
        Magazine magazine1 = new Magazine("Журнал 1", "Автор 3", 5);
        Newspaper newspaper1 = new Newspaper("Газета 1", "Автор 4", 1);
        Newspaper newspaper2 = new Newspaper("Газета 2", "Автор 5", 3);

        // Регистрация печатных изданий
        System.out.println("Регистрация печатных изданий:");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addMagazine(magazine1);
        library.addNewspaper(newspaper1);
        library.addNewspaper(newspaper2);

        // Создаем клиентов
        Client client1 = new Client("Иванов", "Иван", "Иванович", 25, "123456789", "ул. Пушкина, 10", true, 1, library);
        Client client2 = new Client("Павлова", "Валерусик", "Трампампусик", 12, "5555555555", "ул. Макушкина, 5", false, 2, library);

        // Регистрация пользователей (карточки пользователя)
        System.out.println("Регистрация пользователей (карточки пользователя):");
        client1.registerCard();

        // Создаем библиотекаря
        Employee employee = new Employee("Сидоров", "Сидор", "Сидорович", 35, library);

        System.out.println("\n========================================\n");
        // Показываем информацию о клиентах
        System.out.println("\nПоказываем информацию о клиентах\n");
        List<Client> clients = Arrays.asList(client1, client2);
        employee.viewAllClients(clients);

        // Показываем информацию о карточках клиентов и выданных изданиях
        employee.viewClientCardsAndBorrowedEditions(clients);

        System.out.println("\n========================================\n");
        // Показываем все печатные издания в библиотеке
        employee.viewAllPrintEditions(library);

        System.out.println("\n========================================\n");
        // Выдача печатных изданий
        System.out.println("Выдача печатных изданий:");
        System.out.println("Не Лере:");
        client1.issuePrintEdition(book1);
        client1.issuePrintEdition(book2);
        client1.issuePrintEdition(magazine1);
        client1.issuePrintEdition(newspaper1);
        client1.issuePrintEdition(newspaper1);
        System.out.println("\n========================================\n");

        System.out.println("Лере:"); // она не зарегистрирована
        client2.issuePrintEdition(book3);
        client2.issuePrintEdition(book3);
        client2.issuePrintEdition(magazine1);
        client2.issuePrintEdition(newspaper2);

        System.out.println("\n========================================\n");
        // Повторно показываем информацию о карточках клиентов и выданных изданиях
        employee.viewClientCardsAndBorrowedEditions(clients);

        System.out.println("\n========================================\n");
        // Повторно показываем все печатные издания в библиотеке
        employee.viewAllPrintEditions(library);

        // Выводим список выданных изданий для каждого клиента
        System.out.println("=========================================");
        client1.displayBorrowedPrintEditionsFromUser();
        System.out.println("==============================");
        client2.displayBorrowedPrintEditionsFromUser();
        System.out.println("=========================================");

        // Работа с печатными изданиями (возврат)
        System.out.println("\nОстальная работа с печатными изданиями:\n");
        client1.returnPrintEdition(book1);
        client1.displayBorrowedPrintEditionsFromUser();
        System.out.println("=========================================");
        client1.returnPrintEdition(book1);
        client1.returnPrintEdition(newspaper1);
        client1.returnPrintEdition(book2);
        client1.returnPrintEdition(book2);
        client1.returnPrintEdition(magazine1);
        client1.returnPrintEdition(magazine1);
        client1.displayBorrowedPrintEditionsFromUser();
        System.out.println("=========================================");
        client2.displayBorrowedPrintEditionsFromUser();

        // Показываем все печатные издания в библиотеке после выдачи и возврата
        employee.viewAllPrintEditions(library);

        // Удаляем печатные издания из библиотеки
        System.out.println("\n=============удаляем ПИ из библиотеки=================\n");
        library.removeBook(book1, 1);
        library.removeMagazine(magazine1, 2);
        library.removeNewspaper(newspaper1, 6);
        library.removeNewspaper(newspaper1, 1);

        // Ищем печатные издания в библиотеке по разным данным
        System.out.println("\n=============ищем ПИ в библиотеке по разным данным=================\n");
        List<Printable> booksByAuthor = library.searchBooksByAuthor("Автор 1");
        List<Printable> magazinesByTitle = library.searchMagazinesByTitle("Журнал 2");
        List<Printable> printEditionsByTitleAndAuthor = library.searchPrintEditionsByTitleAndAuthor("Книга 3", "Автор 6");

        // Очищаем списки, вдруг нужно будет ещё искать что-то
        booksByAuthor.clear();
        magazinesByTitle.clear();
        printEditionsByTitleAndAuthor.clear();

        System.out.println("\n========================================\n");
        // Показываем все печатные издания в библиотеке после удаления
        employee.viewAllPrintEditions(library);

        // Предлагаем случайное печатное издание
        System.out.println("\n=============допустим клиент попросил совета=================\n");
        employee.suggestRandomPrintEdition(library);

        System.out.println("\n====================админ лох====================\n");
        // Создаем администратора и выводим сообщение
        Administrator admin = new Administrator("Иванов", "Александр", "Сергеевич", 35);
        String message = "сам лох";
        admin.informVisitors(message);
    }
}
