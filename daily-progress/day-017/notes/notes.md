```commandline
Excellent! 🎉 Welcome to Day 017 of your 200-Day Spring AI Engineer Roadmap.

Today you'll learn Java Generics & Wrapper Classes, two concepts that are used everywhere in Spring Boot, Spring AI, Hibernate, and the Java Collections Framework.

Without Generics, Java Collections would not be type-safe.

Without Wrapper Classes, Collections could not store numbers like int, double, or boolean.

For example, in Spring Boot you'll frequently see:


List<Employee>
List<String>
Map<Integer, Employee>
ResponseEntity<Employee>
Optional<Employee>

```

# Day 017 – Java Generics & Wrapper Classes

## Learning Objectives

By the end of today, you will be able to:

- Understand Generics
- Learn Generic Classes
- Learn Generic Methods
- Understand Type Safety
- Understand Wrapper Classes
- Learn Autoboxing & Unboxing
- Understand Object Class
- Learn Why Collections Use Wrapper Classes
- Understand Optional (Introduction)
- Learn Generics in Spring Boot

---

# Folder Structure

```
daily-progress/
└── day-017/
    ├── README.md
    ├── notes.md
    └── code/
        ├── WithoutGenerics.java
        ├── WithGenerics.java
        ├── GenericBox.java
        ├── GenericMethodDemo.java
        ├── WrapperClassDemo.java
        ├── AutoBoxingDemo.java
        ├── UnboxingDemo.java
        ├── ObjectClassDemo.java
        ├── OptionalDemo.java
        └── StudentRepository.java
```

---

# 1. What are Generics?

Generics allow us to write classes, interfaces, and methods that work with different data types while maintaining type safety.

Before Java 5

```java
ArrayList list = new ArrayList();

list.add("Java");

list.add(100);
```

Problem

Different data types are mixed.

---

# Without Generics

```java
import java.util.ArrayList;

public class WithoutGenerics {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("Java");

        list.add(100);

        list.add(true);

        System.out.println(list);

    }

}
```

Output

```
[Java, 100, true]
```

This is not type-safe.

---

# With Generics

```java
import java.util.ArrayList;

public class WithGenerics {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");

        courses.add("Spring Boot");

        // courses.add(100); ❌ Compile-time Error

        System.out.println(courses);

    }

}
```

Output

```
[Java, Spring Boot]
```

---

# Advantages of Generics

- Type Safety
- Compile-time Error Checking
- No Explicit Casting
- Reusable Code
- Better Readability

---

# Generic Syntax

```java
ClassName<Type>
```

Examples

```java
ArrayList<String>

List<Employee>

Map<Integer,String>

Set<Double>
```

---

# 2. Generic Class

Example

```java
public class GenericBox<T> {

    private T value;

    public void setValue(T value) {

        this.value = value;

    }

    public T getValue() {

        return value;

    }

}
```

---

# Demo

```java
public class GenericBoxDemo {

    public static void main(String[] args) {

        GenericBox<String> box = new GenericBox<>();

        box.setValue("Spring AI");

        System.out.println(box.getValue());

    }

}
```

Output

```
Spring AI
```

---

# Generic with Integer

```java
GenericBox<Integer> box = new GenericBox<>();

box.setValue(100);

System.out.println(box.getValue());
```

Output

```
100
```

---

# 3. Generic Method

```java
public class GenericMethodDemo {

    public static <T> void print(T value) {

        System.out.println(value);

    }

    public static void main(String[] args) {

        print("Java");

        print(100);

        print(99.9);

    }

}
```

Output

```
Java

100

99.9
```

---

# 4. Wrapper Classes

Java has primitive types.

```
int

double

boolean

char
```

Collections cannot store primitives.

Instead Java provides Wrapper Classes.

| Primitive | Wrapper |
|------------|----------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

---

# Why Wrapper Classes?

Wrong

```java
ArrayList<int> numbers;
```

Compilation Error.

Correct

```java
ArrayList<Integer> numbers;
```

Collections work only with objects.

---

# Wrapper Example

```java
public class WrapperClassDemo {

    public static void main(String[] args) {

        Integer age = 25;

        Double salary = 55000.50;

        Boolean active = true;

        System.out.println(age);

        System.out.println(salary);

        System.out.println(active);

    }

}
```

---

# 5. Autoboxing

Automatic conversion

Primitive

↓

Wrapper Object

```java
Integer number = 100;
```

Java automatically converts

```java
100
```

to

```java
Integer.valueOf(100)
```

---

# Program

```java
public class AutoBoxingDemo {

    public static void main(String[] args) {

        Integer number = 10;

        Double price = 99.99;

        Boolean available = true;

        System.out.println(number);

        System.out.println(price);

        System.out.println(available);

    }

}
```

---

# 6. Unboxing

Wrapper

↓

Primitive

```java
Integer number = 50;

int value = number;
```

Java automatically converts

```
Integer

↓

int
```

---

# Program

```java
public class UnboxingDemo {

    public static void main(String[] args) {

        Integer number = 100;

        int value = number;

        System.out.println(value);

    }

}
```

Output

```
100
```

---

# 7. Object Class

Every class in Java extends

```java
Object
```

Example

```java
class Student {

}
```

Actually becomes

```java
class Student extends Object {

}
```

---

# Object Example

```java
public class ObjectClassDemo {

    public static void main(String[] args) {

        String text = "Java";

        System.out.println(text.toString());

        System.out.println(text.hashCode());

    }

}
```

---

# Common Object Methods

```java
toString()

equals()

hashCode()

getClass()
```

---

# 8. Optional (Introduction)

Optional helps avoid

```
NullPointerException
```

Example

```java
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Rahul");

        System.out.println(name.get());

    }

}
```

Output

```
Rahul
```

---

# Optional Empty

```java
Optional<String> name = Optional.empty();

System.out.println(name.orElse("Guest"));
```

Output

```
Guest
```

---

# Spring Boot Example

Repository

```java
Optional<Employee> findById(Integer id);
```

Instead of

```java
Employee employee;
```

Spring returns

```java
Optional<Employee>
```

to safely handle missing data.

---

# Spring AI Example

Prompt Variables

```java
Map<String,Object>
```

Chat History

```java
List<Message>
```

Documents

```java
List<Document>
```

Generics ensure type safety.

---

# Advantages of Wrapper Classes

- Required for Collections
- Utility methods
- Null values supported
- Type conversion

---

# Interview Questions

## 1. What are Generics?

Generics provide type safety and allow classes and methods to work with different data types.

---

## 2. Why are Generics used?

- Type safety
- Compile-time checking
- Reusability

---

## 3. Why can't Collections store primitive types?

Collections store only objects.

Primitive types are not objects.

---

## 4. What are Wrapper Classes?

Classes that wrap primitive values into objects.

Example

```
int → Integer
```

---

## 5. What is Autoboxing?

Automatic conversion

Primitive

↓

Wrapper

---

## 6. What is Unboxing?

Automatic conversion

Wrapper

↓

Primitive

---

## 7. What is the Object class?

The root class of all Java classes.

---

## 8. What is Optional?

A container object used to safely represent a value that may or may not be present.

---

## 9. Why does Spring Boot use Optional?

To avoid returning null and reduce NullPointerExceptions.

---

## 10. Where are Generics used in Spring Boot?

- List<Employee>
- Optional<Employee>
- ResponseEntity<Employee>
- JpaRepository<Employee,Integer>
- Map<String,Object>

---

# Assignments

## 1.

Create a GenericBox<T> class.

---

## 2.

Create a Generic Method

```
display()
```

---

## 3.

Store Integers using

```
ArrayList<Integer>
```

---

## 4.

Store Doubles using

```
List<Double>
```

---

## 5.

Demonstrate Autoboxing.

---

## 6.

Demonstrate Unboxing.

---

## 7.

Print

```
hashCode()

toString()
```

of an object.

---

## 8.

Create

```
Optional<String>
```

---

## 9.

Create

```
Map<Integer,Employee>
```

---

## 10.

Create

```
List<Student>
```

using Generics.

---

# notes.md

```md
# Day 017 Notes

## Generics

Provide type safety.

Example

```java
List<String>
```

## Generic Class

```java
class Box<T>
```

## Generic Method

```java
<T> void print(T value)
```

## Wrapper Classes

- Integer
- Double
- Boolean
- Character

## Autoboxing

Primitive → Wrapper

## Unboxing

Wrapper → Primitive

## Object Class

Parent of all Java classes.

## Optional

Avoids NullPointerException.

## Spring Boot Usage

- Optional<Employee>
- List<Employee>
- JpaRepository<Employee,Integer>
```

---

# README.md

```md
# Day 017 – Java Generics & Wrapper Classes

## Topics

- Generics
- Generic Classes
- Generic Methods
- Wrapper Classes
- Autoboxing
- Unboxing
- Object Class
- Optional

## Programs

- GenericBox
- GenericMethodDemo
- WrapperClassDemo
- AutoBoxingDemo
- UnboxingDemo
- OptionalDemo

## Key Learnings

- Generics provide type safety.
- Wrapper classes allow primitives to be used in collections.
- Autoboxing and unboxing happen automatically.
- Object is the parent of all Java classes.
- Optional helps avoid NullPointerException.

## Next Topic

Day 018 – Java File Handling & Serialization
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 017: Learned Java Generics and Wrapper Classes"

git push origin main
```

---

# Day 017 Checklist

- [ ] Understand Generics
- [ ] Create Generic Classes
- [ ] Create Generic Methods
- [ ] Learn Wrapper Classes
- [ ] Practice Autoboxing
- [ ] Practice Unboxing
- [ ] Understand Object class
- [ ] Learn Optional basics
- [ ] Complete all assignments
- [ ] Push to GitHub
