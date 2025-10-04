# Temario

1. Fundamentos y Arquitectura
    ¿Qué es Hibernate y para qué sirve?
    Diferencia entre Hibernate y JDBC.
    Concepto de ORM (Object Relational Mapping).
    Ciclo de vida de un objeto en Hibernate (transient, persistent, detached).
    Arquitectura de Hibernate
    1. SessionFactory, Session, Transaction, Query.
    2. Flujo de trabajo interno (interacción con BD).

2. Configuración
    Archivo de configuración hibernate.cfg.xml.
    Configuración programática con Configuration.
    Clases entidad con anotaciones (@Entity, @Id, @Column).
    Creación y uso de SessionFactory y Session.
    Manejo de transacciones (Transaction).

3. Mapeos (Relaciones)
    1. Mapeo Propiedad
        Atributos simples (@Column, tipos básicos).
        Claves primarias (@Id, @GeneratedValue).
    2. Mapeo Relaciones
        One-to-One (@OneToOne).
        One-to-Many (@OneToMany, @ManyToOne).
        Many-to-Many (@ManyToMany).
    3. Mapeo Colecciones
        List, Set, Map.
        Configuración de @ElementCollection.
    4. Lazy vs Eager loading en asociaciones.

4. Mapeo Herencia

    1. Estrategias de herencia en Hibernate
        @Inheritance(strategy = InheritanceType.SINGLE_TABLE).
        @Inheritance(strategy = InheritanceType.JOINED).
        @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS).
    2. Pros y contras de cada enfoque.

5. Trabajo con objetos (CRUD)
    Guardar (save, persist).
    Consultar (get, load).
    Actualizar (update, merge).
    Eliminar (delete).
    Estados de los objetos Transient, Persistent, Detached.

6. HQL y Criteria
    Consultas con HQL (Hibernate Query Language).
    1. Sintaxis similar a SQL pero sobre entidades.
    2. Consultas con FROM, WHERE, ORDER BY, joins.
    Named Queries (@NamedQuery).
    API Criteria para consultas programáticas.
    Diferencia entre HQL, Criteria y Native SQL.

7. Temas avanzados
    Caché de primer nivel (Session) y segundo nivel (EhCache, Infinispan).
    Integración con JPA (usando EntityManager).
    Buenas prácticas
    1. Evitar N+1 queries.
    2. Optimización de consultas y relaciones.
    Uso de transacciones distribuidas.
