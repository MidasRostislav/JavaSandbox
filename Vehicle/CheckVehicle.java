package Vehicle;

public class CheckVehicle {
    public static void truckCheck_Ex7_1() {
        Truck pickup = new Truck(1, 2, 3, 4);
        Truck defaultTruck = new Truck();
        System.out.println(pickup.fuelNeeded(180) + "   " + defaultTruck.getPassengers());

    }
}
