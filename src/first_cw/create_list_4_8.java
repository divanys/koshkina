package first_cw;

import java.util.Scanner;

public class create_list_4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int[] lst = new int[n + 2];
        lst[0] = 1;
        lst[n + 1] = 1;
        for (int i = 1; i <= n; i++) {
            lst[i] = 0;
        }

        System.out.println("Вывод: ");
        for (int num : lst) {
            System.out.print(num + " ");
        }
    }
}
/*
8. Создание списка.
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором
первый и последний элементы будут равны строчке 1, а между ними будет n 0. Выведите список на экран через пробел.
Ввод
3
Вывод
1 0 0 0 1

*/