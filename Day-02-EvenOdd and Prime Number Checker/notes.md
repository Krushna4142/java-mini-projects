# 📘 Day 02 Notes — Even / Odd & Prime Number Checker

This notes file explains the **thinking and concepts** behind the Day 02 project.
It is written for **beginners** who want to understand _why_ the logic works,
not just _how_ to write the code.

---

## 🎯 Why This Project Matters

This project strengthens:

- Decision making using conditions
- Loop-based logical checks
- Mathematical reasoning in programming

Almost every real-world Java application relies on **clear conditional logic**.

---

## 🔢 Even vs Odd — Core Logic

### Definition

- **Even Number** → divisible by 2
- **Odd Number** → not divisible by 2

### Java Logic

```java
number % 2 == 0
Why % (Modulus) is Used?
The modulus operator returns the remainder after division.

Example:

10 % 2 = 0 → Even

7 % 2 = 1 → Odd

This is the simplest and most efficient way to check even/odd.

🔍 Prime Number — Concept Explained
What is a Prime Number?
A number is prime if:

It is greater than 1

It has exactly two factors: 1 and itself

Examples:

Prime → 2, 3, 5, 7, 11

Not Prime → 1, 4, 6, 8, 9

⚙️ Prime Number Logic (Step-by-Step)
Step 1: Handle Edge Cases
Numbers <= 1 are not prime

Step 2: Check Divisibility
Loop from 2 to number - 1

If divisible by any number → Not Prime

Otherwise → Prime

Why This Works
If a number has any factor other than 1 and itself, it cannot be prime.

🧠 Logical Thinking Improved
This project improves:

Breaking problems into smaller checks

Using boolean flags effectively

Writing readable and maintainable conditions

🎯 Interview Insight
Interviewers often test:

Logical clarity

Edge case handling

Simplicity over clever tricks

This project demonstrates all three.

✅ Best Practices Followed
Meaningful variable names

Clear method separation

Beginner-friendly logic

No unnecessary complexity
```
