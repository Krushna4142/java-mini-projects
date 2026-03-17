<div align="center">

# 📅 Day 23 — Employee Payroll System

### Real Salary Calculation Using Java Logic

<img src="https://img.shields.io/badge/Day-23-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Payroll%20System-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [📂 What I Built](#-what-i-built)
- [📁 Folder Structure](#-folder-structure)
- [⚙️ System Logic Explained](#️-system-logic-explained)
- [🖼️ Working Output](#️-working-output)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation](#-interview-preparation-day-23-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 23** is to build an **Employee Payroll System** that calculates employee salaries using real-world business logic.

Payroll systems are used in companies to manage employee payments by calculating:

- Base Salary
- Allowances
- Deductions
- Final Net Salary

Instead of just storing data, this project focuses on **performing calculations based on employee salary components**.

In this system, the program will:

- Store employee details
- Calculate salary components
- Display employee payroll information

---

## 🧠 Concepts Practiced

### Core Java Concepts

- Classes and Objects
- Arithmetic calculations
- Arrays of objects
- Menu driven programs
- Scanner for user input

### Logical Skills

- Salary calculation logic
- Financial computation
- Managing employee data
- Designing real-world system logic

---

## 📂 What I Built

A **Console-Based Employee Payroll System** that can:

✔ Add employee records  
✔ Calculate salary components  
✔ Generate employee payroll details  
✔ Display salary information

📌 Demonstrates **real-world financial calculations**  
📌 Introduces **business logic implementation**  
📌 Builds foundation for **HR and payroll systems**

Payroll systems are widely used in:

- Corporate companies
- Government organizations
- HR departments
- Accounting systems

---

## 📁 Folder Structure

```
Day-23-Employee-Payroll-System/
├── README.md
├── NOTES.md
└── src/
    ├── Employee.java
    ├── PayrollManager.java
    └── PayrollApp.java
```

---

## ⚙️ System Logic Explained

### Step 1 — Create Employee Class

Each employee is represented using an **Employee class**.

Example:

```
class Employee {
    int id;
    String name;
    double salary;
}
```

This class stores employee information.

---

### Step 2 — Define Salary Components

The salary is calculated using components such as:

- Basic Salary
- HRA (House Rent Allowance)
- DA (Dearness Allowance)
- Deductions

Example logic:

```
double hra = salary * 0.20;
double da = salary * 0.10;
double deductions = salary * 0.05;
```

---

### Step 3 — Calculate Net Salary

The final salary is calculated by adding allowances and subtracting deductions.

Example:

```
double netSalary = salary + hra + da - deductions;
```

This gives the **final payroll amount**.

---

### Step 4 — Store Employee Records

Multiple employees are stored using an **array of objects**.

Example:

```
Employee[] employees = new Employee[50];
```

This allows the system to manage multiple employee payroll records.

---

### Step 5 — Display Payroll Details

The system calculates and prints the salary breakdown for each employee.

Example:

```
System.out.println("Net Salary: " + netSalary);
```

This generates a **simple payroll report**.

---

## 🖼️ Working Output

📸 Example program run:

👉 View Output Screenshot

<img src="assets/output.png" width="650"/>

---

## 📝 Notes & Observations

Payroll systems involve **financial calculations**

Allowances increase salary while deductions reduce salary

Objects help manage employee records efficiently

Business logic is an important part of real software systems

---

## 💡 Key Takeaways

Payroll systems demonstrate **real-world financial logic**

Java programs can perform structured salary calculations

Classes help organize employee data

This project introduces **business-oriented programming**

---

## 🎯 Interview Preparation (Day 23 Level)

**Q1. What is a Payroll System?**  
A payroll system calculates employee salaries including allowances and deductions.

**Q2. What are salary components?**  
Salary components include basic salary, allowances, and deductions.

**Q3. What is Net Salary?**  
Net salary is the final amount an employee receives after all calculations.

**Q4. Why are payroll systems important?**  
They ensure accurate salary calculations and employee payment management.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 Day 24 – File-Based Contact Book

Focus areas:

File storage  
Persistent contact records  
Reading and writing data  
Real data management

<br/>

[➡️ Go to Day 24](#-day-24/README.md)

</div>

---
