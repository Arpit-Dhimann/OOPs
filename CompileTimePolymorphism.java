class Student {
    String name;
    int age;

    // Method overloading based on parameter type and count
    public void displayInfo(String name) {
        System.out.println("Student Name: " + name);
    }

    public void displayInfo(int age) {
        System.out.println("Student Age: " + age);
    }

    public void displayInfo(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Calling overloaded methods
        s1.displayInfo("ARPIT DHIMAN");     // Calls method with String parameter
        s1.displayInfo(19);                 // Calls method with int parameter
        s1.displayInfo("ARPIT DHIMAN", 19); // Calls method with both parameters
    }
}