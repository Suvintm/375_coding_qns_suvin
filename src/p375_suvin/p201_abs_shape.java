//201) Write an abstract class "Shape" with abstract methods "calculateArea" and "calculatePerimeter". Implement it in subclasses "Circle" and "Rectangle".

package p375_suvin;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    double calculateArea() { return Math.PI * r * r; }
    double calculatePerimeter() { return 2 * Math.PI * r; }
}

class Rectangle extends Shape {
    double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w; }
    double calculateArea() { return l * w; }
    double calculatePerimeter() { return 2 * (l + w); }
}

public class p201_abs_shape {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(10, 5);
        System.out.println("Circle Area: " + String.format("%.2f", c.calculateArea()));
        System.out.println("Rectangle Perimeter: " + r.calculatePerimeter());
    }
}

//output
//Circle Area: 78.54
//Rectangle Perimeter: 30.0
