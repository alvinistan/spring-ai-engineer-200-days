# Folder Structure

```

com.company.employeemanagement
│
├── controller
├── service
├── repository
├── entity
├── dto
├── config
├── exception
├── security
└── util

```

# Day 014 – Packages & Access Modifiers

## Learning Objectives

By the end of today, you will be able to:

- Understand Packages
- Create Custom Packages
- Import Classes
- Understand Java Package Naming Conventions
- Learn Access Modifiers
- Understand public, private, protected, and default
- Understand Package Structure in Spring Boot
- Learn Best Practices for Organizing Projects

---

# Folder Structure

```
daily-progress/
└── day-014/
    ├── README.md
    ├── notes.md
    └── code/
        ├── com/
        │   └── example/
        │       ├── model/
        │       │   └── Student.java
        │       ├── service/
        │       │   └── StudentService.java
        │       ├── util/
        │       │   └── MathUtility.java
        │       └── main/
        │           └── Main.java
        ├── AccessModifierDemo.java
        ├── PublicDemo.java
        ├── PrivateDemo.java
        ├── ProtectedDemo.java
        └── DefaultDemo.java
```

---

# 1. What is a Package?

A package is a collection of related Java classes and interfaces.

Think of it like folders on your computer.

Example

```
Documents

↓

Java

↓

SpringBoot

↓

Employee.java
```

Similarly

```
com.example.model

↓

Student.java
```

---

# Why Do We Need Packages?

Packages help us:

- Organize code
- Avoid class name conflicts
- Improve maintainability
- Control access
- Create reusable modules

---

# Real Spring Boot Example

```
com.company.employee

│

├── controller

├── service

├── repository

├── entity

├── dto

├── config

├── util

└── exception
```

Every class belongs to a package.

---

# Package Syntax

```java
package com.example.model;
```

This statement must be the first line in a Java file.

---

# Program 1

## Student.java

```java
package com.example.model;

public class Student {

    public void display() {

        System.out.println("Student Information");

    }

}
```

---

# Import Statement

To use a class from another package, use `import`.

Example

```java
import com.example.model.Student;
```

---

# Program 2

## Main.java

```java
package com.example.main;

import com.example.model.Student;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.display();

    }

}
```

Output

```
Student Information
```

---

# Wildcard Import

Instead of

```java
import com.example.model.Student;
```

You can write

```java
import com.example.model.*;
```

This imports all public classes from the package.

---

# Package Naming Convention

Java packages are written in lowercase.

Example

```text
com.company.project

org.example.demo

in.company.student
```

Avoid

```text
StudentPackage

JAVA

Models
```

---

# 2. Access Modifiers

Access modifiers control where classes, variables, and methods can be accessed.

Java provides four access modifiers:

- public
- protected
- default (package-private)
- private

---

# Access Modifier Table

| Modifier | Same Class | Same Package | Subclass | Other Package |
|-----------|------------|--------------|----------|---------------|
| public | ✅ | ✅ | ✅ | ✅ |
| protected | ✅ | ✅ | ✅ | ❌* |
| default | ✅ | ✅ | ❌ | ❌ |
| private | ✅ | ❌ | ❌ | ❌ |

> *`protected` is accessible in subclasses located in other packages.

---

# 3. public

A public member is accessible everywhere.

Example

```java
public class Student {

    public void study() {

        System.out.println("Studying");

    }

}
```

Usage

```java
Student student = new Student();

student.study();
```

---

# 4. private

Private members can only be accessed inside the same class.

Example

```java
public class Employee {

    private double salary = 50000;

    public double getSalary() {

        return salary;

    }

}
```

Wrong

```java
Employee employee = new Employee();

employee.salary;
```

Compilation Error.

Correct

```java
employee.getSalary();
```

---

# 5. protected

Protected members are accessible:

- Inside the same class
- Inside the same package
- In subclasses

Example

```java
public class Animal {

    protected void eat() {

        System.out.println("Eating");

    }

}
```

```java
public class Dog extends Animal {

    void test() {

        eat();

    }

}
```

---

# 6. Default (Package-Private)

If no modifier is specified:

```java
class Student {

}
```

or

```java
void display() {

}
```

The member is accessible only within the same package.

---

# Example

```java
package com.example.model;

class Student {

    void display() {

        System.out.println("Hello");

    }

}
```

Another class in the same package can access it.

A class from another package cannot.

---

# 7. Package Structure in Spring Boot

Typical project

```
com.example.employee

├── controller
│   └── EmployeeController.java

├── service
│   └── EmployeeService.java

├── repository
│   └── EmployeeRepository.java

├── entity
│   └── Employee.java

├── dto
│   └── EmployeeRequest.java

├── config
│   └── AppConfig.java

├── exception
│   └── GlobalExceptionHandler.java

└── util
    └── DateUtility.java
```

---

# Why This Structure?

- Easier navigation
- Separation of responsibilities
- Better testing
- Scalability
- Team collaboration

---

# 8. Example Project

## Student.java

```java
package com.example.model;

public class Student {

    private String name;

    public Student(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

}
```

---

## StudentService.java

```java
package com.example.service;

import com.example.model.Student;

public class StudentService {

    public void printStudent(Student student) {

        System.out.println(student.getName());

    }

}
```

---

## Main.java

```java
package com.example.main;

import com.example.model.Student;
import com.example.service.StudentService;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Rahul");

        StudentService service = new StudentService();

        service.printStudent(student);

    }

}
```

Output

```
Rahul
```

---

# Best Practices

✅ Use meaningful package names.

```
controller

service

repository

entity
```

❌ Avoid

```
abc

temp

java1
```

---

# Interview Questions

## 1. What is a Package?

A package is a namespace used to organize related classes and interfaces.

---

## 2. Why do we use Packages?

- Organize code
- Avoid naming conflicts
- Improve maintainability
- Control access

---

## 3. Which statement defines a package?

```java
package com.example.model;
```

---

## 4. Which statement imports a class?

```java
import com.example.model.Student;
```

---

## 5. What are the four access modifiers?

- public
- protected
- default
- private

---

## 6. Which access modifier provides the widest access?

```java
public
```

---

## 7. Which access modifier provides the most restricted access?

```java
private
```

---

## 8. What is the default access modifier?

Package-private (no keyword).

---

## 9. Why are private variables recommended?

They support encapsulation and prevent unauthorized modification.

---

## 10. How does Spring Boot organize packages?

Common packages include:

- controller
- service
- repository
- entity
- dto
- config
- exception
- util

---

# Assignments

## 1.

Create package

```
com.example.student
```

Create

```
Student.java
```

---

## 2.

Create package

```
com.example.employee
```

Create

```
Employee.java
```

---

## 3.

Import one package into another.

---

## 4.

Create a utility package.

```
com.example.util
```

Add

```
MathUtility.java
```

---

## 5.

Demonstrate all four access modifiers.

---

## 6.

Create a package

```
controller
```

Add

```
StudentController.java
```

---

## 7.

Create a package

```
service
```

Add

```
StudentService.java
```

---

## 8.

Create a package

```
repository
```

Add

```
StudentRepository.java
```

---

## 9.

Create package

```
entity
```

Add

```
Student.java
```

---

## 10.

Create a mini Spring Boot-style folder structure using only Java classes.

---

# notes.md

```md
# Day 014 Notes

## Package

A package groups related Java classes and interfaces.

Example

```java
package com.example.model;
```

## Import

```java
import com.example.model.Student;
```

## Access Modifiers

- public → Accessible everywhere
- protected → Same package + subclasses
- default → Same package only
- private → Same class only

## Benefits of Packages

- Organize code
- Prevent naming conflicts
- Improve maintainability
- Support modular design

## Spring Boot Structure

- controller
- service
- repository
- entity
- dto
- config
- util
- exception
```

---

# README.md

```md
# Day 014 – Packages & Access Modifiers

## Topics

- Packages
- Import Statements
- Package Naming
- Access Modifiers
- Spring Boot Package Structure

## Programs

- Student
- StudentService
- Main
- AccessModifierDemo

## Key Learnings

- Packages organize Java classes.
- Use import to access classes from other packages.
- public provides the widest access.
- private provides the highest level of encapsulation.
- Spring Boot uses packages to organize projects.

## Next Topic

Day 015 – Exception Handling
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 014: Learned Packages and Access Modifiers"

git push origin main
```

---

# Day 014 Checklist

- [ ] Create custom packages
- [ ] Import classes correctly
- [ ] Understand package naming conventions
- [ ] Practice all four access modifiers
- [ ] Build a Spring Boot-style package structure
- [ ] Complete all assignments
- [ ] Push your work to GitHub