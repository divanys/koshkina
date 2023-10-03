package testing_project;

public class tweNew {
    public static void main(String[] args) {
        Person1 kate = new Person1("Kate", 30);
        System.out.println(kate.getAge());
        kate.setAge(33);
        System.out.println(kate.getAge());
        kate.setAge(123450);
        System.out.println(kate.getAge());
    }
}

class Person1 {
    private String name;
    private int age = 1;

    public Person1(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() { return this.age; }

    public void setAge(int age) {
        if (age > 0 && age < 110)
            this.age = age;
    }
}