import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Crear un JFrame
        JFrame frame = new JFrame("Ejemplo Internal JOptionPane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un desktop pane (contenedor para internal frames)
        JDesktopPane desktop = new JDesktopPane();
        frame.setContentPane(desktop);

        // Crear un internal frame
        JInternalFrame internal = new JInternalFrame("Ventana Interna", true, true, true, true);
        internal.setSize(300, 200);
        internal.setVisible(true);
        desktop.add(internal);

        // Mostrar un cuadro interno de información
        JOptionPane.showInternalMessageDialog(
            internal.getContentPane(),
            "Este es un cuadro de diálogo interno",
            "Mensaje Interno",
            JOptionPane.INFORMATION_MESSAGE
        );

        frame.setVisible(true);
    }
}
