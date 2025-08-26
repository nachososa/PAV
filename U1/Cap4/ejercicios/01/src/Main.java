
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo JPanel");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 300);

        JPanel panelRojo = new JPanel();
        panelRojo.setBackground(Color.RED);

        ventana.add(panelRojo);
        ventana.setVisible(true);
    }
}
