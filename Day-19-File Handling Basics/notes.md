# 🧠 Day 19 — File Handling Basics (NOTES)

---

# 1️⃣ What is File Handling?

File Handling allows a Java program to:

• Create files  
• Write data to files  
• Read data from files  
• Store information permanently

Without file handling, data exists only **while the program runs**.

Example:

If a program stores user data in variables, it will disappear after program execution.

File handling solves this by storing data in **external files**.

---

# 2️⃣ Why File Handling is Important

Real applications store data in files such as:

• Logs
• User data
• Configuration settings
• Reports
• System backups

Examples of real systems using file handling:

• Login systems
• Expense trackers
• Note applications
• Game save systems

---

# 3️⃣ Java File Handling Classes

Java provides classes in the **java.io package**.

Important classes:

| Class          | Purpose                             |
| -------------- | ----------------------------------- |
| File           | Represents a file or directory      |
| FileWriter     | Writes text into files              |
| FileReader     | Reads text from files               |
| BufferedReader | Reads text efficiently line-by-line |

---

# 4️⃣ Creating a File

We create a file using the `File` class.

Example:

```
File file = new File("data.txt");
```

This creates a file object representing **data.txt**.

---

# 5️⃣ Writing Data to a File

We use **FileWriter** to write text into files.

Example:

```
FileWriter writer = new FileWriter("data.txt");

writer.write("Hello Java File Handling");

writer.close();
```

Important rule:

Always **close the writer** after writing.

---

# 6️⃣ Reading Data from a File

To read text we use:

• FileReader  
• BufferedReader

Example:

```
BufferedReader reader =
new BufferedReader(new FileReader("data.txt"));

String line;

while((line = reader.readLine()) != null)
{
    System.out.println(line);
}

reader.close();
```

This reads the file **line by line**.

---

# 7️⃣ Exception Handling in File Operations

File operations can cause errors like:

• File not found  
• Permission denied  
• Read/write failure

So we use **try-catch** blocks.

Example:

```
try
{
    FileWriter writer = new FileWriter("data.txt");
    writer.write("Hello");
    writer.close();
}
catch(Exception e)
{
    System.out.println("Error occurred");
}
```

---

# 8️⃣ Important Best Practices

✔ Always close file streams  
✔ Use try-catch for safety  
✔ Use BufferedReader for large files  
✔ Use meaningful file names

---

# 9️⃣ Real World Use Cases

File handling is used in:

• Login systems  
• Expense tracking apps  
• Configuration storage  
• Log files  
• Backup systems

---

# 🔑 Key Takeaways

• File handling stores data permanently  
• Java provides powerful IO classes  
• BufferedReader improves performance  
• Exception handling prevents crashes

---

# 🎯 Interview Quick Questions

Q1. What is file handling?

File handling is the process of reading and writing data to files.

---

Q2. What package is used for file handling?

```
java.io
```

---

Q3. What is the difference between FileWriter and FileReader?

FileWriter → writes data  
FileReader → reads data

---

Q4. Why is BufferedReader used?

It reads text **efficiently line-by-line**.

---

Q5. Why must we close files?

To release system resources.

---

🚀 After learning file handling you can now build:

• Note Saver apps  
• Data storage systems  
• Log management tools
