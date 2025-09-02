# Task Management System (Java + Spring Boot)

## Description
A full-featured Task Management System where users can manage projects and tasks. Features user authentication, task assignment, status tracking, and reporting.

## Tech Stack
- Java 17+
- Spring Boot 3.x
- Spring Security (JWT)
- MySQL/PostgreSQL
- Hibernate/JPA
- Swagger/OpenAPI
- JUnit & Mockito

## Features
1. User Registration & Login
2. CRUD for Projects & Tasks
3. Role-Based Access Control
4. Task Filtering & Reporting

## Installation
1. Clone the repo: `git clone <your-repo-link>`
2. Configure database in `application.properties`
3. Run: `mvn spring-boot:run`

## APIs
- `POST /api/auth/register` - Register user
- `POST /api/auth/login` - Login & get JWT
- `GET /api/tasks` - List all tasks
- `POST /api/tasks` - Create task
- `PUT /api/tasks/{id}` - Update task
- `DELETE /api/tasks/{id}` - Delete task

## Author
Deepen Mandve
