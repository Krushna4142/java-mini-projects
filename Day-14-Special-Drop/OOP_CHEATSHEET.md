# ☕ Java OOP Cheatsheet

A quick revision guide for writing **scalable, real-world Java applications**.

---

## 🧱 Class & Object

Class → Blueprint  
Object → Instance of class

```java
class Student {
    String name;
}

Student s = new Student();

```

🎯 Used to model real-world entities.

🔒 Encapsulation

Binding data + methods into a single unit.

Why?

✔ Data hiding
✔ Controlled access
✔ Better security

class Account {
private double balance;

    public double getBalance() {
        return balance;
    }

}
🧬 Inheritance

One class acquires properties of another.

class Animal { }
class Dog extends Animal { }
Benefits

Code reusability

Method overriding

Hierarchical design

🎭 Polymorphism
Method Overloading (Compile-time)
int add(int a, int b)
double add(double a, double b)
Method Overriding (Runtime)
class Animal {
void sound() {}
}

class Dog extends Animal {
void sound() {}
}
🧩 Abstraction

Hiding implementation details.

Achieved using:

abstract class

interface

abstract class Shape {
abstract void draw();
}
🏗 Constructor

Special method called when object is created.

Student(String name) {
this.name = name;
}
🔑 this Keyword

Uses:

this.name = name;
this.show();
this();
🛡 Access Modifiers
Modifier Scope
private Within class
default Same package
protected Package + subclass
public Everywhere
📦 Array vs ArrayList

Array → Fixed size
ArrayList → Dynamic

Use ArrayList for:

CRUD operations

Real applications

🧠 OOP in Your Projects

Bank System → Encapsulation
To-Do Manager → Objects + ArrayList
Library System → Multi-object interaction

🎯 Interview One-Liner

OOP provides:

✔ Modularity
✔ Reusability
✔ Scalability
✔ Maintainability
✔ Security
