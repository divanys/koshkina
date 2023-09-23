package first_cw;

import java.util.Scanner;

public class chocolate_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = scanner.nextInt();
        System.out.println("Введите число m:");
        int m = scanner.nextInt();
        System.out.println("Введите число k:");
        int k = scanner.nextInt();

        if (k < (n * m) && ((k % n == 0) || (k % m == 0)) || (n * m / 2 >= k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/*
2. Шоколадка.
Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, если разрешается сделать один разлом
по прямой между дольками (то есть разломить шоколадку на два прямоугольника).
Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.
Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.
*/