# Day 015 – Exception Handling in Java

```commandline
Excellent! 🎉 Welcome to Day 015 of your 200-Day Spring AI Engineer Roadmap.

Today you'll learn one of the most important topics in Enterprise Java and Spring Boot:

Exception Handling in Java

A professional application should never crash because of invalid input or unexpected errors.

Exception handling allows us to detect, handle, and recover from runtime errors gracefully.

In Spring Boot, exception handling is used in:

REST APIs
Database Operations
File Uploads
External API Calls
Spring AI Chat Requests
Authentication & Authorization


```

## Learning Objectives

By the end of today, you will be able to:

- Understand Exceptions
- Differentiate Compile-Time and Runtime Errors
- Understand Checked and Unchecked Exceptions
- Use try-catch
- Use finally
- Use throw
- Use throws
- Create Custom Exceptions
- Learn Exception Handling Best Practices
- Understand Global Exception Handling in Spring Boot

---

# Folder Structure

```
daily-progress/
└── day-015/
    ├── README.md
    ├── notes.md
    └── code/
        ├── DivideNumbers.java
        ├── MultipleCatchDemo.java
        ├── FinallyDemo.java
        ├── ThrowDemo.java
        ├── ThrowsDemo.java
        ├── AgeValidator.java
        ├── InvalidAgeException.java
        ├── BankAccount.java
        ├── BankingDemo.java
        └── CustomExceptionDemo.java
```

---

# 1. What is an Exception?

An Exception is an event that interrupts the normal execution of a program.

Example:

```java
int result = 10 / 0;
```

Output

```
Exception in thread "main"
java.lang.ArithmeticException: / by zero
```

The program crashes because the exception is not handled.

---

# Real Life Example

Imagine an ATM.

You enter

```
Withdraw = ₹5000
```

Current Balance

```
₹1000
```

Instead of crashing,

the ATM displays

```
Insufficient Balance
```

That's exception handling.

---

# Types of Errors

## 1. Compile-Time Error

Detected before running the program.

Example

```java
System.out.println("Hello")
```

Missing semicolon.

---

## 2. Runtime Error

Occurs while the program is running.

Example

```java
int result = 10 / 0;
```

---

## 3. Logical Error

Program runs successfully,

but gives incorrect output.

Example

```java
int area = length + width;
```

Instead of

```java
length * width;
```

---

# Exception Hierarchy

```
Object
   |
Throwable
   |
-------------------------
|                       |
Error              Exception
                        |
        -------------------------
        |                       |
Checked Exceptions   Runtime Exceptions
```

---

# Checked Exception

Checked at compile time.

Examples

- IOException
- SQLException
- FileNotFoundException

Must be handled or declared.

---

# Unchecked Exception

Occurs during runtime.

Examples

- ArithmeticException
- NullPointerException
- ArrayIndexOutOfBoundsException

---

# Program 1

## DivideNumbers.java

```java
public class DivideNumbers {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

            System.out.println(result);

        } catch (ArithmeticException exception) {

            System.out.println("Cannot divide by zero.");

        }

        System.out.println("Program Continues...");

    }

}
```

Output

```
Cannot divide by zero.
Program Continues...
```

---

# try-catch Flow

```
try

↓

Exception?

↓

Yes

↓

catch

↓

Continue Program
```

---

# Multiple Catch Blocks

```java
public class MultipleCatchDemo {

    public static void main(String[] args) {

        try {

            String text = null;

            System.out.println(text.length());

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Error");

        } catch (NullPointerException e) {

            System.out.println("Null Value");

        }

    }

}
```

Output

```
Null Value
```

---

# finally Block

The finally block always executes.

Used for:

- Closing files
- Closing database connections
- Releasing resources

Example

```java
public class FinallyDemo {

    public static void main(String[] args) {

        try {

            System.out.println(10 / 2);

        } finally {

            System.out.println("Cleaning Resources");

        }

    }

}
```

Output

```
5
Cleaning Resources
```

---

# throw Keyword

Used to manually create an exception.

Example

```java
public class ThrowDemo {

    public static void validateAge(int age) {

        if (age < 18) {

            throw new ArithmeticException("Age must be 18 or above.");

        }

        System.out.println("Eligible");

    }

    public static void main(String[] args) {

        validateAge(16);

    }

}
```

---

# throws Keyword

Used to declare that a method may throw an exception.

```java
import java.io.IOException;

public class ThrowsDemo {

    public static void readFile() throws IOException {

        throw new IOException("File Not Found");

    }

    public static void main(String[] args) {

        try {

            readFile();

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }

}
```

---

# throw vs throws

| throw | throws |
|--------|---------|
| Creates an exception | Declares an exception |
| Inside method | Method signature |
| One exception | Multiple exceptions possible |

---

# Custom Exception

Create your own exception class.

## InvalidAgeException.java

```java
public class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {

        super(message);

    }

}
```

---

## AgeValidator.java

```java
public class AgeValidator {

    public static void validate(int age)
            throws InvalidAgeException {

        if (age < 18) {

            throw new InvalidAgeException(
                    "Age must be 18 or above."
            );

        }

        System.out.println("Eligible");

    }

}
```

---

## CustomExceptionDemo.java

```java
public class CustomExceptionDemo {

    public static void main(String[] args) {

        try {

            AgeValidator.validate(15);

        } catch (InvalidAgeException exception) {

            System.out.println(exception.getMessage());

        }

    }

}
```

Output

```
Age must be 18 or above.
```

---

# Bank Account Example

```java
public class BankAccount {

    private double balance = 1000;

    public void withdraw(double amount) {

        if (amount > balance) {

            throw new IllegalArgumentException(
                    "Insufficient Balance"
            );

        }

        balance -= amount;

        System.out.println("Remaining Balance : " + balance);

    }

}
```

---

## BankingDemo.java

```java
public class BankingDemo {

    public static void main(String[] args) {

        try {

            BankAccount account = new BankAccount();

            account.withdraw(2000);

        } catch (IllegalArgumentException exception) {

            System.out.println(exception.getMessage());

        }

    }

}
```

Output

```
Insufficient Balance
```

---

# Exception Handling in Spring Boot

Instead of writing try-catch in every controller,

Spring Boot provides

```java
@ControllerAdvice
```

Example

```java
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)

    public ResponseEntity<String> handleException(Exception exception) {

        return ResponseEntity
                .badRequest()
                .body(exception.getMessage());

    }

}
```

All controllers automatically use this handler.

---

# Best Practices

✅ Catch specific exceptions

Good

```java
catch(IOException e)
```

Avoid

```java
catch(Exception e)
```

unless necessary.

---

Always log exceptions.

---

Never leave catch blocks empty.

Wrong

```java
catch(Exception e){

}
```

---

Use custom exceptions for business logic.

---

# Interview Questions

## 1. What is an Exception?

An event that interrupts the normal execution of a program.

---

## 2. Difference between Checked and Unchecked Exceptions?

Checked

- Compile-time
- Must be handled

Unchecked

- Runtime
- Optional handling

---

## 3. Difference between throw and throws?

throw

Creates an exception.

throws

Declares an exception.

---

## 4. What is finally?

A block that always executes after try/catch.

---

## 5. Can try exist without catch?

Yes.

```java
try {

} finally {

}
```

---

## 6. Can finally be skipped?

Normally no.

It executes whether an exception occurs or not.

---

## 7. Why create Custom Exceptions?

To represent business-specific errors.

Example

```
InvalidAgeException

InsufficientBalanceException

EmployeeNotFoundException
```

---

## 8. What is @ControllerAdvice?

A Spring Boot annotation for global exception handling.

---

## 9. What is @ExceptionHandler?

Handles specific exceptions in Spring Boot.

---

## 10. Why is Exception Handling important?

- Prevents crashes
- Improves user experience
- Makes applications reliable
- Supports proper error reporting

---

# Assignments

## 1.

Handle division by zero.

---

## 2.

Handle NullPointerException.

---

## 3.

Handle ArrayIndexOutOfBoundsException.

---

## 4.

Create InvalidPasswordException.

---

## 5.

Create BankAccount class.

Throw exception if balance is insufficient.

---

## 6.

Create StudentValidator.

Throw exception for invalid marks.

---

## 7.

Create ProductValidator.

Throw exception for negative price.

---

## 8.

Create LoginValidator.

Throw exception for empty username.

---

## 9.

Create EmployeeNotFoundException.

---

## 10.

Build a mini Banking System using custom exceptions.

---

# notes.md

```md
# Day 015 Notes

## Exception

An event that interrupts program execution.

## Keywords

- try
- catch
- finally
- throw
- throws

## Types

- Checked Exception
- Unchecked Exception

## Custom Exception

Extend Exception class.

Example

```java
class InvalidAgeException extends Exception
```

## Spring Boot

- @ControllerAdvice
- @ExceptionHandler

## Best Practices

- Catch specific exceptions
- Log exceptions
- Use custom exceptions
- Never leave catch blocks empty
```

---

# README.md

```md
# Day 015 – Exception Handling

## Topics

- Exceptions
- Checked Exceptions
- Unchecked Exceptions
- try-catch-finally
- throw
- throws
- Custom Exceptions
- Spring Boot Global Exception Handling

## Programs

- DivideNumbers
- FinallyDemo
- ThrowDemo
- ThrowsDemo
- AgeValidator
- BankAccount
- CustomExceptionDemo

## Key Learnings

- Exceptions prevent application crashes.
- try-catch handles runtime errors.
- throw creates exceptions.
- throws declares exceptions.
- Spring Boot uses @ControllerAdvice for centralized exception handling.

## Next Topic

Day 016 – Collections Framework
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 015: Learned Exception Handling in Java"

git push origin main
```

---

# Day 015 Checklist

- [ ] Understand exceptions
- [ ] Differentiate checked and unchecked exceptions
- [ ] Practice try-catch-finally
- [ ] Learn throw and throws
- [ ] Create custom exceptions
- [ ] Build a mini banking application with exception handling
- [ ] Complete all assignments
- [ ] Push your code to GitHub