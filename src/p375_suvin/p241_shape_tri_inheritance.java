//241) Create a base class "Shape" with properties (type, color) and a subclass "Triangle" with additional properties (base, height). Write a program to demonstrate inheritance.

package p375_suvin;

class Shape {
    String type, color;
    void showS() { System.out.println("Type: " + type + ", Color: " + color); }
}

class Triangle extends Shape {
    double base, height;
    void showT() { System.out.println("Base: " + base + ", Height: " + height); }
}

public class p241_shape_tri_inheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.type = "Triangle";
        t.color = "Green";
        t.base = 10;
        t.height = 15;
        t.showS();
        t.showT();
    }
}

//output
//Type: Triangle, Color: Green
//Base: 10.0, Height: 15.0
