package pz_25;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class AppForRegistrationChelovekov extends JFrame {

    public AppForRegistrationChelovekov() {
        UIFSTFF(); // главный метод
    }

    private void UIFSTFF() {
        // Окошечко приветствия
        String welcomeMessage = "Доброе утречко! Хотите зарегистрироваться?";
        // showConfirmDialog используется для отображения диалогового окна с вариантами ответа "Да" и "неДа"
        int welcomeResult = JOptionPane.showConfirmDialog(this,
                welcomeMessage, "PrivetikiGuns", JOptionPane.YES_NO_OPTION);

        if (welcomeResult == JOptionPane.NO_OPTION) {
            // если нажали "Нет", закругляемся
            System.exit(0);
        }

        // окошечко ввода логина
        String username = "";
        // так как пользователь ОБЯЗАН ввести свой логин, то замучаем его вхиле труе
        while (true) {
            username = JOptionPane.showInputDialog(this,
                    "Введите логин (больше 5 символов, без пробелов):");
            if (username != null && username.length() > 5 && !username.contains(" ")) {
                break;
            }
        }

        // окошечко ввода пароля
        String password = "";
        // замучаем его вхиле труе x2 пока не введёт нормально 😡
        while (true) {
            JPasswordField passwordField = new JPasswordField();
            Object[] passwordPanel = {"Введите пароль (больше 8 символов, без пробелов, с цифрой и буквой):", passwordField};

            int passwordResult = JOptionPane.showConfirmDialog(this, passwordPanel,
                    "Парольчик мэн", JOptionPane.OK_CANCEL_OPTION);

            if (passwordResult == JOptionPane.OK_OPTION) {
                password = new String(passwordField.getPassword());

                // используем регулярочку для проверки пароля (хотя бы одну цифру и хотя бы одну букву)
                if (password.length() > 8 && !password.contains(" ")
                        && password.matches(".*\\d.*") && password.matches(".*[a-zA-Z].*")) {
                    break;
                }
            }
        }

        // окошечко повторного ввода пароля (проверка на пямять), замучаем его вхиле труе x3
        String confirmPassword = "";

        while (true) {
            JPasswordField confirmPasswordField = new JPasswordField();
            Object[] confirmPasswordPanel = {"Повторите пароль:", confirmPasswordField};
            int confirmPasswordResult = JOptionPane.showConfirmDialog(this, confirmPasswordPanel,
                    "Повторите пароль", JOptionPane.OK_CANCEL_OPTION);

            if (confirmPasswordResult == JOptionPane.OK_OPTION) {
                confirmPassword = new String(confirmPasswordField.getPassword());

                if (confirmPassword.equals(password)) {
                    break;
                }
            }
        }

        // информационное окошечко об успешной регистрации
        JOptionPane.showMessageDialog(this, "Регистрация успешно завершена!",
                "Успешный успех", JOptionPane.INFORMATION_MESSAGE);

        // завершаем программу после успешного успеха регистрации
        System.exit(0);
    }
}
