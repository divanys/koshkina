package first_cw;

import java.util.Scanner;

/*
3. Сумма цифр натурального числа.
Дано натуральное число N. Напишите программу, вычисляющую сумму цифр числа N. (с использованием while)
*/
public class sum_digits_of_natural_number_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int num = n;

        while (num != 0) {
            sum += num;
            num--;
        }

        System.out.println("Сумма цифр до " + n + " равна " + sum);
    }
}

