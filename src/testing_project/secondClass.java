package testing_project;

public class secondClass {
    public static void main(String[] args) {

        firstClass tom = new firstClass(); // создание объекта
        tom.displayInfo();

        // изменяем имя и возраст
        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();
    }
}
