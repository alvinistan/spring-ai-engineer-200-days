# Day 008 – Constructors in Java

## Learning Objectives

By the end of this lesson, you will be able to:

- Understand Constructors
- Understand Constructor Syntax
- Differentiate Constructors and Methods
- Create Default Constructors
- Create Parameterized Constructors
- Constructor Overloading
- Use the `this` keyword
- Understand Constructor Chaining
- Understand Constructor Execution Order
- Apply Constructors in Real Spring Boot Projects

---

# Folder Structure

```
daily-progress/
└── day-008/
    ├── README.md
    ├── notes.md
    └── code/
        ├── Student.java
        ├── StudentDemo.java
        ├── Employee.java
        ├── EmployeeDemo.java
        ├── Product.java
        ├── ProductDemo.java
        ├── Car.java
        ├── CarDemo.java
        ├── ConstructorOverloading.java
        ├── ThisKeywordDemo.java
        └── BankAccount.java
```

---

# 1. What is a Constructor?

A constructor is a **special method** used to initialize an object.

It executes automatically when an object is created.

Example

```java
Student student = new Student();
```

As soon as Java executes

```java
new Student()
```

the constructor runs automatically.

---

# Why Do We Need Constructors?

Without constructors

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

These are default values.

Instead, we want

```
101
Rahul
90.5
```

Constructors solve this problem.

---

# Constructor Syntax

```java
public class Student {

    Student(){

        System.out.println("Constructor Called");

    }

}
```

Notice

- Constructor name = Class name
- No return type
- Executes automatically

---

# Program 1

## Student.java

```java
public class Student {

    Student(){

        System.out.println("Student Object Created");

    }

}
```

---

## StudentDemo.java

```java
public class StudentDemo {

    public static void main(String[] args) {

        Student student = new Student();

    }

}
```

Output

```
Student Object Created
```

---

# Constructor vs Method

| Constructor | Method |
|-------------|--------|
| Same name as class | Any valid name |
| No return type | Has return type |
| Runs automatically | Called manually |
| Initializes object | Performs operations |

---

# 2. Default Constructor

A constructor without parameters is called a **Default Constructor**.

```java
public class Employee {

    int id;
    String name;

    Employee(){

        id = 1;
        name = "John";

    }

    void display(){

        System.out.println(id);
        System.out.println(name);

    }

}
```

---

## EmployeeDemo.java

```java
public class EmployeeDemo {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.display();

    }

}
```

Output

```
1
John
```

---

# 3. Parameterized Constructor

Instead of fixed values

```java
id = 1;
```

Allow users to pass values.

```java
public class Student {

    int id;
    String name;
    double marks;

    Student(int id,String name,double marks){

        this.id=id;
        this.name=name;
        this.marks=marks;

    }

    void display(){

        System.out.println(id);
        System.out.println(name);
        System.out.println(marks);

    }

}
```

---

## StudentDemo.java

```java
public class StudentDemo {

    public static void main(String[] args) {

        Student student = new Student(101,"Rahul",90.5);

        student.display();

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

# What is `this`?

Look carefully.

```java
Student(int id,String name){

    this.id=id;

}
```

Left side

```
this.id
```

Instance variable

Right side

```
id
```

Parameter

Without `this`

```java
id=id;
```

Java cannot distinguish them correctly.

---

# 4. Constructor Overloading

Multiple constructors with different parameters.

Example

```java
public class Product {

    int id;
    String name;
    double price;

    Product(){

    }

    Product(int id,String name){

        this.id=id;
        this.name=name;

    }

    Product(int id,String name,double price){

        this.id=id;
        this.name=name;
        this.price=price;

    }

}
```

---

## ProductDemo.java

```java
public class ProductDemo {

    public static void main(String[] args) {

        Product p1 = new Product();

        Product p2 = new Product(1,"Laptop");

        Product p3 = new Product(2,"Mouse",750);

    }

}
```

This is called Constructor Overloading.

---

# 5. Constructor Chaining

One constructor calls another constructor.

Use

```java
this()
```

Example

```java
public class Car {

    String brand;
    String model;

    Car(){

        this("Tesla","Model Y");

    }

    Car(String brand,String model){

        this.brand=brand;
        this.model=model;

    }

    void display(){

        System.out.println(brand);
        System.out.println(model);

    }

}
```

---

## CarDemo.java

```java
public class CarDemo {

    public static void main(String[] args) {

        Car car = new Car();

        car.display();

    }

}
```

Output

```
Tesla
Model Y
```

---

# Constructor Chaining Rules

`this()`:

- Must be the first statement
- Can call another constructor in the same class

Example

Correct

```java
Student(){

    this(101);

}
```

Wrong

```java
Student(){

    System.out.println("Hello");

    this(101);

}
```

Compilation Error.

---

# 6. Real Spring Boot Example

Entity

```java
public class Employee {

    private Integer id;
    private String name;

    public Employee(){

    }

    public Employee(Integer id,String name){

        this.id=id;
        this.name=name;

    }

}
```

Spring Data JPA requires a **no-argument constructor** to create entity objects.

---

# 7. Bank Account Example

```java
public class BankAccount {

    String holder;
    double balance;

    BankAccount(String holder,double balance){

        this.holder=holder;
        this.balance=balance;

    }

    void display(){

        System.out.println("Holder : " + holder);
        System.out.println("Balance : " + balance);

    }

}
```

---

## BankDemo.java

```java
public class BankDemo {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Rahul",5000);

        account.display();

    }

}
```

Output

```
Holder : Rahul
Balance : 5000.0
```

---

# Constructor Execution

```java
Student student = new Student();
```

Execution order

```
Memory allocated

↓

Constructor called

↓

Object initialized

↓

Reference returned
```

---

# Interview Questions

## 1. What is a Constructor?

A constructor is a special member of a class that initializes an object and executes automatically when the object is created.

---

## 2. Can a constructor return a value?

No.

Constructors never have a return type.

---

## 3. Difference between Constructor and Method?

| Constructor | Method |
|-------------|--------|
| Same name as class | Any name |
| No return type | Has return type |
| Called automatically | Called manually |
| Initializes object | Performs operations |

---

## 4. What is Constructor Overloading?

Creating multiple constructors with different parameter lists.

---

## 5. What is the `this` keyword?

`this` refers to the current object.

---

## 6. What is Constructor Chaining?

Calling one constructor from another constructor using `this()`.

---

## 7. Can we create multiple constructors?

Yes.

This is called Constructor Overloading.

---

## 8. Why does Spring Boot use constructors?

Spring uses constructors for:

- Dependency Injection
- Entity creation
- DTO initialization
- Bean initialization

---

## 9. What happens if we don't create any constructor?

Java automatically provides a default constructor **only if no constructor is declared**.

---

## 10. Why is a no-argument constructor important in Hibernate?

Hibernate/JPA uses it to create entity objects through reflection before populating their fields.

---

# Assignments

1. Create Student class with parameterized constructor.

2. Create Employee class with two constructors.

3. Create Book class with constructor overloading.

4. Create Mobile class using `this` keyword.

5. Create BankAccount class with constructor.

6. Create Rectangle class and calculate area.

7. Create Circle class using constructor.

8. Create Laptop class.

9. Create Movie class.

10. Create Product class with three constructors.

---

# README.md

```md
# Day 008 - Constructors in Java

## Topics

- Constructors
- Default Constructor
- Parameterized Constructor
- Constructor Overloading
- Constructor Chaining
- this Keyword

## Programs

- Student
- Employee
- Product
- Car
- BankAccount

## Key Learnings

- Constructors initialize objects.
- Constructors execute automatically.
- Constructors have no return type.
- this refers to the current object.
- Constructor overloading improves flexibility.
- Constructor chaining reduces duplicate code.

## Next Topic

Day 009 - Encapsulation
```

---

# notes.md

```md
# Day 008 Notes

## Constructor

A constructor is a special member of a class used to initialize objects.

## Rules

- Same name as class
- No return type
- Runs automatically
- Can be overloaded

## Types

- Default Constructor
- Parameterized Constructor

## this Keyword

Refers to the current object.

Example

```java
this.name = name;
```

## Constructor Chaining

```java
this();
```

Must be the first statement.

## Important Points

- Constructors initialize objects.
- One class can have multiple constructors.
- Java provides a default constructor only when no constructor is written.
- Spring Boot and Hibernate rely heavily on constructors.
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 008: Learned Constructors in Java"

git push origin main
```

---

# Day 008 Checklist

- [ ] Understand constructors
- [ ] Create default constructors
- [ ] Create parameterized constructors
- [ ] Practice constructor overloading
- [ ] Understand the `this` keyword
- [ ] Learn constructor chaining
- [ ] Complete all assignments
- [ ] Push to GitHub