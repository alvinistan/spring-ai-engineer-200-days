# Day 012 – Abstraction in Java

## Learning Objectives

By the end of today, you will be able to:

- Understand Abstraction
- Understand Abstract Classes
- Understand Abstract Methods
- Create Abstract Classes
- Implement Abstract Methods
- Understand Partial Abstraction
- Differentiate Abstraction and Encapsulation
- Differentiate Abstract Class and Interface
- Understand Abstraction in Spring Boot

---

# Folder Structure

```
daily-progress/
└── day-012/
    ├── README.md
    ├── notes.md
    └── code/
        ├── Animal.java
        ├── Dog.java
        ├── AnimalDemo.java
        ├── Shape.java
        ├── Circle.java
        ├── Rectangle.java
        ├── ShapeDemo.java
        ├── Payment.java
        ├── CreditCardPayment.java
        ├── UpiPayment.java
        ├── PaymentDemo.java
        └── Employee.java
```

---

# 1. What is Abstraction?

Abstraction means:

> **Showing only the essential details and hiding the implementation details.**

Users only know **what** an object does.

They don't need to know **how** it does it.

---

# Real World Example

## ATM Machine

You know:

- Insert Card
- Enter PIN
- Withdraw Money

You don't know:

- Database operations
- Network communication
- Banking server logic

The implementation is hidden.

---

## Spring Boot Example

```java
employeeRepository.save(employee);
```

You call:

```java
save()
```

You don't know:

- SQL generation
- JDBC execution
- Transaction handling

Spring Boot hides everything.

That's abstraction.

---

# 2. What is an Abstract Class?

An abstract class is a class declared with the `abstract` keyword.

Example

```java
abstract class Animal{

}
```

Characteristics:

- Cannot create objects
- Can contain abstract methods
- Can contain normal methods
- Can contain constructors
- Can contain variables

---

# Program 1

## Animal.java

```java
public abstract class Animal {

    abstract void sound();

    void eat() {

        System.out.println("Animal is eating.");

    }

}
```

---

## Dog.java

```java
public class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog Barks");

    }

}
```

---

## AnimalDemo.java

```java
public class AnimalDemo {

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();

        animal.eat();

    }

}
```

Output

```
Dog Barks
Animal is eating.
```

---

# What is an Abstract Method?

An abstract method has:

- No body
- Only declaration

Example

```java
abstract void sound();
```

The child class **must implement** it.

---

# Rule

If a class contains an abstract method,

the class must also be abstract.

Wrong

```java
class Animal{

    abstract void sound();

}
```

Compilation Error.

Correct

```java
abstract class Animal{

    abstract void sound();

}
```

---

# 3. Another Example

## Shape.java

```java
public abstract class Shape {

    abstract void draw();

}
```

---

## Circle.java

```java
public class Circle extends Shape {

    @Override
    void draw() {

        System.out.println("Drawing Circle");

    }

}
```

---

## Rectangle.java

```java
public class Rectangle extends Shape {

    @Override
    void draw() {

        System.out.println("Drawing Rectangle");

    }

}
```

---

## ShapeDemo.java

```java
public class ShapeDemo {

    public static void main(String[] args) {

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

# 4. Can an Abstract Class Have Normal Methods?

Yes.

Example

```java
public abstract class Employee {

    abstract void work();

    void login() {

        System.out.println("Employee Logged In");

    }

}
```

Child class inherits:

```java
login()
```

and must implement:

```java
work()
```

---

# 5. Constructor in Abstract Class

Yes.

Abstract classes can have constructors.

Example

```java
public abstract class Animal {

    Animal() {

        System.out.println("Animal Constructor");

    }

}
```

```java
public class Dog extends Animal {

    Dog() {

        System.out.println("Dog Constructor");

    }

}
```

Output

```
Animal Constructor
Dog Constructor
```

---

# 6. Payment Example

## Payment.java

```java
public abstract class Payment {

    abstract void pay(double amount);

}
```

---

## CreditCardPayment.java

```java
public class CreditCardPayment extends Payment {

    @Override
    void pay(double amount) {

        System.out.println("Paid ₹" + amount + " using Credit Card");

    }

}
```

---

## UpiPayment.java

```java
public class UpiPayment extends Payment {

    @Override
    void pay(double amount) {

        System.out.println("Paid ₹" + amount + " using UPI");

    }

}
```

---

## PaymentDemo.java

```java
public class PaymentDemo {

    public static void main(String[] args) {

        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(2500);

        payment = new UpiPayment();
        payment.pay(800);

    }

}
```

Output

```
Paid ₹2500.0 using Credit Card
Paid ₹800.0 using UPI
```

---

# 7. Why Use Abstraction?

Suppose every payment type has:

- pay()
- validate()
- generateReceipt()

Every payment behaves differently.

An abstract class forces every payment implementation to provide these methods.

---

# 8. Partial Abstraction

An abstract class can contain:

- Abstract methods
- Concrete methods

Example

```java
public abstract class Vehicle {

    abstract void start();

    void stop() {

        System.out.println("Vehicle Stopped");

    }

}
```

---

# 9. Can We Create an Object of an Abstract Class?

No.

Wrong

```java
Animal animal = new Animal();
```

Compilation Error.

Correct

```java
Animal animal = new Dog();
```

---

# 10. Abstract Class vs Normal Class

| Normal Class | Abstract Class |
|---------------|----------------|
| Can create objects | Cannot create objects |
| All methods have bodies | May contain abstract methods |
| Optional inheritance | Designed to be inherited |

---

# 11. Abstraction vs Encapsulation

| Abstraction | Encapsulation |
|--------------|---------------|
| Hides implementation | Hides data |
| Achieved using abstract classes/interfaces | Achieved using private variables |
| Focuses on behavior | Focuses on security |

---

# 12. Abstract Class vs Interface

| Abstract Class | Interface |
|----------------|-----------|
| Uses `abstract class` | Uses `interface` |
| Can have constructors | Cannot have constructors |
| Can have instance variables | Only constants |
| Supports partial abstraction | Supports full abstraction (traditional Java) |
| Uses `extends` | Uses `implements` |

Interfaces will be covered on **Day 013**.

---

# Abstraction in Spring Boot

Example

```java
JpaRepository<Employee, Integer> repository;
```

You call

```java
repository.save(employee);
```

You never write SQL.

Spring Data implements everything internally.

Another example:

```java
ChatModel chatModel;
```

Possible implementations:

- OpenAiChatModel
- OllamaChatModel
- AnthropicChatModel

Same API.

Different implementations.

---

# Advantages of Abstraction

- Hides complexity
- Cleaner design
- Easier maintenance
- Better extensibility
- Encourages loose coupling
- Supports polymorphism

---

# Interview Questions

## 1. What is Abstraction?

Abstraction hides implementation details and exposes only essential functionality.

---

## 2. What is an Abstract Class?

A class declared with the `abstract` keyword.

---

## 3. Can we create an object of an abstract class?

No.

---

## 4. What is an Abstract Method?

A method without a body that must be implemented by subclasses.

---

## 5. Can an abstract class have constructors?

Yes.

---

## 6. Can an abstract class have normal methods?

Yes.

---

## 7. Difference between Abstraction and Encapsulation?

Abstraction hides implementation.

Encapsulation hides data.

---

## 8. Difference between Abstract Class and Interface?

Abstract classes can have constructors and instance variables.

Interfaces cannot have constructors and define a contract for implementation.

---

## 9. Why is abstraction useful in Spring Boot?

It allows Spring to provide different implementations while exposing a common API.

Examples:

- JpaRepository
- CrudRepository
- ChatModel
- PaymentService

---

## 10. Can an abstract class have fields?

Yes.

It can have instance variables, static variables, constants, constructors, and methods.

---

# Assignments

## 1.

Create

```
Animal
```

Abstract method:

```
sound()
```

Child classes:

- Dog
- Cat

---

## 2.

Create

```
Shape
```

Abstract method:

```
calculateArea()
```

Child classes:

- Circle
- Rectangle

---

## 3.

Create

```
Payment
```

Implement:

- CreditCard
- UPI
- Cash

---

## 4.

Create

```
Vehicle
```

Abstract:

```
start()
```

Concrete:

```
stop()
```

---

## 5.

Create

```
Employee
```

Abstract:

```
work()
```

Concrete:

```
login()
logout()
```

---

## 6.

Create

```
BankAccount
```

Abstract:

```
withdraw()
```

Child classes:

- SavingsAccount
- CurrentAccount

---

## 7.

Create

```
Notification
```

Implement:

- Email
- SMS
- WhatsApp

---

## 8.

Create

```
Document
```

Implement:

- PDF
- Word
- Excel

---

## 9.

Create

```
Appliance
```

Implement:

- WashingMachine
- Refrigerator

---

## 10.

Build a Mini Payment System using abstraction.

---

# notes.md

```md
# Day 012 Notes

## Abstraction

Shows essential features while hiding implementation details.

## Abstract Class

- Declared using `abstract`
- Cannot be instantiated
- May contain abstract and concrete methods
- May contain constructors

## Abstract Method

Method without a body.

Example

```java
abstract void sound();
```

Must be implemented by subclasses.

## Benefits

- Hides complexity
- Promotes code reuse
- Supports polymorphism
- Improves maintainability

## Spring Boot Usage

- JpaRepository
- CrudRepository
- ChatModel
- Service abstractions
```

---

# README.md

```md
# Day 012 – Abstraction

## Topics

- Abstraction
- Abstract Class
- Abstract Method
- Concrete Method
- Partial Abstraction
- Abstract Class vs Interface
- Abstraction vs Encapsulation

## Programs

- Animal
- Dog
- Shape
- Circle
- Rectangle
- Payment
- CreditCardPayment
- UpiPayment

## Key Learnings

- Abstraction hides implementation details.
- Abstract classes cannot be instantiated.
- Child classes must implement abstract methods.
- Abstract classes can contain constructors and concrete methods.
- Spring Boot uses abstraction extensively.

## Next Topic

Day 013 – Interfaces in Java
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 012: Learned Abstraction in Java"

git push origin main
```

---

# Day 012 Checklist

- [ ] Understand abstraction
- [ ] Create abstract classes
- [ ] Create abstract methods
- [ ] Implement abstract methods
- [ ] Understand abstract class vs interface
- [ ] Understand abstraction vs encapsulation
- [ ] Complete all assignments
- [ ] Push code to GitHub