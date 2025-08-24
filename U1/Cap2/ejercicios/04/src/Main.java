
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Crear una ventana sin bordes (JWindow)
        JWindow window = new JWindow();
        window.setSize(300, 150);

        // Crear un panel con un mensaje
        JPanel panel = new JPanel();
        panel.add(new JLabel("¡Hola! Esta es una JWindow."));
        window.add(panel);

        // Centrar en pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation((pantalla.width - 300) / 2, (pantalla.height - 150) / 2);

        // Mostrar la ventana
        window.setVisible(true);

        // Cerrar automáticamente después de 3 segundos
        new Timer(3000, e -> window.dispose()).start();
    }
}
