# 📚 Day 15 – Library Management System (OOP)

## 🎯 Objective

Build a menu-driven Library Management System using core OOP principles.

---

## 🧠 Concepts Used

### 1️⃣ Class & Object

- Book → represents a single book
- Library → manages collection of books
- LibraryApp → main driver class

---

### 2️⃣ Encapsulation

- Private data members
- Public getters & setters
- Controlled access to book state

---

### 3️⃣ Object Composition

- Library contains ArrayList<Book>
- Demonstrates HAS-A relationship

---

### 4️⃣ Menu Driven Logic

- Add Book
- View Books
- Issue Book
- Return Book
- Exit

---

## 🏗 Architecture

LibraryApp (Main)
↓
Library
↓
Book

---

## 🧾 Features

✔ Add Book  
✔ View All Books  
✔ Issue Book  
✔ Return Book  
✔ OOP Structured Design  
✔ Clean Separation of Responsibilities

---

## 💡 Interview Takeaways

Q: Why use separate classes?
→ Separation of concerns & maintainability.

Q: Why encapsulation?
→ Data security and controlled access.

Q: What is HAS-A relationship?
→ Library HAS-A collection of Book objects.

---

## 🚀 Possible Improvements

- Add Search Feature
- Add Remove Book
- Add File Handling (Data Persistence)
- Use HashMap for faster lookup
- Add User Roles (Admin / Member)
