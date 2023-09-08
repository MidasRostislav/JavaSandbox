package TwoDShapes;

public class ShapesDemo {
    public static void shapeClassCheck() {
        TwoDShape[] shapes = new TwoDShape[4];

        shapes[0] = new Triangle("Plane", 8.0, 12.0);
        shapes[1] = new Rectangle(10.0);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);

        for (TwoDShape ob : shapes) {
            System.out.println("Object: " + ob.getName());
            System.out.println("Area: " + ob.area());
            System.out.println();
        }


    }
}
