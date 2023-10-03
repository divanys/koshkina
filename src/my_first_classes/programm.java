package my_first_classes;

public class programm {
    public static void main(String[] args) {
        User mimi = new User("Kate", 152, (short) 50);
        System.out.printf("Name: %s\nAge: %d\nHeight: %d", mimi.getName(), mimi.getAge(), mimi.getHeight());
    }
}
