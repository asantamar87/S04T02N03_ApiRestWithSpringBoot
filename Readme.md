# 🍃 Spring Boot CRUD with MongoDB - Level 3 Exercise

This project implements a CRUD REST API using **Spring Boot** and **Spring Data MongoDB** to persist data in a **MongoDB** database.

---

## 📁 Project Metadata

| Property         | Value                      |
|------------------|----------------------------|
| **Group**        | `cat.itacademy.s04.t02.n03`|
| **Artifact**     | `S04T02N03`                |
| **Name**         | `S04T02N03`                |
| **Description**  | `S04T02N03`                |
| **Package Name** | `cat.itacademy.s04.t02.n03`|
| **Java Version** | `11+`                      |
| **Packaging**    | `Jar`                      |
| **Build Tool**   | Maven or Gradle            |

---

## 🚀 Dependencies

- 🔧 Spring Boot DevTools
- 🌐 Spring Web
- 🍃 Spring Data MongoDB

---

## 🛠️ Configuration

Configure MongoDB connection in `application.properties` (or `application.yml`):

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/your_database_name

```
Replace your_database_name with your actual local database name.

You can manage your local MongoDB with MongoDB Compass, the official GUI, which allows you to explore and manipulate your data visually.
MongoDB Atlas (Cloud Cluster)

If you use a MongoDB Atlas cluster, follow these steps:

    Create a free cluster on MongoDB Atlas.

    Whitelist your IP address to allow connections.

    Create a database user with proper credentials.

    Obtain the connection string URI from the Atlas dashboard, which looks like:

mongodb+srv://<username>:<password>@cluster0.mongodb.net/your_database_name?retryWrites=true&w=majority

    Add this URI in your application.properties:

spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster0.mongodb.net/your_database_name?retryWrites=true&w=majority

Replace <username>, <password>, and your_database_name with your credentials and DB name.

----
🍎 Entity: Fruit

The same entity as previous levels:
Field	Type	Description
id	String	Primary key (MongoDB ObjectId)
nom	String	Name of the fruit
quantitatQuilos	int	Quantity in kilos
🛠️ REST API Endpoints
HTTP Method	Endpoint	Description
POST	/fruita/add	Add a new Fruita
PUT	/fruita/update	Update an existing Fruita
DELETE	/fruita/delete/{id}	Delete Fruita by ID
GET	/fruita/getOne/{id}	Get Fruita details by ID
GET	/fruita/getAll	Get all Fruita records
📝 Best Practices

    Use appropriate HTTP status codes.

    Handle exceptions globally with a GlobalExceptionHandler.

    Use ResponseEntity for flexible responses.

🧪 How to Run

    Make sure MongoDB is installed and running on your machine.

    Import the project into your IDE.

    Run the Spring Boot application.

    Use tools like Postman to test the API endpoints.

📚 Additional Learning Resources

    📘 Spring Boot and MongoDB Guide

    📘 Spring Data MongoDB Reference