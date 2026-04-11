📚 Sistema de Gestión de Biblioteca Digital

## 📖 Descripción del Sistema

Sistema para gestionar el catálogo de una biblioteca digital: libros, 
revistas, audiolibros. Permite préstamos digitales, reservas, gestión 
de usuarios con distintos roles y notificaciones de vencimiento.

## 👥 Integrantes

| Nombre | Correo |
|--------|--------|
| Nombre Luis Fernando Masmela Tovar | lfmasmela-2025a@corhuila.edu.co |
| Nombre Keneth Enrique Cardenas Toledo | kecardenas-2025a@corhuila.edu.co |

## 📊 Diagrama de Clases UML

![Diagrama de Clases](diagrams/diagrama-clases.png)

## 🏗️ Estructura del Proyecto

```
src/
└── com/
    └── biblioteca/
        ├── model/
        │   ├── RecursoDigital.java  (Clase abstracta)
        │   ├── Libro.java
        │   ├── Revista.java
        │   ├── Audiolibro.java
        │   ├── Video.java
        │   ├── Usuario.java
        │   ├── Prestamo.java
        │   ├── Reserva.java
        │   └── Notificacion.java
        └── Main.java
```

## 🔗 Explicación de Relaciones

### Herencia (──▷)
- **Libro**, **Revista**,**Audiolibro** y **Video** heredan de **RecursoDigital** 
  (clase abstracta).
- Justificación: Los cuatro son tipos específicos de recurso digital que 
  comparten atributos comunes (id, título, año, disponibilidad) pero 
  difieren en sus atributos propios.

### Composición (◆───)
- **Prestamo** contiene un **Usuario** y un **RecursoDigital**.
  - Multiplicidad: 1 Usuario → 0..* Prestamos
- **Reserva** contiene un **Usuario** y un **RecursoDigital**.
  - Multiplicidad: 1 Usuario → 0..* Reservas
- Justificación: Un préstamo o reserva no tiene sentido sin un usuario 
  y un recurso asociado.

### Asociación (─────)
- **Notificacion** se asocia con **Usuario**.
  - Multiplicidad: 1 Usuario → 0..* Notificaciones
- Justificación: Las notificaciones se envían a un usuario, pero el 
  usuario puede existir sin notificaciones.

## 📝 Clases Implementadas

| Clase | Tipo | Atributos | Descripción |
|-------|------|-----------|-------------|
| RecursoDigital | Abstracta | id, titulo, anioPublicacion, disponible | Clase padre de todos los recursos |
| Libro | Concreta | isbn, autor, numeroPaginas, genero | Recurso tipo libro |
| Revista | Concreta | numeroEdicion, periodicidad, editorial | Recurso tipo revista |
| Audiolibro | Concreta | duracionMinutos, narrador, formato | Recurso tipo audiolibro |
| Usuario | Concreta | id, nombre, email, tipoUsuario | Usuario del sistema |
| Prestamo | Concreta | id, fechas, estado, usuario, recurso | Préstamo de un recurso |
| Reserva | Concreta | id, fechaReserva, estado, usuario, recurso | Reserva de un recurso |
| Notificacion | Concreta | id, mensaje, fecha, tipo, leida, usuario | Notificación al usuario |

---
*Proyecto de Programación y Diseño Orientado a Objetos — Corhuila 2026*
