
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo JPanel");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel con layout FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // Agregar botones al panel
        panel.add(new JButton("Botón 1"));
        panel.add(new JButton("Botón 2"));
        panel.add(new JButton("Botón 3"));

        // Agregar el panel al JFrame
        ventana.add(panel);

        ventana.setVisible(true);
    }
}
