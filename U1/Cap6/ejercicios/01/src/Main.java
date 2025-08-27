// ActionListener en un JButton

import java.awt.event.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener");
        JButton boton = new JButton("Haz clic");

        boton.addActionListener((ActionEvent e) -> {
            System.out.println("Botón presionado");
        });

        frame.add(boton);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
