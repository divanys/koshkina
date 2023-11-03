package pz_19;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;

public class SimpleSwingApp extends JFrame {
    public SimpleSwingApp() {
        setTitle("Простой Swing интерфейс");

        setSize(400, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Привет, мир!");
        JButton button = new JButton("Нажми меня");

        add(label);
        add(button);

        setLayout(new FlowLayout());

        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleSwingApp app = new SimpleSwingApp();
    }
}
