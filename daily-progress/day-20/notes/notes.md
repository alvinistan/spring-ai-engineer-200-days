```commandline
Day 020 – Java 8 Features (Lambda Expressions, Streams & Functional Programming)

You'll learn:

Lambda Expressions
Functional Interfaces
Method References
Stream API
filter(), map(), reduce(), collect()
Optional (Advanced)
Date & Time API (LocalDate, LocalDateTime)
Java 8 features used extensively in Spring Boot and Spring AI

This is one of the most important days in the roadmap. Modern Spring Boot code relies heavily on 
Java 8+ features, especially Streams and Lambdas. Mastering them will make your code cleaner,
 more expressive, and interview-ready.
 
```

# Day 020 – Java 8 Features (Lambda Expressions, Streams & Functional Programming)

## Learning Objectives

By the end of today, you will be able to:

- Understand Java 8 Features
- Learn Functional Programming
- Create Lambda Expressions
- Use Functional Interfaces
- Understand Method References
- Learn Stream API
- Perform filter(), map(), sorted(), reduce(), collect()
- Learn Optional (Advanced)
- Learn Date & Time API
- Understand Java 8 in Spring Boot

---

# Folder Structure

```
daily-progress/
└── day-020/
    ├── README.md
    ├── notes.md
    └── code/
        ├── LambdaDemo.java
        ├── FunctionalInterfaceDemo.java
        ├── MethodReferenceDemo.java
        ├── StreamFilterDemo.java
        ├── StreamMapDemo.java
        ├── StreamReduceDemo.java
        ├── StreamCollectDemo.java
        ├── OptionalDemo.java
        ├── DateTimeDemo.java
        └── EmployeeStreamDemo.java
```

---

# 1. What is Java 8?

Java 8 introduced many modern programming features.

Major Features

- Lambda Expressions
- Functional Interfaces
- Stream API
- Method References
- Optional
- New Date & Time API

These features make Java code

- Cleaner
- Shorter
- Faster
- Easier to maintain

---

# Functional Programming

Traditional Java

```java
for(Employee employee : employees){

    if(employee.getSalary() > 50000){

        System.out.println(employee.getName());

    }

}
```

Java 8

```java
employees.stream()
         .filter(employee -> employee.getSalary() > 50000)
         .forEach(System.out::println);
```

Much shorter.

---

# 2. Lambda Expressions

Lambda Expressions allow you to write anonymous functions.

Syntax

```java
(parameters) -> expression
```

Example

Traditional

```java
Runnable runnable = new Runnable(){

    @Override

    public void run(){

        System.out.println("Hello");

    }

};
```

Lambda

```java
Runnable runnable =
        () -> System.out.println("Hello");
```

---

# Lambda Demo

```java
public class LambdaDemo {

    public static void main(String[] args) {

        Runnable task = () -> {

            System.out.println("Learning Java 8");

        };

        task.run();

    }

}
```

Output

```
Learning Java 8
```

---

# 3. Functional Interface

Contains exactly ONE abstract method.

Example

```java
@FunctionalInterface

interface Calculator{

    int add(int a,int b);

}
```

Lambda

```java
Calculator calculator =
        (a,b) -> a+b;

System.out.println(
        calculator.add(10,20)
);
```

Output

```
30
```

---

# 4. Method References

Instead of

```java
name -> System.out.println(name)
```

Use

```java
System.out::println
```

Example

```java
List<String> names =
        List.of("Java","Spring","AI");

names.forEach(System.out::println);
```

Output

```
Java

Spring

AI
```

---

# 5. Stream API

A Stream processes collections efficiently.

Example

```
Collection

↓

Stream

↓

Operations

↓

Result
```

---

# filter()

Select elements based on a condition.

```java
List<Integer> numbers =
        List.of(10,15,20,25,30);

numbers.stream()

       .filter(number -> number%2==0)

       .forEach(System.out::println);
```

Output

```
10

20

30
```

---

# map()

Transforms elements.

```java
List<String> names =
        List.of("java","spring");

names.stream()

     .map(String::toUpperCase)

     .forEach(System.out::println);
```

Output

```
JAVA

SPRING
```

---

# sorted()

```java
List<Integer> numbers =
        List.of(40,10,20,30);

numbers.stream()

       .sorted()

       .forEach(System.out::println);
```

Output

```
10

20

30

40
```

---

# reduce()

Used for aggregation.

```java
int total =

List.of(10,20,30)

.stream()

.reduce(0,Integer::sum);

System.out.println(total);
```

Output

```
60
```

---

# collect()

Collect stream into another collection.

```java
List<String> result =

List.of("java","spring")

.stream()

.map(String::toUpperCase)

.collect(Collectors.toList());

System.out.println(result);
```

Output

```
[JAVA, SPRING]
```

---

# Complete Stream Example

```java
List<String> technologies =

List.of(

"Java",

"Python",

"Spring Boot",

"JavaScript"

);

technologies.stream()

.filter(name -> name.startsWith("J"))

.map(String::toUpperCase)

.forEach(System.out::println);
```

Output

```
JAVA

JAVASCRIPT
```

---

# Employee Example

```java
employees.stream()

.filter(employee -> employee.getSalary()>50000)

.map(Employee::getName)

.sorted()

.forEach(System.out::println);
```

Exactly how enterprise projects are written.

---

# 6. Optional (Advanced)

Instead of

```java
Employee employee = null;
```

Use

```java
Optional<Employee>
```

Example

```java
Optional<String> name =

Optional.of("Rahul");

System.out.println(

name.orElse("Guest")

);
```

Output

```
Rahul
```

---

# Empty Optional

```java
Optional<String> name =

Optional.empty();

System.out.println(

name.orElse("Guest")

);
```

Output

```
Guest
```

---

# Optional Methods

```java
isPresent()

orElse()

orElseGet()

orElseThrow()

ifPresent()
```

---

# 7. Date & Time API

Before Java 8

```
Date

Calendar
```

Complicated.

Java 8 introduced

```java
LocalDate

LocalTime

LocalDateTime
```

---

# Example

```java
import java.time.LocalDate;

public class DateTimeDemo {

    public static void main(String[] args) {

        LocalDate today =

                LocalDate.now();

        System.out.println(today);

    }

}
```

Output

```
2026-01-15
```

---

# LocalDateTime

```java
LocalDateTime now =

LocalDateTime.now();

System.out.println(now);
```

---

# Date Operations

```java
LocalDate today = LocalDate.now();

System.out.println(today.plusDays(5));

System.out.println(today.minusMonths(2));

System.out.println(today.plusYears(1));
```

---

# Java 8 in Spring Boot

Repository

```java
Optional<Employee>

findById(Integer id);
```

Controller

```java
employees.stream()

.map(EmployeeDTO::new)

.collect(Collectors.toList());
```

Sorting

```java
employees.stream()

.sorted()
```

Filtering

```java
employees.stream()

.filter(Employee::isActive)
```

Everything uses Streams.

---

# Spring AI Example

```java
List<Message> messages

.stream()

.filter(Message::hasContent)

.collect(Collectors.toList());
```

Prompt Variables

```java
Map<String,Object>
```

Stream processing

```java
variables.entrySet()

.stream()
```

---

# Advantages of Java 8

- Less Code
- Functional Programming
- Better Performance
- Cleaner Collections Processing
- Easy Parallel Processing
- Widely used in Spring Boot

---

# Interview Questions

## 1. What are Lambda Expressions?

Anonymous functions introduced in Java 8.

---

## 2. What is a Functional Interface?

An interface containing exactly one abstract method.

---

## 3. What annotation identifies a Functional Interface?

```java
@FunctionalInterface
```

---

## 4. What is Stream API?

A framework for processing collections declaratively.

---

## 5. Difference between map() and filter()?

filter()

Selects elements.

map()

Transforms elements.

---

## 6. What does reduce() do?

Aggregates elements into a single value.

---

## 7. What is Optional?

A container object used to avoid NullPointerException.

---

## 8. What are Method References?

Shorter form of lambda expressions.

Example

```java
System.out::println
```

---

## 9. What classes were introduced in the Java 8 Date API?

- LocalDate
- LocalTime
- LocalDateTime

---

## 10. Why does Spring Boot use Java 8 features?

Because they make code:

- Cleaner
- Easier to maintain
- More expressive
- Better for collection processing

---

# Assignments

## 1.

Create your first Lambda Expression.

---

## 2.

Create a Functional Interface.

---

## 3.

Use Method Reference.

---

## 4.

Filter even numbers using Stream.

---

## 5.

Convert names to uppercase using map().

---

## 6.

Sort employee names.

---

## 7.

Calculate total salary using reduce().

---

## 8.

Practice Optional methods.

---

## 9.

Print current date and time.

---

## 10.

Create an Employee Management System using Stream API.

---

# notes.md

```md
# Day 020 Notes

## Java 8 Features

- Lambda Expressions
- Streams
- Functional Interfaces
- Method References
- Optional
- Date & Time API

## Stream Operations

- filter()
- map()
- sorted()
- reduce()
- collect()

## Date API

- LocalDate
- LocalTime
- LocalDateTime

## Spring Boot Usage

- Optional<Employee>
- Stream API
- Method References
- Lambda Expressions
```

---

# README.md

```md
# Day 020 – Java 8 Features

## Topics

- Lambda Expressions
- Functional Interfaces
- Method References
- Stream API
- Optional
- Date & Time API

## Programs

- LambdaDemo
- FunctionalInterfaceDemo
- StreamFilterDemo
- StreamMapDemo
- StreamReduceDemo
- OptionalDemo
- DateTimeDemo

## Key Learnings

- Lambda expressions simplify anonymous classes.
- Stream API provides functional collection processing.
- Optional reduces NullPointerException.
- Java 8 features are heavily used in Spring Boot.

## Next Topic

Day 021 – JDBC (Java Database Connectivity)
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 020: Learned Java 8 Features (Lambda, Streams & Functional Programming)"

git push origin main
```

---

# Day 020 Checklist

- [ ] Understand Lambda Expressions
- [ ] Create Functional Interfaces
- [ ] Practice Method References
- [ ] Learn Stream API
- [ ] Practice filter(), map(), sorted(), reduce(), collect()
- [ ] Understand Optional
- [ ] Learn Java 8 Date & Time API
- [ ] Complete all assignments
- [ ] Push code to GitHub