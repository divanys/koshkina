package pz_16_1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Printable> books = new ArrayList<>();
    private List<Printable> magazines = new ArrayList<>();
    private List<Printable> newspapers = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга успешно добавлена!");
    }

    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
        System.out.println("Журнал успешно добавлен!");
    }

    public void addNewspaper(Newspaper newspaper) {
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

    public int getBookCount(String title, String author) {
        int count = 0;
        for (Printable book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                count += book.getCount();
            }
        }
        return count;
    }

    public int getMagazineCount(String title, String author) {
        int count = 0;
        for (Printable magazine : magazines) {
            if (magazine.getTitle().equals(title) && magazine.getAuthor().equals(author)) {
                count += magazine.getCount();
            }
        }
        return count;
    }

    public int getNewspaperCount(String title, String author) {
        int count = 0;
        for (Printable newspaper : newspapers) {
            if (newspaper.getTitle().equals(title) && newspaper.getAuthor().equals(author)) {
                count += newspaper.getCount();
            }
        }
        return count;
    }

    public void borrowBook(String title, String author) {
        for (Printable book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                book.decreaseCount();
                break;
            }
        }
    }

    public void returnBook(String title, String author) {
        for (Printable book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                book.increaseCount();
                break;
            }
        }
    }

    public void borrowMagazine(String title, String author) {
        for (Printable magazine : magazines) {
            if (magazine.getTitle().equals(title) && magazine.getAuthor().equals(author)) {
                magazine.decreaseCount();
                break;
            }
        }
    }

    public void returnMagazine(String title, String author) {
        for (Printable magazine : magazines) {
            if (magazine.getTitle().equals(title) && magazine.getAuthor().equals(author)) {
                magazine.increaseCount();
                break;
            }
        }
    }

    public void borrowNewspaper(String title, String author) {
        for (Printable newspaper : newspapers) {
            if (newspaper.getTitle().equals(title) && newspaper.getAuthor().equals(author)) {
                newspaper.decreaseCount();
                break;
            }
        }
    }

    public void returnNewspaper(String title, String author) {
        for (Printable newspaper : newspapers) {
            if (newspaper.getTitle().equals(title) && newspaper.getAuthor().equals(author)) {
                newspaper.increaseCount();
                break;
            }
        }
    }

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
