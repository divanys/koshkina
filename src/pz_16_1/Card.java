package pz_16_1;

public interface Card {
    void registerCard();
    void issueCard();
    void issuePrintEdition(Printable printEdition);
    void returnPrintEdition(Printable printEdition);
}