package InheritanceAndOverriding;

/*
 * Name: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: CCOBJPGL
 * Date: May 22, 2023
 */

// Derived class: Plane (Subclass of Vehicle)
class Plane extends Vehicle {
    private double wingspan;

    // Constructor to Initialize the Speed, Color, Price, and Wingspan of the Plane
    public Plane(double speed, String color, double price, double wingspan) {
        super(speed, color, price);
        this.wingspan = wingspan;
    }

    // Method to Stop the Plane
    @Override
    public void stop() {
        System.out.println("Plane is Stopping.");
    }

    // Method to Get the Wingspan of the Plane
    public double getWingspan() {
        return wingspan;
    }
}
