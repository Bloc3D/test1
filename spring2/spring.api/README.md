Spring Boot Product API

A simple Spring Boot REST API for managing products using:

Java 17
Spring Boot
JPA
H2 Database

Swager UI

This project includes full CRUD operations and a clean layered architecture.

Project Structure

src/main/java/com/vistu/spring2/product
│
├── api
│   ├── ProductController.java
│   ├── request
│   │     └── ProductRequest.java
│   └── response
│         └── ProductResponse.java
│
├── domain
│   └── product.java
│
├── repository
│   └── ProductRepository.java
│
├── service
│   └── ProductService.java
│
└── support
└── ProductMapper.java

How to Run the Project;
Open the project in IntelliJ

Run the Spring Boot main class

Open Swagger UI:
http://localhost:8080/swagger-ui/index.html
🗄️ H2 Database Configuration

H2 console:
http://localhost:8080/h2-console
Use these settings:

JDBC URL: jdbc:h2:mem:testdb
User: sa
Password: (empty)
Entity (product)
java
@Entity
public class product {
@Id
@GeneratedValue
private Long id;
private String name;
}
CRUD Endpoints
Create Product
POST /api/products

Request body:

json
{
"name": "Laptop"
}
Response:

json
{
"id": 1,
"name": "Laptop"
}
Get All Products
GET /api/products

Get Product by ID
GET /api/products/{id}

Update Product
PUT /api/products/{id}

Request:

json
{
"name": "Updated Name"
}
Delete Product
DELETE /api/products/{id}

Testing With H2
To view saved products:

sql
SELECT * FROM PRODUCT;
🛠 Technologies Used
Spring Boot

Spring Web

Spring Data JPA

H2 Database

Swagger / OpenAPI

Status
Project fully working with:

CRUD
H2
Swagger
JPA repository
Lowercase product entity

![](C:\Users\user\Desktop\spring2\spring.api\screenshots)