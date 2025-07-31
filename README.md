# 🧠 Smart Contact Manager (SCM)

A full-stack web application to manage personal and professional contacts with secure authentication, cloud storage, email integration, and modern UI — built during my internship at Euonus IT as part of my B.Tech program.

---

## 🔥 Features

- 🔐 User registration with email/password and OAuth2 (Google & GitHub)
- ✅ Email verification before login
- 👥 Full CRUD for contact management
- ☁️ Profile image upload with Cloudinary/AWS S3
- ✉️ Send emails with attachments using JavaMail API
- 🔍 Contact search and pagination
- 📁 Export contact data (Excel/CSV)
- ⭐ Mark favorite contacts
- 🎨 Light/Dark mode toggle
- 👤 User profile management
- 🧪 Manual testing & secure route protection with Spring Security

---

## 🧰 Tech Stack

### 🔹 Backend
- Java 17+
- Spring Boot (MVC, Security, Data JPA)
- RESTful APIs
- MySQL / PostgreSQL

### 🔹 Frontend
- Thymeleaf (server-side rendering)
- Tailwind CSS
- Flowbite
- JavaScript (dynamic features)

### 🔹 Tools & Integrations
- JavaMail API
- Cloudinary / AWS S3
- OAuth 2.0 (Google, GitHub)
- Maven, Postman
- Git & GitHub

---

## 🗂️ Folder Structure

smart-contact-manager/
├── backend/ # Spring Boot app
├── frontend/ # Thymeleaf templates, static assets
├── database/ # SQL schema & ER diagram
├── screenshots/ # UI screenshots
├── docs/ # Project report (PDF)
├── README.md
├── .gitignore
└── pom.xml



---

## 🚀 Getting Started

### 🔧 Prerequisites
- Java 17+
- Maven
- MySQL 8+
- Git

### ⚙️ Setup

```bash
git clone https://github.com/shivanshagarwal10/scm.git
cd scm


Update src/main/resources/application.properties with your local DB and OAuth credentials.

mvn spring-boot:run


App runs at:
📍 http://localhost:8080/

🧑‍💼 About Me
👨‍💻 Shivansh Agarwal
🎓 B.Tech, Computer Science
🏢 Intern @ Euonus IT
📬shivanshagrawal21@gmail.com
🔗https://www.linkedin.com/in/shivansh-agarwal-887657234/
🔗https://leetcode.com/u/ShivanshAgrawal/


📘 Project Report
You can find the full internship + project report in /docs/.


📄 License
This project is for educational & demonstration purposes. You may fork it or use ideas with proper credit.

