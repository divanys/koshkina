package first_cw;

import java.util.Scanner;

/*
1. Сумма цифр.
Дано трехзначное число. Найдите сумму его цифр.
*/
public class sum_of_digits_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трёхзначное число: ");
        int digit = sc.nextInt();
        System.out.println("Сумма этого числа равна " + ((digit % 10) + (digit / 100) + (digit / 10 % 10)));
    }
}
