Spring Boot Task 1

 Project: First Spring Boot Application (Task 1)

This project is created as part of the Spring Framework Apps – Project for Everyone course at Vistula University.
The goal of Task 1 is to build a simple Spring Boot application that:

runs on localhost

handles HTTP requests

uses a Controller

returns plain text

returns a dynamic HTML view using Thymeleaf

displays an image from the static folder

 Technologies Used
Java 17+

Spring Boot (latest stable)

Spring Web

Thymeleaf

Maven

IntelliJ IDEA

 Project Structure

src/main/java/com.VISTU.spring1
└── controller
└── HelloController.java

src/main/resources
├── static
│     └── images
│           └── vistula.jpg
└── templates
└── greeting.html
 How It Works (MVC Explanation)
Controller (C)
Handles incoming HTTP requests.

HelloController.java:

/ → returns plain text

/greeting?name=YourName → returns HTML page with dynamic name

View (V)
Thymeleaf template located in:


src/main/resources/templates/greeting.html
Displays:

dynamic text: “Hello, {name}!”

custom paragraph

image from /static/images/

Model (M)
Data passed from controller to the view:

java
model.addAttribute("name", name);
How to Run the Project
Open the project in IntelliJ IDEA

Wait for Maven to download dependencies

Run the main class:


Spring1Application.java
Open your browser and test:

 Plain text endpoint

http://localhost:8080/
 Dynamic HTML page

http://localhost:8080/greeting?name=Ismoil
 Endpoints Overview
Method	Endpoint	Description
GET	/	Returns plain text message
GET	/greeting?name=YourName	Returns HTML page with dynamic name + image



 Project running 
![](C:\Users\user\Desktop\spring 1\spring1\screenshots)



src/main/resources/static/images/vistula.jpg
Referenced in HTML as:

html
<img th:src="@{/images/vistula.jpg}" />
 Files Included
 HelloController.java
Handles HTTP requests.

 greeting.html
Thymeleaf template with dynamic content and image.

 .gitignore
Ensures unnecessary files are not pushed to GitHub.

  Author
Ismoil  
Vistula University — Spring Framework Project
Task 1 — Completed