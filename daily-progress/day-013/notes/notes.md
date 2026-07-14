# Day 013 – Interfaces in Java

## Learning Objectives

By the end of today, you will be able to:

- Understand Interfaces
- Create Interfaces
- Implement Interfaces
- Understand Multiple Inheritance using Interfaces
- Learn Default Methods
- Learn Static Methods
- Learn Functional Interfaces
- Introduction to Lambda Expressions
- Understand Interface vs Abstract Class
- Understand Interfaces in Spring Boot & Spring AI

---

# Folder Structure

```
daily-progress/
└── day-013/
    ├── README.md
    ├── notes.md
    └── code/
        ├── Animal.java
        ├── Dog.java
        ├── AnimalDemo.java
        ├── Payment.java
        ├── CreditCardPayment.java
        ├── UpiPayment.java
        ├── PaymentDemo.java
        ├── Camera.java
        ├── MusicPlayer.java
        ├── SmartPhone.java
        ├── InterfaceDemo.java
        ├── FunctionalDemo.java
        └── LambdaDemo.java
```

---

# 1. What is an Interface?

An Interface is a blueprint that defines **what a class must do**, but not **how it does it**.

An interface contains method declarations (contracts).

Every class implementing the interface must provide the implementation.

---

## Real Life Example

Think about a USB port.

You know that every USB device can:

- Connect
- Transfer Data

You don't care how it works internally.

The USB specification is the interface.

Different manufacturers implement it differently.

---

## Spring Boot Example

```java
JpaRepository
```

You call

```java
save(employee);
```

You never implement it.

Spring provides the implementation.

---

# Interface Syntax

```java
public interface Animal {

    void sound();

}
```

Notice

- Uses the keyword `interface`
- Methods are public and abstract by default

---

# 2. Implementing an Interface

Use the keyword

```java
implements
```

---

## Animal.java

```java
public interface Animal {

    void sound();

}
```

---

## Dog.java

```java
public class Dog implements Animal {

    @Override
    public void sound() {

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

    }

}
```

Output

```
Dog Barks
```

---

# Why Interfaces?

Suppose you have

```java
CreditCardPayment

UpiPayment

CashPayment
```

All should support

```java
pay()
```

Instead of forcing inheritance,

define a contract.

---

# 3. Payment Example

## Payment.java

```java
public interface Payment {

    void pay(double amount);

}
```

---

## CreditCardPayment.java

```java
public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
                "Paid ₹" + amount + " using Credit Card"
        );

    }

}
```

---

## UpiPayment.java

```java
public class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
                "Paid ₹" + amount + " using UPI"
        );

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

        payment.pay(1500);

        payment = new UpiPayment();

        payment.pay(500);

    }

}
```

Output

```
Paid ₹1500.0 using Credit Card

Paid ₹500.0 using UPI
```

---

# 4. Multiple Inheritance Using Interfaces

Java does NOT support multiple inheritance using classes.

But Java DOES support multiple inheritance using interfaces.

---

## Camera.java

```java
public interface Camera {

    void takePhoto();

}
```

---

## MusicPlayer.java

```java
public interface MusicPlayer {

    void playMusic();

}
```

---

## SmartPhone.java

```java
public class SmartPhone
        implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {

        System.out.println("Photo Captured");

    }

    @Override
    public void playMusic() {

        System.out.println("Playing Music");

    }

}
```

---

## InterfaceDemo.java

```java
public class InterfaceDemo {

    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();

        phone.takePhoto();

        phone.playMusic();

    }

}
```

Output

```
Photo Captured

Playing Music
```

---

# 5. Default Methods

Before Java 8,

interfaces could only contain abstract methods.

Java 8 introduced

```
default
```

methods.

Example

```java
public interface Vehicle {

    void start();

    default void stop() {

        System.out.println("Vehicle Stopped");

    }

}
```

Classes automatically inherit the default method.

---

# 6. Static Methods in Interfaces

Interfaces can also contain static methods.

Example

```java
public interface MathUtility {

    static int square(int number) {

        return number * number;

    }

}
```

Usage

```java
System.out.println(
        MathUtility.square(5)
);
```

Output

```
25
```

---

# 7. Functional Interface

A Functional Interface contains exactly ONE abstract method.

Example

```java
@FunctionalInterface

public interface Greeting {

    void sayHello();

}
```

---

# Program

```java
public class FunctionalDemo {

    public static void main(String[] args) {

        Greeting greeting = new Greeting() {

            @Override
            public void sayHello() {

                System.out.println("Hello Java");

            }

        };

        greeting.sayHello();

    }

}
```

---

# 8. Lambda Expression (Introduction)

Lambda Expressions simplify Functional Interfaces.

Instead of

```java
Greeting greeting = new Greeting() {

    @Override

    public void sayHello() {

        System.out.println("Hello");

    }

};
```

Write

```java
Greeting greeting =
        () -> System.out.println("Hello");
```

Call

```java
greeting.sayHello();
```

Output

```
Hello
```

This is the foundation of Java Streams, Spring Boot, and modern Java.

---

# 9. Interface vs Abstract Class

| Interface | Abstract Class |
|------------|----------------|
| Uses `interface` | Uses `abstract class` |
| No constructors | Can have constructors |
| Supports multiple inheritance | Single inheritance |
| Methods are public by default | Any access modifier |
| Defines a contract | Provides partial implementation |

---

# 10. Interfaces in Spring Boot

Spring Boot depends heavily on interfaces.

Example

```java
public interface PaymentService {

    void pay(double amount);

}
```

Implementation

```java
public class PaypalService
        implements PaymentService {

}
```

Later

```java
public class StripeService
        implements PaymentService {

}
```

The controller depends only on

```java
PaymentService
```

Not on a specific implementation.

---

# Spring AI Example

Interface

```java
ChatModel
```

Implementations

```
OpenAiChatModel

AnthropicChatModel

OllamaChatModel
```

Application code

```java
ChatModel chatModel;
```

The implementation can change without changing the rest of the application.

---

# Advantages of Interfaces

- Loose Coupling
- Flexibility
- Easy Testing
- Supports Dependency Injection
- Supports Multiple Inheritance
- Encourages Clean Architecture

---

# Interview Questions

## 1. What is an Interface?

An interface defines a contract that implementing classes must follow.

---

## 2. Which keyword is used to implement an interface?

```java
implements
```

---

## 3. Can an interface have constructors?

No.

---

## 4. Can an interface contain variables?

Yes.

They are automatically:

```java
public static final
```

(constants)

---

## 5. Can Java support multiple inheritance?

Not with classes.

Yes, with interfaces.

---

## 6. What is a Functional Interface?

An interface with exactly one abstract method.

---

## 7. What annotation identifies a Functional Interface?

```java
@FunctionalInterface
```

---

## 8. What are Default Methods?

Methods with implementation inside an interface using the `default` keyword.

---

## 9. Why does Spring Boot use interfaces?

To achieve loose coupling and Dependency Injection.

---

## 10. Difference between Interface and Abstract Class?

Interfaces define contracts.

Abstract classes provide partial implementation.

---

# Assignments

## 1.

Create interface

```
Animal
```

Implement

```
Dog

Cat
```

---

## 2.

Create interface

```
Payment
```

Implement

- UPI
- Credit Card
- Cash

---

## 3.

Create interface

```
Vehicle
```

Implement

- Car
- Bike

---

## 4.

Create interface

```
Notification
```

Implement

- Email
- SMS
- WhatsApp

---

## 5.

Create interface

```
Calculator
```

Methods

- add()
- subtract()

---

## 6.

Create two interfaces

```
Camera

GPS
```

Implement both in

```
SmartPhone
```

---

## 7.

Create interface with a default method.

---

## 8.

Create interface with a static method.

---

## 9.

Create Functional Interface

```
Printer
```

Use a lambda expression.

---

## 10.

Build a Payment System using interfaces.

---

# notes.md

```md
# Day 013 Notes

## Interface

Defines a contract.

## Keyword

interface

## Implementation

implements

## Features

- Abstract methods
- Default methods
- Static methods
- Constants

## Functional Interface

Exactly one abstract method.

## Lambda Expression

Simplified implementation of a functional interface.

## Spring Boot Usage

- JpaRepository
- CrudRepository
- ChatModel
- PaymentService
- UserDetailsService
```

---

# README.md

```md
# Day 013 – Interfaces in Java

## Topics

- Interface
- implements
- Multiple Inheritance
- Default Methods
- Static Methods
- Functional Interface
- Lambda Expressions

## Programs

- Animal
- Payment
- SmartPhone
- FunctionalDemo
- LambdaDemo

## Key Learnings

- Interfaces define contracts.
- Classes implement interfaces.
- Java supports multiple inheritance through interfaces.
- Functional interfaces enable lambda expressions.
- Spring Boot is built around interfaces.

## Next Topic

Day 014 – Packages & Access Modifiers
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 013: Learned Interfaces in Java"

git push origin main
```

---

# Day 013 Checklist

- [ ] Understand interfaces
- [ ] Implement interfaces
- [ ] Practice multiple inheritance using interfaces
- [ ] Create default methods
- [ ] Create static methods
- [ ] Understand functional interfaces
- [ ] Write your first lambda expression
- [ ] Complete all assignments
- [ ] Push code to GitHub