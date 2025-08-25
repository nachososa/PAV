// ==============================
// Absolute Layout (coordenadas absolutas)
// ==============================

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Absolute Layout");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Desactiva cualquier LayoutManager

        JButton b1 = new JButton("Botón 1");
        b1.setBounds(30, 30, 100, 30); // x, y, ancho, alto

        JButton b2 = new JButton("Botón 2");
        b2.setBounds(150, 80, 100, 30);

        frame.add(b1);
        frame.add(b2);

        frame.setVisible(true);
    }
}
