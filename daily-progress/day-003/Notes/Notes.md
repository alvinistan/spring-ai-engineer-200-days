# Day 003 — Loops in Java

## Goal

The goal of Day 003 is to understand how Java repeats a block of code using loops.

By the end of today, you should be able to:

- Understand why loops are used
- Write `for`, `while`, and `do-while` loops
- Use `break` and `continue`
- Create nested loops
- Print basic patterns
- Solve number-based loop problems
- Build a menu-driven program using a loop
- Answer common loop interview questions

---

# Folder Structure

```text
daily-progress/
└── day-003/
    ├── README.md
    ├── notes.md
    └── code/
        ├── ForLoopDemo.java
        ├── WhileLoopDemo.java
        ├── DoWhileLoopDemo.java
        ├── PrintNumbers.java
        ├── EvenNumbers.java
        ├── SumOfNumbers.java
        ├── MultiplicationTable.java
        ├── Factorial.java
        ├── ReverseNumber.java
        ├── PalindromeNumber.java
        ├── DigitCounter.java
        ├── BreakDemo.java
        ├── ContinueDemo.java
        ├── NestedLoopDemo.java
        ├── StarPattern.java
        └── RepeatingCalculator.java
```

---

# 1. What Is a Loop?

A loop is used to execute a block of code repeatedly.

Without a loop:

```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);
```

Using a loop:

```java
for (int number = 1; number <= 5; number++) {
    System.out.println(number);
}
```

Both programs print:

```text
1
2
3
4
5
```

The loop version is shorter, cleaner, and easier to maintain.

---

# Why Do We Use Loops?

Loops are commonly used to:

- Print repeated output
- Process collections of data
- Read records from a database
- Validate user input
- Calculate totals
- Search for values
- Generate reports
- Process API responses
- Repeat menu operations
- Work with arrays and collections

In Spring Boot applications, loops are often used to process lists of entities, DTOs, API results, files, and database records.

---

# Types of Loops in Java

Java provides three main loops:

1. `for` loop
2. `while` loop
3. `do-while` loop

Java also supports an enhanced `for` loop, which will be studied later with arrays and collections.

---

# 2. The for Loop

A `for` loop is useful when you know approximately how many times the code should repeat.

## Syntax

```java
for (initialization; condition; update) {
    // repeated code
}
```

Example:

```java
for (int number = 1; number <= 5; number++) {
    System.out.println(number);
}
```

## Parts of a for Loop

```java
for (int number = 1; number <= 5; number++)
```

### Initialization

```java
int number = 1
```

The loop variable is created and initialized.

This executes only once.

### Condition

```java
number <= 5
```

The loop continues while this condition is `true`.

### Update

```java
number++
```

The loop variable increases after every iteration.

---

# Program 1: ForLoopDemo.java

```java
public class ForLoopDemo {

    public static void main(String[] args) {

        for (int number = 1; number <= 5; number++) {
            System.out.println("Iteration: " + number);
        }

    }
}
```

## Output

```text
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
Iteration: 5
```

---

# Understanding an Iteration

One complete execution of a loop body is called an iteration.

For this loop:

```java
for (int number = 1; number <= 3; number++) {
    System.out.println(number);
}
```

There are three iterations:

```text
Iteration 1: number = 1
Iteration 2: number = 2
Iteration 3: number = 3
```

---

# Program 2: PrintNumbers.java

Print numbers from 1 to 10.

```java
public class PrintNumbers {

    public static void main(String[] args) {

        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }

    }
}
```

---

# Printing Numbers in Reverse

```java
public class ReverseCounting {

    public static void main(String[] args) {

        for (int number = 10; number >= 1; number--) {
            System.out.println(number);
        }

    }
}
```

## Output

```text
10
9
8
7
6
5
4
3
2
1
```

Here, `number--` decreases the value by one.

---

# Program 3: EvenNumbers.java

Print even numbers from 1 to 20.

```java
public class EvenNumbers {

    public static void main(String[] args) {

        for (int number = 1; number <= 20; number++) {

            if (number % 2 == 0) {
                System.out.println(number);
            }

        }

    }
}
```

## Alternative Solution

Start directly from 2 and increase by 2.

```java
public class EvenNumbers {

    public static void main(String[] args) {

        for (int number = 2; number <= 20; number += 2) {
            System.out.println(number);
        }

    }
}
```

The second solution performs fewer iterations.

---

# Program 4: SumOfNumbers.java

Calculate the sum of numbers from 1 to a user-provided limit.

```java
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive limit: ");
        int limit = scanner.nextInt();

        if (limit < 1) {
            System.out.println("The limit must be positive.");
        } else {

            int sum = 0;

            for (int number = 1; number <= limit; number++) {
                sum = sum + number;
            }

            System.out.println("Sum from 1 to " + limit + " = " + sum);
        }

        scanner.close();

    }
}
```

## Example Output

```text
Enter a positive limit: 5
Sum from 1 to 5 = 15
```

## How It Works

```text
Initial sum = 0

Iteration 1: sum = 0 + 1 = 1
Iteration 2: sum = 1 + 2 = 3
Iteration 3: sum = 3 + 3 = 6
Iteration 4: sum = 6 + 4 = 10
Iteration 5: sum = 10 + 5 = 15
```

A variable such as `sum` that collects a result across iterations is called an accumulator.

---

# Program 5: MultiplicationTable.java

```java
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table of " + number);

        for (int multiplier = 1; multiplier <= 10; multiplier++) {

            int result = number * multiplier;

            System.out.println(
                    number + " x " + multiplier + " = " + result
            );
        }

        scanner.close();

    }
}
```

## Example Output

```text
Enter a number: 7

Multiplication table of 7
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
```

---

# 3. The while Loop

A `while` loop repeats a block of code while a condition remains `true`.

It is commonly used when the exact number of iterations is not known in advance.

## Syntax

```java
while (condition) {
    // repeated code
}
```

Important: initialize the loop variable before the loop and update it inside the loop.

---

# Program 6: WhileLoopDemo.java

```java
public class WhileLoopDemo {

    public static void main(String[] args) {

        int number = 1;

        while (number <= 5) {
            System.out.println(number);
            number++;
        }

    }
}
```

## Output

```text
1
2
3
4
5
```

## Execution Flow

```text
1. Initialize number as 1.
2. Check whether number <= 5.
3. Execute the loop body.
4. Increase number.
5. Check the condition again.
6. Stop when the condition becomes false.
```

---

# Common while Loop Mistake

Incorrect:

```java
int number = 1;

while (number <= 5) {
    System.out.println(number);
}
```

The value of `number` never changes.

Therefore, the condition remains true forever.

This creates an infinite loop.

Correct:

```java
int number = 1;

while (number <= 5) {
    System.out.println(number);
    number++;
}
```

---

# Program 7: DigitCounter.java

Count the digits in a number.

```java
import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        long workingNumber = Math.abs((long) number);
        int digitCount = 0;

        if (workingNumber == 0) {
            digitCount = 1;
        } else {

            while (workingNumber > 0) {
                workingNumber = workingNumber / 10;
                digitCount++;
            }
        }

        System.out.println("Number of digits: " + digitCount);

        scanner.close();

    }
}
```

## Example

```text
Enter an integer: 58219
Number of digits: 5
```

## Important Idea

Integer division by 10 removes the last digit.

```text
58219 / 10 = 5821
5821 / 10  = 582
582 / 10   = 58
58 / 10    = 5
5 / 10     = 0
```

---

# Program 8: ReverseNumber.java

```java
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {

            int originalNumber = number;
            long reversedNumber = 0;

            while (number > 0) {

                int lastDigit = number % 10;

                reversedNumber =
                        reversedNumber * 10 + lastDigit;

                number = number / 10;
            }

            System.out.println(
                    "Reverse of " +
                    originalNumber +
                    " = " +
                    reversedNumber
            );
        }

        scanner.close();

    }
}
```

## Example

```text
Enter a non-negative integer: 1234
Reverse of 1234 = 4321
```

## Logic

For `1234`:

```text
lastDigit = 1234 % 10 = 4
reverse = 0 * 10 + 4 = 4
number = 1234 / 10 = 123

lastDigit = 123 % 10 = 3
reverse = 4 * 10 + 3 = 43
number = 123 / 10 = 12
```

The process continues until the number becomes zero.

---

# Program 9: PalindromeNumber.java

A palindrome number remains the same when reversed.

Examples:

```text
121
1331
4554
```

```java
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {

            int originalNumber = number;
            long reversedNumber = 0;

            while (number > 0) {

                int lastDigit = number % 10;

                reversedNumber =
                        reversedNumber * 10 + lastDigit;

                number = number / 10;
            }

            if (originalNumber == reversedNumber) {
                System.out.println(
                        originalNumber +
                        " is a palindrome number."
                );
            } else {
                System.out.println(
                        originalNumber +
                        " is not a palindrome number."
                );
            }
        }

        scanner.close();

    }
}
```

---

# 4. The do-while Loop

A `do-while` loop executes the loop body first and checks the condition afterward.

This means the loop body executes at least once.

## Syntax

```java
do {
    // repeated code
} while (condition);
```

Notice the semicolon after the `while` condition.

---

# Program 10: DoWhileLoopDemo.java

```java
public class DoWhileLoopDemo {

    public static void main(String[] args) {

        int number = 1;

        do {
            System.out.println(number);
            number++;
        } while (number <= 5);

    }
}
```

## Output

```text
1
2
3
4
5
```

---

# while vs do-while

## while Example

```java
int number = 10;

while (number < 5) {
    System.out.println(number);
}
```

The condition is false at the beginning.

Therefore, the loop executes zero times.

## do-while Example

```java
int number = 10;

do {
    System.out.println(number);
} while (number < 5);
```

## Output

```text
10
```

The loop executes once before checking the condition.

---

# Comparison of Loop Types

| Loop | Condition Checked | Minimum Executions | Best Use |
|---|---|---:|---|
| `for` | Before each iteration | 0 | Known number of repetitions |
| `while` | Before each iteration | 0 | Unknown number of repetitions |
| `do-while` | After each iteration | 1 | Menus and operations that must run once |

---

# 5. Increment and Decrement Operators

## Increment

```java
number++;
```

This increases the value by one.

Equivalent to:

```java
number = number + 1;
```

## Decrement

```java
number--;
```

This decreases the value by one.

Equivalent to:

```java
number = number - 1;
```

---

# Prefix and Postfix Increment

## Postfix

```java
int number = 5;
int result = number++;
```

After execution:

```text
result = 5
number = 6
```

The old value is used first, and then the variable is increased.

## Prefix

```java
int number = 5;
int result = ++number;
```

After execution:

```text
number = 6
result = 6
```

The variable is increased first, and then the new value is used.

---

# 6. break Statement

The `break` statement immediately terminates a loop.

---

# Program 11: BreakDemo.java

```java
public class BreakDemo {

    public static void main(String[] args) {

        for (int number = 1; number <= 10; number++) {

            if (number == 6) {
                break;
            }

            System.out.println(number);
        }

        System.out.println("Loop completed.");

    }
}
```

## Output

```text
1
2
3
4
5
Loop completed.
```

When the value becomes `6`, `break` ends the loop.

---

# Searching with break

```java
public class SearchNumber {

    public static void main(String[] args) {

        int target = 7;
        boolean found = false;

        for (int number = 1; number <= 10; number++) {

            if (number == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Target found.");
        } else {
            System.out.println("Target not found.");
        }

    }
}
```

Once the target is found, there is no need to continue the loop.

---

# 7. continue Statement

The `continue` statement skips the current iteration and moves to the next iteration.

---

# Program 12: ContinueDemo.java

```java
public class ContinueDemo {

    public static void main(String[] args) {

        for (int number = 1; number <= 10; number++) {

            if (number == 5) {
                continue;
            }

            System.out.println(number);
        }

    }
}
```

## Output

```text
1
2
3
4
6
7
8
9
10
```

The number `5` is skipped.

---

# Difference Between break and continue

| `break` | `continue` |
|---|---|
| Ends the complete loop | Skips only the current iteration |
| Execution continues after the loop | Execution continues with the next iteration |
| Commonly used after finding a result | Commonly used to ignore selected values |

---

# 8. Factorial of a Number

The factorial of a positive integer is the product of all positive integers from 1 to that number.

```text
5! = 5 × 4 × 3 × 2 × 1 = 120
```

Also:

```text
0! = 1
```

---

# Program 13: Factorial.java

```java
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Enter a non-negative number up to 20: "
        );

        int number = scanner.nextInt();

        if (number < 0 || number > 20) {

            System.out.println(
                    "Enter a value between 0 and 20."
            );

        } else {

            long factorial = 1;

            for (int value = 2; value <= number; value++) {
                factorial = factorial * value;
            }

            System.out.println(
                    number + "! = " + factorial
            );
        }

        scanner.close();

    }
}
```

## Why Limit the Input to 20?

The value of `21!` is larger than the maximum value supported by `long`.

For larger factorials, Java's `BigInteger` class is required.

---

# 9. Nested Loops

A nested loop is a loop inside another loop.

## Syntax

```java
for (initialization; condition; update) {

    for (initialization; condition; update) {
        // code
    }
}
```

The outer loop controls the number of rows.

The inner loop usually controls the number of columns or repeated values inside each row.

---

# Program 14: NestedLoopDemo.java

```java
public class NestedLoopDemo {

    public static void main(String[] args) {

        for (int row = 1; row <= 3; row++) {

            for (int column = 1; column <= 3; column++) {

                System.out.println(
                        "Row: " + row +
                        ", Column: " + column
                );
            }
        }

    }
}
```

## Output

```text
Row: 1, Column: 1
Row: 1, Column: 2
Row: 1, Column: 3
Row: 2, Column: 1
Row: 2, Column: 2
Row: 2, Column: 3
Row: 3, Column: 1
Row: 3, Column: 2
Row: 3, Column: 3
```

The inner loop runs completely for every outer-loop iteration.

---

# 10. Pattern Printing

Pattern printing helps you understand nested loops.

---

# Program 15: StarPattern.java

Print the following pattern:

```text
*
**
***
****
*****
```

```java
public class StarPattern {

    public static void main(String[] args) {

        int totalRows = 5;

        for (int row = 1; row <= totalRows; row++) {

            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
```

## Explanation

The outer loop controls the row:

```java
for (int row = 1; row <= totalRows; row++)
```

The inner loop prints stars according to the current row:

```java
for (int star = 1; star <= row; star++)
```

At row 3, the inner loop prints three stars.

---

# Square Pattern

Output:

```text
*****
*****
*****
*****
*****
```

```java
public class SquarePattern {

    public static void main(String[] args) {

        int size = 5;

        for (int row = 1; row <= size; row++) {

            for (int column = 1; column <= size; column++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
```

---

# Inverted Triangle Pattern

Output:

```text
*****
****
***
**
*
```

```java
public class InvertedStarPattern {

    public static void main(String[] args) {

        int totalRows = 5;

        for (int row = totalRows; row >= 1; row--) {

            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
```

---

# Number Pattern

Output:

```text
1
12
123
1234
12345
```

```java
public class NumberPattern {

    public static void main(String[] args) {

        int totalRows = 5;

        for (int row = 1; row <= totalRows; row++) {

            for (int number = 1; number <= row; number++) {
                System.out.print(number);
            }

            System.out.println();
        }

    }
}
```

---

# 11. Infinite Loops

An infinite loop continues forever unless it is manually stopped or a `break` statement is reached.

## Infinite for Loop

```java
for (;;) {
    System.out.println("Running...");
}
```

## Infinite while Loop

```java
while (true) {
    System.out.println("Running...");
}
```

Infinite loops are sometimes intentionally used for:

- Server processes
- Menu-driven programs
- Event listeners
- Continuous monitoring
- Background workers

They must include a safe termination mechanism.

---

# 12. Menu-Driven Program with do-while

This program keeps displaying a calculator menu until the user chooses Exit.

---

# Program 16: RepeatingCalculator.java

```java
import java.util.Scanner;

public class RepeatingCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println();
            System.out.println("===== Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                double firstNumber = scanner.nextDouble();

                System.out.print("Enter second number: ");
                double secondNumber = scanner.nextDouble();

                switch (choice) {

                    case 1:
                        System.out.println(
                                "Result: " +
                                (firstNumber + secondNumber)
                        );
                        break;

                    case 2:
                        System.out.println(
                                "Result: " +
                                (firstNumber - secondNumber)
                        );
                        break;

                    case 3:
                        System.out.println(
                                "Result: " +
                                (firstNumber * secondNumber)
                        );
                        break;

                    case 4:

                        if (secondNumber == 0) {
                            System.out.println(
                                    "Cannot divide by zero."
                            );
                        } else {
                            System.out.println(
                                    "Result: " +
                                    (firstNumber / secondNumber)
                            );
                        }

                        break;

                    default:
                        System.out.println("Unexpected option.");
                }

            } else if (choice == 5) {

                System.out.println("Calculator closed.");

            } else {

                System.out.println("Invalid option.");
            }

        } while (choice != 5);

        scanner.close();

    }
}
```

## Why Use do-while Here?

The menu must appear at least once.

After each operation, the condition checks whether the user selected Exit.

---

# 13. Prime Number Checker

A prime number is greater than 1 and divisible only by 1 and itself.

Examples:

```text
2, 3, 5, 7, 11, 13
```

---

# Program 17: PrimeNumber.java

```java
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isPrime = number > 1;

        for (
                int divisor = 2;
                divisor <= number / divisor;
                divisor++
        ) {

            if (number % divisor == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();

    }
}
```

## Why Check Only Up to the Square Root?

If a number has a factor larger than its square root, it must also have a corresponding factor smaller than its square root.

Therefore, checking all values up to `number - 1` is unnecessary.

The condition:

```java
divisor <= number / divisor
```

avoids multiplication overflow that could occur with:

```java
divisor * divisor <= number
```

---

# 14. Fibonacci Series

The Fibonacci series starts with:

```text
0, 1
```

Every next value is the sum of the previous two values.

```text
0, 1, 1, 2, 3, 5, 8, 13
```

---

# Program 18: FibonacciSeries.java

```java
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Enter the number of terms from 1 to 47: "
        );

        int totalTerms = scanner.nextInt();

        if (totalTerms < 1 || totalTerms > 47) {

            System.out.println(
                    "Enter a value between 1 and 47."
            );

        } else {

            int first = 0;
            int second = 1;

            System.out.print("Fibonacci series: ");

            for (int term = 1; term <= totalTerms; term++) {

                System.out.print(first);

                if (term < totalTerms) {
                    System.out.print(", ");
                }

                int next = first + second;
                first = second;
                second = next;
            }

            System.out.println();
        }

        scanner.close();

    }
}
```

---

# Common Mistakes

## Mistake 1: Forgetting to Update the Loop Variable

Incorrect:

```java
int number = 1;

while (number <= 5) {
    System.out.println(number);
}
```

This creates an infinite loop.

Correct:

```java
int number = 1;

while (number <= 5) {
    System.out.println(number);
    number++;
}
```

---

## Mistake 2: Adding a Semicolon After a Loop

Incorrect:

```java
for (int number = 1; number <= 5; number++); {
    System.out.println("Hello");
}
```

The semicolon ends the loop.

Correct:

```java
for (int number = 1; number <= 5; number++) {
    System.out.println("Hello");
}
```

---

## Mistake 3: Incorrect Loop Condition

Incorrect:

```java
for (int number = 1; number >= 5; number++) {
    System.out.println(number);
}
```

The initial value is `1`, and `1 >= 5` is false.

Therefore, the loop never executes.

Correct:

```java
for (int number = 1; number <= 5; number++) {
    System.out.println(number);
}
```

---

## Mistake 4: Using the Wrong Increment Direction

Incorrect:

```java
for (int number = 1; number <= 5; number--) {
    System.out.println(number);
}
```

The number keeps decreasing, so the condition remains true.

Correct:

```java
for (int number = 1; number <= 5; number++) {
    System.out.println(number);
}
```

---

## Mistake 5: Changing the Wrong Variable in a Nested Loop

Incorrect:

```java
for (int row = 1; row <= 3; row++) {

    for (int column = 1; column <= 3; row++) {
        System.out.println(row + " " + column);
    }
}
```

The inner loop incorrectly updates `row`.

Correct:

```java
for (int row = 1; row <= 3; row++) {

    for (int column = 1; column <= 3; column++) {
        System.out.println(row + " " + column);
    }
}
```

---

# Interview Questions and Answers

## 1. What is a loop?

A loop is a control-flow structure that repeatedly executes a block of code while a specified condition is true.

---

## 2. What are the main loops in Java?

The main loops are:

- `for`
- `while`
- `do-while`

Java also provides an enhanced `for` loop for arrays and collections.

---

## 3. When should we use a for loop?

Use a `for` loop when the initialization, condition, and update are clearly defined, especially when the number of iterations is known.

Example:

```java
for (int number = 1; number <= 10; number++) {
    System.out.println(number);
}
```

---

## 4. When should we use a while loop?

Use a `while` loop when the number of repetitions is not known in advance and the loop depends on a condition.

Example:

```java
while (passwordIsIncorrect) {
    // request the password again
}
```

---

## 5. What is the difference between while and do-while?

A `while` loop checks its condition before executing the body.

A `do-while` loop executes its body first and checks the condition afterward.

Therefore, a `do-while` loop executes at least once.

---

## 6. Can a for loop execute zero times?

Yes.

If the condition is false during the first check, the loop body does not execute.

```java
for (int number = 10; number < 5; number++) {
    System.out.println(number);
}
```

---

## 7. Can a do-while loop execute zero times?

No.

A `do-while` loop executes its body before checking the condition, so it always executes at least once.

---

## 8. What is an infinite loop?

An infinite loop is a loop whose termination condition never becomes false.

Example:

```java
while (true) {
    System.out.println("Running");
}
```

---

## 9. What does break do inside a loop?

`break` immediately terminates the nearest loop.

```java
for (int number = 1; number <= 10; number++) {

    if (number == 5) {
        break;
    }
}
```

---

## 10. What does continue do?

`continue` skips the remaining statements in the current iteration and proceeds to the next iteration.

---

## 11. What is a nested loop?

A nested loop is a loop written inside another loop.

It is commonly used for:

- Pattern printing
- Matrices
- Tables
- Comparing combinations of values

---

## 12. What is the scope of a variable declared inside a for loop?

A variable declared in the initialization section of a `for` loop is available only inside that loop.

```java
for (int number = 1; number <= 5; number++) {
    System.out.println(number);
}

// number is not available here
```

---

## 13. What is an iteration?

An iteration is one complete execution of a loop body.

---

## 14. What is the difference between `i++` and `++i`?

Both increase the value by one.

When used as separate statements, they have the same effect:

```java
i++;
++i;
```

When used inside a larger expression:

- `i++` uses the current value and then increments.
- `++i` increments first and then uses the new value.

---

## 15. Can multiple variables be used in a for loop?

Yes.

```java
for (
        int left = 1, right = 10;
        left <= right;
        left++, right--
) {
    System.out.println(left + " " + right);
}
```

All variables declared in the same initialization section must have compatible types.

---

## 16. Is break allowed outside a loop or switch?

An unlabeled `break` cannot be used outside a loop or `switch`.

Java also supports labeled `break`, which can terminate an enclosing labeled statement, but that is an advanced topic.

---

## 17. What happens when break is used in a nested loop?

It terminates only the nearest enclosing loop.

```java
for (int row = 1; row <= 3; row++) {

    for (int column = 1; column <= 3; column++) {

        if (column == 2) {
            break;
        }
    }
}
```

The inner loop stops, but the outer loop continues.

---

## 18. What is the time complexity of a loop running from 1 to n?

A single loop that runs `n` times generally has a time complexity of:

```text
O(n)
```

Two fully nested loops, each running `n` times, generally have:

```text
O(n²)
```

You will study time complexity in greater detail during DSA preparation.

---

# Practice Assignments

## Assignment 1: Odd Numbers

Print all odd numbers between 1 and 100.

Expected beginning:

```text
1
3
5
7
9
```

---

## Assignment 2: Sum of Even Numbers

Calculate the sum of all even numbers from 1 to a user-provided limit.

Example:

```text
Input: 10
Result: 30
```

Because:

```text
2 + 4 + 6 + 8 + 10 = 30
```

---

## Assignment 3: Product of Digits

Input:

```text
234
```

Output:

```text
24
```

Because:

```text
2 × 3 × 4 = 24
```

---

## Assignment 4: Sum of Digits

Input:

```text
5832
```

Output:

```text
18
```

Because:

```text
5 + 8 + 3 + 2 = 18
```

---

## Assignment 5: Armstrong Number

A three-digit Armstrong number is equal to the sum of the cubes of its digits.

Example:

```text
153 = 1³ + 5³ + 3³
153 = 1 + 125 + 27
153 = 153
```

Write a program to check whether a number is an Armstrong number.

---

## Assignment 6: Count Even and Odd Digits

Input:

```text
58324
```

Output:

```text
Even digits: 3
Odd digits: 2
```

---

## Assignment 7: All Multiplication Tables

Print multiplication tables from 1 to 10 using nested loops.

Expected structure:

```text
Table of 1
1 x 1 = 1
...
1 x 10 = 10

Table of 2
2 x 1 = 2
...
```

---

## Assignment 8: Login Attempts

Give the user a maximum of three attempts to enter the correct PIN.

Requirements:

- Correct PIN: `1234`
- Print `Access granted` for a correct PIN
- Print remaining attempts after an incorrect PIN
- Print `Account locked` after three failed attempts
- Use a loop and `break`

---

## Assignment 9: Guessing Game

Store a secret number.

Ask the user to keep guessing until the correct number is entered.

Print:

- `Too high`
- `Too low`
- `Correct`

Use a `while` or `do-while` loop.

---

## Assignment 10: Pattern Practice

Print:

```text
1
22
333
4444
55555
```

---

# Suggested Daily Workflow

## Step 1: Read the Concepts

Spend approximately 45 minutes understanding:

- `for`
- `while`
- `do-while`
- `break`
- `continue`
- Nested loops

## Step 2: Type the Programs Yourself

Do not copy and paste immediately.

Type each program manually so that you become familiar with Java syntax.

## Step 3: Compile Every Program

Example:

```bash
javac ForLoopDemo.java
java ForLoopDemo
```

## Step 4: Change the Inputs

Test:

- Positive values
- Zero
- Negative values
- Boundary values
- Invalid menu options

## Step 5: Solve Assignments

Complete at least five assignments without viewing a solution.

## Step 6: Update Your Notes and README

Record:

- What you understood
- Problems you solved
- Errors you encountered
- How you corrected those errors

## Step 7: Push to GitHub

```bash
git status
git add .
git commit -m "Day 003: Learned Java loops and pattern programs"
git push origin main
```

---

# notes.md

Create:

```text
daily-progress/day-003/notes.md
```

Paste the following content:

```md
# Day 003 Notes — Loops in Java

## What Is a Loop?

A loop repeatedly executes a block of code while a specified condition is true.

## Types of Loops

### for Loop

Used when the number of iterations is known or clearly controlled.

```java
for (int number = 1; number <= 5; number++) {
    System.out.println(number);
}
```

### while Loop

Used when repetition depends on a condition and the number of iterations may not be known.

```java
int number = 1;

while (number <= 5) {
    System.out.println(number);
    number++;
}
```

### do-while Loop

Executes the body at least once because the condition is checked after the body.

```java
int number = 1;

do {
    System.out.println(number);
    number++;
} while (number <= 5);
```

## Loop Components

- Initialization
- Condition
- Update
- Loop body

## Increment and Decrement

```java
number++;
number--;
```

## break

Terminates the nearest loop.

```java
if (number == 5) {
    break;
}
```

## continue

Skips the current iteration.

```java
if (number == 5) {
    continue;
}
```

## Nested Loop

A loop inside another loop.

The outer loop usually controls rows, and the inner loop usually controls columns.

## Number Processing

The last digit of an integer can be extracted using:

```java
int lastDigit = number % 10;
```

The last digit can be removed using:

```java
number = number / 10;
```

## Common Mistakes

- Forgetting to update a loop variable
- Writing an incorrect condition
- Using the wrong increment direction
- Adding a semicolon after the loop
- Updating the wrong variable in nested loops
- Creating an infinite loop accidentally

## Programs Completed

- ForLoopDemo
- WhileLoopDemo
- DoWhileLoopDemo
- PrintNumbers
- EvenNumbers
- SumOfNumbers
- MultiplicationTable
- Factorial
- ReverseNumber
- PalindromeNumber
- DigitCounter
- BreakDemo
- ContinueDemo
- NestedLoopDemo
- StarPattern
- RepeatingCalculator
- PrimeNumber
- FibonacciSeries

## Important Interview Points

- A for loop is useful when iteration is clearly controlled.
- A while loop may execute zero times.
- A do-while loop executes at least once.
- break terminates a loop.
- continue skips one iteration.
- Nested loops are used for patterns, matrices, and combinations.
```

---

# README.md

Create:

```text
daily-progress/day-003/README.md
```

Paste the following content:

```md
# Day 003 — Loops in Java

## Goal

The goal of Day 003 was to understand repetition and iteration using Java loops.

## Topics Covered

- for loop
- while loop
- do-while loop
- Increment and decrement operators
- break statement
- continue statement
- Infinite loops
- Nested loops
- Pattern printing
- Number-processing algorithms
- Menu-driven applications

## Programs Completed

| Program | Description |
|---|---|
| ForLoopDemo.java | Basic for-loop example |
| WhileLoopDemo.java | Basic while-loop example |
| DoWhileLoopDemo.java | Basic do-while example |
| PrintNumbers.java | Prints numbers in a range |
| EvenNumbers.java | Prints even numbers |
| SumOfNumbers.java | Calculates the sum from 1 to n |
| MultiplicationTable.java | Prints a multiplication table |
| Factorial.java | Calculates the factorial of a number |
| DigitCounter.java | Counts the digits in an integer |
| ReverseNumber.java | Reverses an integer |
| PalindromeNumber.java | Checks whether a number is a palindrome |
| BreakDemo.java | Demonstrates break |
| ContinueDemo.java | Demonstrates continue |
| NestedLoopDemo.java | Demonstrates nested loops |
| StarPattern.java | Prints a triangle pattern |
| RepeatingCalculator.java | Repeats a menu until Exit |
| PrimeNumber.java | Checks whether a number is prime |
| FibonacciSeries.java | Prints Fibonacci terms |

## Key Learnings

- Loops reduce repeated code.
- A for loop is useful when iteration is clearly controlled.
- A while loop checks the condition before execution.
- A do-while loop executes at least once.
- break immediately terminates a loop.
- continue skips the current iteration.
- Nested loops are useful for patterns and table-like processing.
- Integer division and modulus can be used to process digits.
- Loop variables must be updated correctly to avoid infinite loops.

## Interview Questions Revised

- What is a loop?
- Difference between for, while, and do-while
- What is an infinite loop?
- Difference between break and continue
- What is a nested loop?
- Difference between prefix and postfix increment
- Can a loop execute zero times?
- What is an iteration?

## Challenges Completed

- Multiplication table
- Factorial
- Reverse number
- Palindrome number
- Prime number
- Fibonacci series
- Star patterns
- Repeating calculator

## Status

Day 003 completed.

## Next Topic

Day 004 — Methods in Java:

- Method declaration
- Method parameters
- Return values
- void methods
- Method overloading
- Variable scope
- Reusable calculator methods
```

---

# Day 003 Completion Checklist

- [ ] Understand the purpose of loops
- [ ] Write a `for` loop without notes
- [ ] Write a `while` loop without notes
- [ ] Write a `do-while` loop without notes
- [ ] Explain the difference between the three loops
- [ ] Use `break` correctly
- [ ] Use `continue` correctly
- [ ] Complete at least five number programs
- [ ] Complete at least three patterns
- [ ] Build the repeating calculator
- [ ] Test programs with edge cases
- [ ] Update `notes.md`
- [ ] Update `README.md`
- [ ] Push all work to GitHub

# GitHub Commit

```bash
git status
git add .
git commit -m "Day 003: Learned Java loops, number programs and patterns"
git push origin main
```

# Next Lesson

Day 004 will cover **Methods in Java**, including parameters, return values, method overloading, scope, reusable code, interview questions, practical programs, `notes.md`, and `README.md`.