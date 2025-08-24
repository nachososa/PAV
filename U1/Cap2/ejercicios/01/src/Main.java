
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Crear un objeto de tipo JFrame
        JFrame ventana = new JFrame("Mi primera ventana JFrame");

        // Tamaño de la ventana
        ventana.setSize(400, 300);

        // Cerrar aplicación al cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Permite cambiar tamaño
        ventana.setResizable(true);

        // Centrar ventana en la pantalla
        ventana.setLocationRelativeTo(null);

        // Agregar un botón simple
        JButton boton = new JButton("Clic aquí");
        ventana.add(boton);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
};
