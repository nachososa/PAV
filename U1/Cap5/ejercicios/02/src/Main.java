// Ejercicio 2 – Campos de texto y contraseña

import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);
        JButton button = new JButton("Mostrar");

        button.addActionListener((ActionEvent e) -> {
            String usuario = textField.getText();
            String pass = new String(passwordField.getPassword());
            JOptionPane.showMessageDialog(frame, "Usuario: " + usuario + "\nPassword: " + pass);
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Usuario:"));
        panel.add(textField);
        panel.add(new JLabel("Contraseña:"));
        panel.add(passwordField);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
