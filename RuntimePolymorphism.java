class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {
    // Method to calculate area of triangle
    public void area(int h, int b) {
        System.out.println("Area of Triangle is: " + (0.5 * b * h));
    }  
}

class Circle extends Shape {
    // Method to calculate area of circle
    public void area(int r) {
        System.out.println("Area of Circle is: " + (3.14 * r * r));
    }  
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // Creating objects
        Triangle t1 = new Triangle();
        Circle c1 = new Circle();

        // Calling methods
        t1.area(); // Inherited from Shape
        t1.area(10, 5); // Overloaded in Triangle

        System.out.println();

        c1.area(); // Inherited from Shape
        c1.area(7); // Overloaded in Circle
    }
}