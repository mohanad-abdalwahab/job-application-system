#   Job Application System - Microservices Architecture

This is a **Job Application System** built using **Spring Boot** and designed following the **Microservices Architecture Pattern**. Each service is independent, modular, and registered via **Eureka Discovery Server**, with centralized configuration management.

---

##   Microservices Structure

| Service              | Description                                | Port  |
|----------------------|--------------------------------------------|--------|
| `config-server`      | Centralized configuration via GitHub repo  | 8888   |
| `discovery-server`   | Eureka service registry                    | 8761   |
| `user-service`       | Manages job seekers and HR users           | 8082   |
| `application-service`| Handles job applications & their statuses | 8081   |
| `api-gateway`        | Routes and protects APIs                   | 8083   |

---

##   Architecture Overview

```mermaid
graph TD;
    Client -->|HTTP| APIGateway
    APIGateway -->|Route| UserService
    APIGateway -->|Route| ApplicationService
    UserService --> DiscoveryServer
    ApplicationService --> DiscoveryServer
    APIGateway --> DiscoveryServer
    ConfigServer -->|Reads from| GitHubRepo
    UserService --> ConfigServer
    ApplicationService --> ConfigServer
    APIGateway --> ConfigServer
  All services retrieve their config from config-server, which pulls files from a GitHub repository.

  How to Run the Project
Clone the repository

bash
Copy
Edit
git clone https://github.com/mohanad-abdalwahab/job-application-system.git
cd job-application-system
Start services in order:

config-server

discovery-server

user-service

application-service

api-gateway

Access endpoints:

Eureka dashboard: http://localhost:8761

API Gateway: http://localhost:8083

  Technologies Used
Java 17

Spring Boot 3.x

Spring Cloud (Config, Eureka, Gateway)

Maven

IntelliJ IDEA / PyCharm

Git + GitHub

  Author
Mohanad Abdalwahab
Master's student in Information Technology , Islamic University of Gaza
Advanced Software Engineering course, supervised by Dr. Abdul Karim Al-Ashqar

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

yaml
Copy
Edit

---

## 📌 التعليمات:

1. افتح مشروعك في IntelliJ.
2. أنشئ ملفًا جديدًا في الجذر باسم `README.md`.
3. انسخ النص أعلاه والصقه في الملف.
4. احفظ الملف ثم نفّذ:

```bash
git add README.md
git commit -m "Add project documentation in README.md"
git push origin master
