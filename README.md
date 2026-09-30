# Spring Boot JPA Many-to-Many

A Spring Boot project demonstrating a **Many-to-Many relationship** between `Book` and `Author` entities using Spring Data JPA and Hibernate.

## About

This project demonstrates how to map and manage a Many-to-Many relationship using JPA.

- One Book can have multiple Authors.
- One Author can write multiple Books.
- Uses a join table to maintain the relationship.
- Demonstrates saving related entities.
- Demonstrates fetching a Book using `findById()`.

## Tech Stack

- Java 21
- Spring Boot 4
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok

## Project Structure

```text
src/main/java/in/ashokit
├── model
│   ├── Book.java
│   └── Author.java
├── repository
│   ├── BookRepository.java
│   └── AuthorRepository.java
├── runner
│   └── MyApplicationRunner.java
└── SbJpaManyToManyApplication.java



Key Concepts
@Entity
@ManyToMany
mappedBy
JpaRepository
findById()
Bidirectional entity relationships
JPA/Hibernate persistence
Database

Configure your MySQL database in:

spring.datasource.url=jdbc:mysql://localhost:3306/sbms
spring.datasource.username=root
spring.datasource.password=your_password
Run
mvn spring-boot:run

The application demonstrates saving Books with Authors and fetching a Book by its ID.
