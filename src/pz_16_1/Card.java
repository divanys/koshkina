package pz_16_1;

public interface Card {
    void registerCard();
    void issuePrintEdition(Printable printEdition);
    void returnPrintEdition(Printable printEdition);
    void displayBorrowedPrintEditionsFromUser();
}