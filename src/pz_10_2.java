// Необходимо написать программу для поиска площади и периметра квадрата или круга.
// Напишите две функции: perimeter и area, каждая из них принимает строку - название фигуры и одно целое число
// (либо радиус круга, либо сторону квадрата). Как результат они выводят периметр и площадь фигуры соответственно.
// В ответ они должны вывести именно целое число (при надобности округлять "вверх",
// то есть до ближайшего большего целого числа). Пи брать как 3.14.
// П.С. Метод Math.ceil () - округление вверх. Округляет аргумент до ближайшего большего целого.


import java.util.Scanner;

public class pz_10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название фигуры: ");
        String figure = scanner.nextLine();

        if (figure.equalsIgnoreCase("круг")) {
            System.out.println("Введите радиус a: ");
        } else {
            System.out.println("Введите сторону a: ");
        }

        int a = scanner.nextInt();

        perimeter(figure, a);
        area(figure, a);
    }

    public static void perimeter(String figure, int a) {
        double perimeter = 0;
        double pi = 3.14;

        if (figure.equalsIgnoreCase("круг")) {
            perimeter = 2 * pi * a;
        } else if (figure.equalsIgnoreCase("квадрат")) {
            perimeter = 4 * a;
        }

        System.out.println("Периметр " + figure + "а равен " + Math.ceil(perimeter));
    }

    public static void area(String figure, int a) {
        double area = 0;
        double pi = 3.14;

        if (figure.equalsIgnoreCase("круг")) {
            area = pi * Math.pow(a, 2);
        } else if (figure.equalsIgnoreCase("квадрат")) {
            area = Math.pow(a, 2);
        }

        System.out.println("Площадь " + figure + "а равна " + Math.ceil(area));
    }
}
