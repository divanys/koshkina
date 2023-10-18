package pz_16_1;

import java.util.List;

public class Employee extends Person {
    private final Library library;

    public Employee(String lastName, String firstName, String middleName, int age, Library library) {
        super(lastName, firstName, middleName, age);
        this.library = library;
    }

    public void viewAllClients(List<Client> clients) {
        for (Client client : clients) {
            System.out.println("Имя: " + client.getFirstName() + ", Фамилия: " + client.getLastName());
        }
    }

    public void viewClientCardsAndBorrowedEditions(List<Client> clients) {
        for (Client client : clients) {
            System.out.println("Клиент: " + client.getFirstName() + " " + client.getLastName());
            System.out.println("Номер карточки: " + client.getCardNumber());

            if (client.isCardRegistered()) {
                System.out.println("Статус карточки: Зарегистрирована");
                System.out.println("Выданные издания:");
                for (Printable printEdition : client.getBorrowedPrintEditions()) {
                    System.out.println(printEdition.getTitle() + " (" + printEdition.getAuthor() + ")");
                }
            } else {
                System.out.println("Статус карточки: Не зарегистрирована");
            }
            System.out.println("-----------------------");
        }
    }

    public void viewAllPrintEditions(Library library) {
        System.out.println("Все имеющиеся издания:");
        System.out.println("Книги:");
        for (Printable book : library.getBooks()) {
            System.out.println(book.getTitle() + " (" + book.getAuthor() + ") - " + book.getCount());
        }

        System.out.println("Журналы:");
        for (Printable magazine : library.getMagazines()) {
            System.out.println(magazine.getTitle() + " (" + magazine.getAuthor() + ") - " + magazine.getCount());
        }

        System.out.println("Газеты:");
        for (Printable newspaper : library.getNewspapers()) {
            System.out.println(newspaper.getTitle() + " (" + newspaper.getAuthor() + ") - " + newspaper.getCount());
        }
    }


}