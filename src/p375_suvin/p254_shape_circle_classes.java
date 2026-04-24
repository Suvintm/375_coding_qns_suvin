//254) Create a base class "Shape" with properties (type, color) and a subclass "Circle" with additional properties (radius, area).

package p375_suvin;

class ShapeV29 {
    String type, color;
}

class CircleV29 extends ShapeV29 {
    double radius, area;
}

public class p254_shape_circle_classes {
    public static void main(String[] args) {
        System.out.println("Shape and Circle classes created.");
    }
}

//output
//Shape and Circle classes created.
