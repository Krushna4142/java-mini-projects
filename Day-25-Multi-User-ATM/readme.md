<div align="center">

# 📅 Day 25 — Multi-User ATM Simulation

### Handling Multiple Users with Transaction Logic in Java

<img src="https://img.shields.io/badge/Day-25-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-ATM%20System-orange?style=for-the-badge" />
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
- [🎯 Interview Preparation](#-interview-preparation-day-25-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 25** is to build a **Multi-User ATM Simulation** that can manage multiple user accounts and perform banking transactions.

Unlike earlier ATM systems, this project supports **multiple users**, each having their own account and balance.

The system simulates real ATM operations such as:

- User authentication (basic)
- Checking balance
- Depositing money
- Withdrawing money

This introduces the concept of **multi-user data handling and transaction management**.

---

## 🧠 Concepts Practiced

### Core Java Concepts

- Classes and Objects
- Arrays of Objects
- Conditional statements
- Menu-driven programs
- Scanner for input

### Logical Skills

- Multi-user system design
- Transaction handling
- Balance management
- Input validation

---

## 📂 What I Built

A **Console-Based Multi-User ATM System** that can:

✔ Store multiple user accounts  
✔ Allow users to access their account  
✔ Perform deposit and withdrawal operations  
✔ Display account balance

📌 Demonstrates **banking transaction logic**  
📌 Introduces **multi-user system handling**  
📌 Simulates real ATM machine behavior

This type of system is used in:

- Banking applications
- ATM machines
- Financial systems
- Payment processing systems

---

## 📁 Folder Structure

```
Day-25-Multi-User-ATM/
├── README.md
├── NOTES.md
└── src/
    ├── Account.java
    ├── ATMManager.java
    └── ATMApp.java
```

---

## ⚙️ System Logic Explained

### Step 1 — Create Account Class

Each user account is represented using an **Account class**.

Example:

```
class Account {
    int accountNumber;
    String name;
    double balance;
}
```

This stores user-specific banking data.

---

### Step 2 — Store Multiple Accounts

Multiple user accounts are stored using an **array of objects**.

Example:

```
Account[] accounts = new Account[50];
```

This allows handling multiple users in the system.

---

### Step 3 — User Authentication

The system identifies users using their account number.

Example:

```
if(accounts[i].accountNumber == enteredAccountNumber)
```

This ensures users access their own accounts.

---

### Step 4 — Deposit Operation

Users can add money to their account.

Example:

```
accounts[i].balance += depositAmount;
```

This increases the account balance.

---

### Step 5 — Withdrawal Operation

Users can withdraw money if they have sufficient balance.

Example:

```
if(balance >= withdrawAmount) {
    balance -= withdrawAmount;
}
```

This ensures safe transactions.

---

### Step 6 — Display Balance

Users can check their current account balance.

Example:

```
System.out.println("Balance: " + balance);
```

---

## 🖼️ Working Output

📸 Example program run:

👉 View Output Screenshot

<img src="assets/output.png" width="650"/>

---

## 📝 Notes & Observations

Multi-user systems handle **multiple accounts simultaneously**

Transaction logic must ensure **accuracy and safety**

Balance validation is important to prevent errors

Menu-driven programs simulate real ATM interfaces

---

## 💡 Key Takeaways

ATM systems demonstrate **real-world transaction logic**

Multi-user handling is essential in banking systems

Validation ensures secure financial operations

This project improves **system design thinking**

---

## 🎯 Interview Preparation (Day 25 Level)

**Q1. What is a multi-user system?**  
A system that allows multiple users to access and use it independently.

**Q2. What is transaction handling?**  
It is the process of performing operations like deposit and withdrawal safely.

**Q3. Why is balance validation important?**  
To ensure users cannot withdraw more than their available balance.

**Q4. What is the role of authentication in ATM systems?**  
It ensures that only authorized users can access their accounts.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 Day 26 – Mini E-Commerce Console

Focus areas:

Product listing  
Cart system  
Purchase logic  
System flow design

<br/>

[➡️ Go to Day 26](#-day-26/README.md)

</div>

---
