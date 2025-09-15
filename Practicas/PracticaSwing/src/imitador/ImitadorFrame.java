package imitador;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ImitadorFrame extends JFrame {

    public ImitadorFrame() {
        
        // Nueva Ventana
        setTitle("Imitador / Espejo"); // Titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierre
        setSize(600, 300); // Tamaño
        setLayout(new GridLayout(1, 2, 10, 10)); // Grilla
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla es NULL, porque no tiene un componente de referencia, usa el centro del monitor.

        // PANEL PRINCIPAL
        //
        JPanel principal = new JPanel();
        principal.setLayout(new GridLayout(5, 1));
        principal.setBorder(BorderFactory.createTitledBorder("Principal"));
        
        // textfield
        JTextField tfPrincipal = new JTextField();
        
        // checkbox
        JCheckBox cbPrincipal = new JCheckBox("Aceptar"); 
        
        // radio buttons
        JRadioButton rb1Principal = new JRadioButton("Opción 1");
        JRadioButton rb2Principal = new JRadioButton("Opción 2");
        
        // grupo de botones
        ButtonGroup bgPrincipal = new ButtonGroup();
        bgPrincipal.add(rb1Principal);
        bgPrincipal.add(rb2Principal);
        
        // Spinner
        JSpinner spPrincipal = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        
        // Agregar a principal
        principal.add(tfPrincipal);
        principal.add(cbPrincipal);
        principal.add(rb1Principal);
        principal.add(rb2Principal);
        principal.add(spPrincipal);

        // PANEL ESPEJO
        JPanel espejo = new JPanel();
        
        espejo.setLayout(new GridLayout(5, 1));
        espejo.setBorder(BorderFactory.createTitledBorder("Espejo"));

        JTextField tfEspejo = new JTextField();
        tfEspejo.setEditable(false);
        
        // Aceptar
        JCheckBox cbEspejo = new JCheckBox("Aceptar");
        cbEspejo.setEnabled(false);
        
        // Opcion 1
        JRadioButton rb1Espejo = new JRadioButton("Opción 1");
        rb1Espejo.setEnabled(false);
        
        // Opcion 2
        JRadioButton rb2Espejo = new JRadioButton("Opción 2");
        rb2Espejo.setEnabled(false);
        
        // Grupod de botones
        ButtonGroup bgEspejo = new ButtonGroup();
        bgEspejo.add(rb1Espejo);
        bgEspejo.add(rb2Espejo);
        JSpinner spEspejo = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        spEspejo.setEnabled(false);
        
        // Agregar a espejo
        espejo.add(tfEspejo);
        espejo.add(cbEspejo);
        espejo.add(rb1Espejo);
        espejo.add(rb2Espejo);
        espejo.add(spEspejo);

        // CAPTURA DE LOS EVENTOS
        tfPrincipal.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                tfEspejo.setText(tfPrincipal.getText());
            }
            
            @Override
            public void removeUpdate(DocumentEvent e) {
                tfEspejo.setText(tfPrincipal.getText());
            }
            
            @Override
            public void changedUpdate(DocumentEvent e) {
                tfEspejo.setText(tfPrincipal.getText());
            }
        });

        cbPrincipal.addActionListener(
                e -> cbEspejo.setSelected(
                        cbPrincipal.isSelected()
                ));

        rb1Principal.addActionListener(
                e -> {
                    if (rb1Principal.isSelected())
                        rb1Espejo.setSelected(true);
                });
        
        rb2Principal.addActionListener(
                e -> {
                    if (rb2Principal.isSelected())
                        rb2Espejo.setSelected(true);
                });

        spPrincipal.addChangeListener(
                e -> spEspejo.setValue(
                        spPrincipal.getValue()));

        // Agregar paneles
        add(principal);
        add(espejo);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ImitadorFrame().setVisible(true);
        });
    }
}