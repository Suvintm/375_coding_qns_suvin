//162) Create a class representing a rectangle with private member variables (length, width, area) and public methods (getters and setters).

package p375_suvin;

class Rectangle {
    private double length;
    private double width;
    private double area;

    public void setDimensions(double l, double w) {
        length = l;
        width = w;
        area = l * w;
    }
    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double getArea() { return area; }
}

public class p162_rectangle_encap {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setDimensions(10, 5);
        System.out.println("Rectangle: " + r.getLength() + "x" + r.getWidth() + ", Area: " + r.getArea());
    }
}

//output
//Rectangle: 10.0x5.0, Area: 50.0
