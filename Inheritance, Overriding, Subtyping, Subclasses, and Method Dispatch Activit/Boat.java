package InheritanceAndOverriding;

/*
 * Name: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: CCOBJPGL
 * Date: May 22, 2023
 */

// Derived class: Boat (Subclass of Vehicle)
class Boat extends Vehicle {
    private String mainSailColor;

    // Constructor to Initialize the Speed, Color, Price, and Main Sail Color of the Boat
    public Boat(double speed, String color, double price, String mainSailColor) {
        super(speed, color, price);
        this.mainSailColor = mainSailColor;
    }

    // Method to Stop the Boat
    @Override
    public void stop() {
        System.out.println("The Boat is Stopping.");
    }

    // Method to Get the Main Sail Color of the Boat
    public String getMainSailColor() {
        return mainSailColor;
    }
}
