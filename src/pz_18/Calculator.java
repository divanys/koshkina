package pz_18;

import java.io.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ ввода данных: ");
        System.out.println("1. Ввести данные с клавиатуры");
        System.out.println("2. Взять данные из файла");
        System.out.print("Введите 1 или 2: ");

        int choice = scanner.nextInt();

        String input;

        if (choice == 1) {
            scanner.nextLine();
            System.out.print("Введите арифметическое выражение (например, a + b): ");
            input = scanner.nextLine();
        } else if (choice == 2) {
            try {
                File inputFile = new File("src/pz_18/input.txt");
                if (inputFile.exists()) {
                    Scanner fileScanner = new Scanner(inputFile);
                    input = fileScanner.nextLine();
                    fileScanner.close();
                } else {
                    System.out.println("Файл src/pz_18/input.txt не найден.");
                    return;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Ошибка при чтении файла.");
                return;
            }
        } else {
            System.out.println("Некорректный выбор. Введите 1 или 2.");
            return;
        }

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
                    System.out.println("Ошибка операции! Поддерживаются только +, -, *, /.");
                    return;
            }

            System.out.println("Результат: " + result);

            try {
                File outputFile = new File("src/pz_18/output.txt");
                FileWriter writer = new FileWriter(outputFile);
                writer.write("Результат: " + result);
                writer.close();
                System.out.println("Результат записан в файл src/pz_18/output.txt.");
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл src/pz_18/output.txt.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка! Один из операндов не является числом.");
        }
    }
}
