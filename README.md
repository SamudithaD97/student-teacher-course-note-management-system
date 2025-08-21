#!/bin/bash

# Script to create README.md and upload to GitHub
# Make sure you're in your project directory first

# Create README.md file with content
cat > README.md << 'EOF'
# 🎓 Student Management System

A **full-stack web application** to manage **students, teachers, courses, enrollments, notes**, and **email notifications**.  
The project is built with a **separate backend and frontend**, but everything runs together as a single system.

---

## ✨ Features

- 👩‍🎓 Manage student records (create, update, view, delete)
- 👨‍🏫 Manage teacher records and assign them to courses
- 📚 Create courses and handle student enrollments
- 📝 Upload and share student notes/resources
- 📧 Send automated email notifications (e.g., enrollments, note updates)

---

## 🛠 Tech Stack

- **Backend:** Java, Spring Boot  
- **Frontend:** React.js  
- **Database:** MySQL 
- **Email:** SMTP (via Spring Boot Mail – e.g., Gmail, Mailtrap)  

---

## 📂 Project Structure

```
student-management-system/
├── BACKEND/student-management-system   # Spring Boot backend
├── front_end                           # React frontend
└── .idea                               # IDE configs
```

## 🚀 Getting Started (Backend + Frontend)

### 1. Clone the Repository

```bash
git clone https://github.com/SamudithaD97/student-management-system.git
cd student-management-system
```

### 2. Configure Environment

#### Backend: Edit `application.properties`

Edit `BACKEND/student-management-system/src/main/resources/application.properties`

Example for MySQL + SMTP:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sms?useSSL=false&serverTimezone=UTC
spring.datasource.username=DB_USER
spring.datasource.password=DB_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=YOUR_EMAIL
spring.mail.password=YOUR_APP_PASSWORD
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

#### Frontend: Create Environment File

Create a `.env` file inside `front_end/`:

```env
REACT_APP_API_BASE_URL=http://localhost:8080/api
```

### 3. Run Backend

```bash
cd BACKEND/student-management-system
mvn spring-boot:run
```

**Backend runs at:** http://localhost:8080

### 4. Run Frontend

```bash
cd front_end
npm install
npm start
```

**Frontend runs at:** http://localhost:3000

---

## 🌐 API Endpoints (Examples)

- `GET /api/students` → List students
- `POST /api/students` → Create student
- `GET /api/teachers` → List teachers
- `POST /api/courses` → Create course
- `POST /api/enrollments` → Enroll student
- `POST /api/notes` → Upload note

---

## 🗃️ Core Models

- **Student** → id, name, email, enrolledCourses
- **Teacher** → id, name, email, assignedCourses
- **Course** → id, name, code, teacherId, schedule
- **Enrollment** → id, studentId, courseId, status, enrolledAt
- **Note** → id, title, fileUrl/content, ownerId, createdAt

---

## 🔮 Roadmap

- Role-based access (Admin / Teacher / Student)
- Attendance & grading
- Analytics dashboard
- File storage integration (AWS S3, etc.)
- Docker Compose for full stack setup
EOF

# Add README to git
git add README.md

# Commit with message
git commit -m "Add comprehensive README.md documentation"

# Push to GitHub
git push origin main

echo "README.md has been created and pushed to GitHub successfully!"
