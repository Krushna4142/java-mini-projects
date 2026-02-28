<div align="center">

# 📅 Day 16 — Expense Tracker

### Managing Personal Finance Using Data Handling & OOP in Java

<img src="https://img.shields.io/badge/Day-16-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Data%20Handling%20%26%20OOP-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [💰 What I Built](#-what-i-built)
- [📁 Folder Structure](#-folder-structure)
- [⚙️ Program Logic Explained](#️-program-logic-explained)
- [🖼️ Working Output](#️-working-output)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation](#-interview-preparation-day-16-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 16** is to build a **Console-Based Expense Tracker** that helps practice:

- Managing dynamic data using collections
- Applying Object-Oriented Programming
- Implementing CRUD operations
- Designing structured, multi-class systems

This project connects **real-world finance management with data-driven programming**.

---

## 🧠 Concepts Practiced

### Core Java Concepts

- `ArrayList`
- `Scanner` class
- Classes & Objects
- Encapsulation
- Method abstraction
- Looping and conditional statements

### Data Handling Concepts

- Dynamic object storage
- Searching data by ID
- Removing objects safely
- Aggregating data (Total calculation)

---

## 💰 What I Built

I built an **Expense Tracker System** where:

- Users can:
  - Add an expense (ID, amount, category, date)
  - View all expenses
  - Delete expense by ID
  - Calculate total expenses
- Data is stored using `ArrayList`
- Each expense is modeled as an object

📌 Real-world budgeting logic  
📌 Clean OOP structure  
📌 Manager class for business logic

---

## 📁 Folder Structure

Day-16-Expense-Tracker/  
├── README.md  
├── NOTES.md  
├── assets/  
│ └── output.png  
└── src/  
 ├── Expense.java  
 ├── ExpenseManager.java  
 └── ExpenseApp.java

---

<h2>⚙️ Program Logic Explained</h2>

Step 1: Create an Expense class

- Stores id, amount, category, date

Step 2: Create ExpenseManager class

- Maintains ArrayList of expenses
- Adds expense
- Displays expenses
- Deletes expense by ID
- Calculates total expense

Step 3: ExpenseApp (Main Class)

- Displays menu
- Takes user input
- Calls manager methods

This structure follows separation of responsibilities and clean OOP design.

---

<h2>🖼️ Working Output</h2>

Example Menu:

1. Add Expense
2. View Expenses
3. Delete Expense
4. Show Total Expense
5. Exit

Example Output:

101 | ₹500.0 | Food | 10-02-2026  
102 | ₹1200.0 | Travel | 11-02-2026

Total Expense: ₹1700.0

---

<h2>📝 Notes & Observations</h2>

ArrayList allows dynamic storage without fixed size

Encapsulation improves data safety

Separation of logic makes code scalable

Manager class improves maintainability

Menu-driven programs simulate real backend systems

---

<h2>💡 Key Takeaways</h2>

Data handling is the backbone of real-world applications

OOP makes programs modular and extendable

Collections are essential for dynamic systems

Structured thinking improves interview readiness

---

<h2>🎯 Interview Preparation (Day 16 Level)</h2>

Q1. Why use ArrayList instead of array?  
Because ArrayList dynamically resizes and provides useful methods.

Q2. Why separate Expense and ExpenseManager?  
To follow Single Responsibility Principle.

Q3. What is the time complexity of searching by ID?  
O(n) because we iterate through the list.

Q4. How can this be optimized?  
By using HashMap<Integer, Expense> for O(1) lookup.

Q5. How can we persist data permanently?  
By implementing file handling or database storage.

---

## ⏭️ What’s Next?

<div align="center">

👉 Day 17 – Student Management System

Focus Areas:

Advanced Collection Handling  
Search & Filter Logic  
Improved Object Relationships

<br/>
➡️ Continue the  Journey 🚀

</div>
