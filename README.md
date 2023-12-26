# JPA API for Teacher Entity

In this project, JPA (Java Persistence API) is utilized to create a set of APIs for managing `Teacher` entities. JPA simplifies database interactions by providing a high-level, object-oriented interface for Java applications.

## JPA Configuration (application.properties)

```properties
server.port = 8081
spring.datasource.url=jdbc:postgresql://localhost:5432/bootcoding
spring.datasource.username=postgres
spring.datasource.password=suhag
spring.jpa.show-sql=true

## Hibernate Properties
# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto = update
```
# JPA Information

## JPA Usage Highlights

- **Entity Mapping:** JPA maps Java classes to database tables, simplifying the process of storing and retrieving objects.

- **Repository Interface:** The `TeacherRepo` interface extends `JpaRepository`, providing CRUD operations out of the box.

- **Service Layer:** The `TeacherServiceImpl` class serves as an intermediary between the controller and the repository, encapsulating business logic.

## Controller Endpoints

- **GET:** `/findByEmail/{email}` - Retrieve a teacher by email.
- **POST:** `/insertTeacher` - Insert a new teacher.
- **DELETE:** `/deleteTeacher/{id}` - Delete a teacher by ID.
- **GET:** `/selectTeacher` - Retrieve all teachers.
- **GET:** `/selectById/{id}` - Retrieve a teacher by ID.
- **PUT:** `/updateTeacher/{id}` - Update a teacher by ID.

## Best Practices

- Use `@RestController` for clean RESTful API design.
- Enable Cross-Origin Resource Sharing (CORS) with `@CrossOrigin`.
- Utilize Spring Data JPA repository for simplified database operations.
- Leverage JPA's automatic table creation/update (`spring.jpa.hibernate.ddl-auto`) for development.
