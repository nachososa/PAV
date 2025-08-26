// ==============================
// Personalizado
// ==============================

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }

        // Cambios personalizados
        UIManager.put("Button.background", Color.ORANGE);
        UIManager.put("Button.foreground", Color.BLUE);
        UIManager.put("TextField.background", Color.YELLOW);
        UIManager.put("TextField.foreground", Color.RED);

        JFrame frame = new JFrame("LookAndFeel - Personalizado");
        JPanel panel = new JPanel();
        panel.add(new JButton("Botón"));
        panel.add(new JTextField("Texto"));

        frame.setContentPane(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
