// ==============================
// BoxLayout
// ==============================

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Vertical

        panel.add(new JButton("Arriba"));
        panel.add(new JButton("Medio"));
        panel.add(new JButton("Abajo"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
