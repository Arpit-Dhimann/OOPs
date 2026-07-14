# OOPS - Java Notes

Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies the software development and maintenance by providing some concepts defined below :

---

## Class

Class is a user-defined data type which defines its properties and its functions. Class is the only logical representation of the data. For example, Human being is a class. The body parts of a human being are its properties, and the actions performed by the body parts are known as functions. The class does not occupy any memory space till the time an object is instantiated.

## Object

Object is a run-time entity. It is an instance of the class. An object can represent a person, place or any other item. An object can operate on both data members and member functions.

### Example 1:

```java
class Student {
   String name;
   int age;

   public void getInfo() {
       System.out.println("The name of this Student is " + this.name);
       System.out.println("The age of this Student is " + this.age);
    }
}

public class OOPS {
   public static void main(String args[]) {
       Student s1 = new Student();
       s1.name = "ARPIT DHIMAN";
       s1.age = 19;
       s1.getInfo();

       Student s2 = new Student();
       s2.name = "XYZ";
       s2.age = 19;
       s2.getInfo();
    }
}
```


### Example 2:

```java
class Pen {
   String color;
   String type;

   public void specification() {
       System.out.println("The color of Pen is " + color);
       System.out.println("The type of Pen is " + type);
    }
}

public class BasicClassAndObject {
   public static void main(String[] args) {
       Pen pen = new Pen();
       pen.color = "BLUE";
       pen.type = "GEL";
       pen.specification();
    }
}
```


> **Note :** When an object is created using a new keyword, then space is allocated for the variable in a heap, and the starting address is stored in the stack memory.

---

## 'this' Keyword

'this' keyword in Java refers to the current instance of the class. In OOPS it is used to:
- Pass the current object as a parameter to another method
- Refer to the current class instance variable

```java
class Student {
   String name;
   String age;

   public void getInfo() {
       System.out.println("The name of this Student is : " + this.name);
       System.out.println("The age of this Student is : " + this.age);
    }
}

public class UsingThisKeyword {
   public static void main(String[] args) {
       Student S1 = new Student();
       S1.name = "Arpit Dhiman";
       S1.age = "19";
       S1.getInfo();

       System.out.println();

       Student S2 = new Student();
       S2.name = "XYZ";
       S2.age = "19";
       S2.getInfo();
    }
}
```


---

## Constructor

Constructor is a special method which is invoked automatically at the time of object creation. It is used to initialize the data members of new objects generally.

- Constructors have the same name as class or structure.
- Constructors don't have a return type. (Not even void)
- Constructors are only called once, at object creation.

There can be three types of constructors in Java.

---

### 1. Non-Parameterized Constructor

A constructor which has no argument is known as non-parameterized constructor (or no-argument constructor). It is invoked at the time of creating an object. If we don't create one then it is created by default by Java.

```java
class Student {
   String name;
   int age;

   public void printInfo() {
       System.out.println("Student name is : " + name);
       System.out.println("Student age is : " + age);
       System.out.println();
    }

   Student() {
       System.out.println("Constructor called for a new student!");
    }
}

public class NonParameterizedConstructor {
   public static void main(String[] args) {
       Student S1 = new Student();
       S1.name = "ARPIT DHIMAN";
       S1.age = 19;
       S1.printInfo();

       Student S2 = new Student();
       S2.name = "XYZ";
       S2.age = 19;
       S2.printInfo();
    }
}
```


---

### 2. Parameterized Constructor

Constructor which has parameters is called a parameterized constructor. It is used to provide different values to distinct objects.

```java
class Student {
   String Name;
   int Age;

   public void printInfo() {
       System.out.println("Student name is : " + Name);
       System.out.println("Student age is : " + Age);
       System.out.println();
    }

   Student(String name, int age) {
       this.Name = name;
       this.Age = age;
    }
}

public class ParameterizedConstructor {
   public static void main(String[] args) {
       Student S1 = new Student("ARPIT DHIMAN", 19);
       S1.printInfo();

       Student S2 = new Student("XYZ", 19);
       S2.printInfo();
    }
}
```


---

### 3. Copy Constructor

A Copy constructor is an overloaded constructor used to declare and initialize an object from another object. There is only a user defined copy constructor in Java (C++ has a default one too).

```java
class Student {
   String name;
   int age;

   public void printInfo(String student) {
       System.out.println(student);
       System.out.println("Student name is : " + name);
       System.out.println("Student age is : " + age);
    }

   // Copy Constructor
   Student(Student s2) {
       this.name = s2.name;
       this.age = s2.age;
    }

   // Default Constructor
   Student() {
       // Empty constructor
    }
}

public class CopyConstructor {
   public static void main(String[] args) {
       Student s1 = new Student();
       s1.name = "ARPIT DHIMAN";
       s1.age = 19;

       Student s2 = new Student(s1);
       s2.printInfo("Print for Student s2 (Copied from s1):");
    }
}
```


---

## Methods in Class

```java
class Pen {
   String color;
   String type;

   public void specification(String penName) {
       System.out.println("Detail for : " + penName);
       System.out.println("The color of Pen is " + color);
       System.out.println("The type of Pen is " + type);
    }
}

public class MethodsInClass {
   public static void main(String[] args) {
       Pen pen1 = new Pen();
       pen1.color = "BLUE";
       pen1.type = "GEL";

       Pen pen2 = new Pen();
       pen2.color = "BLACK";
       pen2.type = "BALLPOINT";

       pen1.specification("pen1");
       System.out.println();
       pen2.specification("pen2");
    }
}
```


---

> **Note :** Unlike languages like C++, Java has no Destructor. Instead, Java has an efficient garbage collector that deallocates memory automatically.

---

# Polymorphism

Polymorphism is the ability to present the same interface for differing underlying forms (data types).

With polymorphism, each of these classes will have different underlying data.

Precisely:

- **Poly** means **Many**
- **Morphism** means **Forms**

## Types of Polymorphism (IMP)

1. Compile Time Polymorphism (Static)
2. Runtime Polymorphism (Dynamic)

Let's understand them one by one.

---

## Compile Time Polymorphism (Static)

The polymorphism which is implemented at compile time is known as **Compile Time Polymorphism**.

The best example of Compile Time Polymorphism is **Method Overloading**.

### Method Overloading

Method Overloading is a technique that allows you to have more than one method with the same name but different functionality.

Method Overloading can be achieved on the following basis:

1. Different number of parameters.
2. Different data types of parameters.

### Example

```java
class Student {

   String name;
   int age;

   public void displayInfo(String name) {
       System.out.println(name);
    }

   public void displayInfo(int age) {
       System.out.println(age);
    }

   public void displayInfo(String name, int age) {
       System.out.println(name);
       System.out.println(age);
    }
}
```

> **Note :** In Method Overloading, the method name remains the same, but the parameter list must be different.

---

## Runtime Polymorphism (Dynamic)

Runtime Polymorphism is also known as **Dynamic Polymorphism**.

The best example of Runtime Polymorphism is **Method Overriding**.

### Method Overriding

Method Overriding occurs when a child class provides its own implementation of a method that is already defined in the parent class.

In Method Overriding:

- Parent and Child classes contain the same method.
- Method name and parameters remain the same.
- The implementation (definition) changes in the child class.
- The method call is resolved at runtime.

### Example

```java
class Shape {

   public void area() {
       System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {

   public void area(int h, int b) {
       System.out.println((1 / 2) * b * h);
   }
}

class Circle extends Shape {

   public void area(int r) {
       System.out.println((3.14) * r * r);
    }
}
```

> **Note :** Compile Time Polymorphism is achieved using **Method Overloading**, whereas Runtime Polymorphism is achieved using **Method Overriding**.

---

---

# Inheritance

Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically.

In such a way, you can reuse, extend or modify the attributes and behaviors which are defined in other classes.

In Java, the class which inherits the members of another class is called the **Derived Class (Child Class)**, and the class whose members are inherited is called the **Base Class (Parent Class)**.

The derived class is the specialized class for the base class.

---

## Types of Inheritance

1. Single Inheritance
2. Hierarchical Inheritance
3. Multilevel Inheritance
4. Hybrid Inheritance

---

## 1. Single Inheritance

When one class inherits another class, it is known as **Single Inheritance**.

### Example

```java
class Shape {

   public void area() {
       System.out.println("Displays Area of Shape");
   }
}

class Triangle extends Shape {

   public void area(int h, int b) {
       System.out.println((1 / 2) * b * h);
   }
}
```

---

## 2. Hierarchical Inheritance

Hierarchical Inheritance is defined as the process of deriving more than one class from a single base class.

### Example

```java
class Shape {

   public void area() {
       System.out.println("Displays Area of Shape");
   }
}

class Triangle extends Shape {

   public void area(int h, int b) {
       System.out.println((1 / 2) * b * h);
   }
}

class Circle extends Shape {

   public void area(int r) {
       System.out.println((3.14) * r * r);
   }
}
```

---

## 3. Multilevel Inheritance

Multilevel Inheritance is the process of deriving a class from another derived class.

### Example

```java
class Shape {

   public void area() {
       System.out.println("Displays Area of Shape");
   }
}

class Triangle extends Shape {

   public void area(int h, int b) {
       System.out.println((1 / 2) * b * h);
   }
}

class EquilateralTriangle extends Triangle {

   int side;
}
```

---

## 4. Hybrid Inheritance

Hybrid Inheritance is a combination of:

- Single Inheritance
- Multiple Inheritance
- Hierarchical Inheritance

> **Note :** Hybrid Inheritance is **not supported directly through classes in Java** because Java does not support Multiple Inheritance with classes. It can be achieved using **Interfaces**.

---

## Advantages of Inheritance

- Code Reusability
- Reduces Code Duplication
- Easy Maintenance
- Improves Readability
- Supports Method Overriding
- Makes Code More Organized

---

# Package in Java

Package is a group of similar types of classes, interfaces and sub-packages. Packages can be built-in or user defined.

## Types of Packages

1. Built-in Packages
2. User Defined Packages

### Built-in Packages

Some commonly used built-in packages are:

- `java.util`
- `java.io`
- `java.lang`
- `java.net`
- `java.sql`

### Example

```java
import java.util.Scanner;
import java.io.IOException;
```

> **Note :** Packages help organize Java classes and avoid naming conflicts.

---

# Access Modifiers in Java

Access Modifiers define the accessibility (visibility) of classes, variables, methods, and constructors.

There are four types of Access Modifiers in Java.

## 1. Private

- The access level of a private modifier is only within the class.
- It cannot be accessed from outside the class.

## 2. Default

- The access level of a default modifier is only within the package.
- It cannot be accessed from outside the package.
- If no access modifier is specified, Java assigns the default access modifier automatically.

## 3. Protected

- The access level of a protected modifier is within the package.
- It can also be accessed outside the package through inheritance (child class).

## 4. Public

- The access level of a public modifier is everywhere.
- It can be accessed:
  - Within the class
  - Outside the class
  - Within the package
  - Outside the package

### Example

```java
package newpackage;

class Account {

   public String name;
   protected String email;
   private String password;

   public void setPassword(String password) {
       this.password = password;
    }
}

public class Sample {

   public static void main(String args[]) {

       Account a1 = new Account();

       a1.name = "Apna College";
       a1.setPassword("abcd");
       a1.email = "hello@apnacollege.com";
    }
}
```

---

# Encapsulation

Encapsulation is the process of combining data and functions into a single unit called a class.

In Encapsulation:

- Data is not accessed directly.
- Data is accessed through methods present inside the class.
- Variables are generally kept private.
- Getter and Setter methods are used to access and modify the data.

Encapsulation provides **Data Hiding**, which restricts direct access to object members and increases security.

### Advantages of Encapsulation

- Improves security
- Achieves data hiding
- Makes code reusable
- Easy maintenance
- Better flexibility
- Better control over data

> **Data Hiding:** A language feature that restricts direct access to class members using access modifiers such as `private` and `protected`.

# Abstraction

We try to obtain an abstract view, model or structure of a real life problem, and reduce its unnecessary details.

With definition of properties of problems, including the data which are affected and the operations which are identified, the model abstracted from problems can be a standard solution to this type of problems.

It is an efficient way since there are nebulous real-life problems that have similar properties.

In simple terms, **Abstraction is the process of hiding unnecessary implementation details and showing only the essential functionalities to the user.**

## Data Binding

Data Binding is a process of binding the application UI and business logic.

Any change made in the business logic will directly reflect in the application UI.

## Abstraction is achieved in two ways:

1. Abstract Class
2. Interfaces (Pure Abstraction)

---

# Abstract Class

An abstract class must be declared using the `abstract` keyword.

## Properties of Abstract Class

- It can have abstract and non-abstract methods.
- It cannot be instantiated.
- It can have constructors.
- It can have static methods.
- It can have final methods.
- It is mainly used to achieve abstraction.

### Example

```java
abstract class Animal {

   abstract void walk();

   void breathe() {
       System.out.println("This animal breathes air");
    }

   Animal() {
       System.out.println("You are about to create an Animal.");
    }
}

class Horse extends Animal {

   Horse() {
       System.out.println("Wow, you have created a Horse!");
    }

   void walk() {
       System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal {

   Chicken() {
       System.out.println("Wow, you have created a Chicken!");
    }

   void walk() {
       System.out.println("Chicken walks on 2 legs");
    }
}

public class OOPS {

   public static void main(String args[]) {

      Horse horse = new Horse();

      horse.walk();
      horse.breathe();
    }
}
```

> **Note :** An abstract class cannot be instantiated, but its reference can point to the object of its child class.

---

# Interfaces

An Interface is a blueprint of a class that contains only abstract methods (before Java 8).

It is mainly used to achieve **Pure Abstraction**.

## Properties of Interface

- All variables are `public`, `static` and `final` by default.
- All methods are `public` and `abstract` by default.
- A class uses the `implements` keyword to implement an interface.
- One class can implement multiple interfaces.
- Interfaces support Multiple Inheritance in Java.

### Example

```java
interface Animal {

   void walk();
}

class Horse implements Animal {

   public void walk() {
       System.out.println("Horse walks on 4 legs");
    }
}

class Chicken implements Animal {

   public void walk() {
       System.out.println("Chicken walks on 2 legs");
    }
}

public class OOPS {

   public static void main(String args[]) {

      Horse horse = new Horse();

      horse.walk();
    }
}
```

> **Note :** Interfaces are used when multiple classes need to follow the same behavior but may have different implementations.

---

# Static Keyword

The `static` keyword belongs to the class rather than the object.

A static member is shared among all the objects of the class.

## Static can be

- Static Variable (Class Variable)
- Static Method (Class Method)
- Static Block
- Static Nested Class

### Example

```java
class Student {

   static String school;
   String name;
}

public class OOPS {

   public static void main(String args[]) {

       Student.school = "JMV";

       Student s1 = new Student();
       Student s2 = new Student();

       s1.name = "Meena";
       s2.name = "Beena";

       System.out.println(s1.school);
       System.out.println(s2.school);
    }
}
```

## Advantages of Static Keyword

- Memory efficient because static members are shared.
- Can be accessed without creating an object.
- Used for common properties like college name, company name, school name, etc.

> **Note :** A static method can directly access only static members. To access non-static members, an object must be created.

---

# OOPS Concepts Summary

The four pillars of Object-Oriented Programming are:

1. Encapsulation
2. Abstraction
3. Inheritance
4. Polymorphism

These concepts help in developing software that is:

- Reusable
- Secure
- Scalable
- Easy to Maintain
- Flexible
- Modular

---

*Learning in Public – Arpit Dhiman*