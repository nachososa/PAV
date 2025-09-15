# Patrón Modelo–Vista–Controlador (MVC)

## Introducción

El **patrón Modelo–Vista–Controlador (MVC)** es una arquitectura de software que organiza una aplicación en tres componentes principales: **modelo**, **vista** y **controlador**. Su propósito es separar la lógica de negocio y los datos de la interfaz de usuario y de la gestión de eventos.  

Este patrón favorece la **reutilización de código**, la **separación de responsabilidades** y un **mantenimiento más sencillo** de las aplicaciones, ya que cada componente cumple una función clara y diferenciada.

---

## Componentes del MVC

### 1. Modelo

- Representa los **datos** y la **lógica de negocio** de la aplicación.  
- Gestiona el acceso a la información, permitiendo **consultas** y **actualizaciones**, además de controlar los privilegios definidos.  
- No tiene conocimiento de cómo se muestran sus datos; simplemente los **proporciona a la vista** cuando son requeridos.  
- Es responsable de notificar cambios en los datos (frecuentemente mediante el patrón **Observador**).

### 2. Vista

- Encargada de la **presentación** de los datos del modelo en un formato adecuado para la interacción con el usuario.  
- Representa la **interfaz gráfica** o cualquier otra forma de salida de la aplicación.  
- Depende del modelo para obtener la información que muestra, pero el modelo no debe conocerla directamente.  
- Puede suscribirse a los cambios del modelo mediante mecanismos de observación.

### 3. Controlador

- Actúa como **intermediario** entre la vista y el modelo.  
- Responde a los **eventos generados por el usuario** (como clics o entradas de texto).  
- Traduce esas acciones en operaciones sobre el modelo (ej. actualizar datos, validar información).  
- También puede indicar a la vista que actualice su presentación, aunque en general evita transferir directamente los objetos del modelo.  
- Puede implementar **gestores de eventos** o comandos que encapsulan las acciones, facilitando su extensión.

---

## Flujo de Interacción en MVC

1. **Interacción del usuario**: el usuario realiza una acción en la interfaz (ej. presionar un botón).  
2. **Notificación al controlador**: la vista notifica al controlador del evento.  
3. **Gestión de la acción**: el controlador procesa la acción y, si corresponde, solicita cambios al modelo.  
4. **Actualización del modelo**: el modelo modifica su estado según lo solicitado por el controlador.  
5. **Actualización de la vista**: la vista obtiene la información actualizada del modelo y la presenta al usuario.  
6. **Nuevo ciclo de interacción**: la interfaz queda lista para nuevas acciones del usuario.

Este flujo ilustra cómo se consigue la separación: el modelo gestiona los datos, la vista los muestra y el controlador coordina la comunicación entre ambos.

---

## MVC en el contexto de Swing

En Swing, la arquitectura MVC es fundamental para entender cómo funcionan los componentes gráficos. Cada componente de Swing puede verse bajo estas tres abstracciones:

- **Modelo**: los datos que manipula el componente (ej. una lista de elementos en un `JComboBox`).  
- **Vista**: la representación gráfica del componente en pantalla (ej. el cuadro desplegable con las opciones).  
- **Controlador**: la lógica que define el comportamiento del componente, incluyendo cómo responde a eventos del usuario (ej. la acción de desplegar la lista y seleccionar un ítem).  

Este enfoque garantiza que los datos, la forma de mostrarlos y las interacciones estén desacoplados, lo que facilita la reutilización y la flexibilidad de las aplicaciones gráficas.

---

## Conclusión

El patrón **Modelo–Vista–Controlador** establece una división clara entre datos, presentación y control de eventos.  

- El **modelo** administra la información y la lógica de negocio.  
- La **vista** se ocupa de mostrar los datos de forma adecuada al usuario.  
- El **controlador** conecta la vista con el modelo, gestionando las acciones del usuario y manteniendo el flujo de interacción.  

Su adopción en frameworks y bibliotecas, como Java Swing, refuerza la importancia de este patrón como base en el desarrollo de interfaces gráficas interactivas, asegurando aplicaciones más mantenibles, modulares y escalables.
