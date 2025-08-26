# 🚀 Day 7: Polymorphism in Java | OOPs in 15 Days Challenge  

Welcome to **Day 7** of my journey to master **Object-Oriented Programming in Java**.  
Today’s focus is on one of the most powerful OOP concepts — **Polymorphism**.  

---

## 🔹 What is Polymorphism?  
Polymorphism means **“many forms”**.  
It allows a single method, class, or object to take **different forms** depending on the situation.  

Example:  
- A method named `sound()` behaves differently for a **Dog** and a **Cat**.  
- A method named `withdraw()` behaves differently for **Savings Account** and **Current Account**.  

---

## 🔹 Why Use Polymorphism?  
✔️ Write **cleaner and reusable code**  
✔️ Implement **one interface, multiple implementations**  
✔️ Achieve **method overriding & overloading**  
✔️ Make programs **flexible, extensible, and scalable**  

---

## 🔹 Types of Polymorphism in Java  

### 1️⃣ Compile-time Polymorphism (Static Binding)  
- Achieved through **method overloading**  
- Decision made at **compile-time**  

```java
class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}
2️⃣ Runtime Polymorphism (Dynamic Binding)
Achieved through method overriding

Decision made at runtime

java
Copy
Edit
class BankAccount {
    void withdraw(int amount) {
        System.out.println("Generic withdraw method");
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw(int amount) {
        System.out.println("Withdrawal with minimum balance check in Savings Account");
    }
}

class CurrentAccount extends BankAccount {
    @Override
    void withdraw(int amount) {
        System.out.println("Withdrawal allowed with overdraft in Current Account");
    }
}
🔹 Compile-time vs Runtime Polymorphism
Feature	Compile-time	Runtime
Binding	At compile-time	At runtime
Technique	Method Overloading	Method Overriding
Example	add(int, int) vs add(double, double)	withdraw() in different account types

🔹 Example Programs Included
Method Overloading Example → Calculator

Method Overriding Example → Animal Sounds

Bank Account Example → Savings vs Current account withdraw()

Shape Example → Circle, Rectangle, Triangle with area() method

📌 Conclusion
Polymorphism is the heart of OOP that enables flexibility, reusability, and maintainability.
It makes your Java programs clean, extensible, and interview-ready.

🔗 Connect With Me
I’m on a 15 Days OOPs in Java Challenge.
Follow my journey and connect with me for more updates 🚀
 Linkedin :https://www.linkedin.com/ , Gitub :https://github.com/