package pz_24;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса JOptionPaneTest
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JOptionPaneTest();
            }
        });
    }
}