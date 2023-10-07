package pz_14_1;

// Класс Pen:
//        У всех ручек цвет стержня по умолчанию - "Blue".
//        У ручек должен быть новый метод:
//
//        click() - выводит на экран фразу "Клик-клик" и изменяет состояние ручки, которое можно представить
//        булевым полем "clicked" (если ручка была выдвинута, то после вызова метода она считается вдвинутой, и наоборот).


class Pen extends WritingMaterials {
    private boolean clicked;
    private String color = "Blue";
    private String name = "Pen";


    public Pen() {
        setName(name);
        setColor(color);
        setClicked(clicked);
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public boolean isClicked() {
        return this.clicked;
    }

    public void click() {
        System.out.println("Клик-клик-клик-клик-клик-клик-клик-надоел!-клик-клик-клик-клик-клик-клик!");
        if (this.clicked) setClicked(false);
        else setClicked(true);
    }

    @Override
    public void display() {
        System.out.printf("I am a %s\n", getName());
        super.display();
        System.out.printf("Is Clicked: %b\n", clicked);
    }

    @Override
    public void draw() {
        System.out.println("I can to write text!");
    }
}
