
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("JDesktopPane y JInternalFrame");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 400);

        JDesktopPane desktop = new JDesktopPane();

        JInternalFrame internalFrame = new JInternalFrame("Ventana Interna", true, true, true, true);
        internalFrame.setSize(200, 150);
        internalFrame.setLocation(50, 50);
        internalFrame.setVisible(true);

        desktop.add(internalFrame);
        ventana.add(desktop);

        ventana.setVisible(true);
    }
}
