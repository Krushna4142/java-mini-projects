<div align="center">

# 📅 Day 22 — Inventory Management System

### Managing Products Using Structured Data in Java

<img src="https://img.shields.io/badge/Day-22-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Inventory%20System-orange?style=for-the-badge" />
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
- [🎯 Interview Preparation](#-interview-preparation-day-22-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 22** is to build a simple **Inventory Management System** that manages product information using structured data.

Instead of handling only numbers or simple inputs, we now manage **multiple attributes of products** such as:

- Product Name
- Product ID
- Quantity
- Price

This introduces the concept of **structured data management**, where each item has multiple properties stored together.

In this project, the system will allow the user to:

- Add products to inventory
- View available products
- Update product quantities
- Display product details

---

## 🧠 Concepts Practiced

### Core Java Concepts

- Classes and Objects
- Arrays of Objects
- Menu-driven programs
- Scanner for user input
- Conditional logic

### Logical Skills

- Managing structured product data
- Tracking inventory quantities
- Handling user-driven menus
- Organizing multiple product records

---

## 📂 What I Built

A **Console-Based Inventory Management System** that can:

✔ Add new products to the inventory  
✔ View all stored products  
✔ Update product quantity  
✔ Display product details

📌 Demonstrates **structured object-based data storage**  
📌 Introduces **real-world product management logic**  
📌 Builds the foundation for **e-commerce and store systems**

This type of system is commonly used in:

- Retail shops
- Warehouses
- E-commerce platforms
- Stock management systems

---

## 📁 Folder Structure

```
Day-22-Inventory-System/
├── README.md
├── NOTES.md
└── src/
    ├── Product.java
    ├── InventoryManager.java
    └── InventoryApp.java
```

---

## ⚙️ System Logic Explained

### Step 1 — Create Product Class

Each product in the inventory is represented using a **Product class**.

Example:

```
class Product {
    int id;
    String name;
    int quantity;
    double price;
}
```

This allows us to group related data into a single object.

---

### Step 2 — Store Products in an Array

Multiple products are stored using an **array of Product objects**.

Example:

```
Product[] products = new Product[50];
```

This allows the program to manage multiple inventory items.

---

### Step 3 — Add Product to Inventory

The user enters product details, and a new object is created and stored in the array.

Example logic:

```
products[index] = new Product(id, name, quantity, price);
index++;
```

This stores the product in the inventory list.

---

### Step 4 — Display Inventory

The system loops through the array and displays stored product information.

Example:

```
for(int i = 0; i < index; i++) {
    System.out.println(products[i].name);
}
```

This prints all products currently available.

---

### Step 5 — Update Product Quantity

Users can update stock when items are sold or restocked.

Example logic:

```
products[i].quantity += addedStock;
```

This ensures inventory quantities stay accurate.

---

## 🖼️ Working Output

📸 Example program run:

👉 View Output Screenshot

<img src="assets/output.png" width="650"/>

---

## 📝 Notes & Observations

Inventory systems manage **multiple attributes for each product**

Objects help represent real-world entities like products

Arrays allow the system to store multiple product records

Menu-driven programs simulate real software interfaces

---

## 💡 Key Takeaways

Structured data management is essential for real-world applications

Classes and objects help organize related data efficiently

Inventory systems are a foundation for **retail and e-commerce software**

This project improves **data modeling and logical system design**

---

## 🎯 Interview Preparation (Day 22 Level)

**Q1. What is an Inventory Management System?**  
It is a system used to track and manage product stock, quantity, and details.

**Q2. Why use classes in an inventory system?**  
Classes group related product properties such as name, price, and quantity.

**Q3. What is an array of objects?**  
It is an array where each element is an object representing structured data.

**Q4. Why is inventory management important?**  
It helps businesses track stock levels and manage product availability.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 Day 23 – Employee Payroll System

Focus areas:

Salary calculation  
Employee data management  
Real-world business logic  
Structured financial computation

<br/>

[➡️ Go to Day 23](#-day-23/README.md)

</div>

---
