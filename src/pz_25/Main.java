package pz_25;


import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // запускаем графический интерфейс в отдельном потоке (23 pz)
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AppForRegistrationChelovekov registrationApp = new AppForRegistrationChelovekov();
                registrationApp.setSize(400, 200);
                registrationApp.setTitle("Регистрация человекоинопланетян");
                registrationApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                registrationApp.setLocationRelativeTo(null);
                registrationApp.setVisible(true);
            }
        });
    }
}