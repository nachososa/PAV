// MouseListener en un JPanel

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseListener");
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);

        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clic en (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Ratón entró en el panel");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Ratón salió del panel");
            }
        });

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
