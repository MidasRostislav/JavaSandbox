import java.util.regex.Pattern;

public class WritingMaterials {
    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;

    // Constructors

    WritingMaterials(){
    }

    WritingMaterials(String name, String color){
        this.name = name;
        this.color = color;
    }

    WritingMaterials(String name, int price){
        this.name = name;
        this.price = price;
        color = "No Color";
    }

    WritingMaterials(int price, double length, boolean draw){
        this.price = price;
        this.length = length;
        this.draw = draw;
        name = "No Name";
        color = "No Color";
    }

    WritingMaterials(String name, String color, int price, double length, boolean draw){
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }
    // Get and Set methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }


    // Methods

    public void display(){
        System.out.println("Name: " + name + " Color: " + color + " Length: " + length + " Price: " + price
                           + " Is draw: " + (draw ? "Yes" : "No"));
        System.out.println();
    }

    public void replace_rod(String color){
        this.color = color;
    }

    public void priceUp(int delha){
        price += delha;
    }

    public void priceDown(int delta){
        price -= delta;
    }

    public void draw(){
        if(draw)
            System.out.println(name + " draws a line. Line has " + color + " color\n");
        else
            System.out.println(name + " can not draw\n");
    }
}
