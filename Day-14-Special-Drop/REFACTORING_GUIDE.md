---

# 📂 REFACTORING_GUIDE.md

```md
# ♻ Code Refactoring Guide

Refactoring = Improving code **without changing functionality**.

---

## 🔴 Before Refactoring

- Everything inside main()
- Duplicate logic
- Poor variable names
- Hardcoded values
- Long methods

---

## 🟢 After Refactoring

✔ Small methods  
✔ Meaningful names  
✔ Reusable logic  
✔ Class-based structure

---

## 🧠 Refactoring Techniques

### 1️⃣ Extract Method

❌ Before

```java
// All logic inside main()

✅ After

addTask();
deleteTask();
viewTask();
2️⃣ Rename Variables

❌ a, b, x
✅ studentCount, scanner, totalMarks

3️⃣ Remove Duplicate Code

Create a common reusable method.

4️⃣ Replace Multiple Variables with Object

❌ name, marks, grade

✅

class Student {
    String name;
    int marks;
    char grade;
}
5️⃣ Use Constants
static final int MAX_MARKS = 100;
🏗 Refactored Structure Example
src/
 ├── model/
 ├── service/
 └── MainApp.java
```
