//249) Write a program to demonstrate inheritance by creating objects of both classes and accessing properties. (Shape/Rectangle)

package p375_suvin;

public class p249_shape_rect_demo {
    public static void main(String[] args) {
        class Shape { String type = "Rectangle"; }
        class Rectangle extends Shape { double area = 50.0; }
        
        Rectangle r = new Rectangle();
        System.out.println("Type: " + r.type + ", Area: " + r.area);
    }
}

//output
//Type: Rectangle, Area: 50.0
