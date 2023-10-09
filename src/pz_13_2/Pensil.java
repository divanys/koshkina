package pz_13_2;

// Класс Pencil:
//        У всех карандашей цвет стержня по умолчанию - "Gray".
//        У карандашей должен быть новый метод:
//
//        sharpen() - выводит на экран фразу "Строгание карандаша" и изменяет длину карандаша, уменьшая её на 0.5
//        (предполагая, что карандаш затачивается и теряет длину при каждом заточении).


class Pensil extends WritingMaterials {
    private String color = "Gray";
    private String name = "Pensil";
    public Pensil() {
        setName(name);
        setColor(color);
    }

    public void sharpen() {
        System.out.println("Строгание карандаша! Карандаш уменьшается!");
        setLength(getLength() - 0.5);
    }


    @Override
    public void display() {
        System.out.printf("I am a %s\n", getName());
        super.display();
    }

    @Override
    public void draw() {
        System.out.println("I can to draw a pictures!");
    }
}
