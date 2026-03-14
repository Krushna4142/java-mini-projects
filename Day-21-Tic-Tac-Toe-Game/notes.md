# 🧠 Day 21 — Tic Tac Toe Game (NOTES)

---

# 1️⃣ What is Tic Tac Toe?

Tic Tac Toe is a simple strategy game played on a **3×3 grid**.

Two players take turns placing:

X
O

Goal:
Create a **horizontal, vertical, or diagonal line of 3 symbols**.

Example Win:

X X X
O O -

---

---

# 2️⃣ Concepts Used

This project mainly focuses on **game logic**.

Key Java concepts used:

• 2D Arrays  
• Nested loops  
• Conditional statements  
• Methods  
• Scanner input  
• Game loop

---

# 3️⃣ Representing the Game Board

The board is stored using a **2D character array**.

Example:

char[][] board = new char[3][3];

Each cell represents a position on the board.

Possible values:

X
O

-

Example board:

---

---

---

---

# 4️⃣ Game Loop

The program runs inside a loop until:

• A player wins  
• The board is full (draw)

Example structure:

while(gameRunning)
{
playerMove();
checkWinner();
}

---

# 5️⃣ Player Turns

Two players alternate turns:

Player 1 → X  
Player 2 → O

Turn logic example:

if(currentPlayer == 'X')
currentPlayer = 'O';
else
currentPlayer = 'X';

---

# 6️⃣ Move Validation

Before placing a symbol the program checks:

1. Position must be inside the board
2. Position must be empty

If invalid, the player must enter another move.

---

# 7️⃣ Win Detection

The system checks **8 possible win combinations**:

3 Rows  
3 Columns  
2 Diagonals

Example diagonal win:

X - -

- X -
- - X

---

# 8️⃣ Draw Condition

If all **9 cells are filled** and no player wins:

The game ends in a draw.

---

# 9️⃣ Real Programming Lessons

This project teaches:

• Game logic design  
• Grid-based systems  
• Turn-based programs  
• Input validation  
• Loop control

These skills are used in **game engines and simulations**.

---

# 🔑 Key Takeaways

• 2D arrays represent grids perfectly  
• Validation prevents logical errors  
• Game loops control flow  
• Breaking logic into methods keeps code clean

---

# 🎯 Interview Quick Questions

Q1. Why use a 2D array?

Because the game board has rows and columns.

---

Q2. What is a game loop?

A loop that keeps running until the game finishes.

---

Q3. How many win combinations exist in Tic Tac Toe?

8 total combinations.

---

Q4. What is input validation?

Ensuring the user enters valid data.

---

🚀 After learning this project you can build:

• Snake game  
• Sudoku solver  
• Chess board systems  
• Grid-based puzzle games
