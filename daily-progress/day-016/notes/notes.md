````
Excellent! 🎉 Welcome to Day 016 of your 200-Day Spring AI Engineer Roadmap.

Today you'll learn one of the most frequently used topics in Enterprise Java and Spring Boot:

Collections Framework in Java

Arrays have a fixed size. Collections are dynamic, flexible, and provide powerful methods to manage data.

In Spring Boot, almost every project uses Collections:

List<Employee>
Set<Role>
Map<String, Object>
List<ProductDTO>
HashMap<String, String>
JSON Arrays

Without Collections, building enterprise applications would be extremely difficult.
````

# Day 016 – Collections Framework in Java

## Learning Objectives

By the end of today, you will be able to:

- Understand the Collections Framework
- Learn Generics
- Understand List, Set, Queue, and Map
- Use ArrayList
- Use LinkedList
- Use HashSet
- Use TreeSet
- Use HashMap
- Use TreeMap
- Iterate Collections
- Understand Collections in Spring Boot

---

# Folder Structure

```
daily-progress/
└── day-016/
    ├── README.md
    ├── notes.md
    └── code/
        ├── ArrayListDemo.java
        ├── LinkedListDemo.java
        ├── HashSetDemo.java
        ├── TreeSetDemo.java
        ├── HashMapDemo.java
        ├── TreeMapDemo.java
        ├── IteratorDemo.java
        ├── StudentList.java
        ├── EmployeeMap.java
        └── CollectionComparison.java
```

---

# 1. What is the Collections Framework?

The Collections Framework is a group of classes and interfaces used to store and manipulate multiple objects dynamically.

Unlike arrays:

- Dynamic size
- Built-in methods
- Better performance
- Easy searching and sorting

---

# Why Not Arrays?

Array

```java
int[] numbers = new int[5];
```

Problems

- Fixed size
- Difficult insertion
- Difficult deletion

Collections solve these problems.

---

# Collection Hierarchy

```
Iterable
    |
Collection
    |
--------------------------------
|              |               |
List          Set            Queue
|
-----------------------
|                     |
ArrayList        LinkedList

Map (Separate Hierarchy)
|
------------------------
|                      |
HashMap           TreeMap
```

---

# Generics

Generics provide type safety.

Without Generics

```java
ArrayList list = new ArrayList();

list.add("Java");

list.add(100);
```

Problem

Different data types.

With Generics

```java
ArrayList<String> list = new ArrayList<>();
```

Only Strings allowed.

---

# 2. List

A List

- Maintains insertion order
- Allows duplicates
- Access by index

Example

```
Java

Spring

Spring

AI
```

Duplicates allowed.

---

# ArrayList

Most commonly used List implementation.

```java
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Spring Boot");
        courses.add("Spring AI");

        System.out.println(courses);

    }

}
```

Output

```
[Java, Spring Boot, Spring AI]
```

---

# Common ArrayList Methods

```java
add()

remove()

get()

set()

contains()

size()

isEmpty()

clear()
```

---

# Example

```java
ArrayList<String> fruits = new ArrayList<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");

System.out.println(fruits.get(1));

System.out.println(fruits.size());

fruits.remove("Banana");

System.out.println(fruits);
```

Output

```
Banana

3

[Apple, Orange]
```

---

# 3. LinkedList

LinkedList stores elements as nodes.

Better for:

- Frequent insertion
- Frequent deletion

```java
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Hyderabad");

        System.out.println(cities);

    }

}
```

---

# ArrayList vs LinkedList

| ArrayList | LinkedList |
|------------|------------|
| Fast Random Access | Slow Random Access |
| Slow Insert/Delete | Fast Insert/Delete |
| Uses Array | Uses Linked Nodes |

---

# 4. Set

A Set

- Does NOT allow duplicates
- No index
- Unique values

---

# HashSet

```java
import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Spring");
        languages.add("Java");

        System.out.println(languages);

    }

}
```

Output

```
[Java, Spring]
```

Duplicate removed automatically.

---

# TreeSet

Stores elements in sorted order.

```java
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);

        System.out.println(numbers);

    }

}
```

Output

```
[10, 30, 50]
```

---

# HashSet vs TreeSet

| HashSet | TreeSet |
|----------|----------|
| Unordered | Sorted |
| Faster | Slightly Slower |

---

# 5. Map

Map stores data as

```
Key → Value
```

Example

```
101 → Rahul

102 → John

103 → David
```

Keys must be unique.

---

# HashMap

```java
import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "John");
        students.put(103, "David");

        System.out.println(students);

    }

}
```

---

# Common HashMap Methods

```java
put()

get()

remove()

containsKey()

containsValue()

size()

clear()
```

---

# Example

```java
HashMap<Integer,String> employees = new HashMap<>();

employees.put(1,"Alice");

employees.put(2,"Bob");

System.out.println(employees.get(2));
```

Output

```
Bob
```

---

# TreeMap

Maintains sorted keys.

```java
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> marks = new TreeMap<>();

        marks.put(3,"A");

        marks.put(1,"B");

        marks.put(2,"C");

        System.out.println(marks);

    }

}
```

Output

```
{1=B, 2=C, 3=A}
```

---

# HashMap vs TreeMap

| HashMap | TreeMap |
|----------|----------|
| Unordered | Sorted by Key |
| Faster | Slightly Slower |

---

# Iterating Collections

Using enhanced for loop

```java
ArrayList<String> names = new ArrayList<>();

names.add("Rahul");
names.add("John");

for(String name : names){

    System.out.println(name);

}
```

---

# Iterator

```java
Iterator<String> iterator = names.iterator();

while(iterator.hasNext()){

    System.out.println(iterator.next());

}
```

---

# Collection Comparison

| Collection | Duplicates | Ordered | Sorted |
|------------|------------|----------|---------|
| ArrayList | Yes | Yes | No |
| LinkedList | Yes | Yes | No |
| HashSet | No | No | No |
| TreeSet | No | Yes | Yes |
| HashMap | Keys No | No | No |
| TreeMap | Keys No | Yes | Yes |

---

# Collections in Spring Boot

Example

```java
List<Employee> employees;
```

Repository

```java
List<Employee> findAll();
```

Controller

```java
@GetMapping

public List<Employee> getEmployees(){

    return service.findAll();

}
```

Spring automatically converts

```
List<Employee>
```

to JSON.

---

# Spring AI Example

Chat messages

```java
List<Message> messages;
```

Vector Search

```java
List<Document> documents;
```

Prompt Variables

```java
Map<String,Object> variables;
```

Collections are used everywhere.

---

# Interview Questions

## 1. What is the Collections Framework?

A framework that provides classes and interfaces for storing and manipulating groups of objects.

---

## 2. Difference between Array and ArrayList?

Array

- Fixed size

ArrayList

- Dynamic size

---

## 3. Difference between List and Set?

List

- Allows duplicates

Set

- No duplicates

---

## 4. Difference between HashSet and TreeSet?

HashSet

- Unordered

TreeSet

- Sorted

---

## 5. Difference between HashMap and TreeMap?

HashMap

- Faster
- Unordered

TreeMap

- Sorted
- Slightly slower

---

## 6. Why use Generics?

To provide compile-time type safety.

---

## 7. Which Collection allows duplicate elements?

List

---

## 8. Which Collection stores key-value pairs?

Map

---

## 9. Which Collection is used most in Spring Boot?

- List
- Map
- Set

---

## 10. Where are Collections used in Spring Boot?

- REST APIs
- JPA Repositories
- JSON
- DTOs
- Spring AI prompts
- Vector Search

---

# Assignments

## 1.

Create an ArrayList of student names.

---

## 2.

Store employee salaries using LinkedList.

---

## 3.

Remove duplicate city names using HashSet.

---

## 4.

Sort marks using TreeSet.

---

## 5.

Create HashMap

```
Employee ID → Employee Name
```

---

## 6.

Create TreeMap

```
Product ID → Product Name
```

---

## 7.

Iterate over an ArrayList using Iterator.

---

## 8.

Create List<Student>.

---

## 9.

Create Map<Integer, Employee>.

---

## 10.

Build a Student Management System using List and Map.

---

# notes.md

```md
# Day 016 Notes

## Collections Framework

Provides dynamic data structures.

## Interfaces

- List
- Set
- Queue
- Map

## List

- Ordered
- Duplicates allowed

## Set

- Unique elements

## Map

Key-Value pairs.

## Common Implementations

- ArrayList
- LinkedList
- HashSet
- TreeSet
- HashMap
- TreeMap

## Spring Boot Usage

- List<Employee>
- Map<String,Object>
- List<Message>
```

---

# README.md

```md
# Day 016 – Collections Framework

## Topics

- Collections Framework
- Generics
- List
- Set
- Map
- ArrayList
- LinkedList
- HashSet
- TreeSet
- HashMap
- TreeMap

## Programs

- ArrayListDemo
- LinkedListDemo
- HashSetDemo
- TreeMapDemo
- HashMapDemo
- IteratorDemo

## Key Learnings

- Collections provide dynamic data structures.
- List allows duplicates.
- Set stores unique elements.
- Map stores key-value pairs.
- Generics improve type safety.

## Next Topic

Day 017 – Java Generics & Wrapper Classes
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 016: Learned Collections Framework"

git push origin main
```

---

# Day 016 Checklist

- [ ] Understand Collections Framework
- [ ] Practice ArrayList
- [ ] Practice LinkedList
- [ ] Practice HashSet
- [ ] Practice TreeSet
- [ ] Practice HashMap
- [ ] Practice TreeMap
- [ ] Iterate using for-each and Iterator
- [ ] Complete all assignments
- [ ] Push to GitHub