//228) Write an abstract class "Shape" with abstract methods "calculateArea" and "calculatePerimeter". Implement it in subclasses "Rectangle" and "Square".

package p375_suvin;

abstract class ShapeV3 {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class SquareV3 extends ShapeV3 {
    double s;
    SquareV3(double s) { this.s = s; }
    double calculateArea() { return s * s; }
    double calculatePerimeter() { return 4 * s; }
}

public class p228_shape_rect_sq_abs {
    public static void main(String[] args) {
        ShapeV3 s = new SquareV3(5);
        System.out.println("Square Area: " + s.calculateArea());
        System.out.println("Square Perimeter: " + s.calculatePerimeter());
    }
}

//output
//Square Area: 25.0
//Square Perimeter: 20.0
