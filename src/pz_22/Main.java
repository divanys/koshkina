package pz_22;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Main extends Canvas {
    static int width = 750, height = 750;//размеры окна

    public static void main(String[] args) throws IOException {
        //ДЛЯ ПОЯВЛЕНИЯ ОКОШКА С НУЖНЫМИ НАМ ПАРАМЕТРАМИ РАЗМЕРА
        JFrame frame = new JFrame();
        frame.setVisible(true); // окошко
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //для его закрытия
        frame.setTitle("логотип DVD");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height + 30);
        frame.getContentPane().setLayout(null);
        //выравнивание, чтобы координаты объектов в дальнейшем считались от верхнего левого угла
        frame.getContentPane().setBackground(Color.BLACK);//фон окна
        //ДОБАВЛЕНИЕ КАРТИНКИ И УСТАНОВКА ПОЯВЛЕНИЯ
        BufferedImage screamHead = ImageIO.read
                (new URL(" https://www.dvdland.com .au/product_images/p/196/dvd_7__69128_std.jpg"));
        //скачиваем картинку
        int screamHeadWidth = screamHead.getWidth();
        //запоминаем ее размер (понадобится, когда будем двигать JLabel)
        int screamHeadHeight = screamHead.getHeight();
        //запоминаем ее размер (понадобится, когда будем двигать JLabel)
        JLabel wIcon = new JLabel(new ImageIcon(screamHead));
        //создаем объект с картинкой, который будем размещать и двигать
        int startX = (int) (Math.random() * (width - screamHeadWidth)),
                startY = (int) (Math.random() * (height - screamHeadHeight));//рандомно задаем новые координаты
        wIcon.setBounds(startX, startY, screamHeadWidth, screamHeadHeight);//устанавливаем начальное положение картинки
        frame.add(wIcon);//добавляем картинку на форму
        //ДЕЛАЕМ БЕСКОНЕЧНЫЙ ЦИКЛ ПЕРЕМЕЩЕНИЯ КАРТИНКИ
        while (true) {
            int newX = (int) (Math.random() * (width - screamHeadWidth)),
                    newY = (int) (Math.random() * (height - screamHeadHeight));//задаем новую То4ку.
            int[][] path = drawBresenhamLine(startX, startY, newX, newY);
            //по апгоритму Брезенхама долучаем дуть (список координат к новой точке)
            startX = newX;//обновляем точки
            startY = newY;
            for (int i = 5; i < path.length; i += 5) {//идем по массиву точек с нужным шагом
                try {//сперва работает таймер
                    Thread.sleep(20);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    wIcon.setBounds(path[i][0], path[i][1], screamHeadWidth,
                            screamHeadHeight);
                    //перемещаем картинку в нужную точку
                    wIcon.repaint();//перерисовываем картинку
                }
            }
        }
    }

    public static int[][] drawBresenhamLine(int xstart, int ystart, int xend, int yend) {//pеализация
        // подсчета координат линии между двумя точками в пространстве,
        // по алгоритму Брезенхэма,
        // взято с https://ru.wikibooks.org/wiki /Реализации_алгоритмов/Алгоритм_Брезенхзма#Реализация_на_Java
/*
    xstart, ustart - начало;
    xend, yend - конец;
    "g.drawLine (x, y, x, y);" используем в качестве "setPixel (x, y);"
    Можно писать что-нибудь вроде g fillRect (x, у, 1, 1);
    */
        int x, y, dx, dy, incx, incy, pdx, pdy, es, el, err;

        dx = xend - xstart;//проекция на ось икс
        dy = yend - ystart;//проекция на ось игрек

        incx = sign(dx);
        /*
         * Определяем, в какую сторону нужно будет сдвигаться.
         * Если dx < 0, т.е. отрезок идёт
         * справа налево по иксу, то incx будет равен -1.
         * Это будет использоваться в цикле постороения.
         */

        incy = sign(dy);
        /*
         *  Аналогично. Если рисуем отрезок снизу вверх -
         * это будет отрицательный сдвиг для у (иначе - положительный).
         * */
        if (dx < 0) dx = -dx;//далее мы будем сравнивать: "if (dx < dy)"
        if (dy < 0) dy = -dy;//поэтому необходимо сделать dx = |dx|; dy = |dy|
        //эти две строчки можно записать и так: dx = Math.abs(dx); dy = Math.abs(dy);
        if (dx > dy) {
            //определяем наклон отрезка:
        /*
        * Если dx > dy, то значит отрезок "вытянут" вдоль оси икс, т.е. он скорее длинный, чем высокий.
        * Значит в цикле нужно будет идти по икс (строчка el = dx;), значит "протягивать"
        дрямую по иксу
        * надо в соответствии с тем, слева направо и справа налево она идёт (pdx = incx;), при этом
        *
        по у сдвиг такой отсутствует.
        */
            pdx = incx;
            pdy = 0;
            es = dy;
            el = dx;
        } else//случай, когда прямая скорее "высокая", чем длинная, т.е. вытянута по оси у
        {
            pdx = 0;
            pdy = incy;
            es = dx;
            el = dy;//тогда в цикле буден двигаться по у
        }
        x = xstart;
        y = ystart;
        err = el / 2;
        int[][] a = new int[el + 1][2];//создаем массие для хранения точек
        a[0][0] = x;//заносии первую Точку
        a[0][1] = y;
        //все последующие тонки возможно надо сдвигаль, постому первую ставии вне цикла
        for (int t = 0; t < el; t++) { //идём по всем точкам, начиная со второй и до последней
            err -= es;
            if (err < 0) {
                err += el;
                x += incx;//сдвинуть прямую (сместить вверх или вние, если цикл
                y += incy;//или сместить влево-вправо, соли цикл проходит по у проходит по иксам)
            } else {
                x += pdx;//дродолкить дянуть прямую дольце, т.е. сдвинуть влево или впрово,
                y += pdy;//цикл идёт по иксу; сдвинуть вверх или вниз, если по у
            }
            a[t + 1][0] = x;//добавляем дочку в нассив
            a[t + 1][1] = y;
        }
        return a;
    }

    // Метод для drawBresenhamLine - этот код "рисует" все 9 видов отрезков. Наклонные (из начала конец и из конца в
// начало каждый), вертикальный и горизонтальный - тоже из начала в конец и из конца в начало, и точку.
    private static int sign(int x) {
        return Integer.compare(x, 0);
        //возвращает 0, если аргумент (x) равен нулю;
    }
}