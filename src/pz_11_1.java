// factorial
// Напишите рекурсивную функцию factorial, которая принимает как аргумент одно неотрицательное целое число
// и возвращает его значение. Напоминаю, что 0! = 1.

import java.util.Scanner;

public class pz_11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите одно неотрицательное целое число: ");
        int number = scanner.nextInt();

        System.out.println("Факториал числа " + number + " равен " + factorial(number));
    }

    public static int factorial(int number) {
        if (number < 0) return 0;  // если чел глупый или тестировщик введёт отрицательное число
        else if (number == 0) return 1;  // ваша напоминалка
        else return number * factorial(number - 1);  // наша рекурсия
    }
}
