# Paneles

A la hora de hacer que los gráficos aparezcan en la pantalla, éstos se han de dibujar sobre un **lienzo**.  
El lienzo es una forma abstracta de indicar que hace falta un marco de trabajo.  
En Java, este marco suele ser un objeto como **JFrame**, que sirve como contenedor principal.  

Estos marcos principales en Swing implementan la interfaz **RootPaneContainer**, que organiza varios paneles superpuestos para estructurar la información.  

---

## Jerarquía de clases relacionadas con paneles y ventanas

Las principales clases relacionadas con ventanas y paneles en Java son:

- **Window**  
- **Applet**  
- **Frame**  
- **Dialog**

En Swing aparecen sus equivalentes:

- **JFrame**  
- **JDialog**  
- **JInternalFrame**  
- **JApplet**  
- **JWindow**

Todas ellas utilizan la interfaz **RootPaneContainer**, que establece el uso de un panel raíz (`JRootPane`).  

---

## Clase JRootPane

El **JRootPane** es el panel raíz de las clases principales de Swing:  
`JFrame`, `JApplet`, `JWindow`, `JDialog`, `JInternalFrame`.  

- Es un hijo de **JComponent**.  
- Se puede obtener mediante el método `getRootPane()`.  
- Se encarga de gestionar la apariencia y estructura interna de las ventanas.  

---

## Estructura interna de un JRootPane

La estructura de un **JRootPane** está compuesta por:

- **Glass Pane** (panel de cristal)  
- **Layered Pane** (panel de capas)  
- **Content Pane** (panel de contenido)  
- **JMenuBar** (opcional)  

Dentro de esta jerarquía:

- La propia ventana se encuentra al fondo.  
- Encima está el `JRootPane`.  
- El `GlassPane` queda siempre por encima, actuando como un panel transparente.  
- El `LayeredPane` contiene al `ContentPane` y, opcionalmente, a la `JMenuBar`.  

---

## Layered Pane (JLayeredPane)

El **Layered Pane** organiza los componentes en distintas capas, lo que permite simular profundidad.  
Incluye las siguientes capas (de la más profunda a la más cercana):

1. `DEFAULT_LAYER`: capa estándar, donde se colocan los componentes habituales.  
2. `PALETTE_LAYER`: pensada para barras de herramientas y paletas flotantes.  
3. `MODAL_LAYER`: destinada a cuadros de diálogo modales.  
4. `POPUP_LAYER`: para menús emergentes.  
5. `DRAG_LAYER`: para operaciones de arrastre con el ratón.  

Estas capas corresponden a constantes enteras de la clase `JLayeredPane` (0, 100, 200, 300, 400, respectivamente).  

El `JLayeredPane` se obtiene mediante el método `getLayeredPane()`.  
Los componentes pueden posicionarse con métodos como:  

- `setLayer()`  
- `moveToFront()`  
- `moveToBack()`  
- `setPosition()`  

---

## Glass Pane (panel de cristal)

El **Glass Pane** es un panel transparente situado por encima de todos los demás.  
Sus principales características son:  

- Se utiliza principalmente para manejar eventos del ratón.  
- Aunque es posible dibujar sobre él, no es recomendable.  
- Permite implementar comportamientos globales sobre toda la ventana.  

---

## Content Pane (panel de contenido)

El **Content Pane** es el panel donde se colocan los componentes habituales de la interfaz.  

- Se obtiene mediante el método `getContentPane()`.  
- Es un contenedor (`Container`) que permite añadir componentes con `add()`.  
- Es la capa recomendada para ubicar todos los elementos visibles de la aplicación.  

---

## Clase JPanel

El **JPanel** es el panel contenedor básico de Swing.  

- Puede añadirse dentro del `Content Pane` de una ventana.  
- Al ser un `Container`, también puede contener otros componentes.  
- Se puede personalizar redefiniendo el método `paintComponent()` para dibujar sobre él.  

Este panel es fundamental para organizar la interfaz de usuario, ya que sirve como bloque de construcción para distribuir y agrupar componentes dentro de un `Content Pane`.  

---

Paneles – Temas tratados

Concepto de lienzo y marco de trabajo en Swing

Necesidad de un espacio donde se dibujan los gráficos.

Uso de marcos principales como JFrame.

Relación con la interfaz RootPaneContainer.

Jerarquía de clases relacionadas con paneles y ventanas

Window, Applet, Frame, Dialog.

Versiones Swing: JFrame, JDialog, JInternalFrame.

Rol de RootPaneContainer.

Clase JRootPane

Función como panel raíz de los contenedores principales (JFrame, JApplet, JWindow, JDialog, JInternalFrame).

Relación con JComponent.

Obtención mediante getRootPane().

Estructura interna de un JRootPane

Glass Pane (panel de cristal).

Layered Pane (panel de capas).

Content Pane (panel de contenido).

JMenuBar (opcional).

Layered Pane (JLayeredPane)

Uso de capas para organizar componentes.

Tipos de capas:

DEFAULT_LAYER

PALETTE_LAYER

MODAL_LAYER

POPUP_LAYER

DRAG_LAYER

Métodos importantes: getLayeredPane(), setLayer(), moveToFront(), moveToBack(), setPosition().

Glass Pane

Panel transparente situado por encima de todos los demás.

Uso frecuente para interacción con el ratón.

Posibilidad de dibujar sobre él (aunque no recomendado).

Content Pane

Panel principal donde se añaden los componentes habituales.

Acceso mediante getContentPane().

Permite añadir componentes con add().

Clase JPanel

Panel contenedor básico de Swing.

Puede añadirse al content pane.

Uso como contenedor de componentes.

Personalización mediante la redefinición de paintComponent().
