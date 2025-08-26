// ==============================
//  Windows
// ==============================

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }

        JFrame frame = new JFrame("LookAndFeel - Windows");
        JPanel panel = new JPanel();
        panel.add(new JButton("Botón"));
        panel.add(new JTextField("Texto"));

        frame.setContentPane(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
