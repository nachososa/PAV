
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Crear un JFrame con título "Prueba"
        JFrame ventana = new JFrame("Prueba");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Obtener el contenedor del JFrame
        Container c = ventana.getContentPane();

        // Agregar un JLabel con texto
        c.add(new JLabel("Hola", SwingConstants.CENTER)); // Centrar texto

        // Establecer tamaño mínimo
        ventana.setSize(500, 500);

        // Centrar ventana en la pantalla
        ventana.setLocationRelativeTo(null);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
