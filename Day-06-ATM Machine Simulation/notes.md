# 📘 Day 06 Notes — ATM Machine Simulation

---

## 1️⃣ What is a Menu-Driven Program?

A menu-driven program:

- Displays options to the user
- Takes user choice
- Performs action based on selection
- Repeats until exit condition

ATM machines are real-world examples of menu-based systems.

---

## 2️⃣ Why We Used a Loop?

We used a `while` loop because:

✔ The ATM should keep running  
✔ The menu should appear again after each operation  
✔ The program should stop only when user selects Exit

Without loop → program runs only once.

---

## 3️⃣ Why Use switch Instead of Multiple if-else?

`switch` is better when:

- There are multiple fixed options
- The input is numeric choice
- Code readability matters

It makes the program clean and structured.

---

## 4️⃣ Core Logic Flow

1. Initialize account balance
2. Start infinite loop
3. Display ATM menu
4. Take user choice
5. Perform operation using switch
6. Repeat until exit

---

## 5️⃣ Important Logical Checks

### 🔹 Deposit

Simply add amount to balance.

### 🔹 Withdraw

Before subtracting:
Check if withdrawal amount ≤ balance.

If not:
Display "Insufficient Balance"

---

## 6️⃣ Beginner Mistakes to Avoid

❌ Forgetting to update balance  
❌ Not validating withdrawal amount  
❌ Forgetting break in switch  
❌ Not closing Scanner  
❌ Infinite loop without exit condition

---

## 7️⃣ Real-World Understanding

This small project represents:

- Banking system basics
- Transaction validation
- User interaction flow
- Stateful program behavior

This is how backend logic begins.

---

## 🎯 Key Learning

This project improves:

✔ Conditional thinking  
✔ Loop control  
✔ Structured program design  
✔ Real-world simulation ability

---
