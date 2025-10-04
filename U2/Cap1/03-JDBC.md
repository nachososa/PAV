# Diferencia entre Hibernate y JDBC

## JDBC (Java Database Connectivity)

- Es la API estándar de Java para interactuar con bases de datos relacionales.  
- Permite ejecutar sentencias SQL de forma directa desde código Java.  
- El programador debe encargarse de:
  - Escribir las consultas SQL manualmente.
  - Manejar la conexión (`Connection`), consultas (`Statement`, `PreparedStatement`) y resultados (`ResultSet`).
  - Mapear manualmente los datos obtenidos de la base a objetos Java.
- Es de bajo nivel, lo que implica mayor control, pero también más código repetitivo y mayor propensión a errores.

---

## Hibernate

- Es un framework ORM que se apoya sobre JDBC.  
- Permite trabajar con objetos Java directamente, sin necesidad de escribir SQL básico.  
- Se encarga automáticamente de:
  - Generar las sentencias SQL a partir de operaciones sobre objetos.
  - Mapear tablas a clases y filas a instancias de objetos.
  - Manejar relaciones (1:1, 1:N, N:M) y herencia entre entidades.
  - Optimizar consultas mediante caché y gestión de transacciones.
- Requiere menos código repetitivo, y la lógica de persistencia se vuelve más simple y mantenible.

---

## Comparación

| Aspecto                  | JDBC                                 | Hibernate                              |
|---------------------------|--------------------------------------|----------------------------------------|
| Nivel de abstracción      | Bajo (trabajo directo con SQL)       | Alto (trabajo con objetos)             |
| Esfuerzo de programación  | Mayor (mucho código repetitivo)      | Menor (menos SQL, más declarativo)     |
| Manejo de relaciones      | Manual                               | Automático con anotaciones/mapeos      |
| Portabilidad entre SGBD   | Limitada (ajustes en SQL)            | Alta (dialectos propios por motor BD)  |
| Caché y optimización      | No integrado                        | Soporte nativo                         |
| Uso típico                | Control detallado y consultas finas  | Desarrollo empresarial con persistencia |

---

## Síntesis

JDBC ofrece control total y bajo nivel, pero obliga a manejar SQL y mapping manualmente. Hibernate abstrae esa complejidad mediante ORM, reduciendo código y aumentando la productividad en aplicaciones empresariales.
