🚀 Day 4 – Java OOPS Interview Preparation (Method Overriding)

As part of my 15 Days Java OOPS Interview Preparation Challenge, I am posting everything on my GitHub:
✅ Code examples
✅ Detailed concepts
✅ Practice questions (theory + coding)

🔗 GitHub Repo: Java-OOPS

📘 Concept: Method Overriding in Java

👉 Definition: Method overriding occurs when a subclass provides a specific implementation of a method already defined in its parent class.

✅ Key Points:

Must have same method name, parameters, and return type.

Must be in different classes (parent → child).

Happens at runtime (Runtime Polymorphism).

Access modifiers can be widened (e.g., protected → public), but not restricted.

Final, static, and private methods cannot be overridden.

Supports covariant return types (child class can return a subtype).



❓ Practice Questions
🔹 Theory Questions (Top 10)

What is method overriding in Java?

What are the rules of method overriding?

Can we override a static method? Why or why not?

Can we override a private method?

Can we override a final method?

What is the difference between method overloading and overriding?

When does method overriding happen — compile-time or runtime? Why?

Can a subclass override a method if the superclass method is default or protected?

What is covariant return type in method overriding?

What happens if we change the return type of an overridden method?


🔹 Coding Practice (Top 10)

Create a Parent class with a method display(). Override it in Child and demonstrate runtime polymorphism.

Write a Payment class with a processPayment() method. Override in CreditCard and DebitCard.

Create Animal → Dog, Cat, Cow classes. Override sound() in each and show runtime polymorphism.

Demonstrate covariant return type with a getObject() method in parent and child.

Override a protected method in parent with public in child.

Create a class with a final method and try overriding it (observe error).

Write a program to show why static methods cannot be overridden (method hiding).

Parent class method throws IOException, child overrides with FileNotFoundException.

Show why constructors cannot be overridden but methods can.

Write a program that demonstrates the difference between overloading vs overriding.

🔥 This wraps up Day 4: Method Overriding of my OOPS preparation series.
Stay tuned — I’ll keep adding daily code, concepts, and practice questions on GitHub.

#Java #OOPS #MethodOverriding #InterviewPreparation #100DaysOfCode #GitHub #Learning