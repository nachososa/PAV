# Persistencia de Datos

## Consigna

1. Objetivo
    Poner en práctica los conceptos aprendidos en la Unidad Persistencia de datos.

2. Metodología
    Actividad de resolución grupal (de 4 a 5 alumnos cada grupo).

3. Formato de entrega
    Entregar en formato zip, habiendo utilizado Netbeans 8.2 y colocar un archivo txt con el apellido y nombre de los integrantes del grupo. Debe ser entregada por todos los alumnos para su calificación.

4. Plazos
    Vencimiento jueves, 30 de octubre de 2025, 23:59

## Ejercitación

### 1. Persistir el siguiente modelo orientado a objetos

Paquete com.facultad

1. Clase Ciudad
    Nombre

2. Clase Persona
    Apellido
    Nombre
    Dni
    Fecha de nacimiento
    Ciudad

3. Clase Alumno extiende de Persona
    Numero de legajo
    Año de ingreso

4. Clase Profesor extiende de Persona
    Antigüedad

5. Materia
    Nombre
    Nivel
    Profesor
    Colección de alumnos

6. Facultad
    Nombre
    Ciudad

7. Carrera
    Nombre
    Facultad
    Colección de Materias

### 2. Clases

1. Implementar los constructores que se consideren necesarios teniendo en cuenta que:
    1. Constructor por defecto
    2. Constructor usando todos los atributos

Sobreescribir el método ToString para mostrar todos los atributos de la clase

### Consultas

Implementar las consultas HQL
    obtener todos los alumnos ordenados por Apellido
    obtener todos los profesores ordenados por Antigüedad
    obtener todas las materias de un Nivel pasado como parámetro

### 4. Para cada clase crear un método que permita

Crear una instancia
Actualizar una instancia
Borrar una instancia
Listar todos los elementos
