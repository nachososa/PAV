# 4. Paneles  

## 4.1. JOptionPane  

En las aplicaciones gráficas, una de las tareas más comunes es **comunicarse con el usuario** a través de cuadros de diálogo.  
En Swing, esta función se resuelve mediante la clase **`JOptionPane`**, que hereda de `JComponent`.  

Aunque `JOptionPane` tiene constructores, en la práctica se usan mucho más sus **métodos estáticos**, que facilitan la creación rápida de cuadros de diálogo.  

---

## Tipos de cuadros de diálogo

### 1. Cuadros de información  

Son ventanas que **informan** al usuario sobre un hecho (mensaje simple).  
Los métodos estáticos permiten mostrar distintos íconos según el contexto:  

- `JOptionPane.INFORMATION_MESSAGE` → Mensaje informativo.  
- `JOptionPane.ERROR_MESSAGE` → Mensaje de error.  
- `JOptionPane.WARNING_MESSAGE` → Advertencia.  
- `JOptionPane.QUESTION_MESSAGE` → Pregunta al usuario.  
- `JOptionPane.PLAIN_MESSAGE` → Sin icono.  

---

### 2. Cuadros de confirmación  

A diferencia de los anteriores, requieren **una respuesta del usuario** (ej. Sí / No / Cancelar).  
El método devuelve un número entero que representa la acción seleccionada, el cual se puede interpretar con estas constantes:  

- `JOptionPane.YES_OPTION` → Pulsó **Sí**.  
- `JOptionPane.NO_OPTION` → Pulsó **No**.  
- `JOptionPane.CANCEL_OPTION` → Pulsó **Cancelar**.  
- `JOptionPane.OK_OPTION` → Pulsó **OK**.  
- `JOptionPane.CLOSE_OPTION` → Cerró el cuadro sin elegir opción.  

Además, se puede definir qué botones aparecen en el cuadro:  

- `JOptionPane.OK_CANCEL_OPTION` → Botones **OK** y **Cancelar**.  
- `JOptionPane.YES_NO_OPTION` → Botones **Sí** y **No**.  
- `JOptionPane.YES_NO_CANCEL_OPTION` → Botones **Sí**, **No** y **Cancelar**.  

---

### 3. Cuadros de entrada de datos  

Permiten que el usuario **escriba información** (ej. un texto) o seleccione entre opciones.  
El valor ingresado se devuelve como un `String`.  
Si el usuario cancela el cuadro, el método retorna `null`.  

Existen dos variantes:  

- **Entrada de texto simple** → el usuario escribe en un campo de texto.  
- **Entrada con opciones** → se le presenta un `array` de valores (ej. lista desplegable).  

---

### 4. Cuadros de diálogo internos  

Son equivalentes a los cuadros anteriores, pero se muestran **dentro de un contenedor Swing** en lugar de ocupar toda la pantalla.  
Esto los hace más **ligeros en recursos**.  

Métodos asociados:  

- `showInternalMessageDialog` → Mensaje interno.  
- `showInternalInputDialog` → Entrada interna de datos.  
- `showInternalConfirmDialog` → Confirmación interna.  

---

## 📌 Resumen  

- **`JOptionPane`** es la herramienta principal para mostrar mensajes, solicitar confirmaciones o pedir datos al usuario en Swing.  
- Se utilizan **métodos estáticos** que facilitan su uso.  
- Los cuadros pueden ser:  
  1. **De información** (mensajes simples).  
  2. **De confirmación** (requieren respuesta).  
  3. **De entrada de datos** (el usuario escribe o selecciona).  
  4. **Internos** (ligeros, dentro de un contenedor).  
