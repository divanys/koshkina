package pz_15_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Library extends Building implements SocialHouse {
    private int numberOfBooks;
    private boolean isOpenOnSundays;
    private String librarianName;
    private String recipientName;
    private String bookName;
    private int capacity;
    private boolean hasParking;
    private boolean hasCafeteria;

    public Library(String name, String address, int yearBuilt, String architectName, boolean isCulturalMonument,
                   int numberOfBooks, boolean isOpenOnSundays, String librarianName, int capacity, boolean hasParking, boolean hasCafeteria) {
        super(name, address, yearBuilt, architectName, isCulturalMonument);
        setNumberOfBooks(numberOfBooks);
        setOpenOnSundays(isOpenOnSundays);
        setLibrarianName(librarianName);
        setCapacity(capacity);
        setHasParking(hasParking);
        setHasCafeteria(hasCafeteria);
    }

    // Геттеры и сеттеры для новых полей
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean hasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public boolean hasCafeteria() {
        return hasCafeteria;
    }

    public void setHasCafeteria(boolean hasCafeteria) {
        this.hasCafeteria = hasCafeteria;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public boolean isOpenOnSundays() {
        return isOpenOnSundays;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void setOpenOnSundays(boolean isOpenOnSundays) {
        this.isOpenOnSundays = isOpenOnSundays;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public void lendBook(String recipientName, String bookName, int numberOfBooksToLend) {
        if (numberOfBooksToLend == 1) {
            System.out.printf("Библиотекарь %s выдал 1 книгу %s получателю %s.\n", getLibrarianName(), bookName, recipientName);
        } else if (numberOfBooksToLend > 1) {
            System.out.printf("Библиотекарь %s выдал %d книг %s получателю %s.\n", getLibrarianName(), numberOfBooksToLend, bookName, recipientName);
        }
    }

    public void returnBook(String recipientName, String bookName, int numberOfBooksToReturn, int numberOfBooksToLend) {
        if (numberOfBooksToLend == numberOfBooksToReturn) {
            System.out.printf("Читатель %s вернул %d книг %s.\nОн больше ничего не должен в библиотеку %s!\n",
                    recipientName, numberOfBooksToReturn, bookName, getName());
        } else if (numberOfBooksToLend > numberOfBooksToReturn) {
            System.out.printf("Читатель %s вернул %d/%d книг %s.\nОн должен в библиотеку %s ещё %d книг!\n",
                    recipientName, numberOfBooksToReturn, numberOfBooksToLend, bookName, getName(), (numberOfBooksToLend - numberOfBooksToReturn));
        } else {
            System.out.printf("Читатель %s вернул %d/%d книг %s.\nОн дополнительно принёс в библиотеку %s %d книг!\n",
                    recipientName, numberOfBooksToReturn, numberOfBooksToLend, bookName, getName(), (numberOfBooksToReturn - numberOfBooksToLend));
        }
    }

    public void acceptBooks(int numberOfBooksToAccept) {
        Scanner scanner = new Scanner(System.in);
        int sumOfBooks = 0;
        Map<String, Integer> booksMap = new HashMap<>();

        while (sumOfBooks < numberOfBooksToAccept) {
            System.out.print("Введите название книги: ");
            String bookName = scanner.nextLine();

            System.out.print("Введите количество этой книги: ");
            int bookCount = scanner.nextInt();
            scanner.nextLine(); // очищаем буфер после nextInt()

            booksMap.put(bookName, bookCount);
            sumOfBooks += bookCount;

        }

        System.out.println("\nНазвание книги - Количество книг");
        for (Map.Entry<String, Integer> entry : booksMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    @Override
    public void display() {
        System.out.println("This is a library.");
    }

    @Override
    public void capacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void hasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    @Override
    public void hasCafeteria(boolean hasCafeteria) {
        this.hasCafeteria = hasCafeteria;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of Books: " + numberOfBooks +
                "\nOpen on Sundays: " + isOpenOnSundays +
                "\nLibrarian Name: " + librarianName +
                "\nCapacity: " + capacity +
                "\nHas Parking: " + hasParking +
                "\nHas Cafeteria: " + hasCafeteria;
    }
}
