package Vehicle;

public interface IVehicle {
    //Get&Set Methods
    public int getPassengers();
    public void setPassengers(int passengers);
    public int getFuelcap();
    public void setFuelcap(int fuelcap);
    public int getMpg();
    public void setMpg(int mpg);

    //Methods
    int range();
    double fuelNeeded(int miles);
}
