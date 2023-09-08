package TwoDShapes;

public class Circle extends TwoDShape {

    final double PI = 3.14;

    //Constructors
    public Circle() {
        super();
    }

    public Circle(double radius){
        super(radius, "circle");
    }

    public Circle(Circle ob){
        super(ob);
    }

    //Methods
    @Override
    public double area(){
        return Math.pow(getWidth() / 2, 2) * PI;
    }
}
