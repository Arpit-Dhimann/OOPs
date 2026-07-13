class Student {
    String name;
    String age;

    // Method to display student information
    public void getInfo() {
        // System.out prints to standard output
        System.out.println("The name of this Student is : " + this.name);
        // System.err prints to error output (usually appears in red)
        System.err.println("The age of this Student is : " + this.age);
    }
}

public class UsingThisKeyword {
    public static void main(String[] args) {
        // Creating the first student object
        Student S1 = new Student();
        S1.name = "Arpit Dhiman";
        S1.age = "19";
        
        // Calling method for S1
        S1.getInfo();

        // Printing an empty line for better formatting
        System.out.println();

        // Creating the second student object
        Student S2 = new Student();
        S2.name = "XYZ";
        S2.age = "19";
        
        // Calling method for S2
        S2.getInfo();
    }
}