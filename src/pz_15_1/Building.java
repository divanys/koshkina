//  1. Создайте абстрактный класс Building.
//        Определите у класса свойства:
//        - название,
//        - адрес,
//        - год постройки,
//        - имя архитектора,
//        - является ли культурным памятником.
//        Добавьте ему абстрактный метод display().
//        Унаследуйте от него 6 классов: Library, House, PoliceDepartment, University, ShoppingCenter, HighRiseBuilding.
//        Добавьте каждому классу наследнику по 3 свойства и 3 метода, которые соответствовали бы тематике здания, сгенерируйте им метод toString()
//        Каждый класс должен быть инкапсулирован.
package pz_15_1;

abstract class Building {
    private String name;
    private String address;
    private int yearBuilt;
    private String architectName;
    private boolean isCulturalMonument;

    public Building(String name, String address, int yearBuilt, String architectName, boolean isCulturalMonument) {
        this.name = name;
        this.address = address;
        this.yearBuilt = yearBuilt;
        this.architectName = architectName;
        this.isCulturalMonument = isCulturalMonument;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public String getArchitectName() {
        return architectName;
    }

    public boolean isCulturalMonument() {
        return isCulturalMonument;
    }

    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void setArchitectName(String architectName) {
        this.architectName = architectName;
    }

    public void setCulturalMonument(boolean culturalMonument) {
        isCulturalMonument = culturalMonument;
    }

    // Абстрактный метод display()
    public abstract void display();

    @Override
    public String toString() {
        return "Name: " + name +
                "\nAddress: " + address +
                "\nYear Built: " + yearBuilt +
                "\nArchitect: " + architectName +
                "\nIs Cultural Monument: " + isCulturalMonument;
    }
}