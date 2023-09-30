// Первая строка, сумма которой кратна 7?
// Напишите функцию find_line7, которая принимает на вход двумерный массив целых чисел и возвращает в ответ
// индекс первой строчки, сумма элементов которой кратна 7. Если такой строки нет, то возвращает значение -1.
// Ввод
// 4
// 1 2 4 3 5
// 3 2 4 4 1
// 6 5 0 4 6 7 5
// 1 2 1 2 1 2 2 1 1
// Вывод
// Сумма строки под номером 2 кратна 7
// (не)нагло скопировала ваш код)

import java.util.Scanner;

public class pz_11_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк в вашем массиве: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[][] mas = new int[count][];

        System.out.println("Введите данные: ");

        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int[] line_mass = new int[numbers.length];

            for (int j = 0; j < numbers.length; j++) {
                line_mass[j] = Integer.parseInt(numbers[j]);
            }

            mas[i] = line_mass;
        }

        int ans = find_line7(mas);

        if (ans != -1)
            System.out.println("Сумма строки под номером " + (ans + 1) + " кратна 7");
        else
            System.out.println("Строка, сумма которой кратна 7, не найдена.");
    }


    public static int n = 0;
    public static int sum_line = 0;

    public static int find_line7(int[][] mas) {
        if (n == mas.length) return -1;

        for (int i = 0; i < mas[n].length; i++) sum_line += mas[n][i];

        if (sum_line % 7 == 0) return n;

        n++;
        sum_line = 0;
        return find_line7(mas);
    }
}