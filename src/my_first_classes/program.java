package my_first_classes;

public class program {

    public static void main(String[] args) {
        cats mimi = new cats("Kate", 12, "Streets", "Black");
        mimi.displayName(); // норм, метод public
        mimi.displayAge();// // норм, метод имеет модификатор по умолчанию
        mimi.displayBreed(); // норм, метод protected
        //kate.displayAddress(); // ! Ошибка, метод private
        System.out.println(mimi.name); // норм, модификатор по умолчанию
        System.out.println(mimi.breed); // норм, модификатор public
        System.out.println(mimi.age); // норм, модификатор protected
        //System.out.println(kate.phone); // ! Ошибка, модификатор private

    }
}
