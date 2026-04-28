# Enterprise Task Management Platform — DevOps Implementation

## 🚀 Overview

This project demonstrates a **production-style DevOps architecture** for a cloud-native application. It implements the full lifecycle of software delivery:

* Application development (Java / Spring Boot)
* Containerization (Docker)
* Continuous Integration & Delivery (Jenkins)
* Code Quality Enforcement (SonarQube)
* Artifact Management (AWS ECR)
* Infrastructure as Code (Terraform on AWS)
* Automated Deployment (EC2)
* Monitoring & Observability (Prometheus + Grafana)

The goal is to simulate how modern engineering teams build, test, deploy, and monitor applications in a **real enterprise environment**.

---

## 🧱 Architecture Diagram

```mermaid
flowchart LR

    Dev[Developer] -->|Push Code| GitHub[GitHub Repository]

    GitHub --> Jenkins[Jenkins CI/CD Pipeline]

    Jenkins -->|Build & Test| AppBuild[Java Build (Maven)]
    Jenkins -->|Code Analysis| Sonar[SonarQube]
    Jenkins -->|Build Image| Docker[Docker Image]

    Docker -->|Push Image| ECR[AWS ECR Repository]

    Jenkins -->|Trigger Deploy| EC2[EC2 Instance]

    EC2 -->|Pull Image| ECR
    EC2 -->|Run Container| App[Spring Boot Application]

    App -->|Metrics| Prometheus[Prometheus]
    Prometheus --> Grafana[Grafana Dashboard]

    User[Client] -->|HTTP Request| App
```

---

## ⚙️ Tech Stack

### Application Layer

* Java (Spring Boot)
* REST API Architecture
* MongoDB (optional integration)

### DevOps & CI/CD

* Jenkins (Pipeline as Code)
* GitHub (Version Control)
* Docker (Containerization)

### Cloud & Infrastructure

* AWS EC2 (Compute)
* AWS ECR (Container Registry)
* Terraform (Infrastructure as Code)

### Quality & Security

* SonarQube (Static Code Analysis)

### Monitoring & Observability

* Prometheus (Metrics Collection)
* Grafana (Visualization)

---

## 🔄 CI/CD Pipeline Flow

1. Developer pushes code to GitHub
2. Jenkins pipeline is triggered
3. Application is built using Maven
4. Unit tests are executed
5. Code is analyzed using SonarQube
6. Docker image is built
7. Image is pushed to AWS ECR
8. EC2 instance pulls the latest image
9. Container is deployed automatically
10. Prometheus scrapes metrics
11. Grafana visualizes system performance

---

## 📦 Project Structure

```text
enterprise-task-management-platform/
│
├── app/                    # Spring Boot application
├── ci-cd/                 # Jenkins pipelines & automation
├── infrastructure/        # Terraform & Ansible configs
├── monitoring/            # Prometheus & Grafana setup
├── quality/               # SonarQube configuration
├── artifact-repository/   # Nexus/ECR configs
├── docker/                # Dockerfiles & compose
├── docs/                  # Architecture & system design
└── README.md
```

---

## ▶️ Running Locally

### 1. Build application

```bash
cd app
./mvnw clean package
```

### 2. Run with Docker

```bash
docker build -t enterprise-task-platform -f docker/application/Dockerfile .
docker run -p 8080:8080 enterprise-task-platform
```

### 3. Access API

```
http://localhost:8080/api/v1/tasks
```

---

## ☁️ Deployment (AWS)

### Infrastructure Provisioning

```bash
cd infrastructure/terraform
terraform init
terraform apply
```

### CI/CD Deployment

Triggered automatically via Jenkins pipeline.

---

## 📊 Monitoring

* Prometheus collects application metrics from:

```
/actuator/prometheus
```

* Grafana dashboards available at:

```
http://localhost:3000
```

---

## 🔐 Security Considerations

* Non-root Docker containers
* IAM roles for EC2 → ECR access
* Secure SSH key authentication
* Network isolation via VPC

---

## 📌 Key DevOps Capabilities Demonstrated

* End-to-end CI/CD automation
* Infrastructure as Code (Terraform)
* Container lifecycle management
* Cloud-native deployment strategy
* Observability and monitoring
* Code quality enforcement

---

## 🎯 Outcome

This project demonstrates the ability to design and implement a **complete DevOps pipeline**, aligning with real-world enterprise practices.

It showcases readiness for roles involving:

* Cloud Infrastructure Engineering
* DevOps Engineering
* Site Reliability Engineering (SRE)

---
