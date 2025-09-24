# Student Management System

A **Spring Boot** application with **PostgreSQL** database for managing student records using **RESTful APIs**.  
This system allows CRUD operations (Create, Read, Update, Delete) on student data.

---

## Features

- Add new students (POST)
- Retrieve student details (GET)
- Update student information (PUT)
- Delete students (DELETE)
- Built with Spring Boot, JPA, and PostgreSQL
- Follows REST API principles

---

## Technologies Used

- **Backend:** Java, Spring Boot, Spring Data JPA  
- **Database:** PostgreSQL  
- **Build Tool:** Maven  
- **API Testing:** Postman or any REST client  

---

## API Endpoints

| Method | Endpoint                  | Description                  |
|--------|---------------------------|------------------------------|
| GET    | `/students`               | Get all students             |
| GET    | `/students/{id}`          | Get a student by ID          |
| POST   | `/students`               | Create a new student         |
| PUT    | `/students/{id}`          | Update a student by ID       |
| DELETE | `/students/{id}`          | Delete a student by ID       |

---

## Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/student-management-system.git
   cd student-management-system


   Create a PostgreSQL database:

### CREATE DATABASE student_management;


# Update application.properties:

- spring.datasource.url=jdbc:postgresql://localhost:5432/student_management
- spring.datasource.username=YOUR_DB_USERNAME
- spring.datasource.password=YOUR_DB_PASSWORD
- spring.jpa.hibernate.ddl-auto=update
- spring.jpa.show-sql=true


#Run the application:
- mvn spring-boot:run


Test the APIs using Postman or any REST client.
-----------------------------------------------------------
## Project Structure
- src
 - └─ main
    - ├─ java
    -  │   └─ com.example.studentmanagement
    - │       ├─ controller    # REST API Controllers
    -  │       ├─ dto           # Data Transfer Objects
    -  │       ├─ entity        # Database Entities
    -  │       ├─ repository    # JPA Repositories
    -  │       └─ service       # Service Layer
    -  └─ resources
       -   ├─ application.properties
       -  └─ data.sql (optional)

## Contributing

- Contributions are welcome!

- Fork the repository

- Create your feature branch:

- git checkout -b feature/AmazingFeature


## Commit your changes:

- git commit -m 'Add some feature'


## Push to the branch:

- git push origin feature/AmazingFeature


## Open a Pull Request

Author

Vedant Bhombe – GitHub Profile
