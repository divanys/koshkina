package pz_16_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

class Client extends Person implements Card, Printable {
    private String numberOfTelephone;
    private String address;
    private boolean childOrAdult;
    private int cardNumber;
    private boolean isCardRegistered = false;
    private final List<Printable> borrowedPrintEditions = new ArrayList<>();
    private String dataFrom;
    private String dataTo;
    private final Library library;


    public Client(String lastName, String firstName, String middleName, int age, String numberOfTelephone, String address,
                  boolean childOrAdult, int cardNumber, Library library) {
        super(lastName, firstName, middleName, age);
        setNumberOfTelephone(numberOfTelephone);
        setAddress(address);
        setChildOrAdult(childOrAdult);
        setCardNumber(cardNumber);
        this.library = library;
    }

    // set
    public void setNumberOfTelephone(String numberOfTelephone) {
        this.numberOfTelephone = numberOfTelephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setChildOrAdult(boolean childOrAdult) {
        this.childOrAdult = childOrAdult;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    // get
    public String getNumberOfTelephone() {
        return numberOfTelephone;
    }

    public String getAddress() {
        return address;
    }

    public boolean getChildOrAdult() {
        return childOrAdult;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    // interface card
    @Override
    public void registerCard() {
        if (!isCardRegistered) {
            System.out.println("Регистрация карточки прошла успешно.");
            isCardRegistered = true;
        } else {
            System.out.println("У клиента уже есть зарегистрированная карточка.");
        }
    }

    @Override
    public void issuePrintEdition(Printable printEdition) {
        if (isCardRegistered) {
            if (printEdition instanceof Book) {
                Book book = (Book) printEdition;
                if (library.containsBook(book)) {
                    System.out.println("Сегодняшняя дата: " + LocalDate.now() + "\nКнига " + book.getTitle() + " автора " + book.getAuthor() + " выдана клиенту.");
                    dataFrom = LocalDate.now().toString();
                    dataTo = LocalDate.now().plusWeeks(2).toString();
                    System.out.println("Клиент должен вернуть книгу до " + dataTo);
                    borrowedPrintEditions.add(book);
                    library.borrowBook(book);
                } else {
                    System.out.println("Эта книга не зарегистрирована в нашей библиотеке.");
                }
            } else if (printEdition instanceof Magazine) {
                Magazine magazine = (Magazine) printEdition;
                if (library.containsMagazine(magazine)) {
                    System.out.println("Сегодняшняя дата: " + LocalDate.now() + "\nЖурнал " + magazine.getTitle() + " автора " + magazine.getAuthor() + " выдана клиенту.");
                    dataFrom = LocalDate.now().toString();
                    dataTo = LocalDate.now().plusWeeks(2).toString();
                    System.out.println("Клиент должен вернуть журнал до " + dataTo);
                    borrowedPrintEditions.add(magazine);
                    library.borrowMagazine(magazine);
                } else {
                    System.out.println("Этот журнал не зарегистрирован в нашей библиотеке.");
                }
            } else if (printEdition instanceof Newspaper) {
                Newspaper newspaper = (Newspaper) printEdition;
                if (library.containsNewspaper(newspaper)) {
                    System.out.println("Сегодняшняя дата: " + LocalDate.now() + "\nГазета " + newspaper.getTitle() + " автора " + newspaper.getAuthor() + " выдана клиенту.");
                    dataFrom = LocalDate.now().toString();
                    dataTo = LocalDate.now().plusWeeks(2).toString();
                    System.out.println("Клиент должен вернуть газету до " + dataTo);
                    borrowedPrintEditions.add(newspaper);
                    library.borrowNewspaper(newspaper);
                } else {
                    System.out.println("Эта газета не зарегистрирована в нашей библиотеке.");
                }
            }
        } else {
            System.out.println("У клиента не зарегистрирована карточка. Невозможно выдать книгу.");
        }
    }

    @Override
    public void returnPrintEdition(Printable printEdition) {
        if (isCardRegistered) {
            if (borrowedPrintEditions.contains(printEdition)) {
                if (printEdition instanceof Book) {
                    if (dataTo != null && LocalDate.now().isAfter(LocalDate.parse(dataTo))) {
                        long daysLate = ChronoUnit.DAYS.between(LocalDate.parse(dataTo), LocalDate.now());
                        System.out.println("Книга " + printEdition.getTitle() + " автора " + printEdition.getAuthor()
                                + " возвращена с опозданием на " + daysLate + " дней.");
                    } else {
                        System.out.println("Книга " + printEdition.getTitle() + " успешно и вовремя возвращена.");
                    }
                } else if (printEdition instanceof Magazine) {
                    if (dataTo != null && LocalDate.now().isAfter(LocalDate.parse(dataTo))) {
                        long daysLate = ChronoUnit.DAYS.between(LocalDate.parse(dataTo), LocalDate.now());
                        System.out.println("Журнал " + printEdition.getTitle() + " автора " + printEdition.getAuthor()
                                + " возвращён с опозданием на " + daysLate + " дней.");
                    } else {
                        System.out.println("Журнал " + printEdition.getTitle() + " успешно и вовремя возвращён.");
                    }
                } else if (printEdition instanceof Newspaper) {
                    if (dataTo != null && LocalDate.now().isAfter(LocalDate.parse(dataTo))) {
                        long daysLate = ChronoUnit.DAYS.between(LocalDate.parse(dataTo), LocalDate.now());
                        System.out.println("Газета " + printEdition.getTitle() + " автора " + printEdition.getAuthor()
                                + " возвращена с опозданием на " + daysLate + " дней.");
                    } else {
                        System.out.println("Газета " + printEdition.getTitle() + " успешно и вовремя возвращена.");
                    }
                }
                borrowedPrintEditions.remove(printEdition);
            } else {
                System.out.println("У клиента нет печатного издания с таким названием и автором. Невозможно принять.");
            }
        } else {
            System.out.println("Клиенту не выдана карточка. Невозможно принять печатное издание.");
        }
    }

    @Override
    public void displayBorrowedPrintEditions() {
        if (borrowedPrintEditions.isEmpty()) {
            System.out.println("У клиента нет выданных печатных изданий.");
        } else {
            System.out.println("Выданные печатные издания:");
            for (Printable printEdition : borrowedPrintEditions) {
                System.out.println(printEdition.getTitle() + " (" + printEdition.getAuthor() + ")");
            }
        }
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String getAuthor() {
        return null;
    }

    // methods
//    public
}

