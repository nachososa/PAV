# Eventos en Java con Swing - Teoría

## Introducción

En Java Swing, el modelo de eventos es un mecanismo fundamental que permite manejar las interacciones del usuario con los componentes de la interfaz gráfica. Un evento representa una acción ocurrida en la interfaz, generalmente iniciada por el usuario, como un clic de ratón, una pulsación de tecla o un cambio de foco.

Este mecanismo transforma el flujo del programa de lineal a dirigido por eventos, donde la ejecución del código depende de las acciones realizadas por el usuario sobre los componentes de la interfaz.

## Elementos Fundamentales del Modelo de Eventos

1. **Objeto Fuente (Source)**  
   Es el componente gráfico que genera o dispara el evento. Puede ser cualquier elemento de la interfaz como botones (JButton), campos de texto (JTextField) o ventanas (JFrame). La fuente es responsable de notificar a los escuchadores registrados cuando ocurre un evento.

2. **Objeto Escuchador u Oyente (Listener)**  
   Es un objeto que implementa una interfaz específica para recibir y manejar eventos. Define la respuesta a cada tipo de evento y debe estar registrado en la fuente mediante métodos especializados.

3. **Objeto Evento (Event Object)**  
   Encapsula toda la información relevante sobre la ocurrencia del evento, como el tipo, la fuente que lo generó, coordenadas del cursor o tecla presionada. Estas clases heredan de `EventObject` y proporcionan métodos para acceder a la información específica.

## Flujo de un Evento en Swing

1. **Generación:** Un componente detecta una interacción del usuario y genera un evento.  
2. **Registro:** El componente (fuente) tiene asociados uno o más escuchadores mediante métodos `add...Listener()`.  
3. **Notificación:** El evento se envía automáticamente a todos los escuchadores registrados.  
4. **Ejecución:** Los métodos de los escuchadores se ejecutan para manejar el evento.

## Principales Interfaces de Eventos (Listeners)

- **ActionListener:** Maneja eventos de acción, usados en botones, menús y campos de texto.  
- **MouseListener:** Procesa eventos básicos del ratón (clic, presionado, liberado, entrada y salida).  
- **MouseMotionListener:** Gestiona movimiento y arrastre del ratón.  
- **KeyListener:** Maneja eventos de teclado (tecla presionada, liberada, tecleada).  
- **WindowListener:** Procesa eventos de ventanas (abrir, cerrar, minimizar, activar o desactivar).  
- **FocusListener:** Gestiona la ganancia y pérdida de foco.  
- **ItemListener:** Maneja cambios en componentes seleccionables (checkboxes, radio buttons, combos).

## Registro de Listeners

La conexión entre un componente y un escuchador se realiza con métodos que siguen el patrón `add + NombreDelListener`. Esto registra al escuchador en la fuente para que reciba notificaciones cuando ocurran eventos.

## Clases Adaptadoras

Java incluye clases adaptadoras que implementan todos los métodos de una interfaz con implementaciones vacías. Esto permite sobreescribir únicamente los métodos necesarios. Ejemplos:  

- `MouseAdapter` (para MouseListener y MouseMotionListener)  
- `KeyAdapter` (para KeyListener)  
- `WindowAdapter` (para WindowListener)  
- `FocusAdapter` (para FocusListener)  
- `ComponentAdapter` (para ComponentListener)

## Múltiples Listeners

Un mismo componente puede tener múltiples escuchadores para el mismo evento. Al producirse el evento, todos son notificados y ejecutados en orden de registro. No obstante, algunos eventos específicos no permiten múltiples escuchadores y pueden lanzar la excepción `TooManyListenersException`.

## Conclusión

El modelo de eventos en Java Swing es esencial para crear aplicaciones interactivas y responsivas. Este modelo, basado en el patrón de diseño **Observer/Observable**, permite separar la interfaz gráfica de la lógica de negocio, facilitando el desarrollo y mantenimiento de aplicaciones.  
Comprender los tres elementos fundamentales (fuente, escuchador y evento), junto con el conocimiento de las interfaces principales y el uso adecuado de adaptadores, constituye la base para un manejo efectivo de eventos en Swing.
