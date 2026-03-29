# 🛒 Smart Grocery Navigator

A Spring Boot application that helps users find nearby grocery shops efficiently based on location and preferences.

---

## 🚀 Features

* 🔍 Find nearby grocery shops
* 📍 Location-based recommendations
* ⚡ Fast REST API
* 🧪 Unit & Controller testing with MockMvc
* 🗄️ In-memory database using H2 (for testing)

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot 3
* Spring Data JPA
* H2 Database
* Maven
* JUnit & Mockito
* GitHub Actions (CI/CD)

---

## 📂 Project Structure

src/
├── main/
├   ├── java/
├   ├   ├── controller/
├   ├   ├── dto/
├   ├   ├── entity/
├   ├   ├── service/
├   ├   ├── repository/
├   ├   ├── exception/
├   ├
├   ├── resources/
├       ├── app/
├       ├── index/
├       ├── styles/
├
└── test/

---

## ⚙️ Setup & Run

### 1. Clone repository

```bash
git clone https://https://github.com/mewannirundakka-hub/SmartGrossaryNevigator.git
cd SmartGrossaryNevigator
```

### 2. Run the project

```bash
./mvnw spring-boot:run
```

👉 For Windows:

```bash
mvnw.cmd spring-boot:run
```

---

## 🧪 Run Tests

```bash
./mvnw test
```

---

## 🔗 API Endpoints

### Get Shops

```http
GET /api/shops?lat=10.0&lon=20.0
```

Response:

```json
[]
```

---

## 🤖 CI/CD

This project uses **GitHub Actions** to automatically run tests on every push.

---

## 📌 Future Improvements

* Add real-time location tracking
* Integrate Google Maps API
* Add user authentication
* Improve recommendation algorithm

---

## 👤 Author

Mewan Nirundaka

---

## 📄 License

This project is open-source and available under the MIT License.
