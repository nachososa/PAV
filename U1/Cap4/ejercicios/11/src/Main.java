import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(
            null,
            "Escriba su nombre:",
            "Entrada de datos",
            JOptionPane.QUESTION_MESSAGE
        );

        if (nombre == null) {
            JOptionPane.showMessageDialog(null, "No escribiste nada");
        } else {
            JOptionPane.showMessageDialog(null, "Hola, " + nombre);
        }
    }
}
