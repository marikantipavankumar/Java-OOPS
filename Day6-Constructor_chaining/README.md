# 🚀 Day 6 – Constructor Chaining (Java OOPs Learning Series)

## 📘 What I Learned
- Constructor Chaining = Calling one constructor from another.
- In Java:
  - **super()** → Calls parent constructor.
  - **this()** → Calls another constructor in the same class.
- Execution always starts from the **parent constructor**.
- If not specified, Java adds `super()` automatically in child constructors.

---

## 💻 Examples

### Example 1: Parent → Child Constructor
```java
class Person {
    Person() {
        System.out.println("Person from Parent");
    }
}
class Employee extends Person {
    Employee() {
        System.out.println("Employee from Child");
    }
}
public class Ex1 {
    public static void main(String[] args) {
        Employee e = new Employee();
    }
}
Output:
Person from Parent
Employee from Child


Example 2: this() in Same Class

class Laptop {
    Laptop() {
        System.out.println("Default Constructor");
    }
    Laptop(int year) {
        this();
        System.out.println("Laptop Year: " + year);
    }
}
public class Ex2 {
    public static void main(String[] args) {
        Laptop lp = new Laptop(2023);
    }
}
Output:
Default Constructor
Laptop Year: 2023

🎯 Interview Prep
Q: What is constructor chaining in Java?
✅ Process where one constructor calls another (via this() or super()).

Q: Difference between this() and super()?
✅ this() → same class, super() → parent class.

Q: Can both this() and super() be used together?
❌ No, only one can be the first statement in a constructor.

Q: Why is it useful?
✅ Ensures proper initialization, avoids duplicate code, increases reusability.

✅ Summary
Constructor Chaining = Parent → Child constructor flow
Helps in code reusability, maintainability, and clean initialization.