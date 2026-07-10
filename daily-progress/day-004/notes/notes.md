# Day 004 - Methods in Java

## Learning Objectives

By the end of today, you will be able to:

- Understand what a method is
- Understand why methods are important
- Create methods
- Call methods
- Pass parameters
- Return values
- Differentiate void and return methods
- Understand method overloading
- Understand variable scope
- Build reusable Java programs

---

# Folder Structure

```
daily-progress/
└── day-004/
    ├── README.md
    ├── notes.md
    └── code/
        ├── MethodDemo.java
        ├── GreetingMethod.java
        ├── AdditionMethod.java
        ├── Calculator.java
        ├── ReturnMethod.java
        ├── StudentResult.java
        ├── AreaCalculator.java
        ├── MethodOverloading.java
        ├── VariableScope.java
        └── EmployeeBonusCalculator.java
```

---

# 1. What is a Method?

A **method** is a block of code that performs a specific task.

Instead of writing the same code multiple times, we write it once inside a method and call it whenever needed.

Example

Without methods

```java
System.out.println("Welcome");

System.out.println("Welcome");

System.out.println("Welcome");
```

With methods

```java
printWelcome();
printWelcome();
printWelcome();
```

Notice how the code becomes cleaner.

---

# Why Do We Need Methods?

Methods help us:

- Avoid duplicate code
- Improve readability
- Improve maintainability
- Reuse code
- Divide a large problem into smaller parts

This is one of the main principles of software engineering.

---

# Real World Example

Imagine an ATM.

Whenever you withdraw money, the ATM performs these steps:

- Validate PIN
- Check balance
- Deduct amount
- Print receipt

Instead of writing this code repeatedly, the ATM software creates methods like

```java
validatePin();
checkBalance();
withdrawMoney();
printReceipt();
```

Spring Boot applications also use methods everywhere.

Example

```java
saveEmployee()

findEmployee()

deleteEmployee()

updateEmployee()
```

---

# Anatomy of a Method

Example

```java
public static void greet(){

    System.out.println("Welcome");

}
```

Let's break it down.

```
public
```

Access modifier

```
static
```

Belongs to the class.

```
void
```

Return type.

```
greet
```

Method name.

```
()
```

Parameters.

```
{}
```

Method body.

---

# Method Syntax

```java
accessModifier static returnType methodName(){

    // code

}
```

---

# 2. First Method

## Program

```java
public class GreetingMethod {

    public static void greet(){

        System.out.println("Welcome to Java");

    }

    public static void main(String[] args) {

        greet();

    }

}
```

Output

```
Welcome to Java
```

---

# Execution Flow

When Java starts,

it enters

```java
main()
```

Inside main,

```java
greet();
```

is called.

Java jumps to

```java
greet()
```

executes it,

returns back to main.

---

# Calling Method Multiple Times

```java
public class GreetingMethod {

    public static void greet(){

        System.out.println("Welcome");

    }

    public static void main(String[] args) {

        greet();

        greet();

        greet();

    }

}
```

Output

```
Welcome
Welcome
Welcome
```

One method

Three calls

No duplicated code.

---

# 3. Method with Parameters

Sometimes methods need input.

Example

Instead of

```java
printHelloRahul()

printHelloJohn()

printHelloDavid()
```

We write one method.

```java
greet(name)
```

---

# Program

```java
public class GreetingMethod {

    public static void greet(String name){

        System.out.println("Welcome " + name);

    }

    public static void main(String[] args) {

        greet("Rahul");

        greet("John");

        greet("David");

    }

}
```

Output

```
Welcome Rahul

Welcome John

Welcome David
```

---

# What is a Parameter?

```java
public static void greet(String name)
```

Here

```
String name
```

is called the parameter.

---

# What is an Argument?

```java
greet("Rahul");
```

"Rahul"

is called an argument.

---

# Parameter vs Argument

| Parameter | Argument |
|------------|----------|
| Declared in method | Passed during method call |
| Variable | Actual value |

---

# 4. Multiple Parameters

Methods can receive multiple values.

Program

```java
public class AdditionMethod {

    public static void add(int a, int b){

        System.out.println("Sum = " + (a+b));

    }

    public static void main(String[] args) {

        add(10,20);

        add(50,80);

    }

}
```

Output

```
Sum = 30

Sum = 130
```

---

# Parameter Order Matters

Correct

```java
add(10,20)
```

Incorrect

```java
add(20,10)
```

The values are assigned according to position.

---

# 5. Return Type

Some methods return a value.

Example

```java
2 + 3
```

Result

```
5
```

Instead of printing,

we return it.

---

# Program

```java
public class ReturnMethod {

    public static int add(int a,int b){

        return a+b;

    }

    public static void main(String[] args) {

        int answer = add(20,30);

        System.out.println(answer);

    }

}
```

Output

```
50
```

---

# How Return Works

```java
return a+b;
```

sends the value back

to the calling method.

---

# Void vs Return

Void

```java
public static void printHello()
```

Returns nothing.

Return

```java
public static int add()
```

Returns integer.

---

# Common Return Types

| Return Type | Returns |
|--------------|---------|
| void | Nothing |
| int | Integer |
| double | Decimal |
| boolean | true/false |
| String | Text |

---

# Program

```java
public class StudentResult {

    public static boolean isPass(int marks){

        return marks>=35;

    }

    public static void main(String[] args) {

        boolean result = isPass(70);

        System.out.println(result);

    }

}
```

Output

```
true
```

---

# 6. Variable Scope

Variables have limited visibility.

Local Variable

```java
public static void test(){

    int age=20;

}
```

Cannot be accessed outside the method.

---

Program

```java
public class VariableScope {

    public static void test(){

        int number=10;

        System.out.println(number);

    }

    public static void main(String[] args){

        test();

    }

}
```

---

# Method Overloading

Java allows multiple methods with the same name,

provided the parameter list is different.

---

Program

```java
public class MethodOverloading {

    public static int add(int a,int b){

        return a+b;

    }

    public static double add(double a,double b){

        return a+b;

    }

    public static void main(String[] args){

        System.out.println(add(10,20));

        System.out.println(add(5.5,8.2));

    }

}
```

Output

```
30

13.7
```

This is called

Method Overloading.

---

# Real Project Example

Imagine Employee Salary

```java
calculateSalary()
```

Student Marks

```java
calculateGrade()
```

Area

```java
calculateArea()
```

Tax

```java
calculateTax()
```

Every task becomes one reusable method.

---

# Interview Questions

## 1 What is a Method?

A method is a reusable block of code that performs a specific task.

---

## 2 Why do we use methods?

- Code reuse
- Better readability
- Easy maintenance
- Reduce duplication

---

## 3 Difference between Parameter and Argument?

Parameter

```java
add(int a,int b)
```

Argument

```java
add(10,20)
```

---

## 4 Difference between void and return?

void

Returns nothing.

return

Returns a value.

---

## 5 What is Method Overloading?

Multiple methods having the same name but different parameters.

---

## 6 Can two methods have the same name?

Yes,

if their parameter list is different.

---

## 7 Can two methods have same name and same parameters?

No.

Compiler throws an error.

---

## 8 What is Variable Scope?

Scope defines where a variable can be accessed.

---

## 9 Can main call another method?

Yes.

Example

```java
main(){

    greet();

}
```

---

## 10 Why are methods important in Spring Boot?

Spring Boot applications are built using methods.

Examples

```java
saveEmployee()

deleteEmployee()

findEmployee()

updateEmployee()

login()

register()

sendEmail()
```

---

# Assignments

1. Create method to find square.

2. Create method to find cube.

3. Create method to find largest number.

4. Create method to calculate simple interest.

5. Create method to check even/odd.

6. Create method to calculate BMI.

7. Create method to calculate electricity bill.

8. Create Employee Bonus Calculator.

9. Create Student Grade Calculator.

10. Build Calculator using methods.

---

# README.md

```md
# Day 004 - Methods in Java

## Topics

- Methods
- Parameters
- Arguments
- Return Type
- void Methods
- Method Overloading
- Variable Scope

## Programs

- GreetingMethod
- AdditionMethod
- ReturnMethod
- StudentResult
- MethodOverloading
- VariableScope
- Calculator

## Key Learnings

- Methods improve code reuse.
- Parameters receive values.
- Arguments pass values.
- Methods can return values.
- Overloading improves flexibility.
- Scope determines variable visibility.

## Next Topic

Day 005 - Arrays in Java
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 004: Learned Methods in Java"

git push origin main
```

---

# Day 004 Checklist

- [ ] Understand methods
- [ ] Write methods without notes
- [ ] Use parameters
- [ ] Return values
- [ ] Practice method overloading
- [ ] Understand scope
- [ ] Complete 10 assignments
- [ ] Push to GitHub
