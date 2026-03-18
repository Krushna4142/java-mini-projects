# 🧠 Day 24 — File-Based Contact Book (NOTES)

---

# 1️⃣ What is a Contact Book System?

A Contact Book System is used to **store and manage contact information** such as names and phone numbers.

Instead of storing contacts temporarily in memory, the system saves them into a **file** so the data remains available even after the program closes.

This is called **persistent storage**.

---

# 2️⃣ Why File-Based Storage?

Earlier programs stored data in variables or arrays.

Problem:

Once the program stops, the data is lost.

File-based storage solves this by saving data into a file such as:

```
contacts.txt
```

This allows the program to **retrieve the data later**.

---

# 3️⃣ Contact Class

Each contact is represented as an object.

A contact contains:

• Name  
• Phone number

Example:

```
class Contact {
    String name;
    String phone;
}
```

This helps organize contact data properly.

---

# 4️⃣ Writing Contacts to File

When a user adds a contact, the program writes the data into a file.

Example:

```
FileWriter writer = new FileWriter("contacts.txt", true);
writer.write(name + "," + phone + "\n");
writer.close();
```

Important points:

• `true` enables **append mode**  
• Data is stored line by line

Example file content:

```
John,9876543210
Alice,9123456780
```

---

# 5️⃣ Reading Contacts from File

To display contacts, the system reads the file line by line.

Example:

```
BufferedReader reader =
new BufferedReader(new FileReader("contacts.txt"));

String line;

while((line = reader.readLine()) != null) {
    System.out.println(line);
}
```

This retrieves all stored contacts.

---

# 6️⃣ Splitting Stored Data

Contacts are stored as:

```
name,phone
```

To separate them we use:

```
String[] data = line.split(",");
```

This converts the line into:

```
data[0] → name
data[1] → phone
```

---

# 7️⃣ Menu Driven System

The program uses a **menu-based interface**.

Example options:

1 → Add Contact  
2 → View Contacts  
3 → Exit

This simulates how simple contact management apps work.

---

# 8️⃣ Real World Applications

Contact storage systems are used in:

• Mobile contact lists  
• CRM systems  
• Customer databases  
• Address book applications

---

# 🔑 Key Takeaways

• File handling allows persistent storage  
• Contacts can be saved in text files  
• BufferedReader reads files efficiently  
• Data can be structured using delimiters like commas

---

# 🎯 Interview Quick Questions

Q1. What is file-based storage?

File-based storage saves data in files so it remains available after the program stops.

---

Q2. What class is used to write data into files?

```
FileWriter
```

---

Q3. What class is used to read files line by line?

```
BufferedReader
```

---

Q4. Why use append mode in FileWriter?

Append mode allows adding new data without deleting existing data.

---

🚀 After learning this project you can build:

• Address book applications  
• Customer contact managers  
• File-based data storage systems
