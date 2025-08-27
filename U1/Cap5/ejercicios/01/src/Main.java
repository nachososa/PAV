// Ejercicio 1 – Ventana simple con JLabel y JButton

import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JLabel label = new JLabel("Texto inicial");
        JButton button = new JButton("Cambiar texto");

        button.addActionListener((ActionEvent e) -> {
            label.setText("¡Texto cambiado!");
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
