
---

# Interview Questions and Answers — Day 001

## 1. What is Java?

Java is a high-level, object-oriented programming language. It is used to build web applications, backend systems, Android apps, enterprise software, and Spring Boot applications.

---

## 2. Why is Java platform independent?

Java is platform independent because Java code is compiled into bytecode. This bytecode can run on any machine that has JVM installed.

```text
Java code → Bytecode → JVM → Output
```

## 3. What is JVM?

- JVM means Java Virtual Machine.
- It runs Java bytecode and converts it into machine-understandable instructions.

## 4. What is JRE?

- JRE means Java Runtime Environment.
- It provides the environment required to run Java programs. It contains JVM and required libraries.

## 5. What is JDK?

- JDK means Java Development Kit.
- It is used to develop Java applications. It contains JRE, compiler, and development tools.

## 6. Difference between JDK, JRE, and JVM?

| Term | Meaning                  | Use                              |
| ---- | ------------------------ | -------------------------------- |
| JVM  | Java Virtual Machine     | Runs bytecode                    |
| JRE  | Java Runtime Environment | Provides environment to run Java |
| JDK  | Java Development Kit     | Used to develop Java programs    |

JDK = JRE + development tools
JRE = JVM + libraries
JVM = runs bytecode

## 7. What is the main method in Java?

- The main method is the starting point of a Java program.
- public static void main(String[] args)
- When we run a Java program, execution starts from the main method.

## 8. Why is main method static?

The main method is static so that JVM can call it without creating an object of the class.

## 9. What is a variable?

A variable is a named memory location used to store data.

``` Example:

int age = 25;
String name = "Rahul";
```

## 10. What is a data type?

A data type defines the type of value a variable can store.

```Example:

int age = 25;
double salary = 45000.50;
boolean isActive = true;
```
## 11. What are primitive data types in Java?

- Java has 8 primitive data types:

1. byte
2. short
3. int
4. long
5. float
6. double
7. char
8. boolean

## 12. Difference between int and double?

int stores whole numbers.
```Example:
int age = 25;
```
double stores decimal numbers.

Example:

double salary = 45000.50;

## 13. Difference between float and double?

Both store decimal numbers.

- float has less precision.
- float price = 99.99f;

double has more precision and is commonly used.

double amount = 99999.99;
## 14. Difference between char and String?

- char stores a single character.

- char grade = 'A';

- String stores multiple characters.

- String name = "Java";
## 15. Difference between print() and println()?

- print() prints output on the same line.

```
System.out.print("Hello ");
System.out.print("Java");

Output:

Hello Java
```

- println() prints output and moves to the next line.
```
System.out.println("Hello");
System.out.println("Java");

Output:

Hello
Java
```
## 16. What is Scanner in Java?

Scanner is a class used to take input from the user.
````
Example:

import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int age = scanner.nextInt();
````
## 17. Why do we write import java.util.Scanner;?

Scanner is available inside the java.util package. To use Scanner in our program, we need to import it.

## 18. Is Java case-sensitive?

Yes. Java is case-sensitive.
````
Example:

int age = 25;
int Age = 30;
````

Here age and Age are different variables.

## 19. What happens after compiling Java code?

When we compile Java code using javac, Java creates a .class file. This .class file contains bytecode.

Example:
````
javac HelloWorld.java

Creates:

HelloWorld.class
````

## 20. What is bytecode?

Bytecode is the intermediate code generated after compiling Java source code. JVM understands and runs bytecode.

