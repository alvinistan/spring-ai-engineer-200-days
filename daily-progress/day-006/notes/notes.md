# Day 006 – Strings in Java

## Learning Objectives

By the end of this lesson, you will be able to:

- Understand what a String is
- Create String objects
- Learn String immutability
- Compare Strings correctly
- Use commonly used String methods
- Reverse Strings
- Check Palindrome
- Count vowels and consonants
- Remove spaces
- Convert uppercase/lowercase
- Solve String interview questions

---

# Folder Structure

```
daily-progress/
└── day-006/
    ├── README.md
    ├── notes.md
    └── code/
        ├── StringDeclaration.java
        ├── StringMethods.java
        ├── StringComparison.java
        ├── ReverseString.java
        ├── PalindromeString.java
        ├── CountVowels.java
        ├── CountWords.java
        ├── RemoveSpaces.java
        ├── CharacterFrequency.java
        ├── StringBuilderDemo.java
        └── StudentNameFormatter.java
```

---

# 1. What is a String?

A **String** is a sequence of characters.

Examples

```text
"Java"

"Spring Boot"

"Hello World"

"Spring AI"
```

A String stores text.

---

# Why Do We Need Strings?

Strings are everywhere.

Examples

- User name
- Password
- Email
- Address
- City
- JSON
- REST API
- SQL Query
- AI Prompt

Example

```java
String name = "Rahul";
```

---

# String Declaration

Method 1

```java
String name = "Java";
```

Method 2

```java
String course = new String("Spring Boot");
```

Most developers use

```java
String name = "Java";
```

---

# Program 1

```java
public class StringDeclaration {

    public static void main(String[] args) {

        String language = "Java";

        String framework = "Spring Boot";

        System.out.println(language);

        System.out.println(framework);

    }

}
```

Output

```
Java
Spring Boot
```

---

# 2. String is Immutable

This is one of the most asked interview questions.

Example

```java
String name = "Java";

name.concat(" Programming");
```

Many beginners think

```
Java Programming
```

will be stored.

Wrong.

Output

```
Java
```

Because String is **Immutable**.

Immutable means

**Once a String object is created, it cannot be changed.**

Instead, Java creates a new String object.

Correct

```java
name = name.concat(" Programming");
```

Now

```
Java Programming
```

---

# 3. String Methods

Java provides many built-in methods.

---

## length()

Returns number of characters.

```java
String name = "Spring";

System.out.println(name.length());
```

Output

```
6
```

---

## charAt()

Returns a character.

```java
String name = "Java";

System.out.println(name.charAt(0));
```

Output

```
J
```

---

## toUpperCase()

```java
String language = "java";

System.out.println(language.toUpperCase());
```

Output

```
JAVA
```

---

## toLowerCase()

```java
String language = "JAVA";

System.out.println(language.toLowerCase());
```

Output

```
java
```

---

## trim()

Removes leading and trailing spaces.

```java
String name = "   Java   ";

System.out.println(name.trim());
```

Output

```
Java
```

---

## contains()

```java
String course = "Spring Boot";

System.out.println(course.contains("Boot"));
```

Output

```
true
```

---

## startsWith()

```java
String course = "Spring Boot";

System.out.println(course.startsWith("Spring"));
```

Output

```
true
```

---

## endsWith()

```java
System.out.println(course.endsWith("Boot"));
```

Output

```
true
```

---

## replace()

```java
String text = "Java";

System.out.println(text.replace("Java","Spring"));
```

Output

```
Spring
```

---

## substring()

```java
String text = "SpringBoot";

System.out.println(text.substring(6));
```

Output

```
Boot
```

---

# Program 2

```java
public class StringMethods {

    public static void main(String[] args) {

        String text = "Spring Boot";

        System.out.println(text.length());

        System.out.println(text.toUpperCase());

        System.out.println(text.toLowerCase());

        System.out.println(text.charAt(0));

        System.out.println(text.contains("Boot"));

    }

}
```

---

# 4. Comparing Strings

Never use

```java
==
```

Use

```java
equals()
```

Wrong

```java
String a = "Java";

String b = new String("Java");

System.out.println(a == b);
```

Output

```
false
```

Correct

```java
System.out.println(a.equals(b));
```

Output

```
true
```

---

# equalsIgnoreCase()

```java
String a = "JAVA";

String b = "java";

System.out.println(a.equalsIgnoreCase(b));
```

Output

```
true
```

---

# Program 3

```java
public class StringComparison {

    public static void main(String[] args) {

        String first = "Java";

        String second = "java";

        System.out.println(first.equals(second));

        System.out.println(first.equalsIgnoreCase(second));

    }

}
```

Output

```
false

true
```

---

# 5. Reverse String

```java
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");

        String text = scanner.nextLine();

        for(int i=text.length()-1;i>=0;i--){

            System.out.print(text.charAt(i));

        }

        scanner.close();

    }

}
```

Input

```
Java
```

Output

```
avaJ
```

---

# 6. Palindrome String

```java
import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");

        String text = scanner.nextLine();

        String reverse = "";

        for(int i=text.length()-1;i>=0;i--){

            reverse += text.charAt(i);

        }

        if(text.equalsIgnoreCase(reverse)){

            System.out.println("Palindrome");

        }else{

            System.out.println("Not Palindrome");

        }

        scanner.close();

    }

}
```

---

# 7. Count Vowels

```java
public class CountVowels {

    public static void main(String[] args) {

        String text = "Spring Boot";

        int vowels = 0;

        text = text.toLowerCase();

        for(int i=0;i<text.length();i++){

            char ch = text.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){

                vowels++;

            }

        }

        System.out.println(vowels);

    }

}
```

Output

```
3
```

---

# 8. Count Words

```java
public class CountWords {

    public static void main(String[] args) {

        String sentence = "Java Spring Boot";

        String[] words = sentence.split(" ");

        System.out.println(words.length);

    }

}
```

Output

```
3
```

---

# 9. Remove Spaces

```java
public class RemoveSpaces {

    public static void main(String[] args) {

        String text = "Java Spring Boot";

        System.out.println(text.replace(" ",""));

    }

}
```

Output

```
JavaSpringBoot
```

---

# 10. StringBuilder

Remember

String is immutable.

If we modify Strings repeatedly,

performance decreases.

Use

```java
StringBuilder
```

Program

```java
public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Java");

        builder.append(" Spring");

        builder.append(" AI");

        System.out.println(builder);

    }

}
```

Output

```
Java Spring AI
```

---

# String vs StringBuilder

| String | StringBuilder |
|----------|--------------|
| Immutable | Mutable |
| Slower for repeated modifications | Faster |
| Safe to use | Better for building strings |

---

# Interview Questions

## 1. What is a String?

A String is a sequence of characters.

---

## 2. Is String mutable?

No.

String is immutable.

---

## 3. Difference between == and equals()?

==

Compares references.

equals()

Compares content.

---

## 4. Difference between String and StringBuilder?

String

Immutable

StringBuilder

Mutable

---

## 5. What is charAt()?

Returns a character at the specified index.

---

## 6. What does length() return?

Returns the number of characters.

---

## 7. Difference between length and length()?

Array

```java
numbers.length
```

String

```java
text.length()
```

---

## 8. What is substring()?

Returns a part of a String.

---

## 9. What is trim()?

Removes leading and trailing spaces.

---

## 10. What is equalsIgnoreCase()?

Compares Strings ignoring uppercase and lowercase.

---

# Assignments

1. Reverse String

2. Count vowels

3. Count consonants

4. Count digits

5. Remove spaces

6. Check palindrome

7. Convert uppercase

8. Convert lowercase

9. Print each character separately

10. Find longest word

---

# README.md

```md
# Day 006 - Strings in Java

## Topics

- String
- String Methods
- String Comparison
- Reverse String
- Palindrome
- StringBuilder

## Programs

- StringDeclaration
- StringMethods
- ReverseString
- PalindromeString
- CountVowels
- CountWords
- RemoveSpaces
- StringBuilderDemo

## Key Learnings

- String stores text.
- String is immutable.
- equals() compares content.
- StringBuilder improves performance.
- String methods simplify text processing.

## Next Topic

Day 007 - Object-Oriented Programming (Classes & Objects)
```

---

# GitHub Commit

```bash
git add .

git commit -m "Day 006: Learned Strings in Java"

git push origin main
```

---

# Day 006 Checklist

- [ ] Understand String
- [ ] Learn String methods
- [ ] Compare Strings correctly
- [ ] Reverse String
- [ ] Check Palindrome
- [ ] Count vowels
- [ ] Use StringBuilder
- [ ] Complete assignments
- [ ] Push to GitHub
