# Ciclo de vida de un objeto en Hibernate

En Hibernate, los objetos pasan por diferentes estados a lo largo de su vida cuando se relacionan con la base de datos. Estos estados son: Transient, Persistent y Detached.

## 1. Estado Transient (Transitorio)

El objeto ha sido creado en Java con new, pero no está asociado a una sesión de Hibernate ni a ninguna fila de la base de datos. Aún no tiene identificador asignado por Hibernate (PK). Si la aplicación termina en este punto, el objeto se pierde (no está guardado en la BD).

```java
Usuario u = new Usuario(); // Estado Transient
u.setNombre("Juan");
```

## 2. Estado Persistent (Persistente)

El objeto está asociado a una sesión de Hibernate y corresponde a una fila de la base de datos. Hibernate realiza un seguimiento automático de los cambios en sus atributos (dirty checking). Cualquier modificación se sincroniza con la base al hacer commit o flush.

```java
Session session = factory.openSession();
Transaction tx = session.beginTransaction();

Usuario u = new Usuario();
u.setNombre("Ana");

// Al guardar, el objeto pasa a estado Persistent
session.save(u);

tx.commit();
session.close();
```

## 3. Estado Detached (Separado)

El objeto estuvo en estado Persistent, pero la sesión de Hibernate se cerró. Ya no está asociado a ninguna sesión activa. Puede seguir existiendo en la memoria de Java, pero Hibernate no lo sincroniza más con la BD. Para volver a hacerlo persistente, debe re-adjuntarse con update() o merge().

```java
Session session = factory.openSession();
Usuario u = session.get(Usuario.class, 1); // Persistent
session.close(); // La sesión se cierra

// Ahora 'u' está en estado Detached
u.setNombre("Carlos"); 
// Cambios no impactan en BD hasta re-asociarlo
```

## Resumen Conceptual de los Estados del Ciclo de vida de un objeto en Hibernate

Un objeto en Hibernate puede estar en tres estados:

1. Transient (Transitorio) → creado en memoria, sin sesión ni BD. Existe solo en Java.
    El objeto existe en memoria, pero Hibernate no lo conoce.
    No tiene relación con la base de datos.
    Si la aplicación termina, se pierde.

2. Persistent (Persistente) → asociado a sesión y sincronizado con la BD. Existe en Java y en la BD (Hibernate lo gestiona).
    El objeto ya está bajo control de Hibernate (dentro de una sesión).
    Está vinculado a un registro de la base de datos.
    Los cambios en sus atributos se reflejan automáticamente en la base de datos cuando se confirma la transacción.

3. Detached (Separado) → estuvo persistente, pero la sesión se cerró. Existe en Java, pero está desconectado de la BD.
    El objeto estuvo persistente, pero la sesión terminó.
    Sigue existiendo en la memoria de Java, pero Hibernate ya no lo sincroniza con la base de datos.
    Se puede volver a asociar más adelante.

## Idea clave

Los Ciclos de vida hablan de cómo vive un objeto Java respecto a Hibernate.
