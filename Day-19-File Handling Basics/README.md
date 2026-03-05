<div align="center">

# 📅 Day 19 — File Handling Basics

### Reading & Writing Data Using Java File Handling

<img src="https://img.shields.io/badge/Day-19-blue?style=for-the-badge" />
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
- [🎯 Interview Preparation](#-interview-preparation-day-19-level)
- [⏭️ What’s Next?](#️-whats-next)

---

## 🎯 Goal of the Day

The goal of **Day 19** is to learn how Java programs can **store and retrieve data using files**.

Instead of storing data temporarily in variables, we now save information **permanently in files**.

This introduces the concept of **data persistence**.

In this project, the program will:

- Write text data into a file
- Read data from an existing file
- Display stored information to the user

---

## 🧠 Concepts Practiced

### Core Java Concepts

- `File`
- `FileWriter`
- `FileReader`
- `BufferedReader`
- Exception Handling (`try-catch`)
- File paths
- I/O streams

### Logical Skills

- Persistent data storage
- Reading structured text
- Handling file exceptions
- Managing input/output operations

---

## 📂 What I Built

A **File Handling Demo Application** that can:

✔ Write data to a file  
✔ Read data from a file  
✔ Display file content in the console

📌 Demonstrates Java **Input/Output Streams**  
📌 Introduces **persistent storage**  
📌 Beginner-friendly file operations

This is the foundation of:

- Log systems
- Configuration files
- Data storage
- Simple databases

---

## 📁 Folder Structure

```
Day-19-File-Handling-Basics/
├── README.md
├── NOTES.md
├── assets/
│   └── output.png
└── src/
    ├── FileWriterDemo.java
    ├── FileReaderDemo.java
    └── FileHandlingApp.java
```

---

## ⚙️ System Logic Explained

### Step 1 — Create a File

Java can create or access files using the `File` class.

Example:

```
File file = new File("data.txt");
```

---

### Step 2 — Write Data to File

Using `FileWriter`, the program writes text into the file.

Example:

```
FileWriter writer = new FileWriter("data.txt");
writer.write("Hello Java File Handling");
writer.close();
```

---

### Step 3 — Read Data from File

Using `BufferedReader` and `FileReader`:

```
BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
String line;

while((line = reader.readLine()) != null){
    System.out.println(line);
}
reader.close();
```

---

### Step 4 — Exception Handling

File operations may cause errors such as:

- File not found
- Permission issues

So we wrap code in:

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

File handling allows programs to **store data permanently**

Streams control how data flows between program and file

Always close files after reading or writing

Exception handling is important for safe file operations

---

## 💡 Key Takeaways

File handling introduces **persistent data storage**

Java provides powerful **I/O stream classes**

Real-world applications rely heavily on file operations

Understanding file handling is essential for **backend development**

---

## 🎯 Interview Preparation (Day 19 Level)

**Q1. What is File Handling?**  
It is the process of reading and writing data to files.

**Q2. What is the difference between FileWriter and FileReader?**  
FileWriter writes data to files, FileReader reads data from files.

**Q3. Why use BufferedReader?**  
To read text efficiently line by line.

**Q4. Why must files be closed after use?**  
To release system resources and prevent memory leaks.

---

## ⏭️ What’s Next?

<div align="center">

### 👉 Day 20 – Notes Saver Application

Focus areas:

File writing  
File reading  
Menu driven system  
Persistent note storage

<br/>

[➡️ Go to Day 20](#-day-20/README.md)

</div>

---
