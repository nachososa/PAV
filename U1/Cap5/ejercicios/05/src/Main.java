// Ejercicio 5 – JSlider y JProgressBar

import javax.swing.*;
import javax.swing.event.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JSlider slider = new JSlider(0, 100, 50);
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(50);

        slider.addChangeListener((ChangeEvent e) -> {
            progressBar.setValue(slider.getValue());
        });

        JPanel panel = new JPanel();
        panel.add(slider);
        panel.add(progressBar);

        frame.add(panel);
        frame.setVisible(true);
    }
}
