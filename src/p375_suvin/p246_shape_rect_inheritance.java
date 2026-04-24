//246) Create a base class "Shape" with properties (type, color) and a subclass "Rectangle" with additional properties (length, width). Write a program to demonstrate inheritance.

package p375_suvin;

class ShapeV5 {
    String type, color;
    void showS() { System.out.println("Shape: " + type + ", Color: " + color); }
}

class RectangleV5 extends ShapeV5 {
    double l, w;
    void showR() { System.out.println("Dim: " + l + "x" + w); }
}

public class p246_shape_rect_inheritance {
    public static void main(String[] args) {
        RectangleV5 r = new RectangleV5();
        r.type = "Rectangle";
        r.color = "Blue";
        r.l = 20;
        r.w = 10;
        r.showS();
        r.showR();
    }
}

//output
//Shape: Rectangle, Color: Blue
//Dim: 20.0x10.0
