// Напишите программу, которая содержит функцию simple, принимающую одно целое число и определяет,
// является ли число простым и выводит на экран ответ: "YES"/"NO".


import java.util.Scanner;

public class pz_10_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число для проверки (a): ");
        int a = scanner.nextInt();

        System.out.println(simple(a) ? "YES" : "NO");
    }

    public static boolean simple(Integer number) {
        if (number < 2) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}