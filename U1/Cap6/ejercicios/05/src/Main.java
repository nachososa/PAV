// WindowListener en un JFrame

import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("WindowListener");

        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Ventana abierta");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Cerrando ventana");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Ventana cerrada");
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
