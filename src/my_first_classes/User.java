package my_first_classes;


public class User {
    private String name;
    private short age = 18;
    private int height = 170;

    // в приват и гет и сет дописать
    public User(String name, short age, int height) {
        setName(name);
        setAge(age);
        setHeight(height);
    }

    public User(String name, int height, short age) {
        setName(name);
        setHeight(height);
        setAge(age);
    }

    public User(short age, String name, int height) {
        setAge(age);
        setName(name);
        setHeight(height);
    }

    public User(int height, String name, short age) {
        setHeight(height);
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public String getName() {
        return this.name;
    }

    public short getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

//    void displayAll() {
//        System.out.printf("Name: %s \nAge: %d \nHeight: %d", name, age, height);
//    }
}
