package pz_23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends JFrame {
    // serialVersionUID для контроля версий сериализации какой-то
    private static final long serialVersionUID = 1L;

    // текстовое поле для ввода
    private JTextField textField;
    // кнопки
    private JButton button1;
    private JButton button2;
    private JButton button3;

    // конструктор класса
    public TestFrame() {
        super("Test frame"); // устанавливаем заголовок окна
        createGUI(); // вызываем метод создания пользовательского интерфейса
    }

    // метод создания графического интерфейса
    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие приложения при закрытии окна
        JPanel panel = new JPanel(); // создаем панель для компоновки элементов
        panel.setLayout(new FlowLayout()); // устанавливаем менеджер компоновки

        // создаем кнопку 1
        button1 = new JButton("Button 1");
        button1.setActionCommand("Button 1 was pressed"); // устанавливаем команду действия
        panel.add(button1); // добавляем кнопку на панель

        // создаем кнопку 2
        button2 = new JButton("Button 2");
        button2.setActionCommand("Button 2 was pressed");
        panel.add(button2);

        // создаем кнопку 3
        button3 = new JButton("Button 3");
        button3.setActionCommand("Button 3 was pressed");
        panel.add(button3);

        // создаем текстовое поле
        textField = new JTextField();
        textField.setColumns(23); // устанавливаем количество колонок (я всё подобное использовала в калькуляторе 😎)
        panel.add(textField); // добавляем текстовое поле на панель

        // создаем слушатель действий и добавляем его ко всем кнопкам
        ActionListener actionListener = new TestActionListener();
        // добавляет слушателя действий к компоненту, который реагирует на событие
        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);

        // добавляем панель на контентное окно
        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 100)); // устанавливаем предпочтительные размеры окна
    }

    // внутренний класс для обработки действий кнопок
    public class TestActionListener implements ActionListener {
        // устанавливаем текст в текстовом поле при действии кнопки
        public void actionPerformed(ActionEvent e) {
            textField.setText(e.getActionCommand()); // устанавливаем текст в текстовом поле

            JButton button = (JButton) e.getSource(); // получаем источник события как кнопку

            // выводим информацию о нажатой кнопке в консоль
            System.out.println(button.getText() + ", " + e.getActionCommand());

            // проверяем, что источник события не равен кнопке button3
            if (e.getSource() != button3) {
                textField.setText(e.getActionCommand()); // устанавливаем текст в текстовом поле
            } else {
                // создаем событие программно для кнопки button2
                ActionEvent e1 = new ActionEvent(button2, Event.MOUSE_DOWN, "Круассан 2 was pressed programmatically!!!😍");

                // получаем массив слушателей для кнопки button2
                ActionListener[] listeners;
                listeners = button2.getActionListeners();

                // вызываем метод actionPerformed у первого слушателя кнопки button2
                listeners[0].actionPerformed(e1);
            }
        }
    }


    public static void main(String[] args) {
        // запускаем графический интерфейс в отдельном потоке
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                TestFrame testFrame = new TestFrame();
                // устанавливает размеры окна в соответствии с заданными значениями
                testFrame.pack();
                // устанавливает положение окна относительно компонента-владельца (null - по центру экрана)
                testFrame.setLocationRelativeTo(null);
                testFrame.setVisible(true); // устанавливаем видимость окна
            }
        });
    }
}
