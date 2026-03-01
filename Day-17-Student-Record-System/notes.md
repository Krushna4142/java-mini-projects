# 🎓 Day 17 – Student Record System (Collections + OOP)

## 🎯 Objective

Build a console-based Student Record System using proper OOP
structure and dynamic data handling.

---

## 🧠 Concepts Applied

### 1️⃣ OOP Principles

- Class & Object
- Encapsulation
- Separation of Concerns
- Single Responsibility Principle

### 2️⃣ Data Handling

- ArrayList for dynamic storage
- Searching student by roll number
- Updating marks
- Deleting records
- Iterating collections

---

## 🏗 Architecture

StudentApp (Main Class)
↓
StudentManager (Business Logic)
↓
Student (Data Model)

---

## 📌 Features

✔ Add Student  
✔ View All Students  
✔ Search Student by Roll Number  
✔ Update Student Marks  
✔ Delete Student  
✔ Clean OOP Structure

---

## ⚡ Time Complexity

Add Student → O(1)  
View Students → O(n)  
Search Student → O(n)  
Update Marks → O(n)  
Delete Student → O(n)

---

## 🎯 Interview Preparation

Q: Why use ArrayList?
→ Dynamic resizing and easy iteration.

Q: How to improve search performance?
→ Use HashMap<Integer, Student>.

Q: Why separate Student and StudentManager?
→ Follows Single Responsibility Principle.

Q: How to persist data?
→ Use File Handling or Database integration.

---

## 🚀 Future Improvements

- Add grade auto-calculation
- Sort students by marks
- Add file persistence
- Convert to database-backed system
- Add input validation
