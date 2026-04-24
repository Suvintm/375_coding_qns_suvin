//235) Create a base class "Shape" with methods to calculate area and perimeter. Derive classes "Circle" and "Rectangle" from it and override the methods. Write a program to demonstrate inheritance.

package p375_suvin;

class ShapeI {
    double calculateArea() { return 0; }
    double calculatePerimeter() { return 0; }
}

class CircleI extends ShapeI {
    double r;
    CircleI(double r) { this.r = r; }
    @Override
    double calculateArea() { return Math.PI * r * r; }
}

class RectangleI extends ShapeI {
    double l, w;
    RectangleI(double l, double w) { this.l = l; this.w = w; }
    @Override
    double calculateArea() { return l * w; }
}

public class p235_shape_inheritance {
    public static void main(String[] args) {
        ShapeI s1 = new CircleI(5);
        ShapeI s2 = new RectangleI(10, 5);
        System.out.println("Circle Area: " + String.format("%.2f", s1.calculateArea()));
        System.out.println("Rectangle Area: " + s2.calculateArea());
    }
}

//output
//Circle Area: 78.54
//Rectangle Area: 50.0
