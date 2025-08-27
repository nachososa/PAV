// Ejercicio 4 – JComboBox y JList

import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        String[] frutas = {"Manzana", "Banana", "Naranja", "Uva"};
        JComboBox<String> comboBox = new JComboBox<>(frutas);

        String[] paises = {"Argentina", "Chile", "Brasil", "Uruguay"};
        JList<String> list = new JList<>(paises);

        JButton button = new JButton("Mostrar selección");
        JLabel label = new JLabel("Selecciona algo...");

        button.addActionListener((ActionEvent e) -> {
            String fruta = (String) comboBox.getSelectedItem();
            String pais = list.getSelectedValue();
            label.setText("Fruta: " + fruta + " | País: " + pais);
        });

        JPanel panel = new JPanel();
        panel.add(comboBox);
        panel.add(new JScrollPane(list));
        panel.add(button);
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);
    }
}
