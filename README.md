<img width="2837" height="1526" alt="Screenshot 2025-07-27 180503" src="https://github.com/user-attachments/assets/8d799550-3105-4adc-b55d-03a75f39f724" /># 🚀 OptiPress – Smart File Compressor

OptiPress is a modern **full-stack file compression web application** built using **React.js** and **Spring Boot**.
It allows users to upload one or multiple files, compress them into a ZIP archive, view compression statistics, and download the optimized file instantly through a sleek dark-themed interface.

---

## ✨ Features

✅ Drag & Drop File Upload
✅ Multiple File Compression Support
✅ ZIP File Generation
✅ Download Compressed Files Instantly
✅ Real-Time Compression Statistics
✅ Dark Modern UI with Glassmorphism Effects
✅ Smooth Animations using Framer Motion
✅ REST API Communication between Frontend & Backend
✅ Responsive Design for Desktop & Mobile

---

## 🖼️ Project Preview

### 🔹 Main Features

* Upload files using drag & drop
* Compress multiple files into ZIP
* View:

  * Original file size
  * Compressed file size
  * Compression percentage
* Download compressed ZIP file

---

## 🛠️ Tech Stack

### 🎨 Frontend

* React.js
* Axios
* Bootstrap
* Framer Motion
* React Dropzone
* Custom CSS

### ⚙️ Backend

* Spring Boot
* Java
* Maven
* REST APIs
* ZipOutputStream (Java ZIP Compression)

---

## 🧠 How the Project Works

1. User uploads files through the React frontend.
2. Frontend sends files to Spring Boot backend using REST API.
3. Backend compresses files into a ZIP archive.
4. Backend returns:

   * Compressed ZIP file
   * Original Size
   * Compressed Size
5. Frontend displays compression statistics and allows ZIP download.

---

# 📂 Project Structure

```bash
FILE-COMPRESSOR/
│
├── frontend/                 # React Frontend
│   ├── src/
│   ├── public/
│   └── package.json
│
├── backend/
│   └── compressor-backend/   # Spring Boot Backend
│       ├── src/main/java/
│       ├── src/main/resources/
│       └── pom.xml
│
└── README.md
```

---

# ⚙️ Installation & Setup

## 🔹 Clone the Repository

```bash
git clone https://github.com/Srivishnuboddu/file-compressor.git
cd OptiPress
```

---

# 🚀 Backend Setup (Spring Boot)

## Navigate to backend

```bash
cd backend/compressor-backend
```

## Install dependencies & build project

```bash
mvn clean install
```

## Run backend server

```bash
mvn spring-boot:run
```

Backend will run on:

```bash
http://localhost:8080
```

---

# 🌐 Frontend Setup (React)

## Open new terminal

```bash
cd frontend
```

## Install dependencies

```bash
npm install
```

## Start frontend

```bash
npm start
```

Frontend will run on:

```bash
http://localhost:3000
```

---

# 📡 REST API Endpoint

## Compress Files API

```http
POST /compress
```

### Request Type

```http
multipart/form-data
```

### Response

```json
{
  "originalSize": 20480,
  "compressedSize": 10240,
  "compressedFile": "BASE64_DATA"
}
```

---

# 🎥 Demo Video

📺 Watch the Full Project Demo Here:

👉 https://youtu.be/sh7bNF9k3N4

---

# 🧪 Testing

Backend APIs were tested using:

* Postman
* React Frontend Integration

---

# 🔥 Future Improvements

* User Authentication
* Cloud File Storage
* Advanced Compression Algorithms
* File History Tracking
* Decompression Support
* Progress Tracking for Large Files

---

# 📚 Key Concepts Used

* REST APIs
* Multipart File Upload
* ZIP Compression
* React Hooks
* State Management
* Axios API Calls
* Base64 Encoding
* Spring Boot Controllers
* Cross-Origin Resource Sharing (CORS)

---

# 👨‍💻 Developed By

### ❤️ Sri Vishnu Boddu

If you liked this project, feel free to ⭐ the repository and share your feedback!

---

# 📜 License

This project is licensed under the MIT License.



🙌 Credits
Developed by ❤️ Sri Vishnu Boddu

