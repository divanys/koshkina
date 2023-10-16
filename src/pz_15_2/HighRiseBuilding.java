package pz_15_2;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class HighRiseBuilding extends Building implements LivingHouse {
    private int numberOfFloors;
    private boolean hasElevator;
    private boolean hasParking;
    private int numberOfRooms;
    private boolean hasGarden;
    private boolean hasGarage;

    public HighRiseBuilding(String name, String address, int yearBuilt, String architectName, boolean isCulturalMonument,
                            int numberOfFloors, boolean hasElevator, boolean hasParking,
                            int numberOfRooms, boolean hasGarden, boolean hasGarage) {
        super(name, address, yearBuilt, architectName, isCulturalMonument);
        setNumberOfFloors(numberOfFloors);
        setHasElevator(hasElevator);
        setHasParking(hasParking);
        setNumberOfRooms(numberOfRooms);
        setHasGarden(hasGarden);
        setHasGarage(hasGarage);
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }


    // Getters
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean hasElevator() {
        return hasElevator;
    }

    public boolean hasParking() {
        return hasParking;
    }

    // Setters
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public void display() {
        System.out.println("This is a high-rise building.");
    }

    public void pressElevatorButton(int floorNumber) {
        if (hasElevator) {
            System.out.println("Нажатие кнопки в лифте для этажа " + floorNumber);
            try {
                TimeUnit.SECONDS.sleep(7); // Добавляем задержку, чтобы создать ощущение поднятия на лифте
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Вы прибыли на этаж " + floorNumber);
        } else {
            System.out.println("В данном здании нет лифта.");
        }
    }

    public void addFloor(int floorsToAdd) {
        if (floorsToAdd > 0) {
            numberOfFloors += floorsToAdd;
            System.out.println(floorsToAdd + " этаж(ей) добавлено. Теперь здание имеет " + numberOfFloors + " этажей.");
        } else {
            System.out.println("Некорректное количество этажей для добавления. Пожалуйста, укажите положительное целое число.");
        }
    }

    public void checkParkingAvailability() {
        if (hasParking) {
            System.out.println("В этом здании есть парковка.");
            // Добавим интересный интерактив для проверки наличия парковки
            System.out.println("Хотите пройтись по парковке и осмотреть автомобили? (yes/no)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Прогулка по парковке...");
            } else {
                System.out.println("Вы решили не исследовать парковку.");
            }
        } else {
            System.out.println("В этом здании нет парковки.");
        }
    }

    public void numberOfRooms(int rooms) {
        setNumberOfRooms(rooms);
    }

    @Override
    public void hasGarden(boolean hasGarden) {
        setHasGarden(hasGarden);
    }

    @Override
    public void hasGarage(boolean hasGarage) {
        setHasGarage(hasGarage);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumber of Floors: " + numberOfFloors +
                "\nHas Elevator: " + hasElevator +
                "\nHas Parking: " + hasParking +
                "\nNumber of Rooms: " + numberOfRooms +
                "\nHas Garden: " + hasGarden +
                "\nHas Garage: " + hasGarage;
    }

}
