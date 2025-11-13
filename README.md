🏥 Medisphere – Hospital Management System

A complete patient-first hospital management web application built using Spring Boot, Thymeleaf, MySQL, and HTML/CSS.

Medisphere simplifies hospital workflows with features like patient registration, doctor browsing, appointment booking, and medicine advisory.
This project is designed with clean UI, smooth navigation, and real-time functionality.


---

🚀 Features

👤 Patient Registration

Users can register with name, email, age, password, and diagnosis.

Beautiful success animation after registration.

Data stored securely in MySQL.


🏠 Dashboard for Patients

After login/registration, users can:

Browse available doctors

Book appointments

Check upcoming and past appointments

Search and explore medicines

Use AI-like Smart Medicine Advisor

Logout securely


🩺 Doctors Module

View all doctors (10 predefined)

Search by name or specialization

Book appointment for any doctor

Fully animated and responsive UI


📅 Appointments Module

Users can book appointments for a specific doctor

Appointment status auto-updates:

Scheduled — for upcoming

Closed — once time passes


All appointment details stored in MySQL


💊 Medicines Module

Add, view, update, delete medicines

Smart Medicine Advisor:
Enter your diagnosis → get instant medicine suggestions

Extensible list of diseases and recommended medicines


🔐 Security

Registration accessible directly

All internal pages require login

Logout returns user safely to registration page



---

🛠 Tech Stack

Backend

Java 21

Spring Boot 3

Spring MVC

Spring JPA + Hibernate


Frontend

HTML5

CSS3

Thymeleaf


Database

MySQL 8.x


Build Tool

Maven



---

📂 Project Structure

Medisphere/
│
├── src/main/java/com/medisphere/
│   ├── controller/        # All web controllers
│   ├── model/             # Entity models (Registration, Appointment, Medicine)
│   ├── repository/        # JPA Repositories
│   ├── config/            # Security config, data initializer
│   └── MedisphereApplication.java
│
├── src/main/resources/
│   ├── templates/         # Thymeleaf HTML pages
│   │   ├── registration.html
│   │   ├── home.html
│   │   ├── doctors.html
│   │   ├── appointment-form.html
│   │   ├── appointments.html
│   │   ├── medicines.html
│   │   └── smart-advisor.html
│   └── application.properties
│
└── pom.xml


---

⚙ How to Run

1️⃣ Clone the Repository

git clone https://github.com/your-username/medisphere.git
cd medisphere

2️⃣ Configure MySQL

Create a database:

CREATE DATABASE medisphere_db;

Update MySQL credentials in application.properties.

3️⃣ Run the App

mvn spring-boot:run

App starts at:
👉 http://localhost:9001


---

🧪 Database Tables

registration

Stores user details.

appointment

Stores booked appointments.

medicine

Stores registered medicines.

🤝 Contributing

Feel free to fork this repo and submit pull requests.


---
