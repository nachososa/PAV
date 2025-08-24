# Introducción

Uno de los principales problemas de la programación clásica era el desarrollo de interfaces de usuario. Para lograrlo, los programadores debían utilizar directamente las APIs propias del sistema operativo, lo que provocaba que el código no fuera fácilmente transportable a otros entornos.

**AWT (Abstract Window Toolkit)** fue la primera solución que propuso Java a este inconveniente. AWT está compuesto por un conjunto de clases que permiten programar **GUIs** (*Graphical User Interfaces*, interfaces gráficas de usuario) de manera más independiente del sistema operativo.

El funcionamiento de AWT consistía en proporcionar clases gráficas comunes, y luego la **Java Virtual Machine (JVM)** se encargaba de traducir esas clases a los componentes gráficos nativos del sistema en el que se ejecutaba el programa (Windows, macOS, Linux, etc.). De este modo, la misma aplicación podía ejecutarse en distintos sistemas sin necesidad de reescribir el código. Esta propuesta superó ampliamente las expectativas iniciales de Sun Microsystems, la empresa creadora de Java.

Sin embargo, la clave de AWT estaba en el uso de componentes llamados **peers**. Cada componente de AWT (botón, lista, cuadro de texto, etc.) delegaba en el sistema operativo la tarea de generar su representación gráfica. Esto aseguraba que la aplicación mantuviera un aspecto coherente con el estilo visual del sistema. El problema era que la calidad y la apariencia podían variar mucho entre plataformas: por ejemplo, en Windows y macOS la interfaz se veía más cuidada, pero en otros sistemas resultaba más pobre.

Para superar estas limitaciones, a partir de la versión 1.2 de Java se introdujo **Swing** como parte de **JFC (Java Foundation Classes)**, un conjunto de librerías fundamentales para el desarrollo de interfaces gráficas.

## Limitaciones de AWT

- Problemas de compatibilidad en varios sistemas operativos.  
- Carencia de componentes avanzados (como árboles, tablas o paneles con pestañas).  
- Uso excesivo de recursos del sistema.  

## Aporte de Swing

- Proporciona una mayor cantidad de componentes listos para usar.  
- Ofrece un mejor rendimiento y un consumo más eficiente de recursos.  
- Permite una apariencia más consistente y personalizable en todas las plataformas.  

En cualquier caso, **AWT no desapareció**: sigue siendo la base sobre la cual se construyó Swing, que se añadió para ampliar y mejorar sus capacidades.
