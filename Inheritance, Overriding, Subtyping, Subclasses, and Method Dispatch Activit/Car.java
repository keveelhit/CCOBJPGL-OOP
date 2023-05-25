package InheritanceAndOverriding;

/*
 * Name: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: CCOBJPGL
 * Date: May 22, 2023
 */

// Derived Class: Car (Subclass of Vehicle)
class Car extends Vehicle {
    private int numDoors;

    // Constructor to Initialize the Speed, Color, Price, and Number of Doors of the Car
    public Car(double speed, String color, double price, int numDoors) {
        super(speed, color, price);
        this.numDoors = numDoors;
    }

    // Method to Stop the Car
    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    // Method to Get the Number of Doors of the Car
    public int getNumDoors() {
        return numDoors;
    }
}
