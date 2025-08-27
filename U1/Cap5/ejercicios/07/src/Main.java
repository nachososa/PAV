// Ejercicio 8 – Menús y JOptionPane

import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 8");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");
        JMenuItem item1 = new JMenuItem("Saludar");
        JMenuItem item2 = new JMenuItem("Salir");

        item1.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "¡Hola desde el menú!");
        });

        item2.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        menu.add(item1);
        menu.add(item2);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
