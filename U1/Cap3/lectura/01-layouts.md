# Layouts

En la construcción de interfaces gráficas en Java, los **layouts** (administradores de diseño) son un elemento fundamental, ya que determinan cómo se organizan y distribuyen los componentes dentro de un contenedor.

## Contenedores y componentes

La colocación de componentes se realiza mediante el método `add` sobre el contenedor correspondiente.  
En el caso de contenedores con **RootPane** (como `JFrame`, `JApplet` o `JDialog`), los componentes se añaden generalmente al panel de contenido (`getContentPane()`).

## ¿Por qué usar administradores de diseño?

En otros entornos de desarrollo es común ubicar los componentes con **coordenadas absolutas**. Sin embargo, en Java se desaconseja esta práctica, ya que el tamaño y la apariencia de los componentes pueden variar según la plataforma, la resolución o la configuración del sistema.  
La filosofía de Java está orientada a la **portabilidad**, por lo que los administradores de diseño permiten una disposición adaptable e independiente de las coordenadas fijas.

## Asignación de un layout

Cada contenedor puede asociarse a un administrador de diseño mediante el método:

```java
setLayout(LayoutManager layout)
```

## Algunos de los Principales Modelos de Layouts en Java Swing

A continuación se describen brevemente los administradores de diseño más utilizados:

- **Absolute Layout (coordenadas absolutas)**  
  Permite ubicar los componentes indicando posiciones y tamaños fijos mediante coordenadas (`setBounds`).  
  No es recomendable, ya que no se adapta a distintos sistemas ni resoluciones.

- **FlowLayout**  
  Coloca los componentes en fila, de izquierda a derecha, y cuando no hay más espacio continúa en la siguiente línea.  
  Es el diseño por defecto de `JPanel`.

- **BoxLayout**  
  Organiza los componentes en una única fila **horizontal** o en una única columna **vertical**, manteniendo el orden de adición.

- **BorderLayout**  
  Divide el contenedor en cinco zonas: `NORTH`, `SOUTH`, `EAST`, `WEST` y `CENTER`.  
  Es útil para organizar áreas principales de una ventana.

- **GridLayout**  
  Organiza los componentes en una cuadrícula de filas y columnas, donde todas las celdas tienen el mismo tamaño.  
  Cada componente ocupa exactamente una celda.

---
Estos layouts permiten adaptar la interfaz a diferentes plataformas y resoluciones, garantizando portabilidad y consistencia visual.
