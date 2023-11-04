package pz_19;

import javax.swing.*;

public class JOptionPanel {
    public static void main(String[] args) {
        JFrame mainWindow = new JFrame("Главное окно");
        mainWindow.setSize(300, 150);
        mainWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainWindow.setVisible(true);

        mainWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                int choice = JOptionPane.showConfirmDialog(null, "Вы уверены, что хотите закрыть приложение?", "Подтверждение", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    mainWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
    }
}
