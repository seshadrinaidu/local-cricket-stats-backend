# 🏏 Local Cricket Stats — Backend

A REST API built with Java and Spring Boot for managing cricket batting records. This backend powers the Local Cricket Stats web application.

## 🌐 Live Demo

- **Frontend:** https://local-cricket-stats-frontend.vercel.app/
- **Backend API:** https://local-cricket-stats-backend.onrender.com/api/batting-records

> Note: The backend is hosted on Render's free service and may take a short time to respond after being idle.

## ✨ Features

- Retrieve cricket batting records
- Add new batting records
- Update batting records, if supported by the current API
- Delete batting records
- Connect the frontend to the backend through REST APIs
- Store application data in MySQL

## 🛠️ Tech Stack

- **Language:** Java
- **Framework:** Spring Boot
- **API:** REST
- **Database:** MySQL
- **Build Tool:** Maven
- **Deployment:** Render
- **Containerization:** Docker

## 🏗️ Architecture

```text
React Frontend (Vercel)
        |
        | HTTP requests
        v
Spring Boot REST API (Render)
        |
        | Database operations
        v
      MySQL
```

## 🔌 API

Base URL:

```text
https://local-cricket-stats-backend.onrender.com
```

The batting records endpoint is:

```text
/api/batting-records
```

| Operation | HTTP Method | Endpoint |
|---|---|---|
| Get batting records | GET | `/api/batting-records` |
| Create a batting record | POST | `/api/batting-records` |
| Update a batting record | PUT | `/api/batting-records/{id}` |
| Delete a batting record | DELETE | `/api/batting-records/{id}` |

Confirm the update endpoint and HTTP method against your controller before relying on that row.

## 🚀 Run Locally

### Prerequisites

- Java JDK
- Maven (or the included Maven Wrapper)
- MySQL Server
- Git

### 1. Clone the repository

```bash
git clone https://github.com/seshadrinaidu/local-cricket-stats-backend.git
cd local-cricket-stats-backend
```

### 2. Configure the database

Create a MySQL database and configure the connection in your local application configuration.

Set your database URL, username, and password using your local configuration or environment variables. **Do not commit database credentials or secrets to GitHub.**

### 3. Run the application

On Windows:

```bash
mvnw.cmd spring-boot:run
```

On macOS or Linux:

```bash
./mvnw spring-boot:run
```

The application will start using the port configured in your project.

## 🔗 Related Repository

- **Frontend:** https://github.com/seshadrinaidu/local-cricket-stats-frontend

## 👨‍💻 Author

**Seshadri Naidu**

- GitHub: https://github.com/seshadrinaidu
- LinkedIn: https://www.linkedin.com/in/seshadrinaidu/

---

Built as a practical full-stack project to learn REST API development, backend integration, and database connectivity.
