package pz_15_2;

import java.util.concurrent.TimeUnit;


class PoliceDepartment extends Building implements SocialHouse {
    private int numberOfOfficers;
    private boolean hasPrisonCells;
    private String policeChiefName;
    private int capacity;
    private boolean hasParking;
    private boolean hasCafeteria;

    public PoliceDepartment(String name, String address, int yearBuilt, String architectName, boolean isCulturalMonument,
                            int numberOfOfficers, boolean hasPrisonCells, String policeChiefName,
                            int capacity, boolean hasParking, boolean hasCafeteria) {
        super(name, address, yearBuilt, architectName, isCulturalMonument);
        setNumberOfOfficers(numberOfOfficers);
        setHasPrisonCells(hasPrisonCells);
        setPoliceChiefName(policeChiefName);
        setCapacity(capacity);
        setHasParking(hasParking);
        setHasCafeteria(hasCafeteria);
    }

    // Геттеры
    public int getNumberOfOfficers() {
        return numberOfOfficers;
    }

    public boolean hasPrisonCells() {
        return hasPrisonCells;
    }

    public String getPoliceChiefName() {
        return policeChiefName;
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

    // Сеттеры
    public void setNumberOfOfficers(int numberOfOfficers) {
        this.numberOfOfficers = numberOfOfficers;
    }

    public void setHasPrisonCells(boolean hasPrisonCells) {
        this.hasPrisonCells = hasPrisonCells;
    }

    public void setPoliceChiefName(String policeChiefName) {
        this.policeChiefName = policeChiefName;
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

    public void conductInvestigation(String caseName) {
        System.out.println("Полиция проводит расследование по делу: " + caseName);

        simulateStep("Сбор доказательств...");
        simulateStep("Проведение допросов свидетелей...");
        simulateStep("Анализ найденных следов...");
        simulateStep("Обработка полученной информации...");
        simulateStep("Подготовка отчета о расследовании...");
    }

    public void makeArrest(String criminalName) {
        System.out.println("Полиция задержала преступника: " + criminalName);

        simulateStep("Определение местонахождения преступника...");
        simulateStep("Подготовка оперативной группы для задержания...");
        simulateStep("Проведение операции по задержанию...");
        simulateStep("Проверка документов и осмотр арестованного...");
        simulateStep("Передача преступника в следственные органы...");
    }

    private void simulateStep(String message) {
        try {
            TimeUnit.SECONDS.sleep(2); // Задержка в 2 секунды
            System.out.println(message);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void display() {
        System.out.println("This is a police department.");
    }

    // Реализация методов из интерфейса SocialHouse
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
                "\nNumber of Officers: " + numberOfOfficers +
                "\nHas Prison Cells: " + hasPrisonCells +
                "\nPolice Chief Name: " + policeChiefName +
                "\nCapacity: " + capacity +
                "\nHas Parking: " + hasParking +
                "\nHas Cafeteria: " + hasCafeteria;
    }
}