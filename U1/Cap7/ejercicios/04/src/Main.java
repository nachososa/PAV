// MouseMotionListener

import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseMotionListener");
        JPanel panel = new JPanel();

        panel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Arrastrando en (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Moviendo en (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
