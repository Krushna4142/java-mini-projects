<div align="center">

# 📅 Day 17 — Student Record System

### Managing Student Data Using Collections & OOP in Java

<img src="https://img.shields.io/badge/Day-17-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Collections%20%26%20OOP-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [🎓 What I Built](#-what-i-built)
- [📁 Folder Structure](#-folder-structure)
- [⚙️ Program Logic Explained](#️-program-logic-explained)
- [🖼️ Working Output](#️-working-output)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation](#-interview-preparation-day-17-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 17** is to build a **Student Record System** that helps practice:

- Managing structured data using collections
- Implementing CRUD operations
- Searching and filtering records
- Designing scalable OOP-based systems

This project connects **academic record management with structured programming logic**.

---

## 🧠 Concepts Practiced

### Core Java Concepts

- `ArrayList`
- Classes & Objects
- Encapsulation
- Method abstraction
- Looping & conditional statements
- Menu-driven programs

### Data Handling Concepts

- Adding student records
- Searching student by roll number
- Updating student details
- Deleting student record
- Displaying all records

---

## 🎓 What I Built

I built a **Console-Based Student Record System** where:

- The user can:
  - Add a student (Roll No, Name, Marks, Grade)
  - View all students
  - Search student by Roll Number
  - Update student marks
  - Delete student record
- Data is stored dynamically using `ArrayList`
- Each student is represented as an object

📌 Real-world academic management logic  
📌 Clean OOP architecture  
📌 Business logic separated from main class

---

## 📁 Folder Structure

Day-17-Student-Record-System/  
├── README.md  
├── NOTES.md  
├── assets/  
│ └── output.png  
└── src/  
 ├── Student.java  
 ├── StudentManager.java  
 └── StudentApp.java

---

<h2>⚙️ Program Logic Explained</h2>

Step 1: Create Student class

- Stores rollNumber, name, marks, grade

Step 2: Create StudentManager class

- Maintains ArrayList of students
- Adds student
- Displays all students
- Searches by roll number
- Updates marks
- Deletes student

Step 3: StudentApp (Main Class)

- Displays menu
- Accepts user input
- Calls manager methods

This structure follows proper separation of responsibilities and scalable design.

---

<h2>🖼️ Working Output</h2>

Example Menu:

1. Add Student
2. View Students
3. Search Student
4. Update Marks
5. Delete Student
6. Exit

Example Output:

101 | Rahul | 85 | A  
102 | Sneha | 78 | B

---

<h2>📝 Notes & Observations</h2>

ArrayList allows dynamic record storage

Encapsulation ensures data safety

Manager class centralizes business logic

Searching with loop results in O(n) complexity

Structure can be extended easily

---

<h2>💡 Key Takeaways</h2>

Data handling is essential for real-world systems

OOP improves maintainability

Structured record systems build backend logic confidence

Clear separation improves scalability

---

<h2>🎯 Interview Preparation (Day 17 Level)</h2>

Q1. Why use ArrayList in this system?  
Because it supports dynamic resizing and easy iteration.

Q2. What is the time complexity of searching a student?  
O(n) since we iterate through the list.

Q3. How can search performance be improved?  
By using HashMap<Integer, Student> for O(1) lookup.

Q4. Why separate Student and StudentManager classes?  
To follow Single Responsibility Principle.

Q5. How can this system be upgraded?  
By integrating database storage and validation logic.

---

## ⏭️ What’s Next?

<div align="center">

👉 Day 18 – Banking System Simulation

Focus Areas:

Advanced OOP  
Transactions Handling  
Data Validation  
Improved Business Logic

<br/>
➡️ Continue the 30 Days of Java Journey 🚀

</div>
