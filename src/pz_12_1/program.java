package pz_12_1;

public class program {
    public static void main(String[] args) {
        Animal tiger = new Animal();
        tiger.setType("тигр");
        tiger.setName("Артём");
        tiger.setAge(15);
        tiger.setWeight(300.6);
        tiger.setSwim(true);
        tiger.setWalk(true);
        tiger.setFly(false);
        tiger.display();
        System.out.println("========================================");

        tiger.rename("Артём", "Антон");
        tiger.display();
        System.out.println("========================================");

        Animal sparrow = new Animal();
        sparrow.setType("воробей");
        sparrow.setName("Капитан Джек");
        sparrow.setAge(3);
        sparrow.setWeight(2);
        sparrow.setSwim(false);
        sparrow.setWalk(true);
        sparrow.setFly(true);
        sparrow.display();
        System.out.println("========================================");

        sparrow.holiday(2);
        sparrow.display();
        System.out.println("========================================");
        System.out.println("========================================");


        Animal piger = new Animal("тигр", "Артём");
        piger.setAge(15);
        piger.setWeight(300.6);
        piger.setSwim(true);
        piger.setWalk(true);
        piger.setFly(false);
        piger.display();
        System.out.println("========================================");

        Animal merrow = new Animal("воробей", 5);
        merrow.setWeight(2);
        merrow.setSwim(false);
        merrow.setWalk(true);
        merrow.setFly(true);
        merrow.display();
        System.out.println("========================================");

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("Утя", "Утя-Утя");
        duck.display();
        System.out.println("========================================");
    }
}