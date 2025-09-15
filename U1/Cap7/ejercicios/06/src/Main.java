// ItemListener en un JCheckBox

import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("ItemListener");
        JCheckBox check = new JCheckBox("Aceptar términos");

        check.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                System.out.println("Checkbox seleccionado");
            } else {
                System.out.println("Checkbox deseleccionado");
            }
        });

        frame.add(check);
        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
