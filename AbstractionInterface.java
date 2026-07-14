interface Vehicle {
    void start();
    void fuelType();
}

class Car implements Vehicle {
    
    // Providing implementation for start()
    public void start() {
        System.out.println("Car starts with a key/button.");
    }
    
    // Providing implementation for fuelType()
    public void fuelType() {
        System.out.println("Car uses petrol/diesel.");
    }
}

class Motorcycle implements Vehicle {
    
    // Providing implementation for start()
    public void start() {
        System.out.println("Motorcycle starts with a kick/self-start.");
    }
    
    // Providing implementation for fuelType()
    public void fuelType() {
        System.out.println("Motorcycle uses petrol.");
    }
}

public class AbstractionInterface {
    public static void main(String args[]) {
        // Creating an object of the Car class
        Car myCar = new Car();
        myCar.start();
        myCar.fuelType();
        
        System.out.println();

        // Creating an object of the Motorcycle class
        Motorcycle mybike = new Motorcycle();
        mybike.start();
        mybike.fuelType();
    }
}