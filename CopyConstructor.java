class Student {
    String name;
    int age;

    // Method to print the student's details
    public void printInfo(String student) {
        System.out.println(student);
        System.out.println("Student name is : " + name);
        System.out.println("Student age is : " + age);
    } 

    // Copy Constructor
    // Takes an existing Student object and copies its values into the new one
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    // Default Constructor (Non-Parameterized)
    Student() {
        // Empty constructor
    }

}

public class CopyConstructor {
    public static void main(String[] args) {
        // Create the first student object and initialize it
        Student s1 = new Student();
        s1.name = "ARPIT DHIMAN";
        s1.age = 19;

        // Use the Copy Constructor to create s2 as a copy of s1
        Student s2 = new Student(s1);
        
        // Print the details of the copied student (s2)
        s2.printInfo("Print for Student s2 (Copied from s1):");
    }    
}