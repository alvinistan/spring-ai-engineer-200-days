# Day 007 – Object-Oriented Programming (Classes & Objects)

## Learning Objectives

By the end of this lesson, you will be able to:

- Understand Object-Oriented Programming (OOP)
- Understand Classes
- Understand Objects
- Create Objects
- Access Object Members
- Understand Fields (Instance Variables)
- Understand Methods inside Classes
- Create Multiple Objects
- Understand Object Memory
- Understand the `new` keyword

---

# Folder Structure

```
daily-progress/
└── day-007/
    ├── README.md
    ├── notes.md
    └── code/
        ├── Student.java
        ├── StudentDemo.java
        ├── Employee.java
        ├── EmployeeDemo.java
        ├── Car.java
        ├── CarDemo.java
        ├── Mobile.java
        ├── MobileDemo.java
        ├── BankAccount.java
        ├── BankDemo.java
        └── Product.java
```

---

# 1. What is Object-Oriented Programming (OOP)?

Object-Oriented Programming is a programming paradigm that organizes software around **objects** instead of functions.

Instead of thinking:

```
What should the program do?
```

We think:

```
What objects exist in the system?
```

Examples

Bank Application

Objects

- Customer
- Account
- ATM
- Transaction

Hospital

Objects

- Doctor
- Patient
- Nurse
- Appointment

E-Commerce

Objects

- Product
- Customer
- Order
- Cart

Spring Boot

Objects

- Controller
- Service
- Repository
- Entity

---

# Four Pillars of OOP

You will learn these over the next few days.

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

Today we start with

```
Class

Object
```

---

# 2. What is a Class?

A **Class** is a blueprint or template used to create objects.

Think of a class as a house blueprint.

```
Blueprint

↓

Many Houses
```

Blueprint

```
Car
```

Objects

```
BMW

Audi

Tesla

Toyota
```

---

# Real-Life Example

Blueprint

```
Student
```

Objects

```
Rahul

John

David
```

All students have

- id
- name
- marks

But values are different.

---

# Class Syntax

```java
class Student{

}
```

Simple.

---

# Class with Variables

```java
class Student{

    int id;

    String name;

    double marks;

}
```

These variables are called

```
Instance Variables

OR

Fields
```

---

# 3. What is an Object?

An Object is an **instance of a class**.

Example

Class

```
Student
```

Objects

```
Rahul

John

David
```

---

# Creating Object

Syntax

```java
Student student = new Student();
```

Let's understand.

```
Student
```

Class name

```
student
```

Reference variable

```
new
```

Creates object

```
Student()
```

Constructor call

---

# Memory Representation

```
Student student

↓

Reference

↓

Object

--------------------

id = 0

name = null

marks = 0.0

--------------------
```

---

# Program 1

## Student.java

```java
public class Student {

    int id;

    String name;

    double marks;

}
```

---

## StudentDemo.java

```java
public class StudentDemo {

    public static void main(String[] args) {

        Student student = new Student();

        student.id = 101;

        student.name = "Rahul";

        student.marks = 90.5;

        System.out.println(student.id);

        System.out.println(student.name);

        System.out.println(student.marks);

    }

}
```

Output

```
101

Rahul

90.5
```

---

# Accessing Object Variables

Syntax

```java
object.variable
```

Example

```java
student.name
```

---

# Updating Values

```java
student.marks = 95;
```

---

# Multiple Objects

```java
Student s1 = new Student();

Student s2 = new Student();

Student s3 = new Student();
```

Each object has its own data.

---

# Program

```java
public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.id = 1;

        s1.name = "Rahul";

        Student s2 = new Student();

        s2.id = 2;

        s2.name = "John";

        System.out.println(s1.name);

        System.out.println(s2.name);

    }

}
```

Output

```
Rahul

John
```

---

# 4. Methods Inside Class

A class can have

Variables

AND

Methods

Example

```java
public class Student{

    int id;

    String name;

    void display(){

        System.out.println(id);

        System.out.println(name);

    }

}
```

---

Program

```java
public class StudentDemo {

    public static void main(String[] args) {

        Student student = new Student();

        student.id = 101;

        student.name = "Rahul";

        student.display();

    }

}
```

Output

```
101

Rahul
```

---

# Program 2

## Employee.java

```java
public class Employee {

    int id;

    String name;

    double salary;

    void display(){

        System.out.println("ID : " + id);

        System.out.println("Name : " + name);

        System.out.println("Salary : " + salary);

    }

}
```

---

## EmployeeDemo.java

```java
public class EmployeeDemo {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.id = 1;

        employee.name = "Alice";

        employee.salary = 50000;

        employee.display();

    }

}
```

---

# Program 3

## Car.java

```java
public class Car {

    String brand;

    String model;

    int year;

    void start(){

        System.out.println("Car Started");

    }

}
```

---

## CarDemo.java

```java
public class CarDemo {

    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "Tesla";

        car.model = "Model Y";

        car.year = 2024;

        System.out.println(car.brand);

        car.start();

    }

}
```

---

# Object Memory

```java
Car c1 = new Car();

Car c2 = new Car();
```

Memory

```
c1

↓

Tesla

---------------

brand

model

year

---------------

c2

↓

BMW

---------------

brand

model

year

---------------
```

Each object has separate memory.

---

# The new Keyword

The keyword

```java
new
```

allocates memory for an object.

Example

```java
Employee employee = new Employee();
```

Without

```java
new
```

No object exists.

---

# this Keyword (Introduction)

Inside a class

```java
this
```

refers to the current object.

Example

```java
this.name
```

We will study

```
this
```

in detail later.

---

# Object Reference

```java
Student student = new Student();
```

```
student
```

is NOT the object.

It is only a reference.

---

# Default Values

When an object is created

Java automatically initializes fields.

| Type | Default |
|--------|----------|
| int | 0 |
| double | 0.0 |
| boolean | false |
| String | null |

Example

```java
Student student = new Student();

System.out.println(student.id);

System.out.println(student.name);
```

Output

```
0

null
```

---

# Real Spring Boot Example

Entity

```java
public class Employee{

    private Integer id;

    private String name;

}
```

Object

```java
Employee employee = new Employee();

employee.setName("John");
```

Exactly the same concept.

---

# Interview Questions

## 1. What is OOP?

Object-Oriented Programming is a programming paradigm that organizes software using objects.

---

## 2. What is a Class?

A class is a blueprint used to create objects.

---

## 3. What is an Object?

An object is an instance of a class.

---

## 4. Difference between Class and Object?

| Class | Object |
|--------|---------|
| Blueprint | Real instance |
| No memory for object data | Occupies memory |
| Template | Created using new |

---

## 5. What does new keyword do?

Creates an object and allocates memory.

---

## 6. What is an Instance Variable?

Variables declared inside a class but outside methods.

Example

```java
int id;
```

---

## 7. What are default values of instance variables?

| Type | Default |
|--------|----------|
| int | 0 |
| double | 0.0 |
| boolean | false |
| String | null |

---

## 8. Can one class create multiple objects?

Yes.

```java
Student s1 = new Student();

Student s2 = new Student();
```

---

## 9. How do we access object members?

Using the dot operator.

```java
student.name

student.display();
```

---

## 10. Why is OOP used in Spring Boot?

Spring Boot is built around classes and objects.

Examples

- EmployeeController
- EmployeeService
- ProductRepository
- ChatService
- User

---

# Assignments

1. Create a Book class.

Fields

- id
- title
- author
- price

Create two Book objects.

---

2. Create a Laptop class.

Fields

- brand
- ram
- processor
- price

Display details.

---

3. Create a Movie class.

Fields

- title
- director
- rating

Create three Movie objects.

---

4. Create a Customer class.

Fields

- id
- name
- city

Display information.

---

5. Create a BankAccount class.

Fields

- accountNumber
- holderName
- balance

Methods

- deposit()
- withdraw()
- display()

---

6. Create a Product class.

Fields

- id
- name
- price

Method

```
display()
```

---

7. Create a Mobile class.

Fields

- brand
- model
- storage

Method

```
call()
```

---

8. Create an Employee class.

Fields

- id
- name
- salary

Method

```
display()
```

---

9. Create a Rectangle class.

Fields

- length
- width

Method

```
area()
```

---

10. Create a Circle class.

Fields

- radius

Method

```
area()
```

---

# README.md

```md
# Day 007 - Classes and Objects

## Topics

- Object-Oriented Programming
- Class
- Object
- Instance Variables
- Methods
- new Keyword
- Default Values

## Programs

- Student
- Employee
- Car
- Mobile
- Product
- BankAccount

## Key Learnings

- Class is a blueprint.
- Object is an instance of a class.
- Objects are created using new.
- Instance variables belong to objects.
- Objects have their own memory.
- Methods define object behavior.

## Next Topic

Day 008 - Constructors in Java
```

---

# notes.md

```md
# Day 007 Notes

## OOP

Object-Oriented Programming organizes software using objects.

## Class

Blueprint for creating objects.

## Object

Instance of a class.

## Instance Variables

Variables declared inside a class and outside methods.

## Object Creation

```java
Student student = new Student();
```

## Dot Operator

```java
student.name
student.display()
```

## Default Values

- int → 0
- double → 0.0
- boolean → false
- String → null

## Important Points

- One class can create many objects.
- Every object has its own memory.
- Objects contain state (fields) and behavior (methods).
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 007: Learned OOP Basics - Classes and Objects"

git push origin main
```

---

# Day 007 Checklist

- [ ] Understand OOP
- [ ] Create a class
- [ ] Create objects
- [ ] Access fields using dot operator
- [ ] Write methods inside classes
- [ ] Create multiple objects
- [ ] Understand the `new` keyword
- [ ] Complete all assignments
- [ ] Push code to GitHub