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

    public boolean isCardRegistered() {
        return isCardRegistered;
    }

    public List<Printable> getBorrowedPrintEditions() {
        return borrowedPrintEditions;
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

    public void issuePrintEdition(Printable printEdition) {
        if (isCardRegistered) {
            if (printEdition instanceof Book) {
                Book book = (Book) printEdition;
                if (book.getCount() > 0) {
                    book.decreaseCount();
                    System.out.println("Сегодняшняя дата: " + LocalDate.now() + "\n" +
                            book.getTitle() + " автора " + book.getAuthor() + " выдана клиенту.");
                    dataFrom = LocalDate.now().toString();
                    dataTo = LocalDate.now().plusWeeks(2).toString();
                    System.out.println("Клиент должен вернуть книгу до " + dataTo);
                    borrowedPrintEditions.add(book);
                } else {
                    System.out.println("Извините, данная книга временно недоступна.");
                }
            } else if (printEdition instanceof Magazine) {
                Magazine magazine = (Magazine) printEdition;
                if (magazine.getCount() > 0) {
                    magazine.decreaseCount();
                    System.out.println("Сегодняшняя дата: " + LocalDate.now() + "\n" +
                            magazine.getTitle() + " автора " + magazine.getAuthor() + " выдан журнал клиенту.");
                    dataFrom = LocalDate.now().toString();
                    dataTo = LocalDate.now().plusWeeks(2).toString();
                    System.out.println("Клиент должен вернуть журнал до " + dataTo);
                    borrowedPrintEditions.add(magazine);
                } else {
                    System.out.println("Извините, этот журнал временно недоступен.");
                }
            } else if (printEdition instanceof Newspaper) {
                Newspaper newspaper = (Newspaper) printEdition;
                if (newspaper.getCount() > 0) {
                    newspaper.decreaseCount();
                    System.out.println("Сегодняшняя дата: " + LocalDate.now() + "\n" +
                            newspaper.getTitle() + " автора " + newspaper.getAuthor() + " выдана газета клиенту.");
                    dataFrom = LocalDate.now().toString();
                    dataTo = LocalDate.now().plusWeeks(2).toString();
                    System.out.println("Клиент должен вернуть газету до " + dataTo);
                    borrowedPrintEditions.add(newspaper);
                } else {
                    System.out.println("Извините, эта газета временно недоступна.");
                }
            } else {
                System.out.println("Неизвестный тип печатного издания.");
            }
        } else {
            System.out.println("У клиента не зарегистрирована карточка. Невозможно выдать издание.");
        }
    }

    public void returnPrintEdition(Printable printEdition) {
        if (isCardRegistered) {
            if (borrowedPrintEditions.contains(printEdition)) {
                if (printEdition instanceof Book) {
                    Book book = (Book) printEdition;
                    book.increaseCount();
                    if (dataTo != null && LocalDate.now().isAfter(LocalDate.parse(dataTo))) {
                        long daysLate = ChronoUnit.DAYS.between(LocalDate.parse(dataTo), LocalDate.now());
                        System.out.println(book.getTitle() + " автора " + book.getAuthor()
                                + " возвращена с опозданием на " + daysLate + " дней.");
                    } else {
                        System.out.println(book.getTitle() + " успешно и вовремя возвращена.");
                    }
                } else if (printEdition instanceof Magazine) {
                    Magazine magazine = (Magazine) printEdition;
                    magazine.increaseCount();
                    if (dataTo != null && LocalDate.now().isAfter(LocalDate.parse(dataTo))) {
                        long daysLate = ChronoUnit.DAYS.between(LocalDate.parse(dataTo), LocalDate.now());
                        System.out.println(magazine.getTitle() + " автора " + magazine.getAuthor()
                                + " возвращён с опозданием на " + daysLate + " дней.");
                    } else {
                        System.out.println(magazine.getTitle() + " успешно и вовремя возвращён.");
                    }
                } else if (printEdition instanceof Newspaper) {
                    Newspaper newspaper = (Newspaper) printEdition;
                    newspaper.increaseCount();
                    if (dataTo != null && LocalDate.now().isAfter(LocalDate.parse(dataTo))) {
                        long daysLate = ChronoUnit.DAYS.between(LocalDate.parse(dataTo), LocalDate.now());
                        System.out.println(newspaper.getTitle() + " автора " + newspaper.getAuthor()
                                + " возвращена с опозданием на " + daysLate + " дней.");
                    } else {
                        System.out.println(newspaper.getTitle() + " успешно и вовремя возвращена.");
                    }
                }
                borrowedPrintEditions.remove(printEdition);
            } else {
                System.out.println("У клиента нет такого издания. Невозможно принять.");
            }
        } else {
            System.out.println("Клиенту не выдана карточка. Невозможно принять издание.");
        }
    }

    @Override
    public void displayBorrowedPrintEditionsFromUser() {
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

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public void decreaseCount() {

    }

    @Override
    public void increaseCount() {

    }

    // methods
//    public
}

