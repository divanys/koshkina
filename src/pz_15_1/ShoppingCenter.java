package pz_15_1;

import java.util.Scanner;

class ShoppingCenter extends Building {
    private int numberOfShops;
    private boolean hasFoodCourt;
    private String mallManagerName;

    public ShoppingCenter(String name, String address, int yearBuilt, String architectName, boolean isCulturalMonument,
                          int numberOfShops, boolean hasFoodCourt, String mallManagerName) {
        super(name, address, yearBuilt, architectName, isCulturalMonument);
        setNumberOfShops(numberOfShops);
        setHasFoodCourt(hasFoodCourt);
        setMallManagerName(mallManagerName);
    }

    // Геттеры
    public int getNumberOfShops() {
        return numberOfShops;
    }

    public boolean hasFoodCourt() {
        return hasFoodCourt;
    }

    public String getMallManagerName() {
        return mallManagerName;
    }

    // Сеттеры
    public void setNumberOfShops(int numberOfShops) {
        this.numberOfShops = numberOfShops;
    }

    public void setHasFoodCourt(boolean hasFoodCourt) {
        this.hasFoodCourt = hasFoodCourt;
    }

    public void setMallManagerName(String mallManagerName) {
        this.mallManagerName = mallManagerName;
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

    public void display() {
        System.out.println("This is a shopping center.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of Shops: " + numberOfShops +
                "\nHas Food Court: " + hasFoodCourt +
                "\nMall Manager Name: " + mallManagerName;
    }
}
