//231) Write an abstract class "Shape" with abstract methods "calculateArea" and "calculatePerimeter". Implement it in subclasses "Triangle" and "Circle".

package p375_suvin;

abstract class ShapeV4 {
    abstract double calculateArea();
}

class CircleV4 extends ShapeV4 {
    double r;
    CircleV4(double r) { this.r = r; }
    double calculateArea() { return Math.PI * r * r; }
}

public class p231_shape_tri_circ_abs {
    public static void main(String[] args) {
        ShapeV4 s = new CircleV4(10);
        System.out.println("Circle Area: " + String.format("%.2f", s.calculateArea()));
    }
}

//output
//Circle Area: 314.16
