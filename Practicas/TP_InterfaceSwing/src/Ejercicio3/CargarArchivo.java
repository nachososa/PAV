
package Ejercicio3;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CargarArchivo {
    
    // leemos el archivo
    public static List<Producto> cargarProductos(String ruta) {
        List<Producto> productos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 3) {
                    productos.add(new Producto(
                        datos[0], 
                        datos[1], 
                        Double.parseDouble(datos[2])
                    ));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productos;
    }
    // guardamos
    public static void guardarProductos(String ruta, List<Producto> productos) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
            for (Producto p : productos) {
                pw.println(p.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}