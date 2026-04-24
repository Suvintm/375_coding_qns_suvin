//248) Create a base class "Shape" with properties (type, color) and a subclass "Rectangle" with additional properties (length, width).

package p375_suvin;

class ShapeV23 {
    String type, color;
}

class RectangleV23 extends ShapeV23 {
    double l, w;
}

public class p248_shape_rect_classes {
    public static void main(String[] args) {
        System.out.println("Shape and Rectangle classes created.");
    }
}

//output
//Shape and Rectangle classes created.
