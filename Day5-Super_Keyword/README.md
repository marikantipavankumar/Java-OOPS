Day 5 – super Keyword in Java

📌 Overview

The super keyword in Java is a reference variable used to access members (variables, methods, and constructors) of the parent class. It is especially useful in inheritance when a child class needs to reuse or extend the behavior of its parent class.

🔹 Uses of super

Call parent class method

If a child class overrides a method, we can still call the parent’s version using super.methodName().

Call parent class constructor

A child class constructor can call the parent constructor using super(...). This must be the first statement inside the child constructor.

Access parent class variable

If a child class defines a variable with the same name as the parent, super.variableName helps access the parent version.

🔹 Examples

1. Calling Parent Method

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating");
        super.eat(); // calling parent method
    }
}

public class TestSuperMethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

Output:

Dog is eating
Animal is eating

2. Calling Parent Constructor

class Person {
    Person(String name) {
        System.out.println("Person: " + name);
    }
}

class Student extends Person {
    Student(String name, int roll) {
        super(name); // calling parent constructor
        System.out.println("Roll Number: " + roll);
    }
}

public class TestSuperConstructor {
    public static void main(String[] args) {
        Student s = new Student("John", 101);
    }
}

Output:

Person: John
Roll Number: 101

3. Accessing Parent Variable

class Vehicle {
    int speed = 60;
}

class Car extends Vehicle {
    int speed = 100;

    void displaySpeed() {
        System.out.println("Child speed: " + speed);
        System.out.println("Parent speed: " + super.speed);
    }
}

public class TestSuperVariable {
    public static void main(String[] args) {
        Car c = new Car();
        c.displaySpeed();
    }
}

Output:

Child speed: 100
Parent speed: 60

🔹 Key Rules

super() must be the first statement in a child constructor.

You cannot use super in a static context.

super only refers to the immediate parent class.

✅ Best Practice

Use super to:

Reuse parent behavior instead of rewriting it.

Avoid variable shadowing issues.

Ensure proper constructor chaining in inheritance.