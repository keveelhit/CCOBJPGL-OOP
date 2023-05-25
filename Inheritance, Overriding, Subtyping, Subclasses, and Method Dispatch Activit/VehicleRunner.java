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

         // Create a ToyotaVios Object
        ToyotaVios toyotaVios = new ToyotaVios(170.0, "Yellow", 706000.0, 4, "Radial");
        System.out.println("Toyota Vios speed: " + toyotaVios.getSpeed() + " kmph");
        System.out.println("Toyota Vios color: " + toyotaVios.getColor());
        System.out.println("Toyota Vios price: " + toyotaVios.getPrice());
        System.out.println("Number of doors: " + toyotaVios.getNumDoors());
        System.out.println("Tire type: " + toyotaVios.getTireType());
        toyotaVios.stop();
        toyotaVios.drive();
        System.out.println();

        // Create a U2SpyPlane Object
        U2SpyPlane u2SpyPlane = new U2SpyPlane(1500.0, "Red", 10000000.0, 80.0, "U-2");
        System.out.println("U2 Spy Plane speed: " + u2SpyPlane.getSpeed());
        System.out.println("U2 Spy Plane color: " + u2SpyPlane.getColor());
        System.out.println("U2 Spy Plane price: " + u2SpyPlane.getPrice());
        System.out.println("Wingspan: " + u2SpyPlane.getWingspan());
        System.out.println("Model: " + u2SpyPlane.getModel());
        u2SpyPlane.stop();
        u2SpyPlane.fly();
        System.out.println();

        // Create a FandangoYacht Object
        FandangoYacht fandangoYacht = new FandangoYacht(10.0, "Blue", 8000000.0, "White", "Gray");
        System.out.println("Fandango Yacht speed: " + fandangoYacht.getSpeed());
        System.out.println("Fandango Yacht color: " + fandangoYacht.getColor());
        System.out.println("Fandango Yacht price: " + fandangoYacht.getPrice());
        System.out.println("Main sail color: " + fandangoYacht.getMainSailColor());
        System.out.println("Yacht color: " + fandangoYacht.getYachtColor());
        fandangoYacht.stop();
        fandangoYacht.floatYacht();
        System.out.println();

    }
}
