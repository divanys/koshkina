/*
Поворот на 90
Вводятся 2 натуральных числа: n (кол-во строк) и m (кол-во столбцов). Затем вводится двумерный массив размером n *m. Поверните его на 90 градусов по часовой стрелке и выведите на экран (через пробел).
Пример.
Ввод:				        Вывод:
3 (n – кол-во строк)		-5 4 1
4 (m – кол-во столбцов)	     6 6 2
1 2 3 8				         3 7 3
4 6 7 8				         4 8 8
-5 6 3 4
*/

import java.util.Scanner;

public class pz_6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести количество строк: ");
        int n = scanner.nextInt();
        System.out.println("Ввести количество столбцов: ");
        int m = scanner.nextInt();
        int[][] mas = new int[n][m];
        System.out.println("Ввести данные: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = scanner.nextInt();
            }
        }
        int[][] mas_trans = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                    mas_trans[j][n-i-1] = mas[i][j];
                }
            }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas_trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}