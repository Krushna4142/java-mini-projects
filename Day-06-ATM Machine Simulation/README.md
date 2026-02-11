<div align="center">

# 📅 Day 06 — ATM Machine Simulation

### Building Menu-Driven Programs & Conditional Logic in Java

<img src="https://img.shields.io/badge/Day-06-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Conditions%20%26%20Loops-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [🏧 What I Built](#-what-i-built)
- [📁 Folder Structure](#-folder-structure)
- [⚙️ Program Logic Explained](#️-program-logic-explained)
- [🖼️ Working Output](#️-working-output)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation](#-interview-preparation-day-06-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 06** is to build a **Console-Based ATM Machine Simulation** to practice:

- Menu-driven programming
- Conditional branching
- Loop-based execution
- Real-world system logic

This project simulates how basic ATM systems operate.

---

## 🧠 Concepts Practiced

### Core Java Concepts

- `while` loop
- `switch` statement
- `if-else` conditions
- `break` statement
- `Scanner` for user input

### Logical Skills

- Managing account balance
- Validating withdrawal amount
- Handling multiple user choices
- Continuous program execution until exit

---

## 🏧 What I Built

I built an **ATM Simulation Program** where:

- User can:
  - Check Balance
  - Deposit Money
  - Withdraw Money
  - Exit
- The system updates balance dynamically
- Withdrawal is allowed only if sufficient balance exists
- The program runs until the user chooses Exit

📌 Real-world simulation  
📌 Menu-driven interaction  
📌 Strong conditional logic practice

---

## 📁 Folder Structure

Day-06-ATM-Machine-Simulation/  
├── README.md  
├── NOTES.md  
├── assets/  
│ └── output.png  
└── src/  
 └── ATMSimulation.java

---

<h2>⚙️ Program Logic Explained</h2>

Initialize account balance

Display ATM menu options

Take user choice

Use `switch` statement to perform actions:

1 → Display Balance  
2 → Deposit Money  
3 → Withdraw Money  
4 → Exit

If withdrawal amount > balance → show insufficient funds

Repeat menu using loop until user exits

This demonstrates real-world menu-based system design.

---

<h2>🖼️ Working Output</h2>

📸 Example program run:

👉 View Output Screenshot

<img src="assets/output.png" alt="Output Of ATM Machine Simulation" width="650"/>

---

<h2>📝 Notes & Observations</h2>

Menu-driven programs are common in real applications

Balance must always be validated before withdrawal

Loops keep the system running continuously

Clear user prompts improve usability

---

<h2>💡 Key Takeaways</h2>

Switch statements simplify multiple choices

Loops create continuous systems

Real-world simulations strengthen logic building

Structured programs look professional

---

<h2>🎯 Interview Preparation (Day 06 Level)</h2>

Q1. Why is a loop required in ATM simulation?  
To continuously show the menu until the user chooses to exit.

Q2. Why do we validate balance before withdrawal?  
To prevent invalid transactions and maintain data integrity.

Q3. Why is `switch` preferred over multiple `if-else` here?  
Because it makes menu-based choice handling cleaner and more readable.

Q4. How can this project be improved?  
By adding PIN authentication, transaction history, or file-based storage.

---

## ⏭️ What’s Next?

<div align="center">

👉 Day 07 – Student Grade Calculator  
Focus areas:

Arrays

Average calculation

Conditional grading system

Data aggregation logic

<br/>
➡️ Go to Day 07

</div>
