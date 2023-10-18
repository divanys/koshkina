package pz_16_1;
// Класс является почти реальной библиотекой. Делаем различные действия (добавить книгу, убрать книгу, проверить количество)
// Для этого используем объекты разных классов

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Printable> books = new ArrayList<>();
    private List<Printable> magazines = new ArrayList<>();
    private List<Printable> newspapers = new ArrayList<>();

    // Добавляем книги/журналы/газеты в нашу библиотеку
    public void addBook(Book book) {
        books.add(book);
        System.out.printf("Книга %s автора %s в количестве %d успешно добавлена в библиотеку!", book.getTitle(), book.getAuthor(), book.getCount());
    }

    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
        System.out.printf("Журнал %s автора %s в количестве %d успешно добавлен в библиотеку!", magazine.getTitle(), magazine.getAuthor(), magazine.getCount());
    }

    public void addNewspaper(Newspaper newspaper) {
        newspapers.add(newspaper);
        System.out.printf("Газета %s автора %s в количестве %d успешно добавлена в библиотеку!", newspaper.getTitle(), newspaper.getAuthor(), newspaper.getCount());
    }

    // Удаляем книги/журналы/газеты из нашей библиотеки
    public void removeBook(Book book) {
        books.remove(book);
        System.out.printf("Книга %s автора %s в количестве %d удалена из библиотеки!", book.getTitle(), book.getAuthor(), book.getCount());
    }

    public void removeMagazine(Magazine magazine) {
        magazines.remove(magazine);
        System.out.printf("Журнал %s автора %s в количестве %d удален из библиотеки!", magazine.getTitle(), magazine.getAuthor(), magazine.getCount());
    }

    public void removeNewspaper(Newspaper newspaper) {
        newspapers.remove(newspaper);
        System.out.printf("Книга %s автора %s в количестве %d удалена из библиотеки!", newspaper.getTitle(), newspaper.getAuthor(), newspaper.getCount());
    }

    // проверка наличия ПИ в нашей библиотеке (используем в Employee)
    public List<Printable> getBooks() {
        return books;
    }

    public List<Printable> getMagazines() {
        return magazines;
    }

    public List<Printable> getNewspapers() {
        return newspapers;
    }
}
