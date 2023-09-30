// Число секунд.
// Напишите функцию second_count, которая принимает как целочисленные аргументы количество дней, часов, минут и секунд,
// которые прошли со времён какого - либо момента. Ваша функция должна вернуть одно целое число - количество секунд,
// которое прошло с того момента.


import java.util.Scanner;

public class pz_11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество дней: ");
        int day = scanner.nextInt();
        System.out.print("Введите количество часов: ");
        int hours = scanner.nextInt();
        System.out.print("Введите количество минут: ");
        int minutes = scanner.nextInt();
        System.out.print("Введите количество секунд: ");
        int seconds = scanner.nextInt();

        System.out.println("С начала вашего какого-либо момента прошло " + second_count(day, hours, minutes, seconds) + " секунд");
    }

    public static int second_count(int days, int hours, int minutes, int seconds) {
        // day = 24; hours = 60; minutes = 60; one day is 86400 seconds
        if (days == 0 && hours == 0 && minutes == 0 && seconds == 0) return 0;

        int secondsFromDays = days * 24 * 60 * 60;
        int secondsFromHours = hours * 60 * 60;
        int secondsFromMinutes = minutes * 60;

        return secondsFromDays + secondsFromHours + secondsFromMinutes + seconds;
    }
}
