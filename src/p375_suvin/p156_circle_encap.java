//156) Create a class representing a circle with private member variables (radius, area, circumference) and public methods (getters and setters).

package p375_suvin;

class Circle {
    private double radius;
    private double area;
    private double circumference;

    public void setRadius(double r) {
        radius = r;
        area = Math.PI * r * r;
        circumference = 2 * Math.PI * r;
    }
    public double getRadius() { return radius; }
    public double getArea() { return area; }
    public double getCircumference() { return circumference; }
}

public class p156_circle_encap {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + String.format("%.2f", c.getArea()));
        System.out.println("Circumference: " + String.format("%.2f", c.getCircumference()));
    }
}

//output
//Radius: 5.0
//Area: 78.54
//Circumference: 31.42
