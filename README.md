# 🎓 Student Management System

A full-stack web application to manage students, teachers, courses, enrollments, notes, and email notifications.

## ✨ Features
- 👩‍🎓 Manage student records (CRUD operations)
- 👨‍🏫 Manage teacher records and course assignments
- 📚 Create courses and handle enrollments
- 📝 Upload and share student notes
- 📧 Automated email notifications

## 🛠 Tech Stack
- **Backend:** Java, Spring Boot
- **Frontend:** React.js
- **Database:** MySQL
- **Email:** SMTP (Gmail/Mailtrap)

## 📂 Project Structure
```
student-management-system/
├── BACKEND/student-management-system/   # Spring Boot backend
├── front_end/                          # React frontend
└── .idea/                              # IDE configs
```

## 🚀 Quick Start

### Backend Setup
```bash
cd BACKEND/student-management-system
mvn spring-boot:run
```
Runs at: http://localhost:8080

### Frontend Setup
```bash
cd front_end
npm install
npm start
```
Runs at: http://localhost:3000

## ⚙️ Configuration

### Database (application.properties)
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sms
spring.datasource.username=YOUR_DB_USER
spring.datasource.password=YOUR_DB_PASSWORD
spring.jpa.hibernate.ddl-auto=update
```

### Email (application.properties)
```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=YOUR_EMAIL
spring.mail.password=YOUR_APP_PASSWORD
```

### Frontend (.env file)
```env
REACT_APP_API_BASE_URL=http://localhost:8080/api
```

## 📡 API Endpoints
- `GET /api/students` - List students
- `POST /api/students` - Create student
- `GET /api/teachers` - List teachers
- `POST /api/courses` - Create course
- `POST /api/enrollments` - Enroll student

## 🔮 Future Features
- Role-based access control
- Attendance tracking
- Grading system
- Analytics dashboard
- File storage integration
