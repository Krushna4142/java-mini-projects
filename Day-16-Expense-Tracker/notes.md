# 💰 Day 16 – Expense Tracker (Data Handling + OOP)

## 🎯 Objective

Build a console-based Expense Tracker using proper object-oriented design
and dynamic data handling with ArrayList.

---

## 🧠 Concepts Applied

### 1️⃣ OOP Principles

- Class & Object
- Encapsulation
- Separation of Concerns
- HAS-A relationship

### 2️⃣ Data Handling

- ArrayList for dynamic storage
- Searching objects by ID
- Removing objects safely
- Aggregating values (Total Expense)

### 3️⃣ Design Structure

ExpenseApp (Main Class)
↓
ExpenseManager (Business Logic)
↓
Expense (Data Model)

---

## 📌 Functional Features

✔ Add Expense  
✔ View All Expenses  
✔ Delete Expense by ID  
✔ Calculate Total Expense  
✔ Clean multi-class architecture

---

## ⚡ Time Complexity

Add Expense → O(1)  
View Expenses → O(n)  
Delete Expense → O(n)  
Search Expense → O(n)  
Total Calculation → O(n)

---

## 🎯 Interview Preparation

Q: Why use ArrayList?
→ Dynamic resizing and built-in utility methods.

Q: Why separate Expense and ExpenseManager?
→ Follows Single Responsibility Principle.

Q: How to optimize search?
→ Replace ArrayList with HashMap<Integer, Expense>.

Q: How to persist data?
→ Use File Handling or Database.

---

## 🚀 Future Improvements

- Category filtering
- Monthly expense summary
- Budget warning system
- File persistence
- Database integration
- Sorting expenses by date or amount
