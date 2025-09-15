package productos;

import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class ProductosFrame extends JFrame {
    private JTextField txtRuta;
    private JButton btnBuscar, btnImportar;
    private JTable tabla;
    private ProductoTableModel modelo;

    public ProductosFrame() {
        super("Lista de Productos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(960, 600);
        setLayout(new BorderLayout());

        // Panel contenedor principal con padding de 60px
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBorder(new EmptyBorder(60, 60, 60, 60));

        // Panel superior (selector de archivo)
        JPanel panelSuperior = new JPanel(new BorderLayout(5, 5));

        txtRuta = new JTextField();
        btnBuscar = new JButton("...");
        btnImportar = new JButton("Importar datos de txt");

        JPanel panelBotones = new JPanel(new BorderLayout());
        panelBotones.add(btnBuscar, BorderLayout.EAST);

        panelSuperior.add(new JLabel("Seleccione un archivo txt"), BorderLayout.NORTH);
        panelSuperior.add(txtRuta, BorderLayout.CENTER);
        panelSuperior.add(panelBotones, BorderLayout.EAST);
        panelSuperior.add(btnImportar, BorderLayout.SOUTH);

        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);

        // Tabla
        modelo = new ProductoTableModel(new File("productos.csv"));
        tabla = new JTable(modelo);
        tabla.setFillsViewportHeight(true);
        tabla.setRowHeight(25);

        // Ajustes de columnas
        tabla.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(350);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(80);

        // Alinear precio a la derecha
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        tabla.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

        panelPrincipal.add(new JScrollPane(tabla), BorderLayout.CENTER);

        add(panelPrincipal); // agregamos el panel principal a la ventana

        // Acción botón "..."
        btnBuscar.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int opcion = fileChooser.showOpenDialog(this);
            if (opcion == JFileChooser.APPROVE_OPTION) {
                File archivo = fileChooser.getSelectedFile();
                txtRuta.setText(archivo.getAbsolutePath());
            }
        });

        // Acción botón "Importar"
        btnImportar.addActionListener(e -> {
            String ruta = txtRuta.getText();
            if (ruta.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un archivo primero.");
                return;
            }
            File archivo = new File(ruta);
            modelo = new ProductoTableModel(archivo);
            tabla.setModel(modelo);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ProductosFrame().setVisible(true);
        });
    }
}
