package calculator;

class CalculatorLogic implements CalculatorInterface {
    @Override
    public double add(double num1, double num2) {
        return (num1 + num2);
    }

    @Override
    public double subtract(double num1, double num2) {
        return (num1 - num2);
    }

    @Override
    public double multiply(double num1, double num2) {
        return (num1 * num2);
    }

    @Override
    public double divide(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Дурашка, не дели на ноль");
        }
        return (num1 / num2);
    }

    @Override
    public double squareRoot(double num) throws ArithmeticException {
        if (num < 0) {
            throw new ArithmeticException("Дурашка, чиселку нельзя меньше нуля");
        }
        return Math.sqrt(num);
    }

    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
