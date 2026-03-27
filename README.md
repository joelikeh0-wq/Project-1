# Spring Boot Project – Task 1

##  Description

This project is a simple Spring Boot application created as part of Task 1.
It demonstrates the use of Spring MVC, controllers, and Thymeleaf templates.

The application displays a greeting message and an image in the browser.

---

##  Technologies Used

* Java
* Spring Boot
* Thymeleaf
* Maven

---

## How to Run the Application

1. Open the project in IntelliJ IDEA
2. Run the class:
   `FirstProjectJavaSpringApplication`
3. Open your browser and go to:
   http://localhost:8080/hello

---

## Application Features

* Handles HTTP GET request at `/hello`
* Uses a Spring Controller (`HelloController`)
* Passes data using `Model`
* Displays dynamic content using Thymeleaf
* Shows an image from the `static` folder

---

## Screenshots

1) Resource Structure
2) HTML FIle
3) Controller Code
4) Java Code
5) Application Result

---

## How It Works

1. User opens `/hello` in browser
2. Controller handles request
3. Data is passed to the view using `Model`
4. Thymeleaf renders HTML page
5. Image is loaded from `static` folder

---

## Project Structure

* `controller` – handles requests
* `templates` – HTML files
* `static` – images and static content

---
