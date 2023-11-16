package pz_24;

import javax.swing.*;
import java.awt.event.*;

public class JOptionPaneTest extends JFrame {
    private JPanel contents = null;
    private JButton btnMessage1 = null;
    private JButton btnMessage2 = null;
    private JButton btnMessage3 = null;
    private JButton btnConfirm1 = null;
    private JButton btnConfirm2 = null;
    private JButton btnConfirm3 = null;
    private JButton btnInput1 = null;
    private JButton btnInput2 = null;
    private JButton btnInput3 = null;
    private ImageIcon icon = null;
    private final String TITLE_message = "Окно сообщения";
    private final String TITLE_confirm = "Окно подтверждения";
    private String[] drink = {"Сок", "Минералка", "Лимонад", "Пиво"};

    public JOptionPaneTest() {
        super("Пример использования JOptionPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Локализация кнопок
        UIManager.put("OptionPane.yesButtonText", "Да");
        UIManager.put("OptionPane.noButtonText", "Нет");
        UIManager.put("OptionPane.cancelButtonText", "Отмена");

        contents = new JPanel();
        // Иконка для отображения в окне сообщений
        icon = new ImageIcon("/home/divan/IdeaProjects/koshkina/src/pz_24/images/warning.png");

        // Кнопка формирования окна по 2-м параметрам
        btnMessage1 = new JButton("MessageDialog 2");
        // Кнопка формирования окна по 4-м параметрам
        btnMessage2 = new JButton("MessageDialog 4");
        // Кнопка формирования окна по 5-и параметрам
        btnMessage3 = new JButton("MessageDialog 5");

        // Кнопки вывода сообщений подтверждения
        btnConfirm1 = new JButton("ConfirmDialog 4+2");
        btnConfirm2 = new JButton("ConfirmDialog 5");
        btnConfirm3 = new JButton("ConfirmDialog 6");

        // создаём три объекта кнопок (JButton) с различными текстовыми метками для каждой кнопки
        btnInput1 = new JButton("InputDialog 2+3");
        btnInput2 = new JButton("InputDialog 4");
        btnInput3 = new JButton("InputDialog 7");

        addMessageListeners(); //Добавляет слушателей событий к кнопкам, относящимся к отображению диалоговых окон сообщений.
        addConfirmListeners(); //Добавляет слушателей событий к кнопкам, относящимся к отображению диалоговых окон подтверждения.
        addInputListeners(); //Добавляет слушателей событий к кнопкам, относящимся к отображению диалоговых окон ввода данных.

        // Размещение кнопок в интерфейсе
        contents.add(btnMessage1);
        contents.add(btnMessage2);
        contents.add(btnMessage3);

        contents.add(btnConfirm1);
        contents.add(btnConfirm2);
        contents.add(btnConfirm3);

        contents.add(btnInput1);
        contents.add(btnInput2);
        contents.add(btnInput3);

        setContentPane(contents);
        // Вывод окна на экран
        setSize(500, 140);
        setVisible(true);
    }

    // Методы для добавления слушателей к кнопкам сообщений
    private void addMessageListeners() {
        // Слушатель для btnMessage1
        btnMessage1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение простого сообщения с разметкой HTML
                JOptionPane.showMessageDialog(JOptionPaneTest.this, "<html><h2>Текст</h2><i>в виде разметки HTML</i>");
            }
        });
        // Слушатель для btnMessage2
        btnMessage2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение сообщения из массива строк с указанием заголовка и типа сообщения
                JOptionPane.showMessageDialog(JOptionPaneTest.this, new String[]{"Сообщение в виде массива строк :", " - первая строка", " - вторая строка"}, TITLE_message, JOptionPane.ERROR_MESSAGE);
            }
        });
        // Слушатель для btnMessage3
        btnMessage3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение сообщения с изображением и указанием заголовка и типа сообщения
                JOptionPane.showMessageDialog(JOptionPaneTest.this, "Использование изображения в окне сообщений", TITLE_message, JOptionPane.INFORMATION_MESSAGE, icon);
            }
        });
    }

    // Методы для добавления слушателей к кнопкам подтверждения
    private void addConfirmListeners() {
        // Слушатель для btnConfirm1
        btnConfirm1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение окна подтверждения с тремя вариантами ответа
                int result = JOptionPane.showConfirmDialog(JOptionPaneTest.this, "Вам это нужно?", TITLE_confirm, JOptionPane.YES_NO_CANCEL_OPTION);
                // Вывод дополнительного сообщения в зависимости от выбора пользователя
                if (result == JOptionPane.YES_OPTION)
                    JOptionPane.showConfirmDialog(JOptionPaneTest.this, "Вы не отказываетесь?");
                else if (result == JOptionPane.NO_OPTION)
                    JOptionPane.showConfirmDialog(JOptionPaneTest.this, "Вы отказались?");
            }
        });
        // Слушатель для btnConfirm2
        btnConfirm2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение окна подтверждения с двумя вариантами ответа и иконкой предупреждения
                JOptionPane.showConfirmDialog(JOptionPaneTest.this, "Вы не отказываетесь?", TITLE_confirm, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            }
        });
        // Слушатель для btnConfirm3
        btnConfirm3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение окна подтверждения с выбором иконки и указанием заголовка
                JOptionPane.showConfirmDialog(JOptionPaneTest.this, "Вам нравится значок?", TITLE_confirm, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, icon);
            }
        });
    }

    // Методы для добавления слушателей к кнопкам ввода данных
    private void addInputListeners() {
        // Слушатель для btnInput1
        btnInput1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение диалогового окна ввода данных с HTML-сообщением и выводом введенных данных
                String result = JOptionPane.showInputDialog(JOptionPaneTest.this, "<html><h2>Добро пожаловать");
                JOptionPane.showInputDialog(JOptionPaneTest.this, "Вы ответили", result);
            }
        });
        // Слушатель для btnInput2
        btnInput2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Диалоговое окно ввода данных : родитель, сообщение в виде
                // массива строк, тип диалогового окна (иконки)
                JOptionPane.showInputDialog(JOptionPaneTest.this, new String[]{"Неверно введен пароль!", "Повторите пароль :"}, "Авторизация", JOptionPane.WARNING_MESSAGE);
            }
        });
        // Слушатель для btnInput3
        btnInput3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Диалоговое окно ввода данных
                Object result = JOptionPane.showInputDialog(JOptionPaneTest.this, "Выберите любимый напиток :", "Выбор напитка", JOptionPane.QUESTION_MESSAGE, icon, drink, drink[0]);
                // Диалоговое окно вывода сообщения
                JOptionPane.showMessageDialog(JOptionPaneTest.this, result);
            }
        });
    }
}