# Swing

Durante la primera unidad trabajaremos sobre "Swing". Se trata de un conjunto de clases desarrolladas por primera vez para Java 1.2 (el llamado Java2) para mejorar el anterior paquete que implementaba clases para fabricar interfaces de usuario, el llamado AWT (Abstract Window Tools) que aún se usa bastante en las aplicaciones Java.

Tanto Swing como AWT forman parte de una colección de clases llamada JFC (Java Foundation Classes) que incluyen paquetes dedicados a la programación de interfaces gráficos (así como a la producción multimedia).

## ¿Qué es Swing? El sucesor de AWT

Swing es una API de Java: un conjunto de librerías y clases utilizadas para crear Interfaces Gráficas de Usuario (**GUI - Graphical User Interface**) para aplicaciones de escritorio.

**AWT** fue la primera herramienta de Java para crear GUIs. Su principal limitación era que sus componentes (botones, ventanas, listas) dependían de los componentes nativos del sistema operativo subyacente (Windows, macOS, Linux).

Un botón de AWT en Windows lo dibujaba Windows, y en macOS lo dibujaba macOS. La consecuencia era el famoso problema de *“escribir una vez, probar en todas partes”*. La aplicación podía verse y comportarse de manera ligeramente diferente en cada OS. Además, estaba limitado a los componentes que existían en todos los sistemas.

**Swing**, que forma parte de JFC, fue introducido con Java 2 como respuesta a las limitaciones de AWT.

Implementa componentes ligeros y 100% escritos en Java, lo que significa que un botón de Swing no depende del OS para ser renderizado: Java lo dibuja por sí mismo sobre un canvas básico.  
El aspecto es consistente, ya que la aplicación se ve exactamente igual en todos los sistemas operativos.

Al estar dibujados por Java, los componentes son altamente personalizables (pueden cambiar su color, forma, bordes, etc.), algo muy difícil de lograr con AWT.  
Además, Swing introduce componentes avanzados que no existían en AWT, como tablas (**JTable**), árboles (**JTree**), pestañas (**JTabbedPane**) y barras de herramientas (**JToolBar**).

## Pilares fundamentales

- **JFrame**: La ventana principal de tu aplicación. Es el contenedor de nivel superior que alberga todos los demás componentes.  
- **JPanel**: Contenedores intermedios utilizados para organizar y agrupar otros componentes dentro de un JFrame. Son esenciales para estructurar una interfaz compleja.  
- **Componentes Básicos (Widgets)**: Los elementos con los que el usuario interactúa:  
  - **JLabel**: Etiquetas de texto o imágenes.  
  - **JButton**: Botones.  
  - **JTextField**: Campos de texto de una línea.  
  - **JTextArea**: Áreas de texto multilínea.  
  - **JCheckBox**: Casillas de verificación.  
  - **JRadioButton**: Botones de opción.  
  - **JComboBox**: Listas desplegables.  
- **Administradores de Diseño (Layout Managers)**: Definen cómo se posicionan y dimensionan los componentes dentro de un contenedor (como un JFrame o un JPanel).

## Ejemplos de Layouts

- **BorderLayout**: Divide el contenedor en 5 áreas (Norte, Sur, Este, Oeste, Centro).  
- **FlowLayout**: Coloca los componentes en fila, uno tras otro.  
- **GridLayout**: Organiza los componentes en una cuadrícula de celdas de igual tamaño.  
- **GridBagLayout**: El más flexible y complejo, permite un posicionamiento preciso.  

### Manejo de Eventos (Event Handling)

Permite que la aplicación reaccione a las acciones del usuario (hacer clic en un botón, escribir texto, seleccionar un ítem).  
Se basa en el paradigma **Fuente → Evento → Oyente** (*Source → Event → Listener*).

## Conclusión

La unidad se centra en:

- Crear ventanas (**JFrame**) y estructurarlas con paneles (**JPanel**).  
- Añadir y usar los componentes de interfaz de usuario básicos.  
- Organizar estos componentes usando diferentes administradores de diseño.  
- Hacer que una aplicación sea interactiva, respondiendo a los eventos del usuario.  
- Construir interfaces de usuario completas y funcionales para aplicaciones de escritorio.  

Al finalizar la unidad, tendrás las bases necesarias para construir interfaces gráficas completas con Swing, lo que servirá como punto de partida para proyectos más complejos en las siguientes unidades.
