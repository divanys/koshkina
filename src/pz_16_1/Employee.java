package pz_16_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Employee extends Person {
    private final Library library;

    public Employee(String lastName, String firstName, String middleName, int age, Library library) {
        super(lastName, firstName, middleName, age);
        this.library = library;
    }

    // перечисляем зарегистрированных пользователей (без перечня ПИ)
    public void viewAllClients(List<Client> clients) {
        for (Client client : clients) {
            System.out.printf("\nФамилия: %s\nИмя: %s\nОтчество: %s\nВозраст: %d " +
                            "\nДоступ во взрослую библиотеку: %b\nАдрес: %s\nНомер телефона: %s\nНомер карточки: %d\n",
                    client.getFirstName(), client.getMiddleName(), client.getLastName(), client.getAge(),
                    client.getChildOrAdult(), client.getAddress(), client.getNumberOfTelephone(), client.getCardNumber());
        }
    }

    public void viewClientCardsAndBorrowedEditions(List<Client> clients) {
        for (Client client : clients) {
            System.out.printf("\nФамилия: %s\nИмя: %s\nОтчество: %s\nВозраст: %d " +
                            "\nДоступ во взрослую библиотеку: %b\nАдрес: %s\nНомер телефона: %s\nНомер карточки: %d\n",
                    client.getFirstName(), client.getMiddleName(), client.getLastName(), client.getAge(),
                    client.getChildOrAdult(), client.getAddress(), client.getNumberOfTelephone(), client.getCardNumber());

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
        System.out.println("\nВсе имеющиеся издания:\nТип \tНазвание \tАвтор \t\tКоличество");
        System.out.println("Книги:");
        for (Printable book : library.getBooks()) {
            System.out.println("  \t\t" + book.getTitle() + "\t\t" + book.getAuthor() + "\t\t\t" + book.getCount());
        }

        System.out.println("Журналы:");
        for (Printable magazine : library.getMagazines()) {
            System.out.println("  \t\t" + magazine.getTitle() + "\t" + magazine.getAuthor() + "\t\t\t" + magazine.getCount());
        }

        System.out.println("Газеты:");
        for (Printable newspaper : library.getNewspapers()) {
            System.out.println("  \t\t" + newspaper.getTitle() + "\t" + newspaper.getAuthor() + "\t\t\t" + newspaper.getCount());
        }
    }

    // совет от библиотекаря
    public void suggestRandomPrintEdition(Library library) {
        List<Printable> allPrintEditions = new ArrayList<>();
        allPrintEditions.addAll(library.getBooks());
        allPrintEditions.addAll(library.getMagazines());
        allPrintEditions.addAll(library.getNewspapers());

        if (!allPrintEditions.isEmpty()) {
            Random random = new Random();
            Printable randomPrintEdition = allPrintEditions.get(random.nextInt(allPrintEditions.size()));

            String type = "";
            if (randomPrintEdition instanceof Book) {
                type = "книгу";
            } else if (randomPrintEdition instanceof Magazine) {
                type = "журнал";
            } else if (randomPrintEdition instanceof Newspaper) {
                type = "газету";
            }

            System.out.println("Я предлагаю вам прочесть " + type + " \"" + randomPrintEdition.getTitle() + "\" автора " + randomPrintEdition.getAuthor());
        } else {
            System.out.println("В библиотеке нет печатных изданий.");
        }
    }

    public Library getLibrary() {
        return library;
    }
}