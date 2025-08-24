# Contenedores de Nivel Superior

## JWindow

`JWindow` deriva de `java.awt.Window`, que a su vez es subclase de `Container`. Representa un marco de ventana simple, sin bordes ni controles, pero permite añadir componentes.  

| Constructor | Uso |
|------------|-----|
| `JWindow()` | Crea un marco de ventana típico e independiente. |
| `JWindow(Frame padre)` | Crea un marco de ventana dentro de la ventana *Frame* indicada. |
| `JWindow(Window padre)` | Crea un marco de ventana dentro de la ventana indicada. |
| `JWindow(GraphicsConfiguration gc)` | Crea una nueva ventana usando la configuración gráfica indicada. |
| `JWindow(Window padre, GraphicsConfiguration gc)` | Crea una ventana dentro de la padre con la configuración gráfica indicada. |

---

## JFrame

`JFrame` deriva de `Frame`, que a su vez deriva de `Window`. Representa ventanas completas en Swing.  

| Constructor | Uso |
|------------|-----|
| `JFrame()` | Crea una ventana con la configuración normal. |
| `JFrame(GraphicsConfiguration gc)` | Crea una ventana usando la configuración gráfica indicada. |
| `JFrame(String título)` | Crea una ventana con el título indicado. |
| `JFrame(String título, GraphicsConfiguration gc)` | Crea una ventana con título y configuración gráfica indicada. |

### Métodos principales de JFrame

| Método | Descripción |
|--------|------------|
| `void setDefaultCloseOperation(int modo)` | Define cómo se cierra la ventana: `EXIT_ON_CLOSE`, `DO_NOTHING_ON_CLOSE`, `HIDE_ON_CLOSE`, `DISPOSE_ON_CLOSE`. |
| `void setResizable(boolean b)` | Permite cambiar el tamaño de la ventana (`true` para redimensionable, `false` para tamaño fijo). |
| `void setTitle(String s)` | Cambia el título de la ventana. |
| `void pack()` | Ajusta la ventana al tamaño mínimo suficiente para contener sus componentes. |
| `void setState(int estado)` | Coloca la ventana en `Frame.NORMAL` o `Frame.ICONIFIED`. |
| `void setExtendedState(int estado)` | Igual que `setState`, pero añade `MAXIMIZED_HOR`, `MAXIMIZED_VER`, `MAXIMIZED_BOTH`. |
| `int getState()` | Devuelve el estado actual de la ventana. |
| `int getExtendedState()` | Devuelve el estado extendido de la ventana (desde Java 1.4). |

---

## JDialog

`JDialog` deriva de `Dialog`, que es subclase de `Window`. Representa un cuadro de diálogo especializado para operaciones interactivas complejas.  

| Constructor | Uso |
|------------|-----|
| `JDialog()` | Crea un cuadro de diálogo básico. |
| `JDialog(Frame propietario)` | Crea un cuadro de diálogo con la ventana padre indicada. |
| `JDialog(Frame propietario, boolean modal)` | Crea un cuadro de diálogo modal si `true`. |
| `JDialog(Frame propietario, String título)` | Crea un cuadro con título en la ventana padre indicada. |
| `JDialog(Frame propietario, String título, boolean modal)` | Crea un cuadro con título y modo modal. |
| `JDialog(Frame propietario, String título, boolean modal, GraphicsConfiguration gc)` | Igual que anterior, especificando configuración gráfica. |

### Métodos comunes para JDialog y JFrame

| Método | Uso |
|--------|----|
| `void toBack()` | Coloca la ventana al fondo, detrás de otras ventanas. |
| `void toFront()` | Envía la ventana al frente y le da el foco. |
| `void setTitle(String t)` | Cambia el título de la ventana. |
| `String getTitle()` | Obtiene el título actual de la ventana. |
| `void setResizable(boolean b)` | Activa o desactiva la capacidad de redimensionar. |
| `void pack()` | Ajusta la ventana al tamaño suficiente para contener sus componentes. |
