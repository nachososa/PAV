
import java.awt.*;
import javax.swing.*;

public class Main extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujar en JPanel");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 300);

        Main panelDibujo = new Main();
        ventana.add(panelDibujo);

        ventana.setVisible(true);
    }
}
