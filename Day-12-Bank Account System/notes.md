# 🧠 Day 12 – Bank Account System (OOP Basics)

---

## 📌 Why OOP?

OOP is used to:

Model real-world systems

Improve code reusability

Increase security

Make large applications manageable

---

## 📌 Class & Object

Class → Blueprint  
Object → Real entity created from class

Example:

Class → BankAccount  
Object → KrushnaAccount

---

## 📌 Encapsulation

Wrapping:

Data + Methods together.

And restricting direct access using:

private variables.

Access is provided using public methods.

This improves:

Security  
Control  
Flexibility

---

## 📌 Instance Variables

These store object-specific data:

accountHolderName  
accountNumber  
balance

Each object will have its own copy.

---

## 📌 Constructor

A constructor:

✔ Runs automatically when object is created  
✔ Initializes object values

Example:

BankAccount(String name, int accNo, double balance)

---

## 📌 Methods in This System

### deposit(amount)

Adds money to balance.

### withdraw(amount)

Checks balance before withdrawing.

Prevents invalid transactions.

### checkBalance()

Displays current account balance.

---

## 📌 Real-World Mapping

User → Bank customer  
Object → Bank account  
Balance → Account state  
Deposit → Credit  
Withdraw → Debit

---

## 📌 Advantages of This Design

Data is secure

Code is modular

Easy to extend

Reusable structure

---

## 📌 Interview Points

Why make balance private?

To prevent direct modification.

What is the benefit of encapsulation?

Controlled access to data.

Can we create multiple accounts?

Yes — by creating multiple objects.

Where is this used in real applications?

Banking systems, wallet apps, ATM software.

---

## 📌 Learning Outcome

You moved from:

Logic building → System design thinking.

You now understand:

How real applications are structured.

This is your first step toward:

Spring Boot  
Backend development  
Enterprise Java

---

## 🚀 Summary

OOP models real-world systems.

Encapsulation protects data.

Constructor initializes objects.

Methods define behavior.

This is the foundation of Java development.
