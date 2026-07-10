## 01.What is % operator?
    It returns the remainder.

## 2. Relational Operators

- These operators compare two values.
- They always return true or false.

2. Relational Operators

These operators compare two values.

They always return true or false.

| Operator | Meaning          |
| -------- | ---------------- |
| `==`     | Equal            |
| `!=`     | Not Equal        |
| `>`      | Greater Than     |
| `<`      | Less Than        |
| `>=`     | Greater or Equal |
| `<=`     | Less or Equal    |

## 3. Logical Operators

Used when combining multiple conditions.

# Relational Operators in Java

## What are Relational Operators?

Relational operators are used to **compare two values**.

The result of every relational operation is always a **boolean value**, which means the output will be either:

- `true`
- `false`

These operators are commonly used in:

- `if`
- `if-else`
- `else-if`
- `while`
- `for`
- `switch` (indirectly through expressions)

---

## Types of Relational Operators

| Operator | Meaning | Example |
|----------|---------|----------|
| `==` | Equal To | `a == b` |
| `!=` | Not Equal To | `a != b` |
| `>` | Greater Than | `a > b` |
| `<` | Less Than | `a < b` |
| `>=` | Greater Than or Equal To | `a >= b` |
| `<=` | Less Than or Equal To | `a <= b` |

---

# Program 1 - Equal To (==)

```java
public class EqualOperator {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        System.out.println(a == b);

    }
}
```

### Output

```
true
```

### Explanation

Both values are **10**, so the comparison returns **true**.

---

# Program 2 - Not Equal To (!=)

```java
public class NotEqualOperator {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a != b);

    }
}
```

### Output

```
true
```

### Explanation

10 is not equal to 20.

Therefore,

```
10 != 20
```

returns

```
true
```

---

# Program 3 - Greater Than (>)

```java
public class GreaterThanOperator {

    public static void main(String[] args) {

        int a = 30;
        int b = 20;

        System.out.println(a > b);

    }

}
```

### Output

```
true
```

Because

```
30 > 20
```

---

# Program 4 - Less Than (<)

```java
public class LessThanOperator {

    public static void main(String[] args) {

        int a = 15;
        int b = 25;

        System.out.println(a < b);

    }

}
```

### Output

```
true
```

---

# Program 5 - Greater Than or Equal To (>=)

```java
public class GreaterEqualOperator {

    public static void main(String[] args) {

        int age = 18;

        System.out.println(age >= 18);

    }

}
```

### Output

```
true
```

### Real-world Example

Checking whether a person is eligible to vote.

```java
if(age >= 18){
    System.out.println("Eligible");
}
```

---

# Program 6 - Less Than or Equal To (<=)

```java
public class LessEqualOperator {

    public static void main(String[] args) {

        int marks = 35;

        System.out.println(marks <= 35);

    }

}
```

### Output

```
true
```

---

# Complete Example

```java
public class RelationalOperators {

    public static void main(String[] args) {

        int a = 15;
        int b = 20;

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

    }

}
```

### Output

```
a == b : false
a != b : true
a > b  : false
a < b  : true
a >= b : false
a <= b : true
```

---

# Important Notes

## Relational Operators Always Return Boolean

Example

```java
int a = 10;
int b = 20;

boolean result = a < b;

System.out.println(result);
```

Output

```
true
```

---

## Common Mistake

Many beginners confuse

```
=
```

with

```
==
```

### Assignment Operator

```java
int a = 10;
```

Here,

`=` assigns a value.

---

### Comparison Operator

```java
if(a == 10)
```

Here,

`==` compares two values.

---

# Real-Life Examples

## Example 1 - Login System

```java
String username = "admin";

if(username.equals("admin")){
    System.out.println("Login Successful");
}
```

---

## Example 2 - Voting

```java
int age = 22;

if(age >= 18){
    System.out.println("Eligible to Vote");
}
```

---

## Example 3 - Pass or Fail

```java
int marks = 45;

if(marks >= 35){
    System.out.println("Pass");
}
```

---

# Interview Questions

## 1. What are relational operators?

**Answer**

Relational operators compare two values and always return a boolean value (`true` or `false`).

---

## 2. Which operators are relational operators in Java?

- `==`
- `!=`
- `>`
- `<`
- `>=`
- `<=`

---

## 3. What is the return type of relational operators?

**Answer**

`boolean`

---

## 4. What is the difference between `=` and `==`?

| `=` | `==` |
|------|------|
| Assignment operator | Comparison operator |
| Stores a value | Compares two values |

Example:

```java
int a = 10;

if(a == 10){
    System.out.println("Equal");
}
```

---

## 5. Can relational operators be used with `if` statements?

Yes.

Example:

```java
int age = 20;

if(age >= 18){
    System.out.println("Eligible");
}
```

---

# Practice Questions

Write Java programs to:

1. Check whether two numbers are equal.
2. Find whether one number is greater than another.
3. Check if a student has passed (marks >= 35).
4. Check if a person is eligible to vote.
5. Compare two ages and print the older person's age.

---

# Logical Operators in Java

## What are Logical Operators?

Logical operators are used to **combine two or more conditions**.

The result of every logical operation is always a **boolean value**:

- `true`
- `false`

Logical operators are widely used in:

- Login systems
- Authentication
- Authorization
- Form validation
- Banking applications
- Spring Boot business logic
- Spring Security

---

# Types of Logical Operators

| Operator | Name | Meaning |
|----------|------|---------|
| `&&` | Logical AND | All conditions must be true |
| `||` | Logical OR | At least one condition must be true |
| `!` | Logical NOT | Reverses the boolean value |

---

# 1. Logical AND (&&)

The **AND (`&&`) operator** returns `true` **only if every condition is true**.

### Truth Table

| Condition 1 | Condition 2 | Result |
|-------------|-------------|--------|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

---

## Example 1

```java
public class LogicalAndDemo {

    public static void main(String[] args) {

        int age = 22;
        boolean hasLicense = true;

        System.out.println(age >= 18 && hasLicense);

    }

}
```

### Output

```
true
```

### Explanation

Condition 1

```java
age >= 18
```

Result

```
true
```

Condition 2

```java
hasLicense
```

Result

```
true
```

Final Result

```
true && true = true
```

---

## Example 2

```java
public class LogicalAndDemo2 {

    public static void main(String[] args) {

        int age = 16;
        boolean hasLicense = true;

        System.out.println(age >= 18 && hasLicense);

    }

}
```

### Output

```
false
```

Explanation

```
false && true = false
```

---

# Real-Life Example

A person can drive only if:

- Age is 18 or above
- Has a driving license

```java
if(age >= 18 && hasLicense){
    System.out.println("You can drive.");
}else{
    System.out.println("You cannot drive.");
}
```

---

# 2. Logical OR (||)

The **OR (`||`) operator** returns `true` if **at least one condition is true**.

### Truth Table

| Condition 1 | Condition 2 | Result |
|-------------|-------------|--------|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

---

## Example

```java
public class LogicalOrDemo {

    public static void main(String[] args) {

        boolean weekend = true;
        boolean holiday = false;

        System.out.println(weekend || holiday);

    }

}
```

### Output

```
true
```

Explanation

```
true || false = true
```

---

## Real-Life Example

You can enter the office if:

- You have an employee ID
  OR
- You have visitor permission

```java
boolean employee = false;
boolean visitorPass = true;

if(employee || visitorPass){
    System.out.println("Entry Allowed");
}else{
    System.out.println("Access Denied");
}
```

Output

```
Entry Allowed
```

---

# 3. Logical NOT (!)

The NOT operator reverses a boolean value.

### Truth Table

| Original | Result |
|----------|--------|
| true | false |
| false | true |

---

## Example

```java
public class LogicalNotDemo {

    public static void main(String[] args) {

        boolean isLoggedIn = false;

        System.out.println(!isLoggedIn);

    }

}
```

Output

```
true
```

Explanation

```
!false = true
```

---

# Complete Example

```java
public class LogicalOperators {

    public static void main(String[] args) {

        int age = 20;
        boolean hasLicense = true;

        System.out.println("AND : " + (age >= 18 && hasLicense));

        System.out.println("OR  : " + (age >= 18 || hasLicense));

        System.out.println("NOT : " + (!hasLicense));

    }

}
```

Output

```
AND : true
OR  : true
NOT : false
```

---

# Short-Circuit Evaluation

Java evaluates logical expressions from left to right.

### AND (&&)

If the first condition is **false**, Java does **not** evaluate the second condition.

Example

```java
int a = 10;
int b = 0;

if(b != 0 && a / b > 2){
    System.out.println("Valid");
}
```

Explanation

```
b != 0
```

is false.

Java stops immediately.

It never executes

```java
a / b
```

This prevents a divide-by-zero error.

---

### OR (||)

If the first condition is **true**, Java does **not** evaluate the second condition.

Example

```java
boolean isAdmin = true;
boolean hasPermission = false;

if(isAdmin || hasPermission){
    System.out.println("Access Granted");
}
```

Java already knows the answer is true after checking `isAdmin`, so it skips checking `hasPermission`.

---

# Difference Between && and ||

| && | || |
|----|----|
| All conditions must be true | At least one condition must be true |
| Stops if first condition is false | Stops if first condition is true |

---

# Real-World Examples

## Example 1 - ATM Withdrawal

```java
double balance = 5000;
double amount = 1000;

if(balance >= amount && amount > 0){
    System.out.println("Withdrawal Successful");
}else{
    System.out.println("Transaction Failed");
}
```

---

## Example 2 - Student Pass

```java
int theory = 45;
int practical = 40;

if(theory >= 35 && practical >= 35){
    System.out.println("Pass");
}else{
    System.out.println("Fail");
}
```

---

## Example 3 - Weekend Discount

```java
boolean weekend = true;
boolean festival = false;

if(weekend || festival){
    System.out.println("Discount Available");
}
```

---

# Interview Questions

## 1. What are logical operators?

Logical operators combine two or more conditions and return a boolean result.

---

## 2. Name the logical operators in Java.

- &&
- ||
- !

---

## 3. What is the difference between && and ||?

**&& (AND)**

All conditions must be true.

**|| (OR)**

At least one condition must be true.

---

## 4. What does ! operator do?

It reverses the boolean value.

Example

```java
true
```

becomes

```java
false
```

---

## 5. What is short-circuit evaluation?

Java stops evaluating a logical expression as soon as it knows the final result.

Example

```java
false && anything
```

Result is already false.

The second condition is never checked.

---

# Practice Problems

Write Java programs to:

1. Check whether a student passes if both theory and practical marks are at least 35.
2. Check if a user can log in using a username and password.
3. Check whether a customer is eligible for free delivery if the order amount is greater than ₹500 **or** the customer is a premium member.
4. Check whether a person can vote and has a voter ID.
5. Check whether a user is **not** logged in using the `!` operator.

---

# Common Mistakes

❌ Using `&` instead of `&&`

```java
if(a > 10 & b > 20)
```

✔ Correct

```java
if(a > 10 && b > 20)
```

---

❌ Using `|` instead of `||`

Always use

```java
||
```

for logical OR in conditions.

---

# Summary

- `&&` → All conditions must be true.
- `||` → At least one condition must be true.
- `!` → Reverses a boolean value.
- Logical operators always return `true` or `false`.
- Java uses **short-circuit evaluation**, which improves performance and prevents some runtime errors.