<div align="center">

# 📅 Day 27 — Chat Simulation

### Simulating Real-Time Conversation Logic in Java

<img src="https://img.shields.io/badge/Day-27-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-Chat%20Simulation-orange?style=for-the-badge" />
<img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" />

</div>

---

## 🔗 Quick Navigation

- [🎯 Goal of the Day](#-goal-of-the-day)
- [🧠 Concepts Practiced](#-concepts-practiced)
- [📂 What I Built](#-what-i-built)
- [📁 Folder Structure](#-folder-structure)
- [⚙️ System Logic Explained](#️-system-logic-explained)
- [🖼️ Working Output](#️-working-output)
- [📝 Notes & Observations](#-notes--observations)
- [💡 Key Takeaways](#-key-takeaways)
- [🎯 Interview Preparation](#-interview-preparation-day-27-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 27** is to build a **Chat Simulation System** that mimics how messaging applications work.

This project focuses on creating a **conversation flow**, where users can:

- Send messages
- View chat history
- Simulate interaction between users

This introduces the concept of **interaction design and message handling logic**, which is used in real-world chat applications.

---

## 🧠 Concepts Practiced

### Core Java Concepts

- Classes and Objects
- Arrays / Lists (for storing messages)
- String handling
- Loops and conditionals
- Menu-driven programs

### Logical Skills

- Conversation flow design
- Message storage
- Simulating real-time interaction
- User input handling

---

## 📂 What I Built

A **Console-Based Chat Simulation System** that can:

✔ Send messages  
✔ Store chat history  
✔ Display conversation  
✔ Simulate basic chat interaction

📌 Demonstrates **message handling logic**  
📌 Introduces **interaction-based systems**  
📌 Builds foundation for **chat applications**

This type of system is used in:

- Messaging apps (WhatsApp, Messenger)
- Customer support chatbots
- Live chat systems
- Social media platforms

---

## 📁 Folder Structure

```
Day-27-Chat-Simulation/
├── README.md
├── NOTES.md
└── src/
    ├── Message.java
    ├── ChatManager.java
    └── ChatApp.java
```

---

## ⚙️ System Logic Explained

### Step 1 — Create Message Class

Each message is represented using a **Message class**.

Example:

```
class Message {
    String sender;
    String text;
}
```

This stores message details.

---

### Step 2 — Store Messages

Messages are stored in a list or array.

Example:

```
Message[] messages = new Message[100];
```

This keeps the chat history.

---

### Step 3 — Send Message

User enters a message which is stored in the system.

Example:

```
messages[count] = new Message(sender, text);
count++;
```

---

### Step 4 — Display Chat History

The system prints all stored messages.

Example:

```
for(int i = 0; i < count; i++) {
    System.out.println(messages[i].sender + ": " + messages[i].text);
}
```

---

### Step 5 — Simulate Interaction

The system can simulate responses or interaction flow.

Example:

```
System.out.println("Bot: Message received!");
```

---

## 🖼️ Working Output

📸 Example program run:

👉 View Output Screenshot

<img src="assets/output.png" width="650"/>

---

## 📝 Notes & Observations

Chat systems focus on **real-time interaction logic**

Messages must be stored in order

User input drives the conversation flow

Simple simulations help understand complex systems

---

## 💡 Key Takeaways

Chat applications rely on **message handling systems**

Conversation flow is key to interaction design

Java can simulate real-time systems effectively

This project improves **interaction-based thinking**

---

## 🎯 Interview Preparation (Day 27 Level)

**Q1. What is a chat system?**  
A system that allows users to send and receive messages.

**Q2. How are messages stored in chat systems?**  
Using arrays, lists, or databases.

**Q3. What is chat history?**  
It is the stored record of all messages in a conversation.

**Q4. What is interaction design?**  
It focuses on how users interact with a system.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 Day 28 – Expense Report Generator

Focus areas:

Data aggregation  
Report generation  
Calculation logic  
Structured output

<br/>

[➡️ Go to Day 28](#-day-28/README.md)

</div>

---
