package pz_13_2;


public class program {
    public static void main(String[] args) {
        // тестируем перегрузку метода draw()

        WritingMaterials pen = new WritingMaterials("Pen", "Blue", 10, 15.5, true);

        System.out.println("=====================PEN========================");

        pen.display();
        pen.draw("Hello, World!");
        System.out.println();

        System.out.println("====================PENCIL======================");

        WritingMaterials pencil = new WritingMaterials("Pencil", 5);
        pencil.display();
        pencil.draw("This is a pencil.");
        System.out.println();

        pencil.setColor("Black");
        pencil.setDraw(true);
        pencil.display();
        pencil.draw("This is a pencil.", 17);
        System.out.println();

        System.out.println("====================MARKER======================");

        WritingMaterials marker = new WritingMaterials("Marker", "Red");

        marker.display();
        marker.priceUp(2);
        marker.draw();
        System.out.println();

        marker.setColor("Green");
        marker.setDraw(true);
        marker.display();
        marker.draw();
        System.out.println("==========================================");
        System.out.println("==========================================");



        // тестируем Pen
        System.out.println("\n=================PEN1=====================");
        Pen pen1 = new Pen();
        pen1.display();

        pen1.click();
        System.out.println("\n=К=Л=И=К=Н=У=Л=И=\n");
        pen1.display();

        pen1.click();
        System.out.println("\n=К=Л=И=К=Н=У=Л=И=\n");
        pen1.display();
        pen1.draw();


        // тестируем Pencil
        System.out.println("\n============PENCIL1====================");
        Pensil pencil1 = new Pensil();
        pencil1.setLength(16.5);
        pencil1.setDraw(true);
        pencil1.setPrice(500);
        pencil1.display();

        pencil1.sharpen();
        System.out.println("\n=П=О=Д=Т=О=Ч=И=Л=И=\n");
        pencil1.display();

        pencil1.sharpen();
        System.out.println("\n=П=О=Д=Т=О=Ч=И=Л=И=\n");
        pencil1.display();
        pencil1.draw();
        System.out.println("==========================================");
        System.out.println("==========================================");



        // тестируем Marker
        System.out.println("\n==============MARKER1====================");
        Marker marker1 = new Marker();
        marker1.setDraw(true);
        marker1.setPrice(40);
        marker1.display();

        marker1.drawPattern("Stars");

        marker1.setCapped(false); // Открываем маркер
        System.out.println("\n=О=Т=К=Р=Ы=Л=И=\n");
        marker1.display();
        marker1.drawPattern("Squares");

        marker1.draw();
        System.out.println();
        Marker marker2 = new Marker();
        marker2.setColor("Black");
        marker2.display();

        System.out.println("\n==============RULER====================");
        Ruler ruler1 = new Ruler("Розовая", "Розовая", 300, 26.0, true, 25, true);
        ruler1.display();

    }
}
