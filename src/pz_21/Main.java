package pz_21;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int weight = 900, height = 800;
        JFrame jFrame = new JFrame();
        DrawingCanvas drawingCanvas = new DrawingCanvas(weight, height);
        // устанавливает размер окна в пикселях
        jFrame.setSize(weight, height);
        // устанавливает заголовок в верхней части окна
        jFrame.setTitle("Светофор");
        // добавляем в окно элементы
        jFrame.add(drawingCanvas);
        // для установки реакции на закрытие окна JFrame
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // окно становится видимым и пользователь может взаимодействовать с ним
        jFrame.setVisible(true);
        // метод программной перерисовки repaint() для стандартных компонентов
        drawingCanvas.repaint();
    }
}
