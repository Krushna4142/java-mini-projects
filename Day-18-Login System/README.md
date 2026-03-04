<div align="center">

# 📅 Day 18 — Login System

### Implementing Authentication Logic Using OOP & Validation in Java

<img src="https://img.shields.io/badge/Day-18-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Authentication%20%26%20Validation-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [🔐 What I Built](#-what-i-built)
- [📁 Folder Structure](#-folder-structure)
- [⚙️ Program Logic Explained](#️-program-logic-explained)
- [🖼️ Working Output](#️-working-output)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation](#-interview-preparation-day-18-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 18** is to build a **Login System** that helps practice:

- User authentication logic
- Input validation
- Conditional decision-making
- OOP-based system design

This project connects **security fundamentals with backend logic development**.

---

## 🧠 Concepts Practiced

### Core Java Concepts

- Classes & Objects
- Encapsulation
- String handling
- Conditional statements
- Loops
- Method abstraction

### Authentication Concepts

- Username & password validation
- Credential matching
- Access control logic
- Limited login attempts

---

## 🔐 What I Built

I built a **Console-Based Login System** where:

- A user can:
  - Enter username and password
  - Attempt login with limited tries
- The system:
  - Validates credentials
  - Displays success or failure message
  - Locks access after maximum attempts

📌 Basic authentication flow  
📌 Clean separation of validation logic  
📌 Real-world security simulation

---

## 📁 Folder Structure

Day-18-Login-System/  
├── README.md  
├── NOTES.md  
├── assets/  
│ └── output.png  
└── src/  
 ├── User.java  
 ├── LoginManager.java  
 └── LoginApp.java

---

<h2>⚙️ Program Logic Explained</h2>

Step 1: Create User class

- Stores username and password

Step 2: Create LoginManager class

- Validates credentials
- Tracks login attempts
- Controls authentication logic

Step 3: LoginApp (Main Class)

- Accepts user input
- Calls validation method
- Displays login result

Login Logic Flow:

Take username input  
Take password input  
Compare with stored credentials  
If matched → Access Granted  
Else → Decrease attempts  
If attempts exhausted → Account Locked

---

<h2>🖼️ Working Output</h2>

Example Output:

Enter Username: admin  
Enter Password: 1234  
❌ Invalid Credentials

Enter Username: admin  
Enter Password: admin123  
✅ Login Successful

Or

❌ Account Locked After 3 Failed Attempts

---

<h2>📝 Notes & Observations</h2>

String comparison must use .equals() method

Encapsulation improves security

Limiting login attempts simulates real systems

Authentication logic is core backend concept

---

<h2>💡 Key Takeaways</h2>

Security begins with validation

Proper structure improves maintainability

Authentication systems rely on conditional logic

Understanding basics is essential before database integration

---

<h2>🎯 Interview Preparation (Day 18 Level)</h2>

Q1. Why use .equals() instead of == for String comparison?  
Because == compares references, not actual values.

Q2. How can this system be made secure?  
By hashing passwords instead of storing plain text.

Q3. How can this be scaled?  
By integrating database-based authentication.

Q4. What is the purpose of limiting login attempts?  
To prevent brute-force attacks.

Q5. How would you implement role-based login?  
By adding user roles and access control checks.

---

## ⏭️ What’s Next?

<div align="center">

👉 Day 19 – Banking System Simulation

Focus Areas:

Transaction Handling  
Advanced OOP  
State Management  
Business Logic Implementation

<br/>
➡️ Continue the 100 Days of Java Journey 🚀

</div>
