
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Varios JPanel");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setLayout(new BorderLayout());

        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(Color.RED);
        panelNorte.add(new JLabel("Norte"));

        JPanel panelCentro = new JPanel(new GridLayout(2, 2));
        panelCentro.setBackground(Color.WHITE);
        panelCentro.add(new JButton("1"));
        panelCentro.add(new JButton("2"));
        panelCentro.add(new JButton("3"));
        panelCentro.add(new JButton("4"));

        JPanel panelSur = new JPanel();
        panelSur.setBackground(Color.BLUE);
        panelSur.add(new JLabel("Sur"));

        ventana.add(panelNorte, BorderLayout.NORTH);
        ventana.add(panelCentro, BorderLayout.CENTER);
        ventana.add(panelSur, BorderLayout.SOUTH);

        ventana.setVisible(true);
    }
}
