import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] paises = {"España", "Italia", "Francia", "Portugal"};

        String res = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione un país:",
            "Selección",
            JOptionPane.INFORMATION_MESSAGE,
            null,
            paises,
            paises[0]
        );

        if (res == null) {
            JOptionPane.showMessageDialog(null, "No seleccionaste ningún país");
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionaste: " + res);
        }
    }
}
