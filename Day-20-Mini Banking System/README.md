<div align="center">

# 📅 Day 20 — Mini Banking System

### Simulating Basic Banking Operations Using Java OOP

<img src="https://img.shields.io/badge/Day-20-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-OOP%20%7C%20Logic-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- 🎯 Goal of the Day
- 🧠 Concepts Practiced
- 📂 What I Built
- 📁 Folder Structure
- ⚙️ System Logic Explained
- 🖥️ Sample Output
- 📝 Notes & Observations
- 💡 Key Takeaways
- 🎯 Interview Preparation (Day 20 Level)
- ⏭️ What’s Next?

---

# 🎯 Goal of the Day

The goal of **Day 20** is to build a **Mini Banking System** that simulates basic banking operations.

Instead of only learning theory, this project focuses on **applying Object-Oriented Programming and logical problem solving**.

The program allows a user to:

- Create a bank account
- Deposit money
- Withdraw money
- Check account balance

This helps in understanding **how real banking logic works internally**.

---

# 🧠 Concepts Practiced

### Core Java Concepts

- Classes and Objects
- Encapsulation
- Constructors
- Methods
- Conditional statements
- User input using Scanner
- Menu-driven programs

### Logical Skills

- Balance validation
- Preventing invalid withdrawals
- Managing account state
- Structuring real-world systems

---

# 📂 What I Built

A **Mini Banking System Application** where users can interact with their bank account through a **console menu**.

### Features

✔ Create an account  
✔ Deposit money  
✔ Withdraw money  
✔ Check current balance  
✔ Prevent withdrawing more than available balance

This project simulates **core banking operations in a simplified way**.

---

# 📁 Folder Structure

```
Day-20-Mini-Banking-System
│
├── README.md
├── NOTES.md
│
├── assets
│   └── output.png
│
└── src
    ├── BankAccount.java
    ├── BankService.java
    └── BankingApp.java
```

---

# ⚙️ System Logic Explained

## 1️⃣ BankAccount Class

This class represents a **bank account**.

It stores:

- Account holder name
- Account balance

Example structure:

```
class BankAccount
{
    String name;
    double balance;
}
```

It also includes methods such as:

- deposit()
- withdraw()
- checkBalance()

---

## 2️⃣ Deposit Operation

Users can add money to their account.

Logic:

```
balance = balance + amount
```

Validation ensures that the **deposit amount is positive**.

---

## 3️⃣ Withdraw Operation

Users can withdraw money from their account.

Important rule:

```
withdraw amount ≤ balance
```

If the user tries to withdraw more money than available, the system prevents the transaction.

---

## 4️⃣ Balance Check

Displays the current balance stored in the account.

Example output:

```
Current Balance: $1500
```

---

## 5️⃣ Menu Driven System

The program runs inside a loop with options like:

```
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
```

This simulates **simple banking interaction**.

---

# 🖥️ Sample Output

Example program interaction:

```
===== Mini Banking System =====

1. Deposit
2. Withdraw
3. Check Balance
4. Exit

Enter choice: 1
Enter deposit amount: 500
Deposit successful.

Enter choice: 3
Current Balance: 500
```

---

# 📝 Notes & Observations

This project shows how **real-world systems can be modeled using classes and objects**.

Each banking action is separated into methods, making the program **clean and modular**.

Using a **menu loop** allows the user to interact continuously until exiting.

---

# 💡 Key Takeaways

- Object-Oriented Programming helps organize complex systems
- Encapsulation keeps data safe inside classes
- Validation prevents logical errors
- Menu-driven programs simulate real applications

This project is a **great beginner example of financial system logic**.

---

# 🎯 Interview Preparation (Day 20 Level)

### Q1. What is Encapsulation?

Encapsulation is the process of **bundling data and methods inside a class** and restricting direct access to data.

---

### Q2. Why use methods like deposit() and withdraw()?

To control how account balance is modified and apply validations.

---

### Q3. Why should withdrawal be validated?

To prevent withdrawing **more money than available balance**.

---

### Q4. What is a menu-driven program?

A program where the user interacts with the system by choosing options from a menu.

---

# ⏭️ What’s Next?

### 🚀 Day 21 — Contact Management System

Next project will introduce:

- ArrayList
- Data storage in collections
- Searching records
- Managing multiple objects

This will move the project from **single object systems to multi-record systems**.
<br/>

[➡️ Go to Day 21](../Day-21/README.md)

</div>

---
