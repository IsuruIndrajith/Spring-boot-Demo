# 🧩 Spring Boot REST API with MySQL Integration

This project is a simple Spring Boot REST API built to understand and demonstrate the core building blocks of a backend system — including the use of annotations, package structuring, DTOs, entities, services, repositories, and custom queries using native SQL.

---

## 🚀 What This Project Covers

### ✅ 1. REST API Implementation
- Implemented basic CRUD operations using:
  - `@GetMapping`
  - `@PostMapping`
  - `@PutMapping`a
  - `@DeleteMapping`
- Tested with Postman to validate proper request handling.

### ✅ 2. Backend Architecture Breakdown
- Layered architecture including:
  - **Controller**: Handles HTTP requests.
  - **Service**: Contains business logic.
  - **Repository**: Interfaces with the database.
  - **DTO & Entity**: For clean data transfer and mapping.

### ✅ 3. MySQL Database Integration
- Connected Spring Boot to a MySQL database via `application.properties`.
- Used `spring.jpa.hibernate.ddl-auto=update` for schema auto-generation.

### ✅ 4. Native SQL Queries
- Used `@Query(nativeQuery = true)` to create custom queries.
  - Example: Fetch user by ID and address.

---

## 🧠 Learning Outcomes

- Understood the purpose and functionality of major Spring Boot annotations
- Applied DTO → Service → Entity workflow in a real-world use case
- Practiced writing native SQL within Spring Data JPA
- Built confidence in backend API development and data flow design

---

## ⚙️ Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Postman (for API testing)**

---
