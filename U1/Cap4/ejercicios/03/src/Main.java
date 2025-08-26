
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("GridLayout");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 300);

        ventana.setLayout(new GridLayout(2, 2)); // 2 filas, 2 columnas
        ventana.add(new JButton("1"));
        ventana.add(new JButton("2"));
        ventana.add(new JButton("3"));
        ventana.add(new JButton("4"));

        ventana.setVisible(true);
    }
}
