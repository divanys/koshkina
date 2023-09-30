// Простая динамика.
// На вершине лесенки, содержащей N ступенек, находится мячик, который начинает прыгать по ним вниз, к основанию.
// Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через 2.
// (То есть, если мячик лежит на 8-ой ступеньке, то он может переместиться на 5-ую, 6-ую или 7-ую.)
// Определить число всевозможных "маршрутов" мячика с вершины на землю.
//
// Подсказка: если ваша программа работает слишком долго, то может использовать кеш?


import java.util.Scanner;

public class pz_11_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество ступеней: ");
        int count_of_rungs = scanner.nextInt();
        int[] cache = new int[count_of_rungs + 1]; // Кеш

        System.out.print("Количество всевозможных маршрутов мячика равно " + number_of_routes(count_of_rungs, cache));
    }


    public static int number_of_routes(int count_of_rungs, int[] cache) {
        if (count_of_rungs <= 2) return count_of_rungs;
        if (count_of_rungs == 3) return 4;  // честно, сейчас не понимаю, почему мы просто не высчитаем это через рекурсию

        if (cache[count_of_rungs] != 0) return cache[count_of_rungs];

        // мяч может смещаться от 1 до 3-х ступеней включительно
        int routes = number_of_routes(count_of_rungs - 3, cache)
                + number_of_routes(count_of_rungs - 2, cache)
                + number_of_routes(count_of_rungs - 1, cache);

        cache[count_of_rungs] = routes;
        return routes;
    }
}
