# 🧠 Day 27 — Chat Simulation (NOTES)

---

# 1️⃣ What is a Chat System?

A Chat System allows users to **send and receive messages**.

It is used in applications like:

• WhatsApp  
• Messenger  
• Telegram  
• Customer support chats

This project simulates a **basic messaging system**.

---

# 2️⃣ Message Class

Each message is represented as an object.

It contains:

• Sender name  
• Message text

Example:

```
class Message {
    String sender;
    String text;
}
```

---

# 3️⃣ Storing Messages

Messages are stored in an array.

Example:

```
Message[] messages = new Message[100];
```

This stores chat history.

---

# 4️⃣ Sending Messages

When a user sends a message:

1. Sender enters name
2. Message is entered
3. Message is stored

Example:

```
messages[count] = new Message(sender, text);
count++;
```

---

# 5️⃣ Simulated Response

To make the system interactive, we simulate a reply.

Example:

```
new Message("Bot", "Message received!");
```

This mimics real chat applications.

---

# 6️⃣ Viewing Chat History

The system displays all messages in order.

Example:

```
for(int i = 0; i < count; i++) {
    messages[i].displayMessage();
}
```

---

# 7️⃣ Conversation Flow

Chat systems depend on:

• Continuous message exchange  
• Order of messages  
• User interaction

---

# 8️⃣ Real World Applications

Chat systems are used in:

• Messaging apps  
• Customer support systems  
• AI chatbots  
• Social media platforms

---

# 🔑 Key Takeaways

• Chat systems manage message flow  
• Messages must be stored in sequence  
• Interaction design is important  
• Java can simulate communication systems

---

# 🎯 Interview Quick Questions

Q1. What is a chat system?

A system that allows users to send and receive messages.

---

Q2. What is chat history?

It is the stored record of all messages.

---

Q3. Why store messages in arrays or lists?

To maintain message order and history.

---

Q4. What is interaction design?

It focuses on how users interact with a system.

---

🚀 After learning this project you can build:

• Chat applications  
• Chatbots  
• Messaging systems  
• Real-time communication tools
