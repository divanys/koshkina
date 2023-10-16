package pz_15_2;

class House extends Building implements LivingHouse {
    private int numberOfRooms;
    private boolean hasGarden;
    private boolean hasGarage;

    public House(String name, String address, int yearBuilt, String architectName, boolean isCulturalMonument,
                 int numberOfRooms, boolean hasGarden, boolean hasGarage) {
        super(name, address, yearBuilt, architectName, isCulturalMonument);
        setNumberOfRooms(numberOfRooms);
        setHasGarden(hasGarden);
        setHasGarage(hasGarage);
    }

    // Getters
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    // Setters
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    @Override
    public void display() {
        System.out.println("This is a house.");
    }

    public void renovate(boolean isRenovated) {
        if (isRenovated) {
            System.out.println("Дом был отремонтирован.");
        } else {
            System.out.println("Дом еще не был отремонтирован.");
        }
    }

    public void addRoom(int additionalRooms) {
        numberOfRooms += additionalRooms;
        System.out.println("К дому добавлено " + additionalRooms + " комнат(ы).");
    }

    public void addGarden() {
        if (!hasGarden) {
            hasGarden = true;
            System.out.println("К дому добавлен сад.");
        } else {
            System.out.println("У дома уже есть сад.");
        }
    }

    public void addGarage() {
        if (!hasGarage) {
            hasGarage = true;
            System.out.println("К дому добавлен гараж.");
        } else {
            System.out.println("У дома уже есть гараж.");
        }
    }

    @Override
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
                "\nNumber of Rooms: " + numberOfRooms +
                "\nHas Garden: " + hasGarden +
                "\nHas Garage: " + hasGarage;
    }

}
