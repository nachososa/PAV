// Ejercicio 9 – JTable y JTree

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 9");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        String[][] data = {
            {"1", "Juan", "20"},
            {"2", "Ana", "25"},
            {"3", "Pedro", "30"}
        };
        String[] columnNames = {"ID", "Nombre", "Edad"};
        JTable table = new JTable(data, columnNames);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Animales");
        DefaultMutableTreeNode mamiferos = new DefaultMutableTreeNode("Mamíferos");
        DefaultMutableTreeNode aves = new DefaultMutableTreeNode("Aves");
        mamiferos.add(new DefaultMutableTreeNode("Perro"));
        mamiferos.add(new DefaultMutableTreeNode("Gato"));
        aves.add(new DefaultMutableTreeNode("Loro"));
        aves.add(new DefaultMutableTreeNode("Águila"));
        root.add(mamiferos);
        root.add(aves);
        JTree tree = new JTree(root);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(table), new JScrollPane(tree));
        frame.add(splitPane);

        frame.setVisible(true);
    }
}
