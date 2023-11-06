package calculator;

import javax.swing.*;

public class CalculatorApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorFrame calculatorFrame = new CalculatorFrame();
            calculatorFrame.setVisible(true);
        });
    }
}
