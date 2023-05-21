package InheritanceAndOverriding;

/*
 * Name: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: CCOBJPGL
 * Date: May 22, 2023
 */

// Derived Class: Car
class Car extends Vehicle {
    private int numDoors;

    public Car(double speed, String color, double price, int numDoors) {
        super(speed, color, price);
        this.numDoors = numDoors;
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    public int getNumDoors() {
        return numDoors;
    }
}
