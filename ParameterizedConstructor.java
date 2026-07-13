class Student {
    String Name;
    int Age;

    //This METHOD prints the student's name and age.
    public void printInfo() {
        System.out.println("Student name is : " + Name);
        System.out.println("Student age is : " + Age);
        System.out.println();
    }

    /* Parameterized Constructor 
    -> This constructor is called automatically when a new object is created. */
    Student(String name , int age) {
        this.Name = name;
        this.Age = age;
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Creating the first student object
        Student S1 = new Student("ARPIT DHIMAN" , 19);
        S1.printInfo();

        // Creating the second student object
        Student S2 = new Student("XYZ" , 19);
        S2.printInfo();
    }
}
