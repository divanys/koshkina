package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {
    private final JTextField textField;
    private final CalculatorLogic calculator;
    private boolean isLastInputOperator = false;

    public ButtonClickListener(JTextField textField, CalculatorLogic calculator) {
        this.textField = textField;
        this.calculator = calculator;
    }

    public double evaluateExpression(String expression) {
        String[] tokens = expression.split(" ");

        double num1 = Double.parseDouble(tokens[0]);
        String operator = tokens[1];
        double num2 = Double.parseDouble(tokens[2]);

        switch (operator) {
            case "+":
                return calculator.add(num1, num2);
            case "-":
                return calculator.subtract(num1, num2);
            case "*":
                return calculator.multiply(num1, num2);
            case "/":
                return calculator.divide(num1, num2);
            default:
                return Double.NaN;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {
            if (isLastInputOperator) {
                textField.setText(textField.getText() + " " + command);
                isLastInputOperator = false;
            } else {
                textField.setText(textField.getText() + command);
            }
        } else if (command.matches("[+\\-*/]")) {
            if (!isLastInputOperator) {
                textField.setText(textField.getText() + " " + command + " ");
                isLastInputOperator = true;
            }
        } else if (command.equals("=")) {
            try {
                System.out.println(textField.getText());
                double result = evaluateExpression(textField.getText());
                textField.setText(Double.toString(result));
            } catch (Exception ex) {
                textField.setText("Error");
                System.out.println(ex.getMessage());
            }
        } else if (command.equals("C")) {
            textField.setText("");
            isLastInputOperator = false;
        } else if (command.equals(".")) {
            textField.setText(textField.getText() + ".");
        } else if (command.equals("←")) {  // backspace
            String currentText = textField.getText();
            if (!currentText.isEmpty()) {
                textField.setText(currentText.substring(0, currentText.length() - 1));
            }
        } else if (command.equals("√")) {
            try {
                double num = Double.parseDouble(textField.getText());
                double result = calculator.squareRoot(num);
                textField.setText(Double.toString(result));
            } catch (Exception ex) {
                textField.setText("Error");
                System.out.println(ex.getMessage());
            }
        } else if (command.equals("^")) {
            try {
                double num = Double.parseDouble(textField.getText());
                String exponentString = JOptionPane.showInputDialog("Введите степень:");
                if (exponentString != null && !exponentString.isEmpty()) {
                    double exponent = Double.parseDouble(exponentString);
                    double result = calculator.power(num, exponent);
                    textField.setText(Double.toString(result));
                } else {
                    textField.setText("Error");
                }
            } catch (NumberFormatException ex) {
                textField.setText("Error");
                System.out.println(ex.getMessage());
            }
        }
    }
}
