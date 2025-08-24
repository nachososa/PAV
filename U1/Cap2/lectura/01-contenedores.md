# Contenedores en Swing

En Swing, los **contenedores** son componentes especiales cuya función principal es **almacenar y organizar otros componentes** dentro de una interfaz gráfica.  

La mayoría de los objetos de interfaz en Swing descienden de la clase **JComponent**, y muchos de ellos también heredan de la clase **Container** (de AWT), que se encarga de gestionar la inclusión y disposición de otros componentes.

## Métodos básicos

- **add(component)** → agrega un componente al contenedor.  
- **remove(component)** → elimina un componente previamente agregado.  

Ambos métodos provienen de la clase `java.awt.Container`.

## Contenedores especiales en Swing

- **JWindow**  
  Ventana sin bordes ni controles (sin minimizar, maximizar o cerrar). Se usa para mensajes flotantes o *splash screens*.  

- **JFrame**  
  Ventana estándar con barra de título, bordes y botones de control. Es el contenedor principal de la mayoría de aplicaciones de escritorio.  

- **JPanel**  
  Contenedor genérico para agrupar y organizar componentes. Se combina con *Layout Managers* para estructurar la interfaz.  

- **JDialog**  
  Ventana de diálogo usada para mostrar mensajes, alertas o solicitar información al usuario. Puede ser **modal** (bloquea la interacción con otras ventanas) o **no modal**.  

- **JApplet**  
  Contenedor para ejecutar componentes dentro de un navegador web. Actualmente en desuso debido a la desaparición de los *applets*.
