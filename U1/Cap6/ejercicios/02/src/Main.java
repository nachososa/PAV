// KeyListener en un JTextField

import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListener");
        JTextField campo = new JTextField(15);

        campo.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Tecla presionada: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }
        });

        frame.add(campo);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
