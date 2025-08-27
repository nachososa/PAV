// Ejercicio 7 – JTabbedPane y JScrollPane

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 7");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Primera pestaña"));
        tabbedPane.addTab("Pestaña 1", panel1);

        JTextArea textArea = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        tabbedPane.addTab("Pestaña 2", scrollPane);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
