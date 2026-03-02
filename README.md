# Smart Healthcare & Future-Ready APIs 🏥

This project is a Spring Boot application designed to provide advanced healthcare management solutions through various RESTful APIs.

## 📋 Project Tasks Implemented

### 1. AI-based Doctor Suggestion
- **Description**: Suggests specialized doctors based on user symptoms.
- **Endpoint**: `POST /api/doctor/suggest`

### 2. Patient Risk Score API
- **Description**: Calculates patient risk level based on age and heart rate (BPM).
- **Endpoint**: `GET /api/risk/calculate-score`

### 3. Readmission Prediction API
- **Description**: Predicts the probability of patient readmission based on medical history.
- **Endpoint**: `GET /api/predict/readmission-probability`

### 4. Smart Queue Management & Wait Time
- **Description**: Manages patient waiting queues and provides real-time estimated waiting time.
- **Endpoint**: `GET /api/queue/live-status`

## 🛠️ Tech Stack
- **Framework**: Spring Boot 3.x
- **Language**: Java
- **Build Tool**: Maven

## 🚀 How to Run
1. Open the project in IntelliJ IDEA.
2. Navigate to `com.HealthCare.HealthCareAPI.HealthCareApiApplication`.
3. Click the **Run** button.
4. The server will start on `http://localhost:8080`.
5.