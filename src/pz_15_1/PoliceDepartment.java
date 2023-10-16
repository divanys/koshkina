package pz_15_1;

import java.util.concurrent.TimeUnit;


class PoliceDepartment extends Building {
    private int numberOfOfficers;
    private boolean hasPrisonCells;
    private String policeChiefName;

    public PoliceDepartment(String name, String address, int yearBuilt, String architectName, boolean isCulturalMonument,
                            int numberOfOfficers, boolean hasPrisonCells, String policeChiefName) {
        super(name, address, yearBuilt, architectName, isCulturalMonument);
        setNumberOfOfficers(numberOfOfficers);
        setHasPrisonCells(hasPrisonCells);
        setPoliceChiefName(policeChiefName);
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

    public void display() {
        System.out.println("This is a police department.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of Officers: " + numberOfOfficers +
                "\nHas Prison Cells: " + hasPrisonCells +
                "\nPolice Chief Name: " + policeChiefName;
    }
}