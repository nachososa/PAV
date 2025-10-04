# Arquitectura de Hibernate

Hibernate está compuesto por varios componentes que permiten la interacción entre las clases Java y la base de datos relacional. Su arquitectura se organiza en capas, donde Hibernate se ubica entre la aplicación y la base de datos.

## 1. Componentes principales

### SessionFactory

Objeto pesado y único por aplicación (generalmente implementado como *singleton*). Se crea a partir de la configuración (`hibernate.cfg.xml`). Contiene la información de mapeo (clases ↔ tablas). Genera instancias de `Session`.

```java
SessionFactory factory = new Configuration()
                            .configure("hibernate.cfg.xml")
                            .buildSessionFactory();
```

### Session

Es una unidad de trabajo que representa una conexión con la base de datos. Es ligera y debe abrirse y cerrarse según la operación. Permite realizar CRUD, crear consultas y manejar transacciones. Implementa el caché de primer nivel (almacena objetos en memoria durante la sesión).

```java
Session session = factory.openSession();
```

### Transaction

Maneja la lógica de ACID (atomicidad, consistencia, aislamiento, durabilidad). Garantiza que un conjunto de operaciones se ejecute de forma segura. Se debe comenzar y confirmar (commit) o revertir (rollback).

```java
Transaction tx = session.beginTransaction();
// operaciones CRUD
tx.commit();
```

### Query

Permite ejecutar consultas usando:
    HQL (Hibernate Query Language) → orientado a objetos.
    SQL nativo → si se necesita control total.
    Criteria API → consultas programáticas.

```java
Query query = session.createQuery("FROM Usuario WHERE nombre = :nombre");
query.setParameter("nombre", "Ana");
List<Usuario> lista = query.list();
```

## 2. Flujo de trabajo interno (interacción con BD)

1. La aplicación crea un objeto SessionFactory.
    La aplicación arranca y crea un SessionFactory.

2. A través de este, se abre una Session para conectarse a la BD.
    Se abre una Session para trabajar con la base.

3. Dentro de la sesión se inicia una Transaction.
    Se inicia una Transaction.

4. El desarrollador interactúa con objetos Java (persistencia transparente).
    Se realizan operaciones sobre objetos (guardar, consultar, actualizar, borrar).

5. Hibernate traduce las operaciones en SQL y las ejecuta sobre la BD.
    Hibernate traduce esas operaciones a SQL y las ejecuta en la base.

6. Al finalizar, se hace commit/rollback de la transacción y se cierra la sesión.
    Se confirma (commit) o se revierte (rollback) la transacción. Se cierra la sesión.

`Aplicación → SessionFactory → Session → Transaction → SQL → Base de Datos`

## Síntesis | Arquitectura de Hibernate

Hibernate funciona como un puente entre el mundo de los objetos Java y las tablas de la base de datos. Sus componentes principales son:

1. SessionFactory → configuración global.
    SessionFactory → se crea una sola vez en la aplicación. Contiene la configuración y el mapeo entre clases y tablas.

2. Session → conexión y unidad de trabajo.
    Session → es como una "conexión" de trabajo con la base. Dentro de una sesión, se crean, consultan y actualizan objetos.

3. Transaction → manejo seguro de cambios.
    Transaction → garantiza que los cambios en la base de datos sean seguros (si algo falla, se revierte).

4. Query → consultas sobre objetos/BD.
    Query → sirve para hacer consultas sobre los datos (usando HQL, SQL o Criteria).

## Idea

La Arquitectura habla de los componentes que permiten esa interacción con la base de datos.
