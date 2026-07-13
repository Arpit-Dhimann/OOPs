class Pen {
    String color;
    String type; 
    
    // Method to display the specifications of the Pen
    public void specification() {
        System.out.println("The color of Pen is " + color);
        System.out.println("The type of Pen is " + type);
    }
}

public class BasicClassAndObject {
    public static void main(String[] args) {
        // Creating a new object of the Pen class
        Pen pen = new Pen();
        
        // Initializing the object's properties
        pen.color = "BLUE";
        pen.type = "GEL";

        // Calling the method to print pen details
        pen.specification();
    }
}