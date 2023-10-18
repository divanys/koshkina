package pz_16_1;
// Класс является почти реальной библиотекой. Делаем различные действия (добавить книгу, убрать книгу, проверить количество)
// Для этого используем объекты разных классов

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Printable> books = new ArrayList<>();
    private final List<Printable> magazines = new ArrayList<>();
    private final List<Printable> newspapers = new ArrayList<>();

    // Добавляем книги/журналы/газеты в нашу библиотеку
    public void addBook(Book book) {
        books.add(book);
        System.out.printf("Книга %s автора %s в количестве %d успешно добавлена в библиотеку!\n", book.getTitle(), book.getAuthor(), book.getCount());
    }

    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
        System.out.printf("Журнал %s автора %s в количестве %d успешно добавлен в библиотеку!\n", magazine.getTitle(), magazine.getAuthor(), magazine.getCount());
    }

    public void addNewspaper(Newspaper newspaper) {
        newspapers.add(newspaper);
        System.out.printf("Газета %s автора %s в количестве %d успешно добавлена в библиотеку!\n", newspaper.getTitle(), newspaper.getAuthor(), newspaper.getCount());
    }

    // Удаляем книги/журналы/газеты из нашей библиотеки.
    // Прошу заметить: если больше: уведомление для библиотекаря, если равно: удаляем запись вовсе
    public void removeBook(Book book, int amount) {
        if (books.contains(book)) {
            int currentCount = book.getCount();
            if (amount < currentCount) {
                for (int i = 0; i < amount; i++) {
                    book.decreaseCount();
                }
                System.out.printf("Книга %s автора %s в количестве %d удалена из библиотеки!\n", book.getTitle(), book.getAuthor(), amount);
            } else if (amount == currentCount) {
                books.remove(book);
                System.out.printf("Все книги %s автора %s удалены из библиотеки!\n", book.getTitle(), book.getAuthor());
            } else {
                System.out.println("Запрошенное количество книг больше, чем имеется в библиотеке.");
            }
        } else {
            System.out.println("Данная книга не зарегистрирована в библиотеке!");
        }
    }

    public void removeMagazine(Magazine magazine, int amount) {
        if (magazines.contains(magazine)) {
            int currentCount = magazine.getCount();
            if (amount < currentCount) {
                for (int i = 0; i < amount; i++) {
                    magazine.decreaseCount();
                }
                System.out.printf("Журнал %s автора %s в количестве %d удалён из библиотеки!\n", magazine.getTitle(), magazine.getAuthor(), amount);
            } else if (amount == currentCount) {
                magazines.remove(magazine);
                System.out.printf("Все журналы %s автора %s удалены из библиотеки!\n", magazine.getTitle(), magazine.getAuthor());
            } else {
                System.out.println("Запрошенное количество журналов больше, чем имеется в библиотеке.");
            }
        } else {
            System.out.println("Данный журнал не зарегистрирован в библиотеке!");
        }
    }

    public void removeNewspaper(Newspaper newspaper, int amount) {
        if (newspapers.contains(newspaper)) {
            int currentCount = newspaper.getCount();
            if (amount < currentCount) {
                for (int i = 0; i < amount; i++) {
                    newspaper.decreaseCount();
                }
                System.out.printf("Газета %s автора %s в количестве %d удалена из библиотеки!\n", newspaper.getTitle(), newspaper.getAuthor(), amount);
            } else if (amount == currentCount) {
                newspapers.remove(newspaper);
                System.out.printf("Все газеты %s автора %s удалены из библиотеки!\n", newspaper.getTitle(), newspaper.getAuthor());
            } else {
                System.out.println("Запрошенное количество газет больше, чем имеется в библиотеке.");
            }
        } else {
            System.out.println("Данная газета не зарегистрирована в библиотеке!");
        }
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


    // А теперь сам поиск ПИ в нашей библиотеке.
    // Методы, если клиент знает название||автора&&типИздания
    public List<Printable> searchBooksByAuthor(String author) {
        List<Printable> result = new ArrayList<>();

        for (Printable book : books) {
            if (book instanceof Book && book.getAuthor().equals(author)) {
                System.out.printf("\nВ наличии: %d\nНазвание: %s\nАвтор: %s\nТип: Книга\n", book.getCount(), book.getTitle(), book.getAuthor());
                result.add(book);
            }
        }

        if (result.isEmpty()) {
            System.out.println("Нет книг данного автора.");
        }
        return result;
    }

    public List<Printable> searchBooksByTitle(String title) {
        List<Printable> result = new ArrayList<>();

        for (Printable book : books) {
            if (book instanceof Book && book.getTitle().equals(title)) {
                System.out.printf("\nВ наличии: %d\nНазвание: %s\nАвтор: %s\nТип: Книга\n", book.getCount(), book.getTitle(), book.getAuthor());
                result.add(book);
            }
        }

        if (result.isEmpty()) {
            System.out.println("Нет книг с данным названием.");
        }
        return result;
    }

    public List<Printable> searchMagazinesByAuthor(String author) {
        List<Printable> result = new ArrayList<>();

        for (Printable magazine : magazines) {
            if (magazine instanceof Magazine && magazine.getAuthor().equals(author)) {
                System.out.printf("\nВ наличии: %d\nНазвание: %s\nАвтор: %s\nТип: Журнал\n", magazine.getCount(), magazine.getTitle(), magazine.getAuthor());
                result.add(magazine);
            }
        }

        if (result.isEmpty()) {
            System.out.println("Нет журналов данного автора.");
        }
        return result;
    }

    public List<Printable> searchMagazinesByTitle(String title) {
        List<Printable> result = new ArrayList<>();

        for (Printable magazine : magazines) {
            if (magazine instanceof Magazine && magazine.getTitle().equals(title)) {
                System.out.printf("\nВ наличии: %d\nНазвание: %s\nАвтор: %s\nТип: Журнал\n", magazine.getCount(), magazine.getTitle(), magazine.getAuthor());
                result.add(magazine);
            }
        }

        if (result.isEmpty()) {
            System.out.println("\nНет журналов с данным названием.");
        }
        return result;
    }

    public List<Printable> searchNewspapersByAuthor(String author) {
        List<Printable> result = new ArrayList<>();

        for (Printable newspaper : newspapers) {
            if (newspaper instanceof Newspaper && newspaper.getAuthor().equals(author)) {
                System.out.printf("\nВ наличии: %d\nНазвание: %s\nАвтор: %s\nТип: Газета\n", newspaper.getCount(), newspaper.getTitle(), newspaper.getAuthor());
                result.add(newspaper);
            }
        }

        if (result.isEmpty()) {
            System.out.println("\nНет газет данного автора.");
        }
        return result;
    }

    public List<Printable> searchNewspapersByTitle(String title) {
        List<Printable> result = new ArrayList<>();

        for (Printable newspaper : newspapers) {
            if (newspaper instanceof Newspaper && newspaper.getTitle().equals(title)) {
                System.out.printf("\nВ наличии: %d\nНазвание: %s\nАвтор: %s\nТип: Газета\n", newspaper.getCount(), newspaper.getTitle(), newspaper.getAuthor());
                result.add(newspaper);
            }
        }

        if (result.isEmpty()) {
            System.out.println("\nНет газет с данным названием.");
        }
        return result;
    }

    public List<Printable> searchPrintEditionsByTitleAndAuthor(String title, String author) {
        List<Printable> result = new ArrayList<>();

        for (Printable printEdition : books) {
            if (printEdition.getAuthor().equals(author) && printEdition.getTitle().equals(title)) {
                System.out.printf("\nВ наличии: %d\nНазвание: %s\nАвтор: %s\nТип: Книга\n", printEdition.getCount(), printEdition.getTitle(), printEdition.getAuthor());
                result.add(printEdition);
            }
        }

        for (Printable printEdition : magazines) {
            if (printEdition.getAuthor().equals(author) && printEdition.getTitle().equals(title)) {
                System.out.printf("\nВ наличии: %d\nНазвание: %s\nАвтор: %s\nТип: Журнал\n", printEdition.getCount(), printEdition.getTitle(), printEdition.getAuthor());
                result.add(printEdition);
            }
        }

        for (Printable printEdition : newspapers) {
            if (printEdition.getAuthor().equals(author) && printEdition.getTitle().equals(title)) {
                System.out.printf("\nВ наличии: %d\nНазвание: %s\nАвтор: %s\nТип: Газета\n", printEdition.getCount(), printEdition.getTitle(), printEdition.getAuthor());
                result.add(printEdition);
            }
        }

        if (result.isEmpty()) {
            System.out.println("\nНет печатных изданий с данным названием и автором.");
        }

        return result;
    }

}
