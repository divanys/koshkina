// Площадь треугольника можно вычислить по формуле Герона. Напишите программу с функцией geron,
// которая по трём действительным числам находит площадь треугольника и выводит её на экран.
// Если такого треугольника не существует, то выведите на экран "Такого треугольника не существует".


import java.util.Scanner;

public class pz_10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сторону a: ");
        int a = scanner.nextInt();
        System.out.println("Введите сторону b: ");
        int b = scanner.nextInt();
        System.out.println("Введите сторону c: ");
        int c = scanner.nextInt();

        geroin(a, b, c);
    }

    public static void geroin(double a, double b, double c) {
        double s, p;
        p = (a + b + c) / 2;
        s = Math.sqrt((p * (p - a) * (p - b) * (p - c)));

        if (s > 0) {
            System.out.println("Площадь треугольника равняется " + s + " квадратных единиц.");
        } else {
            System.out.println("Такого треугольника не существует");
        }
    }
}
