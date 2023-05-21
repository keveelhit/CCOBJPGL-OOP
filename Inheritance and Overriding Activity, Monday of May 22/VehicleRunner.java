package InheritanceAndOverriding;

/*
 * Name: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: CCOBJPGL
 * Date: May 22, 2023
 */

public class VehicleRunner {
    public static void main(String[] args) {
        System.out.println(); 
        Vehicle vehicle = new Vehicle(120.0, "Black", 1005000.0);
        System.out.println("Vehicle speed: " + vehicle.getSpeed() + " kmph");
        System.out.println("Vehicle color: " + vehicle.getColor());
        System.out.println("Vehicle price: " + vehicle.getPrice());
        vehicle.stop();
        System.out.println();

        System.out.println();
        Car car = new Car(150.0, "Yellow", 886000.0, 4);
        System.out.println("Car speed: " + car.getSpeed() + " kmph");
        System.out.println("Car color: " + car.getColor());
        System.out.println("Car price: " + car.getPrice());
        System.out.println("Number of doors: " + car.getNumDoors());
        car.stop();
        System.out.println();

        ToyotaVios toyotaVios = new ToyotaVios(170.0, "White", 706000.0, 4, "Radial");
        System.out.println("Toyota Vios speed: " + toyotaVios.getSpeed() + " kmph");
        System.out.println("Toyota Vios color: " + toyotaVios.getColor());
        System.out.println("Toyota Vios price: " + toyotaVios.getPrice());
        System.out.println("Number of doors: " + toyotaVios.getNumDoors());
        System.out.println("Tire type: " + toyotaVios.getTireType());
        toyotaVios.stop();
        toyotaVios.drive();
        System.out.println();
    }
}
