package Vehicle;

public class Vehicle implements IVehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    //Constructors
    public Vehicle(){}

    public Vehicle(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Get&Set Methods
    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    //Methods
    public int range(){
        return fuelcap * mpg;
    }

    public double fuelNeeded(int miles){
        return (double) miles/mpg;
    }
}

