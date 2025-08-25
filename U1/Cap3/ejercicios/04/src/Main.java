// ==============================
// BorderLayout
// ==============================

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout(5, 5));

        frame.add(new JButton("Norte"), BorderLayout.NORTH);
        frame.add(new JButton("Sur"), BorderLayout.SOUTH);
        frame.add(new JButton("Este"), BorderLayout.EAST);
        frame.add(new JButton("Oeste"), BorderLayout.WEST);
        frame.add(new JButton("Centro"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
