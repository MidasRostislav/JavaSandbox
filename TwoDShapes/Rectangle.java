package TwoDShapes;

public class Rectangle  extends TwoDShape {

    //Constructors
    public Rectangle(){
        super();
    }

    public Rectangle(double w, double l){
        super(w,l,"rectangle");
    }

    public Rectangle(double same){
        super(same, "square");
    }

    public Rectangle(Rectangle ob){
        super(ob);
    }

    //Methods
    @Override
    public double area(){
        return getLength() * getWidth();
    }

    public boolean isSquare(){
        return getWidth() == getLength();
    }
}
