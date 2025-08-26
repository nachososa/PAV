
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int res = JOptionPane.showConfirmDialog(
                null,
                "¿Desea continuar?",
                "Confirmación",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        switch (res) {
            case JOptionPane.YES_OPTION ->
                JOptionPane.showMessageDialog(null, "Seleccionaste SÍ");
            case JOptionPane.NO_OPTION ->
                JOptionPane.showMessageDialog(null, "Seleccionaste NO");
            case JOptionPane.CANCEL_OPTION ->
                JOptionPane.showMessageDialog(null, "Seleccionaste CANCELAR");
            default ->
                JOptionPane.showMessageDialog(null, "No seleccionaste nada");
        }
    }
}
