package InheritanceAndOverriding;

/*
 * Name: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: CCOBJPGL
 * Date: May 22, 2023
 */

// Subclass of Plane: U2SpyPlane
class U2SpyPlane extends Plane {
    private String model;

    // Constructor to Initialize the Speed, Color, Price, Wingspan, and Model of the U-2 Spy Plane
    public U2SpyPlane(double speed, String color, double price, double wingspan, String model) {
        super(speed, color, price, wingspan);
        this.model = model;
    }

    // Method to Stop the U-2 Spy Plane
    @Override
    public void stop() {
        System.out.println("A U-2 Spy Plane is Stopping.");
    }

    // Method to Fly the U-2 Spy Plane
    public void fly() {
        System.out.println("A U-2 Spy Plane is Flying.");
    }

    // Method to Get the Model of the U-2 Spy Plane
    public String getModel() {
        return model;
    }
}
