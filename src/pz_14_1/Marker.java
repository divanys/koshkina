package pz_14_1;
// Класс Marker:
//        У всех маркеров цвет стержня по умолчанию - "Green".
//        У маркеров должен быть новый метод:
//        drawPattern(String pattern) - принимает на вход строку "pattern" и выводит на экран фразу "Рисуем узор: <pattern>".
//        Этот метод также должен проверить, если маркер не закрыт (capped), то выдать
//        предупреждение "Маркер закрыт, рисование невозможно!" и не выполнять рисование.

class Marker extends WritingMaterials {
    private String color = "Green";
    private String name = "Marker";
    private boolean isCapped = true;
    public Marker() {
        setName(name);
        setColor(color);
        setCapped(isCapped);
    }

    public void setCapped(boolean isCapped) {
        this.isCapped = isCapped;
    }

    public boolean isCapped() {
        return isCapped;
    }

    public void drawPattern(String pattern) {
        if (this.isCapped) System.out.println("Маркер закрыт, рисование невозможно!\nОткройте маркер!");
        else System.out.printf("Рисуем узор %s!\n", pattern);
    }

    @Override
    public void display() {
        System.out.printf("I am a %s\n", getName());
        super.display();
        System.out.printf("Is Capped?: %b\n", isCapped());
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("I can paint all the places!");
    }
}
