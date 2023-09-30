// Король
// Требуется определить, бьет ли король, стоящий на клетке с указанными координатами (номер строки и номер столбца),
// фигуру, стоящую на другой указанной клетке. Напишите функцию king_step,
// которая принимает 4 целых числа – сначала координаты клетки, в которой стоит король, а потом координаты клетки,
// в которой стоит фигура, которую он хочет побить.
// Ваша функция должна вывести на экран:
//  - «1», если координаты короля некорректны;
//  - «2», если координаты фигуры некорректны;
//  - «3», если координаты совпадают;
//  "YES"/"NO" - ответ на задачу, если всё в порядке.


import java.util.Scanner;

public class pz_11_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Шахматная доска имеет размер 8 x 8 клеток." +
                "\nИндексация по обеим осям (x, y) начинается с 1." +
                "\nВведите координаты первого положения короля и предполагаемое его положение через действие.");

        System.out.println("\nОткуда");
        System.out.print("Введите x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Введите y1: ");
        int y1 = scanner.nextInt();

        System.out.println("\nКуда");
        System.out.print("Введите x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Введите y2: ");
        int y2 = scanner.nextInt();

        System.out.println("\nВывод");
        System.out.println(king_step(x1, y1, x2, y2));
    }

    public static String king_step(int x1, int y1, int x2, int y2) {
        // координаты короля некорректны
        if (x1 > 8 || x1 < 0 || y1 > 8 || y1 < 0) return "1";

        // координаты фигуры некорректны
        else if (x2 > 8 || x2 < 0 || y2 > 8 || y2 < 0) return "2";

        // координаты совпадают
        else if (x1 == x2 && y1 == y2) return "3";

        //  ответ на задачу (everything is fine).
        else if (Math.abs(x1 - x2) <= 1 && Math.abs(y1 - y2) <= 1) return "YES";

        return "NO";

    }
}
// я сегодня пишу в одну строку, потому что такое настроение