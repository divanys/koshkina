package pz_13_1;
// наследник от класса Animal Класс Bird:
// По умолчанию будем считать, что все птицы умеют летать.
// У птиц должны быть новые свойства:
// - area - зона обитания
// - winterFly - ответ на вопрос, улетает ли она зимовать
// Добавьте птицам метод chiriсk_chiriсk, который выводит на экран строку "Chiriсk-Chiriсk".

import pz_13_1.Animal;

class Bird extends Animal {
    private boolean isFly = true;
    private String area;
    private boolean winterFly;
    private String type = "Bird";

    public Bird() {
        setType(type);
        setFly(isFly);
        setArea(area);
        setWinterFly(winterFly);
    }

    public void setFly(boolean isFly) {
        this.isFly = isFly;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setWinterFly(boolean winterFly) { this.winterFly = winterFly; }

    public boolean isFly() {
        return this.isFly;
    }

    public String getArea() { return this.area; }

    public boolean isWinterFly() {
        return this.winterFly;
    }

    public void chiriсk_chiriсk() {
        System.out.println("Chiriсk-Chiriсk");
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("Area: %s\nIs WinterFly: %b", area, winterFly);
    }
}
