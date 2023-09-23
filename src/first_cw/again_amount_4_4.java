package first_cw;

import java.util.Scanner;

public class again_amount_4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        int sum = 0;
        int i = a;
        while (i <= b) {
            sum += i;
            i++;
        }

        System.out.println("Сумма чисел от " + a + " до " + b + " равна " + sum);
    }
}


/*
4. Опять сумма.
Напишите программу для поиска суммы чисел.
Вводится 2 целых числа a и b (a <= b). Необходимо вычислить сумму всех чисел от a до b включительно.
*/