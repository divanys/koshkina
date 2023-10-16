package pz_15_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Library extends Building {
    private int numberOfBooks;
    private boolean isOpenOnSundays;
    private String librarianName;
    private String recipientName;
    private String bookName;

    public Library(String name, String address, int yearBuilt, String architectName, boolean isCulturalMonument,
                   int numberOfBooks, boolean isOpenOnSundays, String librarianName) {
        super(name, address, yearBuilt, architectName, isCulturalMonument);
        setNumberOfBooks(numberOfBooks);
        setOpenOnSundays(isOpenOnSundays);
        setLibrarianName(librarianName);
    }

    // Геттеры
    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public boolean isOpenOnSundays() {
        return isOpenOnSundays;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    // Сеттеры
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

    public void display() {
        System.out.println("This is a library.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of Books: " + numberOfBooks +
                "\nOpen on Sundays: " + isOpenOnSundays +
                "\nLibrarian Name: " + librarianName;
    }
}
