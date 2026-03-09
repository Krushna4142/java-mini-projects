# 🧠 Day 20 — Mini Banking System (NOTES)

---

# 1️⃣ What is a Banking System?

A banking system is a software system that allows users to:

• Store money  
• Deposit money  
• Withdraw money  
• Check account balance

In real applications, banking systems are complex, but this project simulates the **basic core logic**.

---

# 2️⃣ Key Concepts Used

This project focuses mainly on **Object-Oriented Programming (OOP)** concepts.

Main concepts used:

• Classes and Objects  
• Encapsulation  
• Methods  
• Constructors  
• Conditional logic  
• Menu-driven programs

---

# 3️⃣ BankAccount Class

The `BankAccount` class represents a **user's bank account**.

It stores:

• Account holder name  
• Account balance

Example structure:

```
class BankAccount {
    String name;
    double balance;
}
```

This class also contains methods to perform banking operations.

---

# 4️⃣ Deposit Operation

Deposit allows the user to **add money** to their account.

Logic:

```
balance = balance + amount
```

Important validation:

Deposit amount must be **greater than zero**.

---

# 5️⃣ Withdraw Operation

Withdraw allows the user to **take money from the account**.

Logic:

```
balance = balance - amount
```

But withdrawal must satisfy:

```
withdraw amount ≤ balance
```

Otherwise the transaction is rejected.

---

# 6️⃣ Balance Check

The balance check method simply displays the current balance.

Example output:

```
Current Balance: $1200
```

---

# 7️⃣ Menu Driven System

The application runs using a loop that repeatedly shows options:

```
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
```

The user chooses an option and the corresponding method executes.

---

# 8️⃣ Real World Relevance

Even though this is a simple system, the same logic is used in:

• ATM machines  
• Online banking systems  
• Payment applications  
• Financial management software

Real systems just add more security and database storage.

---

# 🔑 Key Takeaways

• OOP helps model real-world systems  
• Methods organize program logic  
• Validation prevents incorrect transactions  
• Menu-driven programs simulate real user interaction

---

# 🎯 Interview Quick Questions

Q1. What is encapsulation?

Encapsulation is wrapping data and methods inside a class.

---

Q2. Why should withdrawal be validated?

To prevent withdrawing more money than the account balance.

---

Q3. What is a menu-driven program?

A program where users interact through a list of options.

---

Q4. What is the role of methods in this project?

Methods perform banking operations like deposit, withdraw, and balance check.

---

🚀 After learning this project, you can build:

• ATM simulators  
• Payment systems  
• Wallet applications
