# Student Management APP

## Overview
This is a **Spring Boot REST APP** for managing student records. It allows users to:
- Retrieve all students
- Retrieve a student by registration number
- Add a new student
- Update a student
- Delete a student

## Technologies Used
- Java 17
- Spring Boot
- Maven
- Postman (for API testing)

## Setup Instructions

### Prerequisites
Ensure you have the following installed:
- **Java 17** ([Download](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html))
- **Maven** ([Download](https://maven.apache.org/download.cgi))
- **Postman** (Optional, for API testing)


## API Endpoints

### Retrieve All Students
- **GET** `/app/students`
- **Response:**
  ```json
  [
      { "regNo": "2020ICT43", "name": "Bob", "age": 56, "department": "IT", "gpa": 95.0 },
      { "regNo": "2020ICT49", "name": "Alice", "age": 56, "department": "AMC", "gpa": 140.0 }
  ]
  ```

### Retrieve a Student by Registration Number
- **GET** `/app/regno/{regNo}`
- **Example:** `/app/regno/2020ICT43`

### Add a New Student
- **POST** `/app/add`
- **Request Body:**
  ```json
  {
      "regNo": "2020ICT50",
      "name": "John Doe",
      "age": 22,
      "department": "CSE",
      "gpa": 88.5
  }
  ```

### Update a Student
- **PUT** `/app/{regNo}`
- **Example:** `/app/2020ICT50`
- **Request Body:**
  ```json
  {
      "regNo": "2020ICT50",
      "name": "John Doe Updated",
      "age": 23,
      "department": "Software Engineering",
      "gpa": 92.5
  }
  ```

### Delete a Student
- **DELETE** `/app/{regNo}`
- **Example:** `/app/2020ICT50`

## Output Screenshots
(Add your API response screenshots here)
- **Show student details by registration number:**
  ![Students List](https://github.com/manuka8/E-Commerce-IT3232-Day03/blob/main/Screenshot%20(428).png)

- **List of Students:**
  ![Students List](https://github.com/manuka8/E-Commerce-IT3232-Day03/blob/main/Screenshot%20(429).png)

- **Adding a Student:**
  ![Add Student](https://github.com/manuka8/E-Commerce-IT3232-Day03/blob/main/Screenshot%20(430).png)

- **Updating a Student:**
  ![Update Student](https://github.com/manuka8/E-Commerce-IT3232-Day03/blob/main/Screenshot%20(431).png)

- **Deleting a Student:**
  ![Delete Student](https://github.com/manuka8/E-Commerce-IT3232-Day03/blob/main/Screenshot%20(432).png)

