package pz_21;

import java.awt.*;
import java.awt.geom.Path2D;

public class Light {
    private final Color color;
    private final int y;

    public Light(Color color, int y) {
        this.color = color;
        this.y = y;
    }

    public void drawLight(Graphics2D g2d) {
        g2d.setColor(Color.WHITE); // Устанавливает цвет для фона светофора
        g2d.fillOval(315, -20, 100, 100); // Рисует белый фон светофора
        g2d.setColor(Color.DARK_GRAY); // Устанавливает цвет для обводки светофора
        g2d.fillOval(315, -8, 100, 100); // Рисует обводку светофора
        g2d.setColor(color); // Устанавливает цвет для сигнала светофора (красный, желтый, зеленый)
        g2d.fillOval(315, y, 90, 90);  // Рисует сигнал светофора на соответствующей вертикальной позиции
    }

    public void drawEar(Graphics2D g2d) {
        int x = 440;
        int x2 = 290;

        g2d.setColor(Color.DARK_GRAY); // Устанавливает цвет для рисования

        // right ear
        Path2D.Double ear = new Path2D.Double();

        ear.moveTo(x, y + 59); // Устанавливает начальную точку правого
        ear.lineTo(x, y + 4); // Рисует верхнюю границу правого
        ear.quadTo(x, y - 1, x + 5, y - 1); // Рисует кривую верхнюю часть правого
        ear.lineTo(x + 60, y - 1); // Рисует горизонтальную линию верхней части правого
        ear.quadTo(x + 65, y - 1, x + 65, y - 6);  // Рисует кривую нижнюю часть правого
        ear.lineTo(x + 5, y + 64); // Рисует нижнюю границу правого
        ear.quadTo(x, y + 64, x, y + 59); // Рисует кривую нижнюю часть правого

        g2d.fill(ear); // Заполняет правое ухо указанным цветом

        // left ear
        Path2D.Double ear1 = new Path2D.Double();

        ear1.moveTo(x2, y + 59);
        ear1.lineTo(x2, y + 4);
        ear1.quadTo(x2, y - 1, x2 - 5, y - 1);
        ear1.lineTo(x2 + 60, y - 1);
        ear1.quadTo(x2 + 65, y - 1, x2 - 65, y + 6);
        ear1.lineTo(x2 - 5, y + 64);
        ear1.quadTo(x2, y + 64, x2, y + 59);

        g2d.fill(ear1);
    }
}
