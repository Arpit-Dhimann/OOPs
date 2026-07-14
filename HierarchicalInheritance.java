class Shape {
    // Base class
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Square extends Shape {
    // Derived class 1: Square area calculation
    public void area(int side) {
        System.out.println("Area of Square is: " + (side * side));
    }  
}

class Rectangle extends Shape {
    // Derived class 2: Rectangle area calculation
    public void area(int length, int width) {
        System.out.println("Area of Rectangle is: " + (length * width));
    }  
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Creating objects for both derived classes
        Square s1 = new Square();
        Rectangle r1 = new Rectangle();

        s1.area(4); // Calling method from Square class
        r1.area(5, 10); // Calling method from Rectangle class                
        s1.area(); // Calling method inherited from the base Shape class
    }
}