package pz_14_2;

public class program {
    public static void main(String[] args) {
        WritingMaterials wm1 = new WritingMaterials(); // конструктор по умолчанию
        WritingMaterials wm2 = new WritingMaterials("Pen", "Blue");

        WritingMaterials.printDescription();

        // Выводим информацию о объектах
        System.out.println(wm1);
        System.out.println(wm2);

    }
}
