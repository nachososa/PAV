
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Crear un JFrame principal
        JFrame ventana = new JFrame("Ventana principal");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un botón para abrir un JDialog
        JButton boton = new JButton("Abrir diálogo");
        ventana.add(boton);

        // Crear un JDialog modal
        JDialog dialogo = new JDialog(ventana, "Diálogo Modal", true);
        dialogo.setSize(200, 150);
        dialogo.setLocationRelativeTo(ventana);

        // Agregar un botón para cerrar el diálogo
        JButton cerrar = new JButton("Cerrar");
        cerrar.addActionListener(e -> dialogo.dispose());
        dialogo.add(cerrar);

        // Evento del botón para mostrar el diálogo
        boton.addActionListener(e -> dialogo.setVisible(true));

        ventana.setVisible(true);
    }
}
