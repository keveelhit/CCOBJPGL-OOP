package InheritanceAndOverriding;

/*
 * Name: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: CCOBJPGL
 * Date: May 22, 2023
 */

// Subclass of Car: ToyotaVios 
class ToyotaVios extends Car {
    private String tireType;

    // Constructor to Initialize the Speed, Color, Price, Number of Doors, and Tire Type of the Toyota Vios
    public ToyotaVios(double speed, String color, double price, int numDoors, String tireType) {
        super(speed, color, price, numDoors);
        this.tireType = tireType;
    }

    // Method to Stop the Toyota Vios
    @Override
    public void stop() {
        System.out.println("Toyota Vios is Stopping.");
    }

    // Method to Drive the Toyota Vios
    public void drive() {
        System.out.println("Toyota Vios is Driving.");
    }

    // Method to Get the Tire Type of the Toyota Vios
    public String getTireType() {
        return tireType;
    }
}
