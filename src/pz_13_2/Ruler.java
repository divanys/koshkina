package pz_13_2;

// Класс Ruler:
//        По умолчанию будем считать, что все линейки не умеют рисовать.
//        У линеек должны быть новые свойства:
//        - length_itself - длина линейки
//        - wood - из дерева ли эта линейка
//        Добавьте линейкам метод measure, который выводит на экран строку "Сейчас померяем длину".

class Ruler extends WritingMaterials {
    private int length_itself;
    private boolean wood;

    public Ruler(String name, String color, int price, double length, boolean draw, int length_itself, boolean wood) {
        super(name = "Линейка", color, price, length, draw = false);
        setlength_itself(length_itself);
        setWood(wood);
    }

    public void setlength_itself(int length_itself) {
        this.length_itself = length_itself;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public boolean isWood() {
        return wood;
    }

    public int getlength_itself() {
        return length_itself;
    }

    public void measure() {
        System.out.println("Сейчас померяем длину!");
    }

    @Override
    public void display() {
        System.out.printf("I am a %s\n", getName());
        super.display();
        System.out.printf("length_itself: %d\nIs wood?: %b\n", getlength_itself(), isWood());
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("I can paint all the places!");
    }
}
