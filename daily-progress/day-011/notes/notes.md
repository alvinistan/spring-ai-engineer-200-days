# Day 011 – Polymorphism in Java

## Learning Objectives

By the end of today, you will be able to:

- Understand Polymorphism
- Understand Compile-Time Polymorphism
- Understand Runtime Polymorphism
- Learn Method Overloading
- Learn Method Overriding
- Understand Dynamic Method Dispatch
- Learn Upcasting
- Learn Downcasting
- Understand instanceof
- Understand Polymorphism in Spring Boot

---

# Folder Structure

```

daily-progress/
└── day-011/
├── README.md
├── notes.md
└── code/
├── Calculator.java
├── Animal.java
├── Dog.java
├── Cat.java
├── AnimalDemo.java
├── Shape.java
├── Circle.java
├── Rectangle.java
├── ShapeDemo.java
├── Employee.java
├── Manager.java
├── UpcastingDemo.java
├── DowncastingDemo.java
└── InstanceOfDemo.java

```

---

# 1. What is Polymorphism?

The word **Polymorphism** comes from two Greek words.

```
Poly
```

Means

```
Many
```

```
Morph
```

Means

```
Forms
```

Meaning

```
One object

↓

Many forms
```

---

## Real Life Example

A person can be

- Father
- Employee
- Customer
- Teacher

Same person

Different roles

---

## Java Example

```
Animal

↓

Dog

↓

German Shepherd
```

A Dog is also an Animal.

One object

Multiple forms.

---

# Types of Polymorphism

Java supports two types.

## 1. Compile-Time Polymorphism

Also called

```
Static Polymorphism
```

Achieved using

```
Method Overloading
```

---

## 2. Runtime Polymorphism

Also called

```
Dynamic Polymorphism
```

Achieved using

```
Method Overriding
```

---

# 2. Compile-Time Polymorphism

Method Overloading means

Multiple methods

Same name

Different parameters.

---

# Program 1

## Calculator.java

```java
public class Calculator {

    int add(int a,int b){

        return a+b;

    }

    int add(int a,int b,int c){

        return a+b+c;

    }

    double add(double a,double b){

        return a+b;

    }

    public static void main(String[] args){

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10,20));

        System.out.println(calculator.add(10,20,30));

        System.out.println(calculator.add(5.5,6.5));

    }

}
```

Output

```
30

60

12.0
```

Compiler decides

Which method to call.

Hence

Compile-Time Polymorphism.

---

# Rules for Method Overloading

Allowed

```java
add(int,int)

add(double,double)

add(int,int,int)
```

Not allowed

Only changing return type.

Wrong

```java
int add(int a)

double add(int a)
```

Compilation Error.

---

# 3. Runtime Polymorphism

Achieved using

Method Overriding.

---

## Parent

```java
public class Animal {

    void sound(){

        System.out.println("Animal Sound");

    }

}
```

---

## Child

```java
public class Dog extends Animal {

    @Override

    void sound(){

        System.out.println("Dog Barks");

    }

}
```

---

## Demo

```java
public class AnimalDemo {

    public static void main(String[] args){

        Animal animal = new Dog();

        animal.sound();

    }

}
```

Output

```
Dog Barks
```

Notice

Reference

```
Animal
```

Object

```
Dog
```

Method

```
Dog
```

This is Runtime Polymorphism.

---

# Dynamic Method Dispatch

Java decides

Which overridden method to execute

at

Runtime.

Example

```java
Animal animal;

animal = new Dog();

animal.sound();

animal = new Cat();

animal.sound();
```

Output

```
Dog Barks

Cat Meows
```

The same reference variable executes different implementations.

---

# Program

## Cat.java

```java
public class Cat extends Animal {

    @Override

    void sound(){

        System.out.println("Cat Meows");

    }

}
```

---

# Shape Example

## Shape.java

```java
public class Shape {

    void draw(){

        System.out.println("Drawing Shape");

    }

}
```

---

## Circle.java

```java
public class Circle extends Shape {

    @Override

    void draw(){

        System.out.println("Drawing Circle");

    }

}
```

---

## Rectangle.java

```java
public class Rectangle extends Shape {

    @Override

    void draw(){

        System.out.println("Drawing Rectangle");

    }

}
```

---

## ShapeDemo.java

```java
public class ShapeDemo {

    public static void main(String[] args){

        Shape shape;

        shape = new Circle();

        shape.draw();

        shape = new Rectangle();

        shape.draw();

    }

}
```

Output

```
Drawing Circle

Drawing Rectangle
```

---

# 4. Upcasting

Upcasting means

Creating

Parent Reference

Child Object

Syntax

```java
Parent reference = new Child();
```

Example

```java
Animal animal = new Dog();
```

Benefits

- Flexibility
- Runtime Polymorphism
- Loose Coupling

---

# 5. Downcasting

Convert

Parent reference

back to

Child reference.

Example

```java
Animal animal = new Dog();

Dog dog = (Dog) animal;

dog.sound();
```

This is

Downcasting.

---

# Unsafe Downcasting

Wrong

```java
Animal animal = new Cat();

Dog dog = (Dog) animal;
```

Runtime Error

```
ClassCastException
```

---

# 6. instanceof Operator

Used before downcasting.

Example

```java
Animal animal = new Dog();

if(animal instanceof Dog){

    Dog dog = (Dog) animal;

}
```

Safe.

---

# Program

```java
public class InstanceOfDemo {

    public static void main(String[] args){

        Animal animal = new Dog();

        System.out.println(animal instanceof Dog);

        System.out.println(animal instanceof Animal);

    }

}
```

Output

```
true

true
```

---

# Polymorphism in Spring Boot

Repository

```java
JpaRepository repository;
```

Actual object

```
SimpleJpaRepository
```

Controller

```java
PaymentService paymentService;
```

Actual object

```
PaypalService

OR

StripeService
```

Spring injects

Different implementations.

That's Runtime Polymorphism.

---

# Spring AI Example

```java
ChatModel model;
```

Implementation

```
OpenAIChatModel

AnthropicChatModel

OllamaChatModel
```

One interface

Multiple implementations.

---

# Advantages of Polymorphism

- Loose Coupling
- Easy Maintenance
- Flexible Design
- Reusable Code
- Easy Testing
- Supports Dependency Injection

---

# Interview Questions

## 1. What is Polymorphism?

Polymorphism means one object can behave in multiple forms.

---

## 2. Types of Polymorphism?

- Compile-Time
- Runtime

---

## 3. What is Method Overloading?

Multiple methods

Same name

Different parameters.

---

## 4. What is Method Overriding?

Child provides a different implementation of a parent method.

---

## 5. What is Runtime Polymorphism?

Method execution decided at runtime.

---

## 6. What is Dynamic Method Dispatch?

Java chooses the overridden method during runtime based on the actual object type.

---

## 7. What is Upcasting?

```java
Animal animal = new Dog();
```

---

## 8. What is Downcasting?

```java
Dog dog = (Dog) animal;
```

---

## 9. What is instanceof?

Checks whether an object belongs to a class before downcasting.

---

## 10. Why is Polymorphism used in Spring Boot?

Because Spring injects different implementations of interfaces.

Examples

- Service
- Repository
- ChatModel
- Payment Gateway
- Notification Service

---

# Assignments

## 1.

Create Calculator

Overload

```
add()

subtract()

multiply()
```

---

## 2.

Create

```
Animal

↓

Dog

↓

Cat
```

Override

```
sound()
```

---

## 3.

Create

```
Vehicle

↓

Bike

↓

Car
```

Override

```
start()
```

---

## 4.

Create

```
Shape

↓

Triangle

↓

Square
```

Override

```
draw()
```

---

## 5.

Create

```
Employee

↓

Developer

↓

Tester
```

Override

```
work()
```

---

## 6.

Demonstrate Upcasting.

---

## 7.

Demonstrate Downcasting.

---

## 8.

Use instanceof before Downcasting.

---

## 9.

Create Payment example.

```
Payment

↓

UPI

↓

Card

↓

NetBanking
```

---

## 10.

Create Notification example.

```
Notification

↓

Email

↓

SMS

↓

WhatsApp
```

---

# notes.md

```md
# Day 011 Notes

## Polymorphism

One object

Many forms.

## Types

- Compile-Time
- Runtime

## Method Overloading

Same method

Different parameters.

## Method Overriding

Child provides new implementation.

## Upcasting

Parent reference

Child object.

## Downcasting

Child reference

Parent object.

## instanceof

Checks object type before downcasting.

## Spring Boot Usage

- Dependency Injection
- Repository
- Services
- ChatModel
```

---

# README.md

```md
# Day 011 – Polymorphism

## Topics

- Polymorphism
- Method Overloading
- Method Overriding
- Dynamic Method Dispatch
- Upcasting
- Downcasting
- instanceof

## Programs

- Calculator
- Animal
- Dog
- Cat
- Shape
- Circle
- Rectangle

## Key Learnings

- Compile-time polymorphism uses method overloading.
- Runtime polymorphism uses method overriding.
- Upcasting enables flexible code.
- Downcasting requires caution.
- Spring Boot heavily relies on polymorphism.

## Next Topic

Day 012 – Abstraction
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 011: Learned Polymorphism in Java"

git push origin main
```

---

# Day 011 Checklist

- [ ] Understand polymorphism
- [ ] Practice method overloading
- [ ] Practice method overriding
- [ ] Understand dynamic method dispatch
- [ ] Practice upcasting
- [ ] Practice downcasting safely
- [ ] Use instanceof
- [ ] Complete all assignments
- [ ] Push code to GitHub