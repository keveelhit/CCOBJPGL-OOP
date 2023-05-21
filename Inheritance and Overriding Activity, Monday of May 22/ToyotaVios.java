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

    public ToyotaVios(double speed, String color, double price, int numDoors, String tireType) {
        super(speed, color, price, numDoors);
        this.tireType = tireType;
    }

    @Override
    public void stop() {
        System.out.println("Toyota Vios is stopping.");
    }

    public void drive() {
        System.out.println("Toyota Vios is driving.");
    }

    public String getTireType() {
        return tireType;
    }
}
