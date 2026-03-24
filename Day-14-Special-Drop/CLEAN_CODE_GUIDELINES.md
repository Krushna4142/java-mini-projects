# 🧼 Clean Code Guidelines (Java)

This defines the **coding standard of this repository**.

---

## 📛 Naming Conventions

### Class → PascalCase

StudentManager

### Method → camelCase

calculateGrade()

### Variables → meaningful

totalMarks, studentCount

---

## ✂ Keep Methods Small

Each method should do:

✔ One task  
✔ Clearly

---

## 🧱 Follow Single Responsibility Principle

One class → One responsibility

---

## 🔁 Avoid Duplicate Code

If logic repeats → create a method.

---

## 🔐 Use Encapsulation

Always make variables:

```java
private

Access using getters/setters.

📦 Prefer Object over Multiple Variables

❌ name, marks, grade

✅ Student object

🎯 Use Constants
static final int MAX_MARKS = 100;
🧾 Proper Input Handling

Always validate user input.

🧹 Format Your Code

✔ Proper indentation
✔ Spacing
✔ Line breaks

💬 Write Meaningful Comments

Explain:

WHY → not WHAT

🚀 Project Structure Standard
src/
 ├── model
 ├── service
 └── MainApp.java
🏆 Clean Code Benefits

✔ Readable
✔ Maintainable
✔ Scalable
✔ Interview-friendly
✔ Team-ready

🎯 Final Rule

Code should be:

Easy to read
Easy to modify
Easy to extend
```
