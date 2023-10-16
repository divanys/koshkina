package pz_15_2;

class ShoppingCenter extends Building implements SocialHouse {
    private int numberOfShops;
    private boolean hasFoodCourt;
    private String mallManagerName;
    private int capacity;
    private boolean hasParking;
    private boolean hasCafeteria;

    public ShoppingCenter(String name, String address, int yearBuilt, String architectName, boolean isCulturalMonument,
                          int numberOfShops, boolean hasFoodCourt, String mallManagerName,
                          int capacity, boolean hasParking, boolean hasCafeteria) {
        super(name, address, yearBuilt, architectName, isCulturalMonument);
        setNumberOfShops(numberOfShops);
        setHasFoodCourt(hasFoodCourt);
        setMallManagerName(mallManagerName);
        setCapacity(capacity);
        setHasParking(hasParking);
        setHasCafeteria(hasCafeteria);
    }

    public int getNumberOfShops() {
        return numberOfShops;
    }

    public boolean hasFoodCourt() {
        return hasFoodCourt;
    }

    public String getMallManagerName() {
        return mallManagerName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean hasParking() {
        return hasParking;
    }

    public void setNumberOfShops(int numberOfShops) {
        this.numberOfShops = numberOfShops;
    }

    public void setHasFoodCourt(boolean hasFoodCourt) {
        this.hasFoodCourt = hasFoodCourt;
    }

    public void setMallManagerName(String mallManagerName) {
        this.mallManagerName = mallManagerName;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public boolean hasCafeteria() {
        return hasCafeteria;
    }

    public void setHasCafeteria(boolean hasCafeteria) {
        this.hasCafeteria = hasCafeteria;
    }

    public void openNewStores(int numberOfNewStores) {
        if (numberOfNewStores > 0) {
            System.out.println("Открытие новых магазинов...");
            System.out.println("Успешно открыто " + numberOfNewStores + " новых магазинов.");
            numberOfShops += numberOfNewStores;
        } else {
            System.out.println("Неверный ввод. Количество новых магазинов должно быть больше 0.");
        }
    }

    public void organizeEvents(String eventName, String eventDate) {
        System.out.println("Организация мероприятия...");
        System.out.println("Мероприятие \"" + eventName + "\" " + eventDate + " успешно организовано.");
    }

    public void closeStores(int numberOfStoresToClose) {
        if (numberOfStoresToClose > 0 && numberOfStoresToClose <= numberOfShops) {
            System.out.println("Закрытие " + numberOfStoresToClose + " магазинов...");
            numberOfShops -= numberOfStoresToClose;
            System.out.println(numberOfStoresToClose + " магазинов успешно закрыто.");
        } else {
            System.out.println("Ошибка. Количество закрываемых магазинов должно быть от 1 до " + numberOfShops + ".");
        }
    }
    @Override
    public void display() {
        System.out.println("This is a shopping center.");
    }
    @Override
    public void capacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void hasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    @Override
    public void hasCafeteria(boolean hasCafeteria) {
        this.hasCafeteria = hasCafeteria;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of Shops: " + numberOfShops +
                "\nHas Food Court: " + hasFoodCourt +
                "\nMall Manager Name: " + mallManagerName +
                "\nCapacity: " + capacity +
                "\nHas Parking: " + hasParking +
                "\nHas Cafeteria: " + hasCafeteria;
    }
}
