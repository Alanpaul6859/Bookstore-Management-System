📚 Bookstore Management System – REST API (Spring Boot)
📌 Project Overview
1. The Bookstore Management System is a backend RESTful API built using Java Spring Boot.
2. It enables a bookstore owner to manage books, users, and orders efficiently while allowing customers to browse and purchase books securely.
3. The system follows industry best practices such as layered architecture, REST principles, database integration, and security readiness using JWT.

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
Technology	             Purpose
Java 17+	               Core programming language
Spring Boot	             Backend framework
Spring Web	             REST API development
Spring Data JPA    	     Database interaction
Spring Security	         Authentication & Authorization
JWT (JSON Web Token)	   Secure authentication
MySQL	                   Relational database
Hibernate	               ORM framework
Swagger (OpenAPI)	       API documentation
Maven	                   Dependency management
JUnit	                   Unit testing

✨ Features Implemented
📚 Book Management
1. Add new books
2. Fetch all books

Store book details:
1. Title
2. Author
3. Genre
4. ISBN
5. Price
6. Stock quantity

🔐 Security (Ready)
1. Spring Security configured
2. JWT dependencies added

Easily extendable for:
1. User login
2. Role-based access (Admin / Customer)

🗄 Database Integration
1. MySQL database
2. JPA & Hibernate ORM
3. Automatic schema update

📖 API Documentation
1. Swagger UI enabled
2. Easy endpoint testing via browser

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
