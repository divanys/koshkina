package pz_21;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;


public class DrawingCanvas extends JComponent {
    private final int weight;
    private final int height;
    private final Light red = new Light(Color.RED, 270);
    private final Light yellow = new Light(Color.YELLOW, 380);
    private final Light green = new Light(Color.GREEN, 490);

    public DrawingCanvas(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;

        // body
        graphics2D.setColor(Color.DARK_GRAY); // Устанавливает цвет для тела светофора
        // fillRoundRect Используется для рисования закрашенного (заполненного) прямоугольника с закругленными углам
        graphics2D.fillRoundRect(300, 240, 130, 360, 25, 25);
        graphics2D.fillRoundRect(335, 603, 60, 65, 15, 15);

        // lights
        red.drawLight(graphics2D);
        yellow.drawLight(graphics2D);
        green.drawLight(graphics2D);

        // hat

        Path2D.Double hat = new Path2D.Double();
        hat.moveTo(320, 230); // используется для создания пути
        hat.lineTo(410, 230); // используется для рисования линии от текущей позиции до указанной точки
        hat.quadTo(410.5, 225.5, 410, 225); // используется для рисования квадратичной кривой Безье
        hat.curveTo(390, 215, 330, 215, 320, 225); // используется для рисования кубической кривой Безье
        hat.quadTo(315.5, 225.5, 320, 230);
        graphics2D.setColor(Color.DARK_GRAY);
        graphics2D.fill(hat);

        // sideTriangles
        red.drawEar(graphics2D);
        yellow.drawEar(graphics2D);
        green.drawEar(graphics2D);
    }

    @Override
    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}