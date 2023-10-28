package pz_17;

// Калькулятор
// Пользователь вводит одну строку, в которой должно быть записано простое арифметическое
// выражение вида a /операция/ b, где a и b - какие-то действительные числа, а операция - один
// из символов +, -, *, /. Ваша задача - выполнить вычисление, если это возможно.
// Гарантируется, что во введённой строке ровно 2 пробела (значение пробел значение пробел
// значение) В результате работы могут произойти различные ошибки. Их нужно обработать
// следующим образом:
// 1. Если одно из чисел не является числом, то вывести на экран "Error! Not number"
// 2. Если вместо знака операции было введено любое другое значение, то выведите
// "Operation Error"
// 3. Если произошла попытка деления на ноль, то выведите на экран "Error! Division by zero"
// Обрабатывать исключения необходимо в указанном выше порядке.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите арифметическое выражение (например, a + b): ");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        if (parts.length != 3) {
            System.out.println("Ошибка! Введите выражение в формате 'a операция b'.");
            return;
        }

        try {
            double a = Double.parseDouble(parts[0]);
            String operation = parts[1];
            double b = Double.parseDouble(parts[2]);

            double result;
            switch (operation) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Ошибка! Деление на ноль.");
                        return;
                    }
                    result = a / b;
                    break;
                default:
                    System.out.println("Ошибка операции! Поддерживаются только +, -, *, / .");
                    return;
            }

            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка! Один из операндов не является числом.");
        }
    }
}

