# 🧠 Day 25 — Multi-User ATM Simulation (NOTES)

---

# 1️⃣ What is an ATM System?

An ATM System allows users to perform banking operations such as:

• Checking balance  
• Depositing money  
• Withdrawing money

A **multi-user ATM system** supports multiple users, each with their own account.

---

# 2️⃣ Why Multi-User Systems?

Earlier systems handled only one user.

Real-world systems must:

✔ Handle multiple users  
✔ Maintain separate data for each user  
✔ Allow independent operations

---

# 3️⃣ Account Class

Each user is represented as an **Account object**.

It contains:

• Account Number  
• Name  
• Balance

Example:

```
class Account {
    int accountNumber;
    String name;
    double balance;
}
```

---

# 4️⃣ Array of Accounts

To store multiple users we use:

```
Account[] accounts = new Account[50];
```

This allows managing multiple bank accounts.

---

# 5️⃣ Finding an Account

To perform operations, we first locate the user account.

Example:

```
if(accounts[i].accountNumber == enteredAccNo)
```

This ensures correct user access.

---

# 6️⃣ Deposit Operation

Users can add money to their account.

Example:

```
balance += depositAmount;
```

---

# 7️⃣ Withdraw Operation

Users can withdraw money if they have enough balance.

Example:

```
if(balance >= withdrawAmount) {
    balance -= withdrawAmount;
}
```

This prevents negative balance.

---

# 8️⃣ Menu Driven System

The system uses menus like:

Main Menu:

1 → Create Account  
2 → Access Account  
3 → Exit

ATM Menu:

1 → Check Balance  
2 → Deposit  
3 → Withdraw  
4 → Exit

---

# 9️⃣ Real World Applications

ATM systems are used in:

• Banks  
• Financial institutions  
• Payment systems  
• Online banking platforms

---

# 🔑 Key Takeaways

• Multi-user systems manage multiple accounts  
• Arrays help store multiple users  
• Transaction logic must be accurate  
• Validation prevents errors

---

# 🎯 Interview Quick Questions

Q1. What is a multi-user system?

A system that allows multiple users to use it independently.

---

Q2. What is transaction handling?

It is performing operations like deposit and withdrawal safely.

---

Q3. Why is validation important in ATM systems?

To prevent invalid operations like overdrawing money.

---

Q4. What is the role of an account number?

It uniquely identifies each user in the system.

---

🚀 After learning this project you can build:

• Banking systems  
• Payment applications  
• Wallet systems  
• Financial management tools
