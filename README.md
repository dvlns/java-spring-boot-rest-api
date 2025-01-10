# Coffee Shop API
Technologies Used

    Java 17
    Spring Boot
    Spring Data JPA
    MySQL
    Lombok

What the API Does

![API Testing on Insomnia](https://github.com/user-attachments/assets/3ae51bb6-828e-4380-be64-946d46290690)


This is a simple RESTful API that manages coffee items for a coffee shop. It supports basic CRUD operations:

    Create: Add a new coffee item.
    Read: Retrieve all coffee items.
    Update: Modify an existing coffee item.
    Delete: Remove a coffee item from the database.

Database

    MySQL is used as the database.
    The database is called coffee_shop and a table named coffee is automatically created.

Endpoints

    GET /coffee/all: Retrieve all coffee items.
    POST /coffee/create: Add a new coffee item.
    PUT /coffee/update/{id}: Update an existing coffee item.
    DELETE /coffee/delete/{id}: Delete a coffee item.

Setup

    Clone this repository.
    Create a MySQL database named coffee_shop.
    Configure the database connection in application.properties.
    Run the application and the API will be live on localhost:8080.

Enjoy managing your coffee shop data! ☕
