package TwoDShapes;

public class Triangle extends TwoDShape {
    private String style;

    //Constructors
    public Triangle(){
        super();
        style = "none";
    }

    public Triangle(String s, double w, double l){
        super(w, l, "triangle");
        style = s;
    }

    public Triangle(double same){
        super(same, "triangle");
        style = "none";
    }

    public Triangle(Triangle ob){
        super(ob);
        style = ob.style;
    }

    //Get&Set Methods
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    //Methods
    @Override
    public double area(){
        return getWidth() * getLength() / 2;
    }

    public void showStyle(){
        System.out.println("Style of this figure is: " + style);
    }
}
