// Напишите функцию sortByLength, которая принимает как аргумент строку и сортирует её по длине слова.
// Если длины слов одинаковы, то сортировать в алфавитном порядке. Содержание функции main менять запрещено.

import java.util.Scanner;

public class pz_10_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        System.out.println("Отсортированная строка: ");
        System.out.println(sortByLength(input));
    }

    // я не поняла ваших спойлеров, запуталась, вспомнила, что обсуждали с вами сортировку пузырьком, пропузырила код
    // короче, не бейте

    public static String sortByLength(String input) {
        String[] words = input.split(" ");

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].length() > words[j + 1].length() ||
                        (words[j].length() == words[j + 1].length()
                                && words[j].compareTo(words[j + 1]) > 0)) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        return String.join(" ", words);
    }
}

