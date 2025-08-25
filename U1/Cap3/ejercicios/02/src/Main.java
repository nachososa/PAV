// ==============================
// FlowLayout
// ==============================

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        frame.add(new JButton("Uno"));
        frame.add(new JButton("Dos"));
        frame.add(new JButton("Tres"));
        frame.add(new JButton("Cuatro"));
        frame.add(new JButton("Cinco"));

        frame.setVisible(true);
    }
}
