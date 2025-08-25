// ==============================
// GridLayout
// ==============================

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(2, 3, 5, 5)); // 2 filas, 3 columnas, espacio 5px

        for (int i = 1; i <= 6; i++) {
            frame.add(new JButton("Botón " + i));
        }

        frame.setVisible(true);
    }
}
