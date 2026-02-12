📚 Bookstore Management System – REST API (Spring Boot)
📌 Project Overview

The Bookstore Management System is a backend RESTful API built using Java Spring Boot.
It enables a bookstore owner to manage books, users, and orders efficiently while allowing customers to browse and purchase books securely.

The system follows industry best practices such as layered architecture, REST principles, database integration, and security readiness using JWT.

🎯 Project Objectives

Build scalable REST APIs using Spring Boot

Implement CRUD operations for bookstore inventory

Provide a foundation for secure user authentication

Enable order processing and inventory management

Integrate with MySQL database

Document APIs using Swagger

🏗️ Project Architecture

The project follows a Layered Architecture:

Controller Layer  →  Service Layer  →  Repository Layer  →  Database

Layer Responsibilities

Controller: Handles HTTP requests & responses

Service: Contains business logic (extensible)

Repository: Communicates with database using JPA

Model: Represents database entities

Security: JWT & Spring Security (ready for extension)

🛠️ Technologies Used
Technology	Purpose
Java 17+	Core programming language
Spring Boot	Backend framework
Spring Web	REST API development
Spring Data JPA	Database interaction
Spring Security	Authentication & Authorization
JWT (JSON Web Token)	Secure authentication
MySQL	Relational database
Hibernate	ORM framework
Swagger (OpenAPI)	API documentation
Maven	Dependency management
JUnit	Unit testing
✨ Features Implemented
📚 Book Management

Add new books

Fetch all books

Store book details:

Title

Author

Genre

ISBN

Price

Stock quantity

🔐 Security (Ready)

Spring Security configured

JWT dependencies added

Easily extendable for:

User login

Role-based access (Admin / Customer)

🗄 Database Integration

MySQL database

JPA & Hibernate ORM

Automatic schema update

📖 API Documentation

Swagger UI enabled

Easy endpoint testing via browser

⚙️ Configuration
🗄 Database Setup

Create a MySQL database:

CREATE DATABASE bookstore;


Update credentials in:

src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

▶️ How to Run the Project
# Clone the repository
git clone https://github.com/your-username/bookstore-management-system.git

# Navigate to project
cd bookstore-management-system

# Run application
mvn spring-boot:run


Application runs at:

http://localhost:8080