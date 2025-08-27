// Ejercicio 3 – JCheckBox y JRadioButton

import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);

        JCheckBox checkBox = new JCheckBox("Acepto términos");
        JRadioButton r1 = new JRadioButton("Opción A");
        JRadioButton r2 = new JRadioButton("Opción B");
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        JLabel label = new JLabel("Selecciona algo...");

        JButton button = new JButton("Confirmar");
        button.addActionListener((ActionEvent e) -> {
            String msg = "";
            if (checkBox.isSelected()) {
                msg += "✔ Términos aceptados. ";
            }
            if (r1.isSelected()) {
                msg += "✔ Elegiste Opción A.";
            }
            if (r2.isSelected()) {
                msg += "✔ Elegiste Opción B.";
            }
            label.setText(msg);
        });

        JPanel panel = new JPanel();
        panel.add(checkBox);
        panel.add(r1);
        panel.add(r2);
        panel.add(button);
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);
    }
}
