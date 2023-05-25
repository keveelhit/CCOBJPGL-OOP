package InheritanceAndOverriding;

/*
 * Name: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: CCOBJPGL
 * Date: May 22, 2023
 */

// Base class: Vehicle
class Vehicle {
    private double speed;
    private String color;
    private double price;

    // Constructor to initialize the speed, color, and price of the vehicle
    public Vehicle(double speed, String color, double price) {
        this.speed = speed;
        this.color = color;
        this.price = price;
    }

    // Method to stop the vehicle
    public void stop() {
        System.out.println("Vehicle is Stopping.");
    }

    // Method to get the speed of the vehicle
    public double getSpeed() {
        return speed;
    }

    // Method to get the color of the vehicle
    public String getColor() {
        return color;
    }

    // Method to get the price of the vehicle
    public double getPrice() {
        return price;
    }
}

