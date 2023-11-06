package calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {

    public CalculatorFrame() {
        setTitle("калькулятор абэмэ");

        CalculatorLogic calculator = new CalculatorLogic();
        // поле ввода
        JTextField textField = new JTextField(20);
        textField.setEditable(false); // запрет на редактирование
        textField.setHorizontalAlignment(SwingConstants.RIGHT); // Выравнивание текста по правому краю

        // Панель для кнопок
        JPanel buttonPanel = new JPanel(new GridLayout(4, 5));
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", ".", "=", "+"
        };

        // Создаем и добавляем кнопки на панель
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener(textField, calculator));
            buttonPanel.add(button);
        }

        // Создаем контейнер и добавляем в него элементы
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(textField, BorderLayout.NORTH);
        container.add(buttonPanel, BorderLayout.CENTER);

        pack(); // Автоматически подгоняем размер окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Размещение окна по центру экрана
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorFrame frame = new CalculatorFrame();
            frame.setVisible(true);
        });
    }
}
