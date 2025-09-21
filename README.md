# E-Commerce Microservices Platform

A Spring Boot microservices architecture demonstrating enterprise-grade patterns for scalable e-commerce applications.

## Architecture Overview

This project implements a microservices architecture using Spring Boot and Spring Cloud, featuring service discovery, distributed configuration, and RESTful APIs.

### Services

- **Discovery Service** (Port 8761) - Eureka Server for service registration and discovery
- **User Service** (Port 8081) - User management and authentication microservice

## Tech Stack

- **Java 17** - Modern LTS version
- **Spring Boot 3.2** - Latest Spring framework
- **Spring Cloud 2023** - Microservices patterns
- **Maven** - Dependency management and build tool
- **Eureka** - Service discovery and registration

## Project Structure

```
ecommerce-microservices/
├── discovery-service/          # Eureka Server
│   ├── src/main/java/com/ecommerce/discovery/
│   │   └── DiscoveryServiceApplication.java
│   └── src/main/resources/application.yml
├── user-service/              # User Management Service
│   ├── src/main/java/com/ecommerce/user/
│   │   ├── UserServiceApplication.java
│   │   └── UserController.java
│   └── src/main/resources/application.yml
└── pom.xml                    # Parent POM configuration
```

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- Git

### Running the Application

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/ecommerce-microservices.git
   cd ecommerce-microservices
   ```

2. **Start Discovery Service**
   ```bash
   cd discovery-service
   mvn spring-boot:run
   ```
    - Eureka Dashboard: http://localhost:8761

3. **Start User Service** (in a new terminal)
   ```bash
   cd user-service
   mvn spring-boot:run
   ```
    - API Endpoints: http://localhost:8081/users

### API Testing

- **User Service Health Check**: `GET http://localhost:8081/users/health`
- **List Users**: `GET http://localhost:8081/users`
- **Eureka Dashboard**: http://localhost:8761

## Features Implemented

- ✅ Service Discovery with Eureka
- ✅ Multi-module Maven project structure
- ✅ RESTful API endpoints
- ✅ Spring Boot auto-configuration
- ✅ Microservices communication patterns

## Planned Features

- [ ] API Gateway with Spring Cloud Gateway
- [ ] Configuration Server
- [ ] Database integration with PostgreSQL
- [ ] JWT Authentication
- [ ] Docker containerization
- [ ] Circuit breaker pattern

## Development

### Building the Project

```bash
mvn clean install
```

### Running Tests

```bash
mvn test
```

## Architecture Patterns

This project demonstrates several enterprise microservices patterns:

- **Service Discovery**: Automatic service registration and discovery
- **Distributed Configuration**: Centralized configuration management
- **API Gateway**: Single entry point for client requests (planned)
- **Circuit Breaker**: Fault tolerance and resilience (planned)

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Contact

Jorge Perez - j0.perez151@gmail.com

Project Link: https://github.com/yourusername/ecommerce-microservices