class Shape {
    // Base class method
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {
    // Derived class method
    public void area(int h, int b) {
        // Using 0.5 to ensure decimal calculation instead of integer division
        System.out.println("Area of Triangle is: " + (0.5 * b * h));
    }  
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Creating an object of the derived class
        Triangle t1 = new Triangle();        
        
        t1.area();       // Calling the method inherited from the base class        
        t1.area(10, 5); // Calling the method defined in the derived class
    }
}