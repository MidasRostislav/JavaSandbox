package Vehicle;


public class Truck extends Vehicle {
    private int cargocap;

    //Constructors
    public Truck(){
        cargocap = 0;
    }

    public Truck(int p, int f, int m, int c){
        super(p, f, m);
        cargocap = c;
    }

    //Get&Set Methods
    public int getCargocap() {
        return cargocap;
    }

    public void setCargocap(int cargocap) {
        this.cargocap = cargocap;
    }

    //Methods
}
