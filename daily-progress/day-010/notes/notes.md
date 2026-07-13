# Day 010 – Inheritance in Java

## Learning Objectives

By the end of today, you will be able to:

- Understand Inheritance
- Learn the IS-A Relationship
- Use the `extends` keyword
- Create Parent and Child classes
- Inherit fields and methods
- Understand Method Overriding (Introduction)
- Use the `super` keyword
- Understand Constructor Execution in Inheritance
- Learn Types of Inheritance
- Understand Inheritance in Spring Boot

---

# Folder Structure

```

daily-progress/
└── day-010/
├── README.md
├── notes.md
└── code/
├── Animal.java
├── Dog.java
├── AnimalDemo.java
├── Vehicle.java
├── Car.java
├── VehicleDemo.java
├── Employee.java
├── Manager.java
├── EmployeeDemo.java
├── Person.java
├── Student.java
├── SuperDemo.java
└── ConstructorInheritance.java

```

---

# 1. What is Inheritance?

Inheritance is a mechanism where one class acquires the properties and methods of another class.

It promotes:

- Code Reuse
- Maintainability
- Extensibility

---

## Real Life Example

```

Animal

↓

Dog

↓

Puppy

```

A Dog **IS AN** Animal.

A Puppy **IS A** Dog.

---

## Spring Boot Example

```

BaseEntity

↓

Employee

↓

Manager

```

---

# 2. Why Do We Need Inheritance?

Without inheritance

```java
class Dog {

    String name;

    void eat(){

        System.out.println("Eating");

    }

}
```

```java
class Cat {

    String name;

    void eat(){

        System.out.println("Eating");

    }

}
```

Duplicate code.

Instead

```java
class Animal {

    String name;

    void eat(){

        System.out.println("Eating");

    }

}
```

```java
class Dog extends Animal{

}
```

Much cleaner.

---

# 3. Syntax

```java
class Parent{

}
```

```java
class Child extends Parent{

}
```

The child class automatically gets all accessible members from the parent class.

---

# 4. Parent Class

## Animal.java

```java
public class Animal {

    String name;

    void eat(){

        System.out.println("Animal is eating.");

    }

}
```

---

# Child Class

## Dog.java

```java
public class Dog extends Animal {

    void bark(){

        System.out.println("Dog is barking.");

    }

}
```

---

# Demo

## AnimalDemo.java

```java
public class AnimalDemo {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.name = "Bruno";

        System.out.println(dog.name);

        dog.eat();

        dog.bark();

    }

}
```

Output

```
Bruno
Animal is eating.
Dog is barking.
```

---

# Memory Representation

```

Dog Object

↓

name

↓

eat()

↓

bark()

```

The Dog object contains its own members and inherited members.

---

# 5. IS-A Relationship

Inheritance represents an **IS-A** relationship.

Examples

```

Dog IS AN Animal

Car IS A Vehicle

Manager IS AN Employee

Student IS A Person

```

---

# 6. Vehicle Example

## Vehicle.java

```java
public class Vehicle {

    void start(){

        System.out.println("Vehicle Started");

    }

}
```

---

## Car.java

```java
public class Car extends Vehicle {

    void drive(){

        System.out.println("Car is moving.");

    }

}
```

---

## VehicleDemo.java

```java
public class VehicleDemo {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();

        car.drive();

    }

}
```

---

# 7. Method Overriding (Introduction)

A child class can provide its own implementation of a parent method.

---

## Employee.java

```java
public class Employee {

    void work(){

        System.out.println("Employee is working.");

    }

}
```

---

## Manager.java

```java
public class Manager extends Employee {

    @Override
    void work(){

        System.out.println("Manager is managing the team.");

    }

}
```

---

## EmployeeDemo.java

```java
public class EmployeeDemo {

    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.work();

    }

}
```

Output

```
Manager is managing the team.
```

---

# @Override Annotation

```java
@Override
```

Indicates that a method overrides a method from the parent class.

Benefits

- Improves readability.
- Compiler checks correctness.
- Prevents accidental mistakes.

---

# 8. super Keyword

The `super` keyword refers to the immediate parent class.

It is used to:

- Access parent variables
- Access parent methods
- Call parent constructors

---

## Parent Method

```java
public class Person {

    void display(){

        System.out.println("Person Details");

    }

}
```

---

## Child Method

```java
public class Student extends Person {

    @Override
    void display(){

        super.display();

        System.out.println("Student Details");

    }

}
```

Output

```
Person Details
Student Details
```

---

# 9. Parent Constructor

## Parent

```java
public class Animal {

    Animal(){

        System.out.println("Animal Constructor");

    }

}
```

---

## Child

```java
public class Dog extends Animal {

    Dog(){

        System.out.println("Dog Constructor");

    }

}
```

---

## Demo

```java
public class ConstructorInheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();

    }

}
```

Output

```
Animal Constructor
Dog Constructor
```

---

# Constructor Execution Order

```

Parent Constructor

↓

Child Constructor

```

Java always executes the parent constructor first.

---

# Calling Parent Constructor

```java
public class Animal {

    Animal(String name){

        System.out.println(name);

    }

}
```

---

```java
public class Dog extends Animal {

    Dog(){

        super("Bruno");

    }

}
```

`super()` must be the first statement.

---

# 10. Types of Inheritance

## Single Inheritance

```

Animal

↓

Dog

```

---

## Multilevel Inheritance

```

Animal

↓

Dog

↓

Puppy

```

---

## Hierarchical Inheritance

```

Animal

↙ ↓ ↘

Dog Cat Horse

```

---

## Multiple Inheritance

Java **does not support** multiple inheritance with classes.

```

A

↘

C

↗

B

```

Not allowed.

Java supports multiple inheritance through **interfaces**, which you will learn later.

---

# Why Java Doesn't Support Multiple Inheritance?

To avoid the **Diamond Problem**, where a class inherits conflicting implementations from multiple parent classes.

---

# Inheritance in Spring Boot

Example

```java
public class BaseEntity {

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
```

```java
public class Employee extends BaseEntity {

    private String name;

}
```

Every entity inherits common fields.

---

# Advantages of Inheritance

- Code Reuse
- Less Duplication
- Easy Maintenance
- Extensibility
- Cleaner Architecture
- Supports Polymorphism

---

# Disadvantages

- Tight coupling
- Deep inheritance hierarchies become difficult to maintain
- Improper inheritance can reduce flexibility

---

# Interview Questions

## 1. What is Inheritance?

Inheritance is the process by which one class acquires the properties and methods of another class.

---

## 2. Which keyword is used for inheritance?

```java
extends
```

---

## 3. What is an IS-A relationship?

It represents inheritance.

Example

```
Dog IS AN Animal.
```

---

## 4. Can Java support multiple inheritance?

Not with classes.

Java supports multiple inheritance using interfaces.

---

## 5. What is Method Overriding?

Providing a new implementation of a parent method in the child class.

---

## 6. What is `super`?

`super` refers to the immediate parent class.

---

## 7. What is Constructor Chaining?

The parent constructor executes before the child constructor.

---

## 8. What is the difference between Inheritance and Composition?

Inheritance:

```
Car IS A Vehicle.
```

Composition:

```
Car HAS AN Engine.
```

---

## 9. Can a child access private members of the parent?

No.

Private members must be accessed through public or protected methods.

---

## 10. Where is Inheritance used in Spring Boot?

- BaseEntity
- Abstract Controllers
- Exception Handling
- Configuration Classes
- Security Components

---

# Assignments

## 1.

Create

```
Person

↓

Employee
```

Employee should inherit:

- name
- age

Add:

- salary

---

## 2.

Create

```
Vehicle

↓

Bike
```

Methods:

```
start()

ride()
```

---

## 3.

Create

```
Animal

↓

Cat
```

Methods:

```
eat()

meow()
```

---

## 4.

Create multilevel inheritance.

```
Animal

↓

Dog

↓

Puppy
```

---

## 5.

Create hierarchical inheritance.

```
Employee

↓

Manager

↓

Developer
```

---

## 6.

Override

```
display()
```

in child class.

---

## 7.

Call parent constructor using

```java
super()
```

---

## 8.

Create

```
Shape

↓

Rectangle
```

Override

```
draw()
```

---

## 9.

Create

```
Account

↓

SavingsAccount
```

Add:

```
calculateInterest()
```

---

## 10.

Create

```
Person

↓

Student
```

Override

```
display()
```

and call parent method using

```java
super.display();
```

---

# notes.md

```md
# Day 010 Notes

## Inheritance

Inheritance allows one class to acquire the properties and methods of another class.

## Keyword

extends

## IS-A Relationship

Dog IS AN Animal.

## Types

- Single
- Multilevel
- Hierarchical

## Method Overriding

Child provides its own implementation of a parent method.

## super

Refers to the parent class.

## Advantages

- Reusability
- Maintainability
- Extensibility

## Spring Boot Usage

- BaseEntity
- Controllers
- Services
- Security
```

---

# README.md

```md
# Day 010 – Inheritance in Java

## Topics

- Inheritance
- extends
- IS-A Relationship
- Method Overriding
- super Keyword
- Constructor Chaining
- Types of Inheritance

## Programs

- Animal
- Dog
- Vehicle
- Car
- Employee
- Manager
- Student

## Key Learnings

- Inheritance promotes code reuse.
- Child classes inherit parent members.
- Use extends for inheritance.
- super accesses parent members.
- Parent constructor executes before child constructor.

## Next Topic

Day 011 – Polymorphism
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 010: Learned Inheritance in Java"

git push origin main
```

---

# Day 010 Checklist

- [ ] Understand inheritance
- [ ] Create parent and child classes
- [ ] Use the `extends` keyword
- [ ] Understand the IS-A relationship
- [ ] Override methods using `@Override`
- [ ] Use the `super` keyword
- [ ] Understand constructor execution order
- [ ] Complete all assignments
- [ ] Push to GitHub