# Java Swing: Componentes y Contenedores

## Introducción

En **Java Swing**, los **componentes** son los elementos básicos que conforman una interfaz gráfica de usuario (**GUI**). Cada botón, etiqueta, campo de texto o lista es un componente. Estos componentes se agrupan en **contenedores**, y un **administrador de diseño (Layout Manager)** se encarga de organizarlos dentro de la ventana.

Swing extiende el modelo de **AWT (Abstract Window Toolkit)**, pero con una diferencia fundamental: en lugar de usar "pares" (peers) dependientes del sistema operativo, Swing utiliza **componentes de peso ligero**. Esto significa que cada componente se dibuja y gestiona a sí mismo, lo que aporta:

* Mayor independencia del sistema operativo.
* Más flexibilidad para personalizar su apariencia.
* Mejor rendimiento en recursos.

La clase **`javax.swing.JComponent`** es la clase base de todos los componentes de Swing y hereda de `java.awt.Container`, que a su vez hereda de `java.awt.Component`.

---

## Modelo-Vista-Controlador (MVC)

Swing sigue el patrón **Modelo–Vista–Controlador (MVC)**:

* **Modelo** → Define los datos que maneja el componente.
* **Vista** → Es la representación gráfica de esos datos.
* **Controlador** → Gestiona la interacción del usuario con el componente.

**Ejemplo:** Un `JComboBox` que muestra los meses del año.

* Modelo → Un array con los meses.
* Vista → El cuadro desplegable en pantalla.
* Controlador → Captura los clics y gestiona la selección del usuario.

---

## Principales Componentes de Swing

### 1. Componentes básicos

* `JLabel` → Etiquetas de texto o iconos.
* `JButton` → Botón estándar.
* `JToggleButton` → Botón de estado alterno.
* `JCheckBox` → Casilla de verificación.
* `JRadioButton` → Botón de opción.

### 2. Componentes de texto

* `JTextComponent` → Clase base para componentes de texto.
* `JTextArea` → Área de texto multilínea.
* `JTextField` → Campo de texto de una sola línea.
* `JPasswordField` → Campo de texto para contraseñas.
* `JEditorPane` → Editor de contenido enriquecido.

### 3. Componentes de selección

* `JComboBox` → Lista desplegable.
* `JList` → Lista de elementos.
* `JSlider` → Control deslizante.
* `JProgressBar` → Barra de progreso.

### 4. Componentes contenedores

* `JPanel` → Contenedor genérico.
* `JScrollPane` → Contenedor con barras de desplazamiento.
* `JSplitPane` → Divide el espacio entre dos componentes.
* `JTabbedPane` → Panel con pestañas.
* `JToolBar` → Barra de herramientas.
* `JRootPane` → Raíz de otros contenedores.
* `JInternalFrame` → Ventana interna dentro de un contenedor.
* `JOptionPane` → Cuadros de diálogo estándar.

### 5. Componentes de menú

* `JMenuBar` → Barra de menús.
* `JMenu` → Menú dentro de la barra.
* `JMenuItem` → Opción de menú.
* `JPopupMenu` → Menú emergente.
* `JCheckBoxMenuItem` → Opción de menú con casilla.
* `JRadioButtonMenuItem` → Opción de menú con radio button.

### 6. Componentes especializados

* `JColorChooser` → Selector de color.
* `JToolTip` → Mensajes emergentes.
* `JSeparator` → Separador visual.
* `JTable` → Tablas de datos.
* `JTree` → Árbol jerárquico.

### 7. Clases base

* `AbstractButton` → Superclase de los botones.
* `JComponent` → Superclase de todos los componentes Swing.

---

## Métodos de JComponent

La clase `JComponent` proporciona una gran cantidad de métodos para gestionar **apariencia**, **posición**, **eventos** y **comportamiento**.

### Información del componente

* `String getName()` → Obtiene el nombre del componente.
* `void setName(String nombre)` → Cambia el nombre del componente.
* `Container getParent()` → Devuelve el contenedor padre.

### Apariencia y posición

* `void setVisible(boolean v)` → Muestra u oculta el componente.
* `Color getForeground()` / `setForeground(Color c)` → Obtiene o cambia el color de texto.
* `Color getBackground()` / `setBackground(Color c)` → Obtiene o cambia el color de fondo.
* `Point getLocation()` / `setLocation(int x, int y)` → Obtiene o establece la posición.
* `Dimension getSize()` / `setSize(int w, int h)` → Obtiene o establece el tamaño.
* `void setBounds(int x, int y, int w, int h)` → Define posición y tamaño en un solo paso.
* `void setToolTipText(String texto)` → Define un tooltip.
* `void setFont(Font f)` → Cambia la tipografía.
* `void setCursor(Cursor c)` → Cambia el cursor.

### Dibujo

* `void paint(Graphics g)` → Dibuja el componente y sus hijos.
* `void paintComponent(Graphics g)` → Dibuja solo el componente (método recomendado).
* `void paintBorder(Graphics g)` → Dibuja el borde.
* `void update(Graphics g)` → Refresca el componente.

### Activación y enfoque

* `void setEnabled(boolean b)` → Activa o desactiva el componente.
* `void requestFocus()` → Solicita el foco de entrada.
* `boolean requestFocusInWindow()` → Solicita el foco dentro de la ventana.
* `void transferFocus()` → Pasa el foco al siguiente componente.

### Manejo en contenedores

* `void add(Component c)` → Agrega un componente al contenedor.
* `void remove(Component c)` → Elimina un componente.
* `Component[] getComponents()` → Devuelve todos los componentes de un contenedor.

---

## Clases auxiliares

* **`java.awt.Point`** → Representa coordenadas `(x, y)`.
* **`java.awt.Dimension`** → Representa tamaño `(width, height)`.
* **`java.awt.Color`** → Representa colores RGB y soporta transparencia.
* **`java.awt.Cursor`** → Representa cursores personalizados (`HAND_CURSOR`, `WAIT_CURSOR`, etc.).

---

## Contenedores principales en Swing

* **`JWindow`** → Ventana sin bordes ni controles.
* **`JFrame`** → Ventana principal con barra de título y botones de control.
* **`JPanel`** → Contenedor genérico para agrupar componentes.
* **`JDialog`** → Ventana de diálogo.
* **`JApplet`** → Contenedor para applets (usado en navegadores antiguos).

---

## Conclusión

Swing proporciona un conjunto completo y flexible de componentes para construir interfaces gráficas en Java. Su modelo basado en **JComponent** y su independencia de la plataforma lo convierten en una herramienta poderosa para aplicaciones de escritorio. El uso de **contenedores**, junto con el modelo **MVC**, permite organizar y controlar de manera eficiente la interacción del usuario.
