
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("GlassPane");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);

        JLabel etiqueta = new JLabel("Hacé clic en cualquier parte", SwingConstants.CENTER);
        ventana.add(etiqueta, BorderLayout.CENTER);

        JPanel glassPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(0, 0, 255, 80));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        glassPane.setOpaque(false);
        glassPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText("Clic detectado en GlassPane: " + e.getX() + ", " + e.getY());
            }
        });

        ventana.setGlassPane(glassPane);
        glassPane.setVisible(true);

        ventana.setVisible(true);
    }
}
