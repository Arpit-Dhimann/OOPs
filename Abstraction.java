abstract class Vehicle {
    
    // Abstract method: Every vehicle must implement this, but the implementation differs
    abstract void start();
    
    // Regular method: A common feature shared by all vehicles
    void fuelType() {
        System.out.println("This vehicle uses fuel to run.");
    }
    
    // Constructor: Called whenever a subclass object is created
    Vehicle() {
        System.out.println("You are creating a Vehicle.");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("You have created a Car!");
    }
    
    // Providing implementation for the abstract method
    void start() {
        System.out.println("Car starts with a key/button.");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle() {
        System.out.println("You have created a Motorcycle!");
    }
    
    // Providing implementation for the abstract method
    void start() {
        System.out.println("Motorcycle starts with a kick/self-start.");
    }
}

public class Abstraction {
    public static void main(String args[]) {
        // Creating an object of the Car class
        Car myCar = new Car();
        myCar.start();
        myCar.fuelType();
        System.out.println();

        // Creating an object of the Motorcycle class
        Motorcycle myBike = new Motorcycle();
        myBike.start();
        myBike.fuelType();
    }
}