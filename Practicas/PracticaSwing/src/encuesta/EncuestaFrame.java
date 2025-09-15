package encuesta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;

public class EncuestaFrame extends JFrame {

    public EncuestaFrame() {
        
        // Ventana principal
        setTitle("Miniencuesta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new GridLayout(5, 1));
        setLocationRelativeTo(null);

        // Nuevo panel
        JPanel osPanel = new JPanel();
        
        //
        // 1. Seleccion del OS - Seleccion unica
        //
        osPanel.setBorder(BorderFactory.createTitledBorder("Elige un sistema operativo")); // Borde con titulo
        
        // Radio buttons
        JRadioButton rbWindows = new JRadioButton("Windows");
        JRadioButton rbLinux = new JRadioButton("Linux");
        JRadioButton rbMac = new JRadioButton("Mac");
        
        // Solo un radio button pueda estar seleccionado a la vez
        ButtonGroup osGroup = new ButtonGroup();
        
        // Agregar Radio Buttons al Grupo
        osGroup.add(rbWindows);
        osGroup.add(rbLinux);
        osGroup.add(rbMac);
        
        // Agregar Radio Buttons al Panel
        osPanel.add(rbWindows);
        osPanel.add(rbLinux);
        osPanel.add(rbMac);

        // Nuevo panel
        JPanel espPanel = new JPanel();
        
        //
        // 2. Seleccion de la especialidad - Seleccion multiple
        //
        espPanel.setBorder(BorderFactory.createTitledBorder("Elige tu especialidad"));
        
        JCheckBox cbProg = new JCheckBox("Programación");
        JCheckBox cbDiseno = new JCheckBox("Diseño gráfico");
        JCheckBox cbAdmin = new JCheckBox("Administración");
        
        // Agregar Check Buttons al Panel
        espPanel.add(cbProg);
        espPanel.add(cbDiseno);
        espPanel.add(cbAdmin);

        // Nuevo panel
        JPanel sliderPanel = new JPanel();
        
        // 3. Horas
        sliderPanel.setBorder(BorderFactory.createTitledBorder("Horas dedicadas en el ordenador"));

        // Nuevo slider
        JSlider slider = new JSlider(0, 10, 0);
        
        // Configuracion de las marcas (ticks)
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        
        // Etiqueta para mostrar el valor
        JLabel sliderValue = new JLabel("Horas: 0");
        
        // Listener para escuchar cambios (Event Handler)
        slider.addChangeListener((ChangeEvent e) -> {
            
            // Obtiene el valor actual del slider y actualiza la etiqueta con el nuevo valor
            sliderValue.setText("Horas: " + slider.getValue());
        });
        
        // Agregar componentes al panel
        sliderPanel.add(slider);
        sliderPanel.add(sliderValue);

        //
        // BOTON DE ENVIAR
        //
        // Creacion del Botón con JButton
        JButton btnEnviar = new JButton("Enviar encuesta");
        
        // Creacion del Panel para el Botón
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        // Agregar el boton al panel
        buttonPanel.add(btnEnviar);

        // RESULTADOS
        
        // Crear Area de Texto, 5 filas (altura) y 30 columnas (ancho)
        JTextArea resultados = new JTextArea(5, 30);
        
        resultados.setEditable(false); // el usuario NO puede editar el texto
        resultados.setLineWrap(true); // salto a la siguiente línea y evita que el texto se salga del area visible horizontalmente
        resultados.setWrapStyleWord(true); // el salto de línea ocurre entre palabras completas
        
        // Crear JScrollPane: si el texto es muy largo aparecen scrollbars
        JScrollPane scroll = new JScrollPane(resultados);

        //
        // LOGICA PRINCIPAL
        //
        
        btnEnviar.addActionListener((ActionEvent event) -> {
    
            // Construir el resultado y concatenar cadenas
            StringBuilder resultado = new StringBuilder();
        
            // Sistema operativo
            resultado.append("Sistema operativo: ");
        
            if (rbWindows.isSelected()) {
                resultado.append("Windows");
            }
        
            else if (rbLinux.isSelected()) {
                resultado.append("Linux");
            }
        
            else if (rbMac.isSelected()) {
                resultado.append("Mac");
            }
        
            else {
                resultado.append("No seleccionado");
            }
        
            resultado.append("\n");

            // Especialidad
            resultado.append("Especialidad: ");
            
            boolean algunaSeleccionada = false;
            
            if (cbProg.isSelected()) {
                resultado.append("Programación ");
                algunaSeleccionada = true;
            }
            
            if (cbDiseno.isSelected()) {
                resultado.append("Diseño gráfico ");
                algunaSeleccionada = true;
            }
            
            if (cbAdmin.isSelected()) {
                resultado.append("Administración ");
                algunaSeleccionada = true;
            }
            
            if (!algunaSeleccionada) {
                resultado.append("Ninguna");
            }
            
            resultado.append("\n");

            // Horas
            resultado.append("Horas dedicadas: ").append(slider.getValue()).append("\n");
            
            resultados.setText(resultado.toString());
        });
        

        // Agregar componentes al frame en orden
        Component[] componentes = {
            osPanel,        // 1. Sistema operativo
            espPanel,       // 2. Especialidad  
            sliderPanel,    // 3. Horas en ordenador
            buttonPanel,    // 4. Botón de enviar
            scroll          // 5. Área de resultados
        };

        for (Component componente : componentes) {
            add(componente);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EncuestaFrame().setVisible(true);
        });
    }
}   