package pz_21;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int weight = 900, height = 800;
        JFrame jFrame = new JFrame();
        DrawingCanvas drawingCanvas = new DrawingCanvas(weight, height);
        jFrame.setSize(weight, height);
        jFrame.setTitle("Светофор");
        jFrame.add(drawingCanvas);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        drawingCanvas.repaint();
    }
}
