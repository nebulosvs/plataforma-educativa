# Inscripciones Service

Servicio de Inscripciones para la Plataforma Educativa.

## Requisitos

- Java 17 o superior
- Maven 3.6.0 o superior

## Cómo ejecutar

```bash
mvn spring-boot:run
```

El servicio estará disponible en `http://localhost:8081`

## Endpoints

- `GET /api/inscripciones/hello` - Endpoint de prueba

## Estructura del Proyecto

```
inscripciones-service/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/inscripciones/
│   │   │       ├── InscripcionesServiceApplication.java
│   │   │       └── controller/
│   │   │           └── HelloController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/example/inscripciones/
└── pom.xml
```
