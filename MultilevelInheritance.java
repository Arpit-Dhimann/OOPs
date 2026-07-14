class Shape {
    // Base class
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {
    // Derived from Shape
    public void area(int h, int b) {
        System.out.println("Area of Triangle is: " + (0.5 * b * h));
    }  
}

class EquilateralTriangle extends Triangle {
    // Derived from Triangle (Multilevel Inheritance)
    int side;
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // Creating an object of the most derived class
        EquilateralTriangle et1 = new EquilateralTriangle();

        // Accessing methods from both parent classes
        et1.area();          // Inherited from Shape
        et1.area(10, 5);    // Inherited from Triangle
    }
}