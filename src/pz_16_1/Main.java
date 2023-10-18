package pz_16_1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Книга 1", "Автор 1", 2);
        Book book2 = new Book("Книга 2", "Автор 2", 1);
        Book book3 = new Book("Книга 3", "Автор 6", 4);
        Magazine magazine1 = new Magazine("Журнал 1", "Автор 3", 5);
        Newspaper newspaper1 = new Newspaper("Газета 1", "Автор 4", 1);
        Newspaper newspaper2 = new Newspaper("Газета 2", "Автор 5", 3);

        System.out.println("Регистрация печатных изданий:");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addMagazine(magazine1);
        library.addNewspaper(newspaper1);
        library.addNewspaper(newspaper2);

        Client client1 = new Client("Иванов", "Иван", "Иванович", 25, "123456789", "ул. Пушкина, 10", true, 1, library);
        Client client2 = new Client("Павлова", "Валерусик", "Трампампусик", 12, "5555555555", "ул. Макушкина, 5", false, 2, library);
        System.out.println("Регистрация пользователей (карточки пользователя):");
        client1.registerCard();
        client2.registerCard();

        System.out.println("\n\nСмотрим карточки, регистрируем библиотекаря и чекаем все ПИ:");
        Employee employee = new Employee("Сидоров", "Сидор", "Сидорович", 35, library);

        List<Client> clients = Arrays.asList(client1, client2);
        employee.viewAllClients(clients);
        System.out.println();

        employee.viewClientCardsAndBorrowedEditions(clients);
        System.out.println();

        employee.viewAllPrintEditions(library);
        System.out.println("\n\n");


        System.out.println("Выдача печатных изданий:");
        client1.issuePrintEdition(book1);
        client1.issuePrintEdition(book2);
        client1.issuePrintEdition(magazine1);
        client1.issuePrintEdition(newspaper1);

        client2.issuePrintEdition(book3);
        client2.issuePrintEdition(newspaper2);

        System.out.println("\n\nОпять смотрим карточки и чекаем все ПИ:");

        employee.viewAllClients(clients);

        employee.viewClientCardsAndBorrowedEditions(clients);

        employee.viewAllPrintEditions(library);
        System.out.println("\n\n");
        client1.displayBorrowedPrintEditionsFromUser();
        System.out.println("==============================");
        client2.displayBorrowedPrintEditionsFromUser();

        System.out.println("Остальная работа с печатными изданиями:");
        client1.returnPrintEdition(book1);

        client1.displayBorrowedPrintEditionsFromUser();

        client1.returnPrintEdition(book1);
        client1.returnPrintEdition(newspaper1);
        client1.displayBorrowedPrintEditionsFromUser();
        client1.returnPrintEdition(book2);
        client1.returnPrintEdition(book2);
        client1.returnPrintEdition(magazine1);
        client1.returnPrintEdition(magazine1);
        client1.displayBorrowedPrintEditionsFromUser();
        System.out.println("==============================");
        client2.displayBorrowedPrintEditionsFromUser();
        employee.viewAllPrintEditions(library);




    }
}