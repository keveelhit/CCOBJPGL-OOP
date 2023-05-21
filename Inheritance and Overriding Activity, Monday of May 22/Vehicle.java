package InheritanceAndOverriding;

/*
 * Name: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: CCOBJPGL
 * Date: May 22, 2023
 */

// Base Class: Vehicle
class Vehicle {
    private double speed;
    private String color;
    private double price;

    public Vehicle(double speed, String color, double price) {
        this.speed = speed;
        this.color = color;
        this.price = price;
    }

    public void stop() {
        System.out.println("Vehicle is stopping.");
    }

    public double getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}


