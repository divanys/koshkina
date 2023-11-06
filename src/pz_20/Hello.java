package pz_20;


import javax.swing.*;
public class Hello {
    public static void main(String[] args) {
        // объект класса JFrame с пустым конструктором
        JFrame jFrame = new JFrame(){};
        // окно становится видимым и пользователь может взаимодействовать с ним
        jFrame.setVisible(true);
        // для установки реакции на закрытие окна JFrame
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // устанавливает размер окна в пикселях
        jFrame.setSize(500, 300);
        // устанавливает начальное положение окна на экране
        jFrame.setLocation(500, 400);
        // устанавливает заголовок в верхней части окна
        jFrame.setTitle("And the dream was so close");
    }
}
