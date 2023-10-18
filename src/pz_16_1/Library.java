package pz_16_1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Printable> books = new ArrayList<>();
    private List<Printable> magazines = new ArrayList<>();
    private List<Printable> newspapers = new ArrayList<>();

    public void addBook(Printable book) {
        books.add(book);
        System.out.println("Книга успешно добавлена!");
    }

    public void addMagazine(Printable magazine) {
        magazines.add(magazine);
        System.out.println("Журнал успешно добавлен!");
    }

    public void addNewspaper(Printable newspaper) {
        newspapers.add(newspaper);
        System.out.println("Газета успешно добавлена!");
    }

    public boolean containsBook(Printable book) {
        return books.contains(book);
    }

    public boolean containsMagazine(Printable magazine) {
        return magazines.contains(magazine);
    }

    public boolean containsNewspaper(Printable newspaper) {
        return newspapers.contains(newspaper);
    }

    public void borrowBook(Printable book) {
        books.remove(book);
    }

    public void returnBook(Printable book) {
        books.add(book);
    }

    public void borrowMagazine(Printable magazine) {
        magazines.remove(magazine);
    }

    public void returnMagazine(Printable magazine) {
        magazines.add(magazine);
    }

    public void borrowNewspaper(Printable newspaper) {
        newspapers.remove(newspaper);
    }

    public void returnNewspaper(Printable newspaper) {
        newspapers.add(newspaper);
    }
}
