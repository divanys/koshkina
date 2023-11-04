package pz_19;

import javax.swing.*;
import java.awt.*;

public class SwingThird {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Пример Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Создаем панель ContentPane
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());

        // Создаем две кнопки
        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");

        contentPane.add(button1);
        contentPane.add(button2);

        frame.setVisible(true);
    }
}
