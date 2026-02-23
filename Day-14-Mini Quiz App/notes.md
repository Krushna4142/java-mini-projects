# 🧠 NOTES.md — Day 14: To-Do List Manager (ArrayList + OOP)

---

## 📌 1. Why This Project Matters?

This is your first **real-world dynamic data handling application**.

Earlier:

- Arrays → Fixed size ❌

Now:

- ArrayList → Dynamic size ✅

This shift is **very important for interviews and backend development**.

---

## 📌 2. What is ArrayList?

ArrayList is a **resizable array** from `java.util` package.

### ✅ Features:

✔ Dynamic size  
✔ Index-based access  
✔ Easy insertion & deletion  
✔ Stores objects

### 📌 Syntax:

```java
ArrayList<Type> list = new ArrayList<>();

Example:

ArrayList<String> tasks = new ArrayList<>();
📌 3. Why Not Use Array?
Array	ArrayList
Fixed size	Dynamic size
Manual shifting	Auto handled
Less flexible	Very flexible
Primitive support	Object-based
📌 4. OOP Design in This Project

We created a separate Task class.

🎯 Why?

Because each task has:

taskName

completion status

This follows:

✔ Encapsulation
✔ Clean structure
✔ Real-world modeling

📌 5. Encapsulation

Data is kept private and accessed using methods.

private String taskName;

Access using:

getTaskName()
setCompleted()
🔥 Benefit:

Security + controlled updates.

📌 6. CRUD Operations

This project is based on:

Operation	Meaning
Create	Add task
Read	View tasks
Update	Mark as completed
Delete	Remove task

These operations are used in:

Databases

REST APIs

Backend systems

So this project is backend foundation level.

📌 7. Menu-Driven Program Flow

Steps:

Show menu

Take user choice

Perform operation

Repeat until exit

This creates continuous execution system.

📌 8. Important Logic Points
✔ Adding Task
tasks.add(new Task(name));
✔ Accessing Task
tasks.get(index);
✔ Deleting Task
tasks.remove(index);
📌 9. Index Handling

User sees:

1. Task
2. Task

But ArrayList uses:

0 index

So always:

int index = scanner.nextInt() - 1;

This is a very common interview discussion point.

📌 10. Real-World Connection

This project is similar to:

To-do apps

Task trackers

Productivity tools

Jira / Trello (basic logic)

🚀 Key Interview Concepts From This Project

Difference between Array & ArrayList

What is encapsulation?

What is CRUD?

Why use objects in ArrayList?

Dynamic memory handling

⭐ Summary

You learned:

✔ Dynamic data handling
✔ Object storage inside ArrayList
✔ Real-world CRUD flow
✔ OOP + Collections together

This is a resume-level Java mini project.
```
