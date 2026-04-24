//206) Write an abstract class "Shape" with abstract methods "calculateArea" and "calculatePerimeter". Implement it in subclasses "Triangle" and "Circle".

package p375_suvin;

abstract class ShapeV2 {
    abstract double calculateArea();
}

class TriangleV extends ShapeV2 {
    double b, h;
    TriangleV(double b, double h) { this.b = b; this.h = h; }
    double calculateArea() { return 0.5 * b * h; }
}

class CircleV extends ShapeV2 {
    double r;
    CircleV(double r) { this.r = r; }
    double calculateArea() { return Math.PI * r * r; }
}

public class p206_abs_shape_v2 {
    public static void main(String[] args) {
        ShapeV2 t = new TriangleV(10, 5);
        ShapeV2 c = new CircleV(7);
        System.out.println("Triangle Area: " + t.calculateArea());
        System.out.println("Circle Area: " + String.format("%.2f", c.calculateArea()));
    }
}

//output
//Triangle Area: 25.0
//Circle Area: 153.94
