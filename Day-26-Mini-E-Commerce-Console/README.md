<div align="center">

# 📅 Day 26 — Mini E-Commerce Console

### Simulating Product Listing and Purchase Flow in Java

<img src="https://img.shields.io/badge/Day-26-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-E--Commerce%20System-orange?style=for-the-badge" />
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
- [🎯 Interview Preparation](#-interview-preparation-day-26-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 26** is to build a **Mini E-Commerce Console Application** that simulates how online shopping systems work.

This project focuses on creating a **complete purchase flow**, where users can:

- View available products
- Add items to a cart
- Calculate total cost
- Simulate checkout

This introduces the concept of **system flow design**, which is essential in real-world applications.

---

## 🧠 Concepts Practiced

### Core Java Concepts

- Classes and Objects
- Arrays of Objects
- Menu-driven programs
- Loops and conditionals
- Scanner for input

### Logical Skills

- Designing product catalog systems
- Cart management logic
- Purchase flow design
- Total price calculation

---

## 📂 What I Built

A **Console-Based Mini E-Commerce System** that can:

✔ Display available products  
✔ Add products to cart  
✔ Calculate total bill  
✔ Simulate purchase process

📌 Demonstrates **end-to-end system flow**  
📌 Introduces **shopping cart logic**  
📌 Builds foundation for **real e-commerce platforms**

This type of system is used in:

- Amazon-like platforms
- Online shopping apps
- Digital marketplaces
- Order processing systems

---

## 📁 Folder Structure

```
Day-26-Mini-E-Commerce-Console/
├── README.md
├── NOTES.md
└── src/
    ├── Product.java
    ├── Cart.java
    └── ECommerceApp.java
```

---

## ⚙️ System Logic Explained

### Step 1 — Create Product Class

Each product is represented using a **Product class**.

Example:

```
class Product {
    int id;
    String name;
    double price;
}
```

This helps store product details.

---

### Step 2 — Display Product Catalog

The system shows a list of available products.

Example:

```
System.out.println("1. Laptop - 50000");
System.out.println("2. Phone - 20000");
```

This allows users to choose products.

---

### Step 3 — Add to Cart

When a user selects a product, it is added to the cart.

Example logic:

```
cart.addProduct(selectedProduct);
```

This stores selected items.

---

### Step 4 — Calculate Total Price

The system calculates the total cost of items in the cart.

Example:

```
total += product.price;
```

This gives the final bill amount.

---

### Step 5 — Checkout Process

The user can complete the purchase and view the final bill.

Example:

```
System.out.println("Total Amount: " + total);
```

---

## 🖼️ Working Output

📸 Example program run:

👉 View Output Screenshot

<img src="assets/output.png" width="650"/>

---

## 📝 Notes & Observations

E-commerce systems follow a **step-by-step purchase flow**

Cart systems store selected items temporarily

Total calculation is an important business logic

Menu-driven programs simulate shopping interfaces

---

## 💡 Key Takeaways

E-commerce systems require **structured flow design**

Cart logic is essential for online shopping

Java can simulate real-world purchase systems

This project improves **system-level thinking**

---

## 🎯 Interview Preparation (Day 26 Level)

**Q1. What is a shopping cart system?**  
A system that temporarily stores selected products before purchase.

**Q2. What is product catalog?**  
It is a list of available products with details like name and price.

**Q3. Why is total calculation important?**  
To determine the final bill amount for the user.

**Q4. What is checkout process?**  
It is the final step where the user completes the purchase.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 Day 27 – Chat Simulation

Focus areas:

User interaction  
Message flow  
Conversation logic  
Simulation design

<br/>

[➡️ Go to Day 27](#-day-27/README.md)

</div>

---
