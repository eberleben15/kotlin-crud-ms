kotlin-crud-ms

kotlin-crud-ms is a simple Kotlin-based RESTful microservice for managing products. It demonstrates fundamental Kotlin principles and Spring Boot features such as dependency injection, JPA for database interaction, and RESTful API development. The service supports CRUD operations on a “Product” resource and is containerized using Docker.

Features
	•	Create, Read, Update, and Delete (CRUD) operations for products.
	•	Built with Kotlin and Spring Boot.
	•	Uses H2 Database for local development.
	•	Fully containerized with Docker.
	•	Compatible with Java 17.

Requirements
	•	Java 17 installed locally.
	•	Gradle (optional if using ./gradlew).
	•	Docker installed for containerization.

Project Structure

kotlin-crud-ms/
├── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   └── com.example.kotlincrudms/
│   │   │       ├── controller/
│   │   │       │   └── ProductController.kt
│   │   │       ├── model/
│   │   │       │   └── Product.kt
│   │   │       ├── repository/
│   │   │       │   └── ProductRepository.kt
│   │   │       ├── service/
│   │   │       │   └── ProductService.kt
│   │   │       └── KotlinCrudMsApplication.kt
│   ├── resources/
│   │   ├── application.yml
│   │   └── data.sql
├── Dockerfile
├── docker-compose.yml
├── build.gradle.kts
└── README.md

Getting Started

1. Clone the Repository

git clone https://github.com/your-username/kotlin-crud-ms.git
cd kotlin-crud-ms

2. Build and Run Locally

Using Gradle
	1.	Build the project:

./gradlew clean build


	2.	Run the application:

./gradlew bootRun


	3.	The API will be available at http://localhost:8080.

3. Run with Docker
	1.	Build the Docker image:

docker build -t kotlin-crud-ms .


	2.	Run the Docker container:

docker run -p 8080:8080 kotlin-crud-ms


	3.	Verify the service is running by checking the health endpoint:

curl http://localhost:8080/actuator/health

API Documentation

Base URL

http://localhost:8080/api/products

Endpoints

Method	Endpoint	Description	Example Request
GET	/api/products	Fetch all products	curl -X GET http://localhost:8080/api/products
GET	/api/products/{id}	Fetch a product by ID	curl -X GET http://localhost:8080/api/products/1
POST	/api/products	Create a new product	See example JSON body below.
PUT	/api/products/{id}	Update an existing product	See example JSON body below.
DELETE	/api/products/{id}	Delete a product by ID	curl -X DELETE http://localhost:8080/api/products/1

Example JSON Bodies

POST /api/products

Request Body:

{
  "name": "Laptop",
  "price": 999.99
}

PUT /api/products/{id}

Request Body:

{
  "name": "Updated Laptop",
  "price": 899.99
}

Mock Data

To prepopulate the database with mock data, add the following SQL to src/main/resources/data.sql:

INSERT INTO PRODUCT (NAME, PRICE) VALUES ('Laptop', 999.99);
INSERT INTO PRODUCT (NAME, PRICE) VALUES ('Smartphone', 699.99);
INSERT INTO PRODUCT (NAME, PRICE) VALUES ('Tablet', 499.99);
INSERT INTO PRODUCT (NAME, PRICE) VALUES ('Wireless Headphones', 149.99);
INSERT INTO PRODUCT (NAME, PRICE) VALUES ('Gaming Console', 299.99);
INSERT INTO PRODUCT (NAME, PRICE) VALUES ('Smartwatch', 199.99);
INSERT INTO PRODUCT (NAME, PRICE) VALUES ('External Hard Drive', 89.99);
INSERT INTO PRODUCT (NAME, PRICE) VALUES ('Mechanical Keyboard', 129.99);
INSERT INTO PRODUCT (NAME, PRICE) VALUES ('4K Monitor', 399.99);
INSERT INTO PRODUCT (NAME, PRICE) VALUES ('Bluetooth Speaker', 99.99);

This will be automatically loaded into the H2 database when the application starts.

Testing

Run Unit Tests

The project includes tests for the API. You can run them using:

./gradlew test

Using Postman or cURL
	•	Use Postman to interact with the endpoints.
	•	Alternatively, use cURL commands as shown in the API documentation section.

Future Enhancements
	•	Add pagination and sorting for the product list.
	•	Add user authentication (e.g., JWT).
	•	Integrate with a production database like PostgreSQL.
	•	Deploy the service to a cloud platform (e.g., AWS, GCP, or Azure).

Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

License

This project is licensed under the MIT License. See the LICENSE file for details.