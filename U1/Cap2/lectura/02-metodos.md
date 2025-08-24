# Métodos de los Contenedores

Los contenedores en Java heredan de la clase `java.awt.Container`, que proporciona métodos útiles para acceder y manejar los componentes que contienen. Algunos de los más importantes son:

| Método | Descripción |
|--------|-------------|
| **Component[] getComponents()** | Devuelve un **array de componentes** con todos los elementos que forman parte del contenedor actual. |
| **void list(PrintWriter out)** | Escribe en el objeto **PrintWriter** indicado una lista con los componentes del contenedor (útil para depuración). |
| **Component getComponentAt(int x, int y)** | Devuelve el **componente que se encuentra en las coordenadas (x, y)** dentro del sistema de coordenadas del contenedor. |
