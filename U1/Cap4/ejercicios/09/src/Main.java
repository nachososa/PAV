
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Mensaje informativo simple
        JOptionPane.showMessageDialog(
                null,
                "Operación realizada con éxito",
                "Información",
                JOptionPane.INFORMATION_MESSAGE
        );

        // Mensaje de error
        JOptionPane.showMessageDialog(
                null,
                "Ocurrió un error inesperado",
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
