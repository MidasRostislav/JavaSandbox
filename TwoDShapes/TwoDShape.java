package TwoDShapes;

abstract public class TwoDShape {
    private double width, length;
    private String name;

    //Constructors
    protected TwoDShape(){
        width = length = 0.0;
        name = "none";
    }

    protected TwoDShape(double w, double l, String n){
        width = w;
        length = l;
        name = n;
    }

    protected TwoDShape(double same, String n){
        width = length = same;
        name = n;
    }

    protected TwoDShape(TwoDShape ob){
        width = ob.width;
        length = ob.length;
        name = ob.name;
    }

    //Get&Set methods
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methods
    void showDim(){
        System.out.println("Name is: " + name + " Width is: " + width + " Length is: " + length);
    }

    abstract public double area();

}
