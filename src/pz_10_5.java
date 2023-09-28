import java.util.Scanner;

// На вход вашей функции maximin даётся зубчатый двумерный массив
// (сначала даётся число  n - количество строк,
// а потом сами строки). Найдите максимальное значение среди минимальных элементов каждой строки.
// Ввод (ctrl+c -> ctrl+v)
// 4
// 5
// 1 2 4 3 5
// 4
// 3 2 4 4
// 7
// 6 5 3 4 6 7 5
// 9
// 1 2 1 2 1 2 2 1 1
// Вывод
// 3
// Класс Integer предоставляет различные константы и методы для работы с целыми числами.
// Синтаксис: int имя_переменной = Integer.MIN_VALUE; int имя_переменной = Integer.MAX_VALUE;
public class pz_10_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк в вашем массиве: ");
        int count = scanner.nextInt();
        int[][] mass = new int[count][];

        for (int i = 0; i < count; i++) {
            System.out.println("Введите количество элементов в строке " + i + ": ");
            int secondCount = scanner.nextInt();
            mass[i] = new int[secondCount];
            System.out.println("Введите элементы строки " + i + ": ");

            for (int j = 0; j < secondCount; j++) {
                mass[i][j] = scanner.nextInt();
            }
        }

        System.out.println(maximin(mass));

    }

    public static int maximin(int[][] mass) {
        int[] maxElemArrFromMin = new int[mass.length];

        // находим минимальный элемент среди элементов массива
        for (int i = 0; i < mass.length; i++) {
            int min = mass[i][0];

            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] < min) {
                    min = mass[i][j];
                }
            }

            maxElemArrFromMin[i] = min;
        }

        int maxOfMin = maxElemArrFromMin[0];

        // находим максимальный элемент среди минимальных
        for (int j : maxElemArrFromMin) {
            if (j > maxOfMin) {
                maxOfMin = j;
            }
        }

        return maxOfMin;
    }
}
