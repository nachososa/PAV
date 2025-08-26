# 3.1. UIManager

Una de las principales mejoras introducidas en **Swing** fue el **administrador de apariencia**, conocido como **UIManager**.  
Esta clase, integrada en `javax.swing`, permite cambiar el aspecto visual de una aplicación según diferentes esquemas predefinidos, con el objetivo de que los programas Java mantengan una apariencia uniforme en distintas plataformas.

## Look and Feel (L&F)

El **Look and Feel** es el sistema que define la apariencia de los componentes gráficos (botones, menús, cuadros de texto, etc.). Swing ofrece varios esquemas de forma nativa:

- **Metal**: apariencia por defecto, diseñada para ser portable entre sistemas.  
- **Motif**: estilo similar al entorno gráfico X-Windows.  
- **Windows**: apariencia similar a las aplicaciones nativas de Windows.

## Cambio de apariencia

Para modificar el esquema se utiliza el método estático:

- **`UIManager.setLookAndFeel(String className)`**  

Donde `className` corresponde al nombre completo de la clase que implementa el Look and Feel deseado (por ejemplo, `javax.swing.plaf.metal.MetalLookAndFeel`).

Este método puede lanzar varias excepciones relacionadas con la carga o disponibilidad del esquema, como:  

- `ClassNotFoundException`  
- `InstantiationException`  
- `IllegalAccessException`  
- `UnsupportedLookAndFeelException`  

Habitualmente se capturan juntas mediante la clase base `Exception`.

## Actualización de componentes

Cuando se cambia el Look and Feel, los componentes gráficos deben **actualizar su apariencia**.  
Para ello, cada `JComponent` dispone del método `updateUI()`, que refresca el estilo aplicado.

## Look and Feel actual

Siempre existe un **Look and Feel activo**, que define la apariencia global de la interfaz.  
Además, es posible crear **apariencias personalizadas** modificando aspectos como tipografías, bordes o colores a través de la clase `LookAndFeel`.

## Descubrir los esquemas disponibles

Swing permite conocer qué esquemas están instalados mediante:  

- **`UIManager.getInstalledLookAndFeels()`**  

Este método devuelve un array de objetos `UIManager.LookAndFeelInfo`, los cuales contienen, entre otros, el método `getClassName()` para obtener el nombre completo de cada implementación disponible.

---
En resumen, el **UIManager** es la herramienta que Swing ofrece para controlar y cambiar la apariencia de las interfaces gráficas, garantizando flexibilidad y consistencia en distintas plataformas.
