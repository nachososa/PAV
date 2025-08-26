
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("JLayeredPane");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);

        JLayeredPane layeredPane = ventana.getLayeredPane();

        JButton botonAbajo = new JButton("Capa Inferior");
        botonAbajo.setBounds(50, 50, 150, 50);

        JButton botonArriba = new JButton("Capa Superior");
        botonArriba.setBounds(100, 80, 150, 50);

        layeredPane.add(botonAbajo, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(botonArriba, JLayeredPane.POPUP_LAYER);

        ventana.setVisible(true);
    }
}
