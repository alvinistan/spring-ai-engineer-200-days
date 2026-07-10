# Day 005 – Arrays in Java

## Learning Objectives

By the end of this lesson, you will be able to:

- Understand what an array is
- Declare and initialize arrays
- Access array elements
- Update array elements
- Traverse arrays using loops
- Find maximum and minimum values
- Calculate sum and average
- Search for an element
- Reverse an array
- Understand common interview questions on arrays

---

# Folder Structure

```
daily-progress/
└── day-005/
    ├── README.md
    ├── notes.md
    └── code/
        ├── ArrayDeclaration.java
        ├── ArrayInitialization.java
        ├── ArrayTraversal.java
        ├── SumOfArray.java
        ├── AverageOfArray.java
        ├── LargestElement.java
        ├── SmallestElement.java
        ├── SearchElement.java
        ├── ReverseArray.java
        ├── StudentMarks.java
        └── EmployeeSalary.java
```

---

# 1. What is an Array?

An **array** is a collection of elements of the **same data type** stored in **contiguous memory locations**.

Instead of creating many variables:

```java
int mark1 = 85;
int mark2 = 90;
int mark3 = 76;
int mark4 = 88;
int mark5 = 95;
```

We can write:

```java
int[] marks = {85, 90, 76, 88, 95};
```

Now all marks are stored together.

---

# Why Do We Need Arrays?

Without arrays:

```java
int student1 = 80;
int student2 = 70;
int student3 = 90;
int student4 = 60;
int student5 = 100;
```

Imagine storing marks for **10,000 students**.

Impossible.

Using arrays:

```java
int[] students = new int[10000];
```

Simple.

---

# Real World Examples

Arrays are used to store:

- Student marks
- Employee salaries
- Product prices
- Monthly sales
- Exam scores
- Sensor readings
- Daily temperatures

---

# Memory Representation

```
Index

0      1      2      3      4

+-----+-----+-----+-----+-----+

| 85  | 90  | 76  | 88  | 95  |

+-----+-----+-----+-----+-----+
```

Every element has an **index**.

Java array index always starts from **0**.

---

# 2. Declaring an Array

Syntax

```java
dataType[] arrayName;
```

Example

```java
int[] marks;

double[] salary;

String[] names;
```

---

# Creating an Array

```java
int[] marks = new int[5];
```

This creates an array of size **5**.

Initially

```
marks[0] = 0
marks[1] = 0
marks[2] = 0
marks[3] = 0
marks[4] = 0
```

---

# Program 1

```java
public class ArrayDeclaration {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        System.out.println(numbers.length);

    }

}
```

Output

```
5
```

---

# 3. Array Initialization

Method 1

```java
int[] marks = new int[5];

marks[0] = 85;
marks[1] = 90;
marks[2] = 76;
marks[3] = 88;
marks[4] = 95;
```

---

Method 2

```java
int[] marks = {85,90,76,88,95};
```

This is the most commonly used approach.

---

# Program 2

```java
public class ArrayInitialization {

    public static void main(String[] args) {

        int[] marks = {85,90,76,88,95};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

    }

}
```

Output

```
85
90
76
```

---

# Accessing Array Elements

Syntax

```java
arrayName[index]
```

Example

```java
marks[2]
```

Output

```
76
```

---

# Updating Array Elements

```java
marks[2] = 100;
```

Now

```
85
90
100
88
95
```

---

# Array Index Rules

For

```java
int[] marks = {85,90,76,88,95};
```

Valid indexes

```
0
1
2
3
4
```

Invalid

```
5

-1
```

Accessing

```java
marks[5]
```

throws

```
ArrayIndexOutOfBoundsException
```

---

# 4. Traversing an Array

Instead of

```java
System.out.println(marks[0]);

System.out.println(marks[1]);

System.out.println(marks[2]);
```

Use a loop.

---

# Program

```java
public class ArrayTraversal {

    public static void main(String[] args) {

        int[] marks = {85,90,76,88,95};

        for(int i=0;i<marks.length;i++){

            System.out.println(marks[i]);

        }

    }

}
```

Output

```
85
90
76
88
95
```

---

# What is length?

Every array has a property called

```java
length
```

Example

```java
marks.length
```

Output

```
5
```

Never write

```java
i<=marks.length
```

Correct

```java
i<marks.length
```

---

# Program 5 - Sum of Array

```java
public class SumOfArray {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        int sum = 0;

        for(int i=0;i<numbers.length;i++){

            sum += numbers[i];

        }

        System.out.println("Sum = " + sum);

    }

}
```

Output

```
Sum = 150
```

---

# Program 6 - Average

```java
public class AverageOfArray {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        int sum = 0;

        for(int i=0;i<numbers.length;i++){

            sum += numbers[i];

        }

        double average = (double)sum / numbers.length;

        System.out.println("Average = " + average);

    }

}
```

Output

```
Average = 30.0
```

---

# Program 7 - Largest Element

```java
public class LargestElement {

    public static void main(String[] args) {

        int[] numbers = {12,8,25,4,30};

        int largest = numbers[0];

        for(int i=1;i<numbers.length;i++){

            if(numbers[i] > largest){

                largest = numbers[i];

            }

        }

        System.out.println("Largest = " + largest);

    }

}
```

Output

```
Largest = 30
```

---

# Program 8 - Smallest Element

```java
public class SmallestElement {

    public static void main(String[] args) {

        int[] numbers = {12,8,25,4,30};

        int smallest = numbers[0];

        for(int i=1;i<numbers.length;i++){

            if(numbers[i] < smallest){

                smallest = numbers[i];

            }

        }

        System.out.println("Smallest = " + smallest);

    }

}
```

Output

```
Smallest = 4
```

---

# Program 9 - Search Element

```java
public class SearchElement {

    public static void main(String[] args) {

        int[] numbers = {12,8,25,4,30};

        int target = 25;

        boolean found = false;

        for(int i=0;i<numbers.length;i++){

            if(numbers[i] == target){

                found = true;

                break;

            }

        }

        if(found){

            System.out.println("Element Found");

        }else{

            System.out.println("Element Not Found");

        }

    }

}
```

---

# Program 10 - Reverse Array

```java
public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        for(int i=numbers.length-1;i>=0;i--){

            System.out.print(numbers[i] + " ");

        }

    }

}
```

Output

```
50 40 30 20 10
```

---

# Enhanced for Loop (For-Each)

Java provides an easier way to traverse arrays.

```java
for(int number : numbers){

    System.out.println(number);

}
```

This is called the **Enhanced For Loop** or **For-Each Loop**.

Use it when you only need to read elements.

---

# Difference

Traditional Loop

```java
for(int i=0;i<numbers.length;i++){

    System.out.println(numbers[i]);

}
```

Enhanced Loop

```java
for(int number : numbers){

    System.out.println(number);

}
```

---

# Interview Questions

## 1. What is an Array?

An array is a collection of elements of the same data type stored in contiguous memory locations.

---

## 2. Why do arrays start with index 0?

Because the index represents the offset from the first memory location.

The first element is zero positions away.

---

## 3. Can an array store different data types?

No.

An array stores only one data type.

Correct

```java
int[] numbers
```

Incorrect

```java
{10,"Java",true}
```

---

## 4. What is ArrayIndexOutOfBoundsException?

It occurs when an invalid index is accessed.

Example

```java
numbers[10]
```

when the array size is only 5.

---

## 5. Difference between length and length()?

```
Array

length
```

```
String

length()
```

---

## 6. What is the default value of int array?

```
0
```

Boolean array

```
false
```

String array

```
null
```

---

## 7. Difference between traditional for loop and enhanced for loop?

Traditional loop

- Index available
- Can modify elements

Enhanced loop

- Cleaner
- No index
- Best for reading values

---

# Assignments

1. Print all array elements.

2. Find sum.

3. Find average.

4. Find largest element.

5. Find smallest element.

6. Reverse array.

7. Search an element.

8. Count even numbers.

9. Count odd numbers.

10. Find second largest element.

---

# README.md

```md
# Day 005 - Arrays in Java

## Topics

- Arrays
- Declaration
- Initialization
- Traversal
- Sum
- Average
- Largest
- Smallest
- Searching
- Reverse Array

## Programs

- ArrayDeclaration
- ArrayTraversal
- SumOfArray
- AverageOfArray
- LargestElement
- SmallestElement
- SearchElement
- ReverseArray

## Key Learnings

- Arrays store multiple values of the same type.
- Array index starts at 0.
- Arrays have fixed size.
- Use loops to traverse arrays.
- Enhanced for loop simplifies reading elements.

## Next Topic

Day 006 - Strings in Java
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 005: Learned Arrays in Java"

git push origin main
```

---

# Day 005 Checklist

- [ ] Understand arrays
- [ ] Declare arrays
- [ ] Initialize arrays
- [ ] Traverse arrays
- [ ] Find largest and smallest
- [ ] Search elements
- [ ] Reverse arrays
- [ ] Practice enhanced for loop
- [ ] Complete assignments
- [ ] Push to GitHub
