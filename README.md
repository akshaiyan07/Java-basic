# Java Basic Programming

## Overview
This README provides an overview of basic programming in Java.

Java is a powerful and versatile object-oriented programming language, ideal for creating applications across various platforms, including web, mobile, and desktop.

What's Included
This repository contains all the programs I created during my learning journey. These programs demonstrate the foundational concepts of Java programming and reflect my progress as I explored the language.

---

## Prerequisites
- Install the **Java Development Kit (JDK)**: [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- Install an Integrated Development Environment (IDE) such as:
  - IntelliJ IDEA
  - Eclipse
  - VS Code with Java Extension
- Basic understanding of programming concepts (optional, but helpful)

---

## Setting Up
1. **Verify Java Installation**:
   - Open your terminal or command prompt.
   - Type `java -version` to confirm Java is installed and to check its version.

2. **Set Up Your IDE**:
   - Download and install an IDE of your choice.
   - Configure your IDE to use the installed JDK.

3. **Write Your First Program**:
   - Open your IDE.
   - Create a new project and add a Java class file (e.g., `HelloWorld.java`).

---

## Basic Syntax
Below is the structure of a simple Java program:

```java
// HelloWorld.java
public class HelloWorld {
    public static void main(String[] args) {
        // Prints "Hello, World!" to the console
        System.out.println("Hello, World!");
    }
}
```

### Key Points:
- **Class Definition**: Every Java program begins with a class definition. The class name must match the file name.
- **`main` Method**: The entry point of any Java program.
- **Statements**: Code inside the `main` method is executed sequentially.

---

## Java Basics

### 1. **Variables and Data Types**
Java is statically typed, meaning variables must be declared with a specific data type:

```java
int number = 10;      // Integer
double price = 19.99; // Decimal number
char grade = 'A';     // Single character
boolean isJavaFun = true; // Boolean
String message = "Hello!"; // String
```

### 2. **Control Statements**
- **Conditional Statements**:

```java
if (number > 0) {
    System.out.println("Positive number");
} else {
    System.out.println("Negative number");
}
```

- **Loops**:

```java
// For loop
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// While loop
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### 3. **Methods**
Reusable blocks of code defined inside a class:

```java
public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("Result: " + result);
    }
}
```

### 4. **Object-Oriented Programming (OOP)**
Java supports core OOP concepts:
- **Classes and Objects**:

```java
class Car {
    String brand;

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.displayBrand();
    }
}
```

- **Inheritance**:

```java
class Animal {
    public void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
```

---

## Compiling and Running Java Programs
1. Open a terminal or command prompt.
2. Navigate to the directory where your `.java` file is located.
3. Compile the program using `javac`:
   ```bash
   javac HelloWorld.java
   ```
4. Run the compiled program:
   ```bash
   java HelloWorld
   ```

---

## Troubleshooting
- **Class Not Found**: Ensure the class name matches the file name and is spelled correctly.
- **Syntax Errors**: Check for missing semicolons, braces, or parentheses.

---

## Resources
- [Java Programming Cheatsheet](https://introcs.cs.princeton.edu/java/11cheatsheet/)
- Lectures from college.



