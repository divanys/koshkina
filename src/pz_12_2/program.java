package pz_12_2;

public class program {
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(15.6);
        pen.setPrice(145);
        pen.setDraw(true);
        pen.display();
        System.out.println("========================================");

        pen.draw();
        System.out.println("========================================");

        pen.priceDown(10);
        pen.display();
        System.out.println("========================================");

        pen.priceUp(23);
        pen.display();
        System.out.println("========================================");

        pen.replace_rod("Синий");
        pen.draw();
        System.out.println("========================================");

        WritingMaterials ruler = new WritingMaterials();
        ruler.setName("линейка");
        ruler.setLength(30.0);
        ruler.setPrice(25);
        ruler.setDraw(false);
        ruler.display();
        System.out.println("========================================");

        ruler.draw();
        System.out.println("========================================");

        ruler.priceUp(13);
        ruler.display();
        System.out.println("========================================");
        System.out.println("========================================");

        WritingMaterials pen1 = new WritingMaterials("ручка","Красный", 145, 15.6, true);
        pen1.display();
        System.out.println("========================================");

        pen1.draw();
        System.out.println("========================================");

        pen1.priceDown(10);
        pen1.display();
        System.out.println("========================================");

        pen1.priceUp(23);
        pen1.display();
        System.out.println("========================================");

        pen1.replace_rod("Синий");
        pen1.draw();
        System.out.println("========================================");

        WritingMaterials ruler1 = new WritingMaterials("линека", 34);
        ruler1.display();
        System.out.println("========================================");

        ruler1.draw();
        System.out.println("========================================");

        WritingMaterials wm1 = new WritingMaterials(23, 67.8, false);
        wm1.display();
        System.out.println("========================================");

        wm1.draw();
        System.out.println("========================================");

        WritingMaterials wm2 = new WritingMaterials("Циркуль", "Зелёный");
        wm2.setDraw(true);
        wm2.display();
        System.out.println("========================================");

        wm2.draw();
        System.out.println("========================================");

    }
}
