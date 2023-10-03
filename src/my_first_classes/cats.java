package my_first_classes;

public class cats {
    String name;
    protected int age;
    public String breed;
    private String color;

    public cats(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public void displayName() {
        System.out.printf("Name: %s \n", name);
    }

    void displayAge() {
        System.out.printf("Age: %d \n", age);
    }

    public void displayBreed() {
        System.out.printf("Breed: %s \n", breed);
    }

    protected void displayColor() {
        System.out.printf("Color: %s \n", color);
    }
}


