package testing_project;
public class Cat {

    String name;
    int age;

    static int count = 0;

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "Барсик";
        count++;

        Cat vasia = new Cat();
        vasia.age = 5;
        vasia.name = "Вася";
        count++;

        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
        System.out.println("Мы создали кота по имени " + vasia.name + ", его возраст - " + vasia.age);

        System.out.println("Общее количество котов = " + count);
    }
}
