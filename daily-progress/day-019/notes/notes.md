```commandline
Excellent! 🎉 Welcome to Day 019 of your 200-Day Spring AI Engineer Roadmap.

Today you'll learn one of the most important advanced Java topics:

Java Multithreading & Concurrency

Modern applications rarely do just one thing at a time.

While one thread handles an HTTP request, another reads from a database, another writes logs, and another calls an AI model.

Spring Boot, Spring AI, Kafka, RabbitMQ, and Microservices all rely heavily on multithreading.

```

# Day 019 – Java Multithreading & Concurrency

## Learning Objectives

By the end of today, you will be able to:

- Understand Process vs Thread
- Understand Multithreading
- Create Threads
- Implement Runnable
- Understand Thread Lifecycle
- Use Thread Methods
- Understand Synchronization
- Learn Race Conditions
- Use ExecutorService
- Learn Callable & Future
- Understand Multithreading in Spring Boot

---

# Folder Structure

```
daily-progress/
└── day-019/
    ├── README.md
    ├── notes.md
    └── code/
        ├── ThreadDemo.java
        ├── RunnableDemo.java
        ├── ThreadMethodsDemo.java
        ├── ThreadLifecycleDemo.java
        ├── SynchronizationDemo.java
        ├── Counter.java
        ├── RaceConditionDemo.java
        ├── ExecutorServiceDemo.java
        ├── CallableDemo.java
        ├── FutureDemo.java
        └── SpringAsyncExample.java
```

---

# 1. What is a Process?

A Process is an independent program running in memory.

Examples

- Chrome Browser
- IntelliJ IDEA
- VS Code
- Spotify

Each is a separate process.

---

# What is a Thread?

A Thread is the smallest unit of execution inside a process.

Example

Chrome Browser

```
Chrome Process

↓

Thread 1 → UI

Thread 2 → Downloads

Thread 3 → Audio

Thread 4 → Network
```

One process

Multiple threads

---

# Process vs Thread

| Process | Thread |
|----------|---------|
| Independent | Part of a process |
| Heavyweight | Lightweight |
| Own memory | Shares process memory |
| Slow creation | Fast creation |

---

# Why Multithreading?

Without multithreading

```
Download File

↓

Read Database

↓

Generate PDF

↓

Send Email
```

Everything happens one after another.

With multithreading

```
Download File

Generate PDF

Send Email

↓

All run simultaneously
```

Much faster.

---

# 2. Creating a Thread

Method 1

Extend

```
Thread
```

---

## ThreadDemo.java

```java
public class ThreadDemo extends Thread {

    @Override
    public void run() {

        System.out.println("Thread is Running");

    }

    public static void main(String[] args) {

        ThreadDemo thread = new ThreadDemo();

        thread.start();

    }

}
```

Output

```
Thread is Running
```

---

# start() vs run()

Wrong

```java
thread.run();
```

Runs like a normal method.

Correct

```java
thread.start();
```

Creates a new thread.

---

# 3. Runnable Interface

Preferred approach.

```java
public class RunnableDemo implements Runnable {

    @Override
    public void run() {

        System.out.println("Runnable Thread");

    }

    public static void main(String[] args) {

        Thread thread = new Thread(new RunnableDemo());

        thread.start();

    }

}
```

Output

```
Runnable Thread
```

---

# Why Runnable?

Java supports only one class inheritance.

Using Runnable allows

```
class Employee extends Person
        implements Runnable
```

Much more flexible.

---

# 4. Thread Methods

Common methods

```java
start()

run()

sleep()

join()

getName()

setName()

currentThread()
```

---

## Example

```java
public class ThreadMethodsDemo {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {

            System.out.println(Thread.currentThread().getName());

        });

        thread.setName("Worker-1");

        thread.start();

    }

}
```

Output

```
Worker-1
```

---

# sleep()

Pauses thread execution.

```java
try {

    Thread.sleep(2000);

} catch (InterruptedException e) {

    e.printStackTrace();

}
```

---

# join()

Waits until another thread finishes.

```java
thread.start();

thread.join();

System.out.println("Completed");
```

---

# Thread Lifecycle

```
New

↓

Runnable

↓

Running

↓

Blocked / Waiting

↓

Terminated
```

---

# 5. Race Condition

Suppose

```
Balance = 1000
```

Two threads withdraw

```
500

500
```

Both read the same balance.

Result becomes incorrect.

This is called a Race Condition.

---

# Counter Example

```java
public class Counter {

    int count = 0;

    public void increment() {

        count++;

    }

}
```

Two threads

```
count++

count++
```

Final value becomes unpredictable.

---

# 6. Synchronization

Synchronization allows only one thread to access critical code at a time.

```java
public synchronized void increment() {

    count++;

}
```

Now only one thread updates count.

Safe.

---

# Synchronization Demo

```java
public class SynchronizationDemo {

    public static void main(String[] args)
            throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {

            for(int i=0;i<1000;i++){

                counter.increment();

            }

        });

        Thread t2 = new Thread(() -> {

            for(int i=0;i<1000;i++){

                counter.increment();

            }

        });

        t1.start();

        t2.start();

        t1.join();

        t2.join();

        System.out.println(counter.count);

    }

}
```

Output

```
2000
```

Without synchronization

Output may be

```
1837

1942

1985
```

Random.

---

# 7. ExecutorService

Instead of manually creating threads,

Java provides

```
ExecutorService
```

---

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        executor.execute(() ->
                System.out.println("Task 1"));

        executor.execute(() ->
                System.out.println("Task 2"));

        executor.execute(() ->
                System.out.println("Task 3"));

        executor.shutdown();

    }

}
```

---

# Benefits

- Thread Pool
- Better Performance
- Thread Reuse
- Resource Management

---

# 8. Callable

Runnable

```
No return value
```

Callable

```
Returns value
```

---

```java
import java.util.concurrent.*;

public class CallableDemo {

    public static void main(String[] args)
            throws Exception {

        ExecutorService executor =
                Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> 100;

        Future<Integer> future =
                executor.submit(task);

        System.out.println(future.get());

        executor.shutdown();

    }

}
```

Output

```
100
```

---

# Future

Future represents the result of an asynchronous task.

Methods

```java
get()

isDone()

cancel()
```

---

# Runnable vs Callable

| Runnable | Callable |
|------------|----------|
| No return | Returns value |
| Cannot throw checked exceptions | Can throw exceptions |
| execute() | submit() |

---

# Multithreading in Spring Boot

Background Tasks

```java
@Async

public void sendEmail(){

}
```

Spring runs it in another thread.

---

# Spring AI Example

```
User Request

↓

Call OpenAI

↓

Store Chat History

↓

Log Request

↓

Save Usage

```

These tasks can execute concurrently.

---

# ExecutorService in Spring

Spring internally uses thread pools for

- @Async
- Scheduled Tasks
- Web Requests
- Background Processing

---

# Interview Questions

## 1. What is a Thread?

A thread is the smallest unit of execution within a process.

---

## 2. Difference between Process and Thread?

Process has independent memory.

Threads share process memory.

---

## 3. Difference between start() and run()?

start()

Creates a new thread.

run()

Runs as a normal method.

---

## 4. Why is Runnable preferred?

Because Java supports single inheritance.

---

## 5. What is Synchronization?

Synchronization prevents multiple threads from accessing critical code simultaneously.

---

## 6. What is Race Condition?

When multiple threads modify shared data simultaneously, causing inconsistent results.

---

## 7. What is ExecutorService?

A framework for managing thread pools efficiently.

---

## 8. Difference between Runnable and Callable?

Runnable

No return value.

Callable

Returns a value.

---

## 9. What is Future?

Represents the result of an asynchronous computation.

---

## 10. How does Spring Boot use Multithreading?

- @Async
- Scheduler
- Web Requests
- Kafka
- RabbitMQ
- AI Requests
- Email Sending

---

# Assignments

## 1.

Create a Thread using Thread class.

---

## 2.

Create a Thread using Runnable.

---

## 3.

Print Thread Name.

---

## 4.

Use sleep().

---

## 5.

Use join().

---

## 6.

Create Counter with synchronization.

---

## 7.

Demonstrate Race Condition.

---

## 8.

Use ExecutorService with 5 tasks.

---

## 9.

Create Callable returning Student Count.

---

## 10.

Build a Mini Banking System using Multithreading.

---

# notes.md

```md
# Day 019 Notes

## Process

Running program.

## Thread

Smallest execution unit.

## Thread Creation

- Thread class
- Runnable interface

## Synchronization

Prevents race conditions.

## ExecutorService

Manages thread pools.

## Callable

Returns values.

## Future

Represents asynchronous results.

## Spring Boot Usage

- @Async
- Scheduler
- Kafka
- RabbitMQ
- AI Requests
```

---

# README.md

```md
# Day 019 – Java Multithreading & Concurrency

## Topics

- Process
- Thread
- Runnable
- Thread Lifecycle
- Synchronization
- Race Condition
- ExecutorService
- Callable
- Future

## Programs

- ThreadDemo
- RunnableDemo
- SynchronizationDemo
- ExecutorServiceDemo
- CallableDemo

## Key Learnings

- Threads improve application performance.
- Runnable is preferred over extending Thread.
- Synchronization prevents race conditions.
- ExecutorService manages thread pools efficiently.
- Spring Boot uses multithreading extensively.

## Next Topic

Day 020 – Java 8 Features (Lambda, Streams & Functional Programming)
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 019: Learned Java Multithreading and Concurrency"

git push origin main
```

---

# Day 019 Checklist

- [ ] Understand Process vs Thread
- [ ] Create Threads using Thread
- [ ] Create Threads using Runnable
- [ ] Practice sleep() and join()
- [ ] Understand Thread Lifecycle
- [ ] Implement Synchronization
- [ ] Demonstrate Race Conditions
- [ ] Use ExecutorService
- [ ] Practice Callable & Future
- [ ] Push to GitHub