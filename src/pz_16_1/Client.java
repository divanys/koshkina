package pz_16_1;

class Client extends Person implements Card {
    private String numberOfTelephone;
    private String address;
    private boolean childOrAdult;
    private int cardNumber;
    private boolean isCardRegistered = false;
    private boolean isCardIssued = false;


    public Client(String lastName, String firstName, String middleName, int age, String numberOfTelephone, String address,
                  boolean childOrAdult, int cardNumber) {
        super(lastName, firstName, middleName, age);
        setNumberOfTelephone(numberOfTelephone);
        setAddress(address);
        setChildOrAdult(childOrAdult);
        setCardNumber(cardNumber);
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
    public void issueCard() {
        if (isCardRegistered && !isCardIssued) {
            System.out.println("Выдача карточки клиенту для его личной подписи прошла успешно.");
            isCardIssued = true;
        } else if (!isCardRegistered) {
            System.out.println("Необходимо сначала зарегистрировать карточку.");
        }
    }

    @Override
    public void issuePrintEdition(Printable printEdition) {

    }

    @Override
    public void returnPrintEdition(Printable printEdition) {

    }

    // methods
//    public
}

