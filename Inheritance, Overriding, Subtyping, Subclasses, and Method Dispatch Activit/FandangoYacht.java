package InheritanceAndOverriding;

/*
 * Name: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: CCOBJPGL
 * Date: May 22, 2023
 */

// Subclass of Boat: FandangoYacht
class FandangoYacht extends Boat {
    private String yachtColor;

    // Constructor to Initialize the Speed, Color, Price, Main Sail Color, and Yacht Color of the Fandango Yacht
    public FandangoYacht(double speed, String color, double price, String mainSailColor, String yachtColor) {
        super(speed, color, price, mainSailColor);
        this.yachtColor = yachtColor;
    }

    // Method to Stop the Fandango Yacht
    @Override
    public void stop() {
        System.out.println("The Fandango Yacht is stopping.");
    }

    // Method to Float the Fandango Yacht
    public void floatYacht() {
        System.out.println("The Fandango Yacht is floating.");
    }

    // Method to Get the Yacht Color of the Fandango Yacht
    public String getYachtColor() {
        return yachtColor;
    }
}
