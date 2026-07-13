# Day 009 – Encapsulation in Java

## Learning Objectives

By the end of this lesson, you will be able to:

- Understand Encapsulation
- Understand Data Hiding
- Create Private Variables
- Write Getters and Setters
- Validate Data using Setters
- Understand JavaBeans Convention
- Understand Immutable Objects (Introduction)
- Apply Encapsulation in Spring Boot Projects

---

# Folder Structure

```

daily-progress/
└── day-009/
├── README.md
├── notes.md
└── code/
├── Student.java
├── StudentDemo.java
├── Employee.java
├── EmployeeDemo.java
├── BankAccount.java
├── BankDemo.java
├── Product.java
├── ProductDemo.java
├── Person.java
└── JavaBeanDemo.java

```

---

# 1. What is Encapsulation?

Encapsulation means:

> **Wrapping data (variables) and methods together into a single unit while hiding the internal details from outside the class.**

A class contains:

- Fields (Data)
- Methods (Behavior)

Example

```

Student

↓

Fields

id
name
marks

↓

Methods

getId()
setId()
display()

```

---

# Why Do We Need Encapsulation?

Without encapsulation:

```java
Student student = new Student();

student.marks = -100;
```

A student cannot have negative marks.

We need validation.

Encapsulation allows us to control how data is modified.

---

# Real World Example

Imagine an ATM.

You cannot directly change your balance.

Wrong

```
account.balance = 1000000;
```

Correct

```
deposit()

withdraw()

transfer()
```

The bank controls access.

This is encapsulation.

---

# The Four Steps of Encapsulation

## Step 1

Make variables **private**

```java
private int id;
```

---

## Step 2

Create Getter

```java
public int getId(){

    return id;

}
```

---

## Step 3

Create Setter

```java
public void setId(int id){

    this.id = id;

}
```

---

## Step 4

Access data using getters and setters

```java
student.setId(101);

System.out.println(student.getId());
```

---

# Program 1

## Student.java

```java
public class Student {

    private int id;

    private String name;

    private double marks;

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public double getMarks() {

        return marks;

    }

    public void setMarks(double marks) {

        this.marks = marks;

    }

}
```

---

## StudentDemo.java

```java
public class StudentDemo {

    public static void main(String[] args) {

        Student student = new Student();

        student.setId(101);

        student.setName("Rahul");

        student.setMarks(90.5);

        System.out.println(student.getId());

        System.out.println(student.getName());

        System.out.println(student.getMarks());

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

# Why Private?

Suppose

```java
public double marks;
```

Anyone can write

```java
student.marks = -200;
```

Wrong.

Using private prevents this.

---

# Validation Using Setter

```java
public void setMarks(double marks){

    if(marks >= 0 && marks <= 100){

        this.marks = marks;

    }else{

        System.out.println("Invalid Marks");

    }

}
```

Now

```java
student.setMarks(-20);
```

Output

```
Invalid Marks
```

---

# Program 2

## Employee.java

```java
public class Employee {

    private int id;

    private String name;

    private double salary;

    public void setSalary(double salary){

        if(salary >= 0){

            this.salary = salary;

        }else{

            System.out.println("Invalid Salary");

        }

    }

    public double getSalary(){

        return salary;

    }

}
```

---

## EmployeeDemo.java

```java
public class EmployeeDemo {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setSalary(50000);

        System.out.println(employee.getSalary());

    }

}
```

---

# Read-Only Object

Only Getter

```java
private int id;

public int getId(){

    return id;

}
```

Cannot modify from outside.

---

# Write-Only Object

Only Setter

```java
public void setPassword(String password){

}
```

No getter.

Useful for passwords.

---

# JavaBeans Convention

A JavaBean follows these rules:

- Private variables
- Public getter/setter
- No-argument constructor
- Serializable (optional in many applications)

Example

```java
public class Employee {

    private int id;

    private String name;

    public Employee(){

    }

    public int getId(){

        return id;

    }

    public void setId(int id){

        this.id = id;

    }

}
```

---

# Getter Naming Rule

Variable

```java
private String name;
```

Getter

```java
getName()
```

Setter

```java
setName()
```

Boolean

```java
private boolean active;
```

Getter

```java
isActive()
```

Setter

```java
setActive()
```

---

# Program 3

## BankAccount.java

```java
public class BankAccount {

    private String holder;

    private double balance;

    public void deposit(double amount){

        if(amount > 0){

            balance += amount;

        }

    }

    public void withdraw(double amount){

        if(amount <= balance){

            balance -= amount;

        }else{

            System.out.println("Insufficient Balance");

        }

    }

    public double getBalance(){

        return balance;

    }

}
```

---

## BankDemo.java

```java
public class BankDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(1000);

        account.withdraw(200);

        System.out.println(account.getBalance());

    }

}
```

Output

```
800.0
```

---

# Encapsulation in Spring Boot

Entity

```java
public class Employee {

    private Integer id;

    private String name;

    public Integer getId() {

        return id;

    }

    public void setId(Integer id) {

        this.id = id;

    }

}
```

DTO

```java
public class EmployeeRequest {

    private String name;

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

}
```

Spring Boot follows encapsulation everywhere.

---

# Advantages of Encapsulation

- Data Hiding
- Security
- Validation
- Easy Maintenance
- Flexible Code
- Better Testing
- Reusability

---

# Interview Questions

## 1. What is Encapsulation?

Encapsulation is wrapping data and methods into one unit while restricting direct access to the data.

---

## 2. Why use private variables?

To protect data from unauthorized modification.

---

## 3. What are Getter and Setter methods?

Getter returns a field value.

Setter updates a field value.

---

## 4. Difference between Getter and Setter?

| Getter | Setter |
|----------|---------|
| Reads data | Updates data |
| Returns value | No return value (usually) |

---

## 5. Can we create a class with only Getter?

Yes.

It becomes read-only.

---

## 6. Can we create a class with only Setter?

Yes.

Useful for passwords or write-only fields.

---

## 7. What is Data Hiding?

Preventing direct access to variables using `private`.

---

## 8. What is JavaBean?

A class with:

- Private fields
- Public getters/setters
- No-argument constructor

---

## 9. How does Spring Boot use Encapsulation?

Entities, DTOs, Request Models, Response Models, and Configuration classes all use private fields with getters and setters.

---

## 10. What are the advantages of Encapsulation?

- Security
- Validation
- Maintainability
- Flexibility
- Reusability

---

# Assignments

## 1. Student Class

Fields:

- id
- name
- marks

Validate marks (0–100).

---

## 2. Employee Class

Validate salary.

Salary cannot be negative.

---

## 3. Bank Account

Implement:

- deposit()
- withdraw()
- getBalance()

Prevent overdrafts.

---

## 4. Product Class

Fields:

- id
- name
- price

Price cannot be negative.

---

## 5. Circle Class

Private radius.

Validate radius.

Method:

```java
calculateArea()
```

---

## 6. Rectangle Class

Private:

- length
- width

Validate both.

Method:

```java
calculateArea()
```

---

## 7. Mobile Class

Fields:

- brand
- model
- price

Validate price.

---

## 8. Car Class

Fields:

- brand
- speed

Maximum speed

```
300
```

---

## 9. User Class

Fields:

- username
- password

Setter

```
password length >= 8
```

---

## 10. Employee Bonus

Private salary.

Method

```
calculateBonus()
```

Returns

```
10% salary
```

---

# notes.md

```md
# Day 009 Notes

## Encapsulation

Wrapping data and methods into a single unit while hiding implementation details.

## Data Hiding

Achieved using `private` variables.

## Getter

Returns field value.

```java
getName()
```

## Setter

Updates field value.

```java
setName()
```

## JavaBean

- Private fields
- Public getters/setters
- No-argument constructor

## Benefits

- Security
- Validation
- Reusability
- Maintainability

## Spring Boot Usage

- Entities
- DTOs
- Models
- Configuration classes
```

---

# README.md

```md
# Day 009 – Encapsulation in Java

## Topics

- Encapsulation
- Data Hiding
- Getters
- Setters
- Validation
- JavaBeans

## Programs

- Student
- Employee
- BankAccount
- Product
- JavaBeanDemo

## Key Learnings

- Use private fields.
- Access fields through getters and setters.
- Validate data in setters.
- Encapsulation improves security and maintainability.

## Next Topic

Day 010 – Inheritance
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 009: Learned Encapsulation in Java"

git push origin main
```

---

# Day 009 Checklist

- [ ] Understand encapsulation
- [ ] Make fields private
- [ ] Write getters
- [ ] Write setters
- [ ] Add validation inside setters
- [ ] Create JavaBean classes
- [ ] Complete all assignments
- [ ] Push to GitHub