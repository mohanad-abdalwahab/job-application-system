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
    ConfigServer --> UserService
    ConfigServer --> ApplicationService
    ConfigServer --> APIGateway
