package first_cw;

import java.util.Scanner;

public class turn_90_4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = scanner.nextInt();
        System.out.println("Введите количество столбцов: ");
        int m = scanner.nextInt();
        int[][] mass = new int[n][m];
        int[][] mass_trans = new int[m][n];
        System.out.println("Введите данные: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass_trans[j][n-i-1] = mass[i][j];  // Меняем элементы (к примеру 2-0-1; 2-1-1)
            }
        }
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Полученная матрица: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass_trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/*
6. Поворот на 90
Вводятся 2 натуральных числа: n (кол-во строк) и m (кол-во столбцов). Затем вводится двумерный массив размером n *m.
Поверните его на 90 градусов по часовой стрелке и выведите на экран (через пробел).
Данные:
Ввод:
3
4
1 2 3 8
4 6 7 8
-5 6 3 4
*/