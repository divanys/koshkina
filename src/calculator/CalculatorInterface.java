package calculator;

public interface CalculatorInterface {
    double add(double num1, double num2);  // сложение

    double subtract(double num1, double num2);  // вычитание

    double multiply(double num1, double num2);  // умножение

    double divide(double num1, double num2) throws ArithmeticException;  // деление

    double squareRoot(double num) throws ArithmeticException;  // кв корень

    double power(double base, double exponent);  // степень
}
