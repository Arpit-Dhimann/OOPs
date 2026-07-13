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

*Learning in public – Arpit Dhiman*