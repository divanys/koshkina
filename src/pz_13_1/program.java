package pz_13_1;

public class program {
    public static void main(String[] args) {
        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();
        System.out.println("========================================");

        duck.holiday();
        duck.display();
        System.out.println("========================================");

        duck.holiday(5);
        duck.display();
        System.out.println("========================================");

        duck.holiday(0.4);
        duck.display();
        System.out.println("========================================");

        duck.holiday(0.3, 2);
        duck.display();
        System.out.println("========================================");
        System.out.println("========================================");


        System.out.println("\n=================ПТЕЧКЕЕЕЕЕ=======================");
        Bird b = new Bird();
        b.setName("Bob");
        b.display();
        System.out.println("\n========================================");

        b.setArea("На югах");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chiriсk_chiriсk();

        System.out.println("\n=================РЫБКИИИИИ=======================");
        Fish f = new Fish();
        f.setName("Сельд");
        f.display();
        System.out.println("\n========================================");

        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();

        System.out.println("\n=================НАСЕКОМЫЕ=========================");
        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.display();
        System.out.println("\n========================================");

        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();
    }
}