package productos;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class ProductoTableModel extends AbstractTableModel {

    private final List<Producto> productos;
    private final String[] columnas = {"Nombre", "Descripción", "Precio"};
    private final File archivo;

    public ProductoTableModel(File archivo) {
        this.archivo = archivo;
        this.productos = new ArrayList<>();
        crearArchivoSiNoExiste();
        cargarDesdeArchivo();
    }

    private void crearArchivoSiNoExiste() {
        if (!archivo.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
                bw.write("Teclado,Teclado mecánico,50.0\n");
                bw.write("Mouse,Mouse inalámbrico,30.0\n");
                bw.write("Monitor,Monitor 24 pulgadas,150.0\n");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "No se pudo crear el archivo: " + e.getMessage());
            }
        }
    }

    public void cargarDesdeArchivo() {
        productos.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    String nombre = partes[0];
                    String desc = partes[1];
                    double precio = Double.parseDouble(partes[2]);
                    productos.add(new Producto(nombre, desc, precio));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
        }
    }

    public void guardarEnArchivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Producto p : productos) {
                bw.write(p.getNombre() + "," + p.getDescripcion() + "," + p.getPrecio());
                bw.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + e.getMessage());
        }
    }

    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int col) {
        return columnas[col];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto p = productos.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                p.getNombre();
            case 1 ->
                p.getDescripcion();
            case 2 ->
                p.getPrecio();
            default ->
                null;
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 2; // Solo precio editable
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 2) {
            try {
                double precio = Double.parseDouble(aValue.toString());
                if (precio < 0) {
                    throw new NumberFormatException();
                }
                productos.get(rowIndex).setPrecio(precio);
                fireTableCellUpdated(rowIndex, columnIndex);
                guardarEnArchivo();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un precio válido (número positivo).");
            }
        }
    }
}
