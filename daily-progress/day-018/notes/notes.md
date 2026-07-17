```commandline
Excellent! 🎉 Welcome to Day 018 of your 200-Day Spring AI Engineer Roadmap.

Today you'll learn Java File Handling & Serialization, an important topic for enterprise Java development.

Almost every enterprise application reads or writes files.

Spring Boot applications frequently work with:

Configuration files
CSV files
Excel reports
Log files
Image uploads
PDF generation
Object serialization
File storage (AWS S3, Local Storage)
```

# Day 018 – Java File Handling & Serialization

## Learning Objectives

By the end of today, you will be able to:

- Understand Java File Handling
- Create Files
- Read Files
- Write Files
- Append Data to Files
- Use BufferedReader & BufferedWriter
- Understand Serialization
- Understand Deserialization
- Learn Serializable Interface
- Understand File Handling in Spring Boot

---

# Folder Structure

```
daily-progress/
└── day-018/
    ├── README.md
    ├── notes.md
    ├── data/
    │   ├── students.txt
    │   ├── employees.txt
    │   └── student.ser
    └── code/
        ├── CreateFileDemo.java
        ├── WriteFileDemo.java
        ├── AppendFileDemo.java
        ├── ReadFileDemo.java
        ├── BufferedReaderDemo.java
        ├── BufferedWriterDemo.java
        ├── Student.java
        ├── SerializationDemo.java
        ├── DeserializationDemo.java
        └── EmployeeReport.java
```

---

# 1. What is File Handling?

File Handling is the process of:

- Creating files
- Reading files
- Writing files
- Updating files
- Deleting files

using Java.

---

# Why Do We Need File Handling?

Applications store data in files.

Examples

- User details
- Logs
- Reports
- CSV exports
- Configuration files
- Images
- Documents

---

# Real Spring Boot Example

```
application.properties

application.yml

logback.xml

employees.csv

report.pdf
```

All these involve file handling.

---

# Java File Class

Java provides

```java
java.io.File
```

to work with files.

---

# Program 1

## CreateFileDemo.java

```java
import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

    public static void main(String[] args) {

        File file = new File("students.txt");

        try {

            if(file.createNewFile()){

                System.out.println("File Created Successfully");

            }else{

                System.out.println("File Already Exists");

            }

        }catch(IOException exception){

            System.out.println(exception.getMessage());

        }

    }

}
```

---

# Output

```
File Created Successfully
```

---

# File Methods

```java
exists()

createNewFile()

delete()

getName()

getAbsolutePath()

length()
```

---

# Example

```java
File file = new File("students.txt");

System.out.println(file.exists());

System.out.println(file.getAbsolutePath());

System.out.println(file.length());
```

---

# 2. Writing to a File

Use

```java
FileWriter
```

---

## WriteFileDemo.java

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {

    public static void main(String[] args) {

        try{

            FileWriter writer =
                    new FileWriter("students.txt");

            writer.write("Welcome to Java File Handling");

            writer.close();

            System.out.println("Data Written Successfully");

        }catch(IOException exception){

            System.out.println(exception.getMessage());

        }

    }

}
```

---

# Output

```
Data Written Successfully
```

---

# 3. Appending Data

Instead of overwriting

Use

```java
FileWriter(file,true)
```

---

## AppendFileDemo.java

```java
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileDemo {

    public static void main(String[] args) {

        try{

            FileWriter writer =
                    new FileWriter("students.txt",true);

            writer.write("\nSpring Boot");

            writer.close();

        }catch(IOException e){

            System.out.println(e.getMessage());

        }

    }

}
```

---

# File Content

```
Welcome to Java File Handling

Spring Boot
```

---

# 4. Reading a File

Use

```java
Scanner
```

---

## ReadFileDemo.java

```java
import java.io.File;
import java.util.Scanner;

public class ReadFileDemo {

    public static void main(String[] args) {

        try{

            File file = new File("students.txt");

            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){

                System.out.println(scanner.nextLine());

            }

            scanner.close();

        }catch(Exception e){

            System.out.println(e.getMessage());

        }

    }

}
```

---

# Output

```
Welcome to Java File Handling

Spring Boot
```

---

# 5. BufferedReader

Reads files efficiently.

```java
import java.io.*;

public class BufferedReaderDemo {

    public static void main(String[] args)throws Exception{

        BufferedReader reader =
                new BufferedReader(
                        new FileReader("students.txt"));

        String line;

        while((line=reader.readLine())!=null){

            System.out.println(line);

        }

        reader.close();

    }

}
```

---

# BufferedWriter

Writes efficiently.

```java
import java.io.*;

public class BufferedWriterDemo {

    public static void main(String[] args)throws Exception{

        BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter("employees.txt"));

        writer.write("Alice");

        writer.newLine();

        writer.write("Bob");

        writer.close();

    }

}
```

---

# BufferedReader vs Scanner

| BufferedReader | Scanner |
|---------------|---------|
| Faster | Easier to use |
| Large files | Small files |
| Reads text | Reads multiple data types |

---

# 6. Serialization

Serialization means

Converting an object

↓

Byte Stream

↓

Saving into a file.

---

# Why Serialization?

Store Java Objects

Examples

- User Session
- Cache
- Object Storage
- Data Transfer

---

# Serializable Interface

```java
import java.io.Serializable;

public class Student
        implements Serializable {

    private int id;

    private String name;

    public Student(int id,String name){

        this.id=id;

        this.name=name;

    }

}
```

---

# Serialization Demo

```java
import java.io.*;

public class SerializationDemo {

    public static void main(String[] args)throws Exception{

        Student student =
                new Student(101,"Rahul");

        ObjectOutputStream output =
                new ObjectOutputStream(
                        new FileOutputStream("student.ser"));

        output.writeObject(student);

        output.close();

        System.out.println("Object Saved");

    }

}
```

---

# Output

```
Object Saved
```

---

# 7. Deserialization

Read object back.

```java
import java.io.*;

public class DeserializationDemo {

    public static void main(String[] args)throws Exception{

        ObjectInputStream input =
                new ObjectInputStream(
                        new FileInputStream("student.ser"));

        Student student =
                (Student) input.readObject();

        input.close();

        System.out.println(student);

    }

}
```

---

# Student Class

Override

```java
toString()
```

```java
@Override

public String toString(){

    return id + " " + name;

}
```

Output

```
101 Rahul
```

---

# transient Keyword

Suppose

```java
private transient String password;
```

Transient fields

❌ Not Serialized

Useful for

- Password
- OTP
- Tokens

---

# Serialization Flow

```
Java Object

↓

ObjectOutputStream

↓

student.ser

↓

ObjectInputStream

↓

Java Object
```

---

# File Handling in Spring Boot

Reading CSV

```java
MultipartFile file;
```

Writing Report

```
report.pdf
```

Upload Image

```
profile.jpg
```

Download File

```
invoice.pdf
```

Everything uses File Handling.

---

# AWS Example

Spring Boot

↓

MultipartFile

↓

AWS S3

↓

Store Image

This is exactly how production applications upload files.

---

# Interview Questions

## 1. What is File Handling?

Reading, writing, creating, updating, and deleting files.

---

## 2. What is File class?

Represents files and directories.

---

## 3. Difference between FileWriter and BufferedWriter?

FileWriter

Basic writing.

BufferedWriter

Faster writing.

---

## 4. Difference between Scanner and BufferedReader?

Scanner

Simple.

BufferedReader

Faster.

---

## 5. What is Serialization?

Converting an object into a byte stream.

---

## 6. What is Deserialization?

Converting byte stream back into an object.

---

## 7. Which interface enables Serialization?

```java
Serializable
```

---

## 8. What is transient?

Field will not be serialized.

---

## 9. Where is Serialization used?

- Session Storage
- Cache
- File Storage
- Network Communication

---

## 10. How does Spring Boot use File Handling?

- File Upload
- CSV Import
- PDF Generation
- Image Upload
- AWS S3 Storage
- Report Export

---

# Assignments

## 1.

Create a file.

---

## 2.

Write student names into a file.

---

## 3.

Append employee names.

---

## 4.

Read a file using Scanner.

---

## 5.

Read a file using BufferedReader.

---

## 6.

Write using BufferedWriter.

---

## 7.

Serialize a Student object.

---

## 8.

Deserialize the Student object.

---

## 9.

Use transient keyword.

---

## 10.

Build a Student Record File Management System.

---

# notes.md

```md
# Day 018 Notes

## File Handling

Operations

- Create
- Read
- Write
- Append
- Delete

## Classes

- File
- FileReader
- FileWriter
- BufferedReader
- BufferedWriter
- Scanner

## Serialization

Object

↓

Byte Stream

↓

File

## Interface

Serializable

## transient

Field excluded from serialization.

## Spring Boot Usage

- File Upload
- Report Generation
- CSV Processing
- AWS S3 Upload
```

---

# README.md

```md
# Day 018 – Java File Handling & Serialization

## Topics

- File Handling
- File Class
- FileReader
- FileWriter
- BufferedReader
- BufferedWriter
- Serialization
- Deserialization
- Serializable
- transient

## Programs

- CreateFileDemo
- WriteFileDemo
- ReadFileDemo
- BufferedReaderDemo
- SerializationDemo
- DeserializationDemo

## Key Learnings

- Create and manage files.
- Read and write text files.
- Serialize Java objects.
- Deserialize objects.
- File handling is widely used in Spring Boot.

## Next Topic

Day 019 – Java Multithreading
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 018: Learned Java File Handling and Serialization"

git push origin main
```

---

# Day 018 Checklist

- [ ] Create files
- [ ] Write data into files
- [ ] Read files
- [ ] Use BufferedReader
- [ ] Use BufferedWriter
- [ ] Serialize objects
- [ ] Deserialize objects
- [ ] Learn transient keyword
- [ ] Complete all assignments
- [ ] Push to GitHub