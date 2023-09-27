/*
 Петя перешёл в другую школу. На уроке физкультуры ему понадобилось определить своё место в строю.
 Помогите ему это сделать.
 Программа получает на вход невозрастающую последовательность натуральных чисел
 (сначала вводится количество, затем сами числа), означающих рост каждого человека в строю.
 После этого вводится число X – рост Пети. Все числа во входных данных натуральные и не превышают 200.
 Выведите номер, под которым Петя должен встать в строй. Если в строю есть люди с одинаковым ростом, таким же,
 как у Пети, то он должен встать после них.
 */
import java.util.Scanner;

public class pz_5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве:");
        int n = sc.nextInt();
        int pos = 0;
        int[] a = new int[n];
        System.out.println("Введите рост других ребят-некотят:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Введите рост Петя:");
        int x = sc.nextInt();
        while (pos < a.length && a[pos] >= x) {
            pos += 1;
        }
        System.out.println(pos + 1);
    }
}