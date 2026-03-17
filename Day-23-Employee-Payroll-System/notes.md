# 🧠 Day 23 — Employee Payroll System (NOTES)

---

# 1️⃣ What is a Payroll System?

A Payroll System is used to **calculate and manage employee salaries**.

It determines how much salary an employee receives after adding allowances and subtracting deductions.

Companies use payroll systems to handle:

• Salary calculations  
• Employee payments  
• Tax deductions  
• Financial records

---

# 2️⃣ Why Payroll Systems are Important

Payroll systems help organizations:

✔ Pay employees accurately  
✔ Maintain financial records  
✔ Automate salary calculations  
✔ Reduce manual errors

Examples of payroll usage:

• Corporate companies  
• Government offices  
• HR departments  
• Accounting systems

---

# 3️⃣ Employee Class

Each employee is represented as an **object**.

The employee stores:

• Employee ID  
• Employee Name  
• Basic Salary

Example:

```
class Employee {
    int id;
    String name;
    double basicSalary;
}
```

This structure helps manage employee information easily.

---

# 4️⃣ Salary Components

Employee salaries include different components.

Common components:

• Basic Salary  
• HRA (House Rent Allowance)  
• DA (Dearness Allowance)  
• Deductions

Example calculation:

```
double hra = salary * 0.20;
double da = salary * 0.10;
double deductions = salary * 0.05;
```

---

# 5️⃣ Net Salary Calculation

Net Salary is the **final amount received by the employee**.

Formula:

```
Net Salary = Basic Salary + Allowances - Deductions
```

Example:

```
double netSalary = salary + hra + da - deductions;
```

---

# 6️⃣ Array of Employees

To store multiple employees we use an **array of objects**.

Example:

```
Employee[] employees = new Employee[50];
```

This allows the system to store **50 employee records**.

---

# 7️⃣ Menu Driven System

The payroll system uses a **menu-based interface**.

Example options:

1 → Add Employee  
2 → View Payroll  
3 → Exit

This simulates how real payroll software works.

---

# 8️⃣ Real World Use Cases

Payroll systems are used in:

• Corporate HR systems  
• Government salary management  
• Accounting software  
• Payroll processing companies

---

# 🔑 Key Takeaways

• Payroll systems calculate employee salaries  
• Allowances increase salary  
• Deductions reduce salary  
• Java can perform structured financial calculations

---

# 🎯 Interview Quick Questions

Q1. What is a payroll system?

A payroll system calculates employee salaries including allowances and deductions.

---

Q2. What is net salary?

Net salary is the final salary received after adding allowances and subtracting deductions.

---

Q3. What are salary components?

Salary components include basic salary, allowances, and deductions.

---

Q4. Why are payroll systems important?

They ensure accurate salary calculations and employee payment management.

---

🚀 After learning this project you can build:

• HR management systems  
• Company payroll software  
• Accounting tools  
• Salary management applications
