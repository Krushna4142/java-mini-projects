<div align="center">

# 📅 Day 24 — File-Based Contact Book

### Storing and Managing Contacts Using File Handling in Java

<img src="https://img.shields.io/badge/Day-24-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Difficulty-Medium-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Focus-File%20Handling-orange?style=for-the-badge" />
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
- [🎯 Interview Preparation](#-interview-preparation-day-24-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 24** is to build a **File-Based Contact Book** that stores contact information permanently using file handling.

Unlike earlier programs where data was stored only in memory, this project saves contact data into a **file**, allowing the information to remain available even after the program closes.

This project introduces **persistent data storage**, which is an important concept in real-world software systems.

In this system, the program will allow the user to:

- Add new contacts
- Save contact details into a file
- View saved contacts
- Manage basic contact information

---

## 🧠 Concepts Practiced

### Core Java Concepts

- File handling (`FileWriter`, `FileReader`)
- BufferedReader for reading files
- Exception handling
- Classes and objects
- Menu-driven programs

### Logical Skills

- Persistent data storage
- Contact information management
- Reading structured file data
- Designing simple data storage systems

---

## 📂 What I Built

A **Console-Based Contact Book System** that can:

✔ Add new contacts  
✔ Store contact details in a file  
✔ Read contacts from the file  
✔ Display saved contact records

📌 Demonstrates **file-based data persistence**  
📌 Introduces **basic data management systems**  
📌 Simulates how simple contact storage applications work

Contact book systems are commonly used in:

- Phone contact management
- Address books
- Customer databases
- Basic CRM systems

---

## 📁 Folder Structure

```
Day-24-File-Based-Contact-Book/
├── README.md
├── NOTES.md
└── src/
    ├── Contact.java
    ├── ContactManager.java
    └── ContactApp.java
```

---

## ⚙️ System Logic Explained

### Step 1 — Create Contact Class

Each contact is represented using a **Contact class**.

Example:

```
class Contact {
    String name;
    String phone;
}
```

This allows the program to group contact details together.

---

### Step 2 — Save Contacts to File

When a user adds a contact, the program writes the contact data to a file.

Example:

```
FileWriter writer = new FileWriter("contacts.txt", true);
writer.write(name + "," + phone + "\n");
writer.close();
```

This stores contact information permanently.

---

### Step 3 — Read Contacts from File

To display saved contacts, the program reads the file line by line.

Example:

```
BufferedReader reader = new BufferedReader(new FileReader("contacts.txt"));
String line;

while((line = reader.readLine()) != null) {
    System.out.println(line);
}

reader.close();
```

This prints all saved contacts.

---

### Step 4 — Exception Handling

File operations can cause errors such as:

- File not found
- Read/write errors
- Permission issues

So file operations are wrapped inside **try-catch blocks**.

Example:

```
try {
   // file operations
} catch(Exception e) {
   System.out.println("Error occurred");
}
```

---

## 🖼️ Working Output

📸 Example program run:

👉 View Output Screenshot

<img src="assets/output.png" width="650"/>

---

## 📝 Notes & Observations

File-based systems allow programs to **store data permanently**

Contacts are stored in a **structured text format**

File reading allows the system to retrieve stored information

Exception handling ensures safe file operations

---

## 💡 Key Takeaways

File handling enables **persistent data storage**

Simple applications can store data using text files

Java provides powerful classes for file input/output

Understanding file storage is essential for **backend systems**

---

## 🎯 Interview Preparation (Day 24 Level)

**Q1. What is persistent data storage?**  
It is the ability to store data permanently so it remains after the program stops.

**Q2. What classes are used for file writing in Java?**  
`FileWriter` is commonly used to write data to files.

**Q3. Why use BufferedReader?**  
BufferedReader allows efficient reading of text line-by-line.

**Q4. Why is file handling important in applications?**  
Because it allows programs to store and retrieve data from external files.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 Day 25 – Multi-User ATM Simulation

Focus areas:

User account handling  
Transaction logic  
Balance management  
Improved ATM simulation

<br/>

[➡️ Go to Day 25](#-day-25/README.md)

</div>

---
