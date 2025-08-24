
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Componentes en Container");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(new JButton("Botón 1"));
        panel.add(new JButton("Botón 2"));

        // Agregar el panel al JFrame
        ventana.add(panel);

        // Obtener todos los componentes del panel
        Component[] componentes = panel.getComponents();
        for (Component c : componentes) {
            System.out.println("Componente: " + c.getClass().getSimpleName());
        }

        // Mostrar ventana
        ventana.setVisible(true);
    }
}
