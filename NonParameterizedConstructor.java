class Student {
    String name;
    int age;

    // Method to print the student's details
    public void printInfo() {
        System.out.println("Student name is : " + name);
        System.out.println("Student age is : " + age);
        System.out.println();
    }

    /* Non-Parameterized Constructor 
    -> This constructor is called automatically when a new object is created. */
    Student() {
        System.out.println("Constructor called for a new student!");
    }
}

public class NonParameterizedConstructor {
    public static void main(String[] args) {
        // Creating the first student object
        Student S1 = new Student();
        S1.name = "ARPIT DHIMAN";
        S1.age = 19;
        S1.printInfo();

        // Creating the second student object
        Student S2 = new Student();
        S2.name = "XYZ";
        S2.age = 19;
        S2.printInfo();
    }
}
