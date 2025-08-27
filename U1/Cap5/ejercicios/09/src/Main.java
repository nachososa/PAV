// Ejercicio 10 – Mini aplicación integradora (MVC simple)

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 10 - Mini App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Barra de menú
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Archivo");
        JMenuItem salir = new JMenuItem("Salir");
        salir.addActionListener(e -> System.exit(0));
        menu.add(salir);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // Formulario
        JPanel formPanel = new JPanel(new GridLayout(3, 2));
        JTextField nombreField = new JTextField();
        JTextField edadField = new JTextField();
        JButton guardarBtn = new JButton("Guardar");
        formPanel.add(new JLabel("Nombre:"));
        formPanel.add(nombreField);
        formPanel.add(new JLabel("Edad:"));
        formPanel.add(edadField);
        formPanel.add(guardarBtn);

        // Área de salida
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        // TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Formulario", formPanel);
        tabbedPane.addTab("Resultados", scrollPane);

        // Acción botón
        guardarBtn.addActionListener((ActionEvent e) -> {
            String nombre = nombreField.getText();
            String edad = edadField.getText();
            textArea.append("Nombre: " + nombre + ", Edad: " + edad + "\n");
            nombreField.setText("");
            edadField.setText("");
        });

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
