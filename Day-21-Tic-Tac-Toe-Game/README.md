<div align="center">

# 📅 Day 21 — Tic Tac Toe Game

### Building a Classic Game Using Java Game Logic & 2D Arrays

<img src="https://img.shields.io/badge/Day-21-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-yellow?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Game%20Logic%20%7C%202D%20Arrays-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [🎮 What I Built](#-what-i-built)
- [📁 Folder Structure](#-folder-structure)
- [⚙️ Game Logic Explained](#️-game-logic-explained)
- [🖥️ Sample Output](#️-sample-output)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation](#-interview-preparation-day-21-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 21** is to build a **Tic Tac Toe Game** using Java.

This project focuses on **game logic implementation** using programming fundamentals.

The program allows **two players** to play Tic Tac Toe directly in the console.

Players take turns placing:

- **X**
- **O**

The program checks:

- Win condition
- Draw condition
- Valid moves

This project helps strengthen **logical thinking and problem-solving skills**.

---

## 🧠 Concepts Practiced

### Core Java Concepts

- 2D Arrays
- Nested Loops
- Conditional Statements
- Methods
- User Input using Scanner
- Game Logic Implementation

### Logical Skills

- Grid-based logic
- Turn-based gameplay
- Checking win conditions
- Preventing invalid moves

---

## 🎮 What I Built

A **Console-Based Tic Tac Toe Game** where two players compete.

### Features

✔ 3x3 Game Board  
✔ Player X vs Player O  
✔ Turn-based gameplay  
✔ Automatic win detection  
✔ Draw detection  
✔ Input validation

The board updates after every move.

---

## 📁 Folder Structure

```
Day-21-Tic-Tac-Toe-Game
│
├── README.md
├── NOTES.md
│
├── assets
│   └── output.png
│
└── src
    ├── TicTacToeBoard.java
    ├── GameLogic.java
    └── TicTacToeApp.java
```

---

<h2>⚙️ Game Logic Explained</h2>

### 1️⃣ Game Board

The board is implemented using a **2D array**.

Example:

```
char[][] board = new char[3][3];
```

This represents a **3x3 grid**.

Each cell stores:

```
X
O
or empty
```

---

### 2️⃣ Player Turns

Players take turns placing their symbols:

Player 1 → X  
Player 2 → O

After every move the board updates.

---

### 3️⃣ Move Validation

Before placing a symbol the program checks:

- Position must be inside the grid
- Cell must not already be filled

If invalid, the player must enter another move.

---

### 4️⃣ Win Condition

The program checks:

Rows  
Columns  
Diagonals

Example win pattern:

```
X X X
O O -
- - -
```

If a player completes a line, they win.

---

### 5️⃣ Draw Condition

If all 9 cells are filled and no player wins:

The game ends in a **Draw**.

---

## 🖥️ Sample Output

Example gameplay:

```
Current Board

- - -
- - -
- - -

Player X turn
Enter row: 1
Enter column: 1

X - -
- - -
- - -

Player O turn
Enter row: 2
Enter column: 2

X - -
- O -
- - -
```

Game continues until **win or draw**.

---

## 📝 Notes & Observations

Game development requires **strong logical thinking**.

2D arrays are very useful for representing **grid-based systems**.

Separating board logic and game logic makes the code **cleaner and easier to maintain**.

---

## 💡 Key Takeaways

- 2D arrays are useful for game grids
- Logic validation prevents invalid gameplay
- Game loops control the flow of the program
- Small games are great for improving programming skills

---

## 🎯 Interview Preparation (Day 21 Level)

**Q1. Why use a 2D array in this project?**  
Because the Tic Tac Toe board is a grid with rows and columns.

**Q2. What is a game loop?**  
A loop that keeps the game running until a win or draw occurs.

**Q3. How do you detect a win in Tic Tac Toe?**  
By checking all rows, columns, and diagonals.

**Q4. How do you detect a draw?**  
When all cells are filled and no win condition is met.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 Day 22 — Student Grade Analyzer

Focus Areas:

Arrays  
Data processing  
Statistical calculations  
Logic building

<br/>

➡️ Continue the **100 Days of Java Challenge** 🚀

</div>
