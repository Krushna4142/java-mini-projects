# 🧠 Day 26 — Mini E-Commerce Console (NOTES)

---

# 1️⃣ What is an E-Commerce System?

An E-Commerce System allows users to **buy products online**.

Basic flow:

• View products  
• Add to cart  
• Checkout  
• Make payment

This project simulates a **basic shopping system**.

---

# 2️⃣ Product Class

Each product is represented as an object.

It contains:

• Product ID  
• Product Name  
• Price

Example:

```
class Product {
    int id;
    String name;
    double price;
}
```

---

# 3️⃣ Product Catalog

The system stores products in an array.

Example:

```
Product[] products = new Product[10];
```

This represents the **product list available for purchase**.

---

# 4️⃣ Cart System

Cart is used to store selected products.

Example:

```
Product[] cart = new Product[50];
```

The cart temporarily stores items before checkout.

---

# 5️⃣ Adding to Cart

When a user selects a product:

```
cart[count] = selectedProduct;
count++;
```

This adds the item to the cart.

---

# 6️⃣ Viewing Cart

The system displays all selected products.

Example:

```
for(int i = 0; i < count; i++) {
    cart[i].displayProduct();
}
```

---

# 7️⃣ Total Price Calculation

The system calculates total cost:

```
total += product.price;
```

This gives the final bill.

---

# 8️⃣ Checkout Process

Checkout completes the purchase.

Example:

```
System.out.println("Final Bill: " + total);
```

Cart is cleared after checkout.

---

# 9️⃣ Real World Applications

E-commerce systems are used in:

• Amazon  
• Flipkart  
• Online stores  
• Food delivery apps

---

# 🔑 Key Takeaways

• E-commerce systems follow a structured flow  
• Cart stores selected items  
• Total calculation is important  
• Java can simulate real-world systems

---

# 🎯 Interview Quick Questions

Q1. What is a shopping cart?

A shopping cart stores selected products before purchase.

---

Q2. What is product catalog?

It is a list of available products.

---

Q3. Why is checkout important?

It completes the purchase process.

---

Q4. What happens after checkout?

The cart is cleared and the purchase is completed.

---

🚀 After learning this project you can build:

• Online shopping systems  
• Order management systems  
• Product-based applications
