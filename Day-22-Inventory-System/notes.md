# 🧠 Day 22 — Inventory Management System (NOTES)

---

# 1️⃣ What is an Inventory Management System?

An Inventory Management System is used to **track and manage products in stock**.

It helps businesses monitor:

• Product availability  
• Quantity of items  
• Product details  
• Stock updates

Example places where inventory systems are used:

• Retail stores  
• Warehouses  
• E-commerce companies  
• Manufacturing units

---

# 2️⃣ Why Inventory Systems are Important

Without inventory systems businesses can face problems like:

• Overstocking  
• Running out of products  
• Incorrect stock tracking

Inventory systems help to:

✔ Track stock levels  
✔ Manage product information  
✔ Improve business operations

---

# 3️⃣ Product Class

Each product is represented as an **object**.

The product stores information such as:

• Product ID  
• Product Name  
• Quantity  
• Price

Example:

```
class Product {
    int id;
    String name;
    int quantity;
    double price;
}
```

This helps represent **real-world product data**.

---

# 4️⃣ Array of Objects

Instead of storing one product, we store **multiple products**.

Example:

```
Product[] products = new Product[50];
```

This creates an inventory that can store **50 products**.

---

# 5️⃣ Adding Products

When the user adds a product:

1. Program asks product details
2. Creates a new Product object
3. Stores it in the array

Example:

```
products[count] = new Product(id, name, quantity, price);
count++;
```

---

# 6️⃣ Viewing Inventory

The program loops through the array and prints all product information.

Example:

```
for(int i = 0; i < count; i++) {
    products[i].displayProduct();
}
```

This shows the **entire inventory list**.

---

# 7️⃣ Updating Quantity

Inventory systems must update stock when:

• Products are sold  
• New stock arrives

Example:

```
products[i].quantity += addedStock;
```

This increases the product quantity.

---

# 8️⃣ Menu Driven Program

The program uses a **menu system**.

Example options:

1 → Add Product  
2 → View Products  
3 → Update Quantity  
4 → Exit

This simulates **real software systems**.

---

# 9️⃣ Real World Use Cases

Inventory systems are used in:

• Supermarkets  
• Amazon warehouses  
• Retail stores  
• Pharmacy management  
• Electronics stores

---

# 🔑 Key Takeaways

• Inventory systems manage product stock  
• Classes represent real-world objects  
• Arrays store multiple records  
• Menu systems simulate real applications

---

# 🎯 Interview Quick Questions

Q1. What is an Inventory Management System?

It is a system used to track and manage product stock and details.

---

Q2. Why use classes for inventory systems?

Classes allow grouping product properties such as name, price, and quantity.

---

Q3. What is an array of objects?

An array where each element is an object containing structured data.

---

Q4. Why are inventory systems important?

They help businesses track stock levels and manage products efficiently.

---

🚀 After learning this project you can build:

• Store management systems  
• Warehouse tracking software  
• E-commerce inventory systems
