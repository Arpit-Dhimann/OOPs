class Pen {
    String color;
    String type;

    // Method to display the specifications of the Pen
    public void specification(String penName) {
        System.out.println("Detail for : " + penName);
        System.out.println("the color of Pen is " + color);
        System.out.println("the type of Pen is " + type);
    }
}

public class MethodsInClass {
    public static void main(String[] args) {
        // Creating the first Pen object and initializing its properties
        Pen pen1 = new Pen();
        pen1.color = "BLUE";
        pen1.type = "GEL";

        // Creating the second Pen object and initializing its properties
        Pen pen2 = new Pen();
        pen2.color = "BLACK";
        pen2.type = "BALLPOINT";

        // Calling the specification method for both objects
        pen1.specification("pen1");
        
        // Printing an empty line to separate the output of the two objects
        System.out.println();
        
        pen2.specification("pen2");
    }   
}