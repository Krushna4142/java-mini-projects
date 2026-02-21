# 🧠 Day 13 – Contact Book System (Array + Menu)

---

## 📌 Why This Project?

This project simulates:

Phone contact storage

It teaches how real applications manage:

Multiple records  
User-driven operations

---

## 📌 Arrays of Objects

We are not storing:

only data

We are storing:

objects inside an array

Example:

Contact[] contacts = new Contact[100];

Each index holds a Contact object.

---

## 📌 Contact Class

This class represents:

A single contact

It contains:

name  
phoneNumber

This is real-world modeling.

---

## 📌 Menu-Driven Program

Menu allows user to:

Choose operations repeatedly.

This is done using:

do-while loop

---

## 📌 Add Contact Logic

Create new object

Store in array

Increase counter

This counter tracks:

Total contacts stored

---

## 📌 View All Contacts

Loop from:

0 → totalContacts

Display each object.

---

## 📌 Search Contact

Take name as input

Traverse array

Compare using:

equalsIgnoreCase()

If found → display contact.

---

## 📌 Why Counter Variable?

Because array size is fixed

We must track:

How many contacts are actually stored.

---

## 📌 Time Complexity

Add → O(1)  
View → O(n)  
Search → O(n)

---

## 📌 Real-World Mapping

Contact → Record  
Array → Storage  
Menu → User interface

---

## 📌 Limitations of Arrays

Fixed size

Wasted memory

No dynamic growth

This leads to:

ArrayList (next project 🚀)

---

## 📌 Interview Points

Why use array of objects?

To store structured data.

Why use equalsIgnoreCase?

For case-insensitive search.

How to improve this system?

Use ArrayList.

Add update & delete features.

---

## 📌 Learning Outcome

You learned:

Multi-record handling

Searching logic

Menu-driven application design

This is a step toward:

CRUD applications.

---

## 🚀 Summary

This is your first record management system.

Arrays act like a simple database.

Menu-driven flow simulates real software.

This builds strong logical thinking for backend development.
