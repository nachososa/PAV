
package Ejercicio3;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class ProductoTableModel extends AbstractTableModel {
    private final String[] columnas = {"Nombre", "Descripción", "Precio"};
    private List<Producto> productos;

    public ProductoTableModel(List<Producto> productos) {
        this.productos = productos;
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
    public Object getValueAt(int row, int col) {
        Producto p = productos.get(row);
        switch (col) {
            case 0: return p.getNombre();
            case 1: return p.getDescripcion();
            case 2: return p.getPrecio();
            default: return null;
        }
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return col == 2; // editamos solo la columna de Precio
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        if (col == 2) {
            try {
                double nuevoPrecio = Double.parseDouble(value.toString());
                productos.get(row).setPrecio(nuevoPrecio);
                fireTableCellUpdated(row, col);
            } catch (NumberFormatException e) {
                System.out.println("Error al ingresar un valor invalido");
            }
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
