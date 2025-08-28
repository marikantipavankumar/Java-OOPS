# Day 9 – Abstract Classes (Java OOPs 15 Days Challenge)

This repository contains my practice code for **Day 9** of my **15-day Java OOPs strengthening challenge**.  
On this day, I focused on learning **Abstract Classes** in Java.

---

## 🚀 What I Learned
- Abstract classes act as **blueprints** for other classes.
- They can contain:
  - **Abstract methods** → must be implemented by subclasses.
  - **Concrete methods** → reusable across subclasses.
- Abstract classes **cannot be instantiated** directly.
- They are useful when we want **partial abstraction** and a **common template**.

---

## 🖥️ Practice Example
I implemented a simple **Payment System**:
- `Payment` (abstract class with `pay()` method).
- `CreditCard` and `UpiPayment` classes extend `Payment` and override `pay()`.
- Demonstrates **runtime polymorphism** with different payment types.

---

## 📂 Folder Structure


Day9-AbstractClasses/
│-- Payment.java
│-- CreditCard.java
│-- UpiPayment.java
│-- PaymentEx.java


---

## 🙏 
A big thanks to **Shradha Ma’am (Apna College YouTube)** 🎉  
Her clear explanations make OOPs concepts very easy to understand for students like me.

---

## 🤝 Connect
If you’re also exploring **Java & OOPs**, let’s connect and grow together!  