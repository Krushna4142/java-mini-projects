# 📝 Day 18 – Login System Notes

## 🔐 What is Authentication?

Authentication is the process of verifying:

- Who the user is
- Whether credentials are valid

In this project:

- Username + Password based authentication is implemented.

---

## 🧠 Concepts Used

- Classes & Objects
- Encapsulation
- String Handling
- Conditional Statements
- Loops
- Method Abstraction
- Input Handling using Scanner

---

## ⚙️ Important Learning Points

### 1️⃣ String Comparison

❌ Wrong:
if (username == "admin")

✅ Correct:
if (username.equals("admin"))

Reason:

- `==` compares memory references
- `.equals()` compares actual values

---

### 2️⃣ Encapsulation

User credentials are stored inside a class.
Access is controlled using getter methods.

---

### 3️⃣ Login Attempts Logic

- Maximum attempts: 3
- If credentials incorrect:
  attempts--
- If attempts == 0:
  Account locked

This simulates real-world brute-force protection.

---

## 🔥 Real-World Improvement Ideas

- Hash passwords using SHA-256 or bcrypt
- Store credentials in database
- Add OTP verification
- Add role-based authentication (Admin/User)
- Implement session handling

---

## 🎯 Interview Concepts

Q: Why limit login attempts?
A: To prevent brute-force attacks.

Q: How to make it secure?
A: Hash passwords and use secure storage.

Q: What is authentication vs authorization?
A:
Authentication → Who you are
Authorization → What you can access
