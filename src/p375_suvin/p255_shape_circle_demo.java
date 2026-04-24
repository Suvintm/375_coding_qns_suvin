//255) Write a program to demonstrate inheritance by creating objects of both classes and accessing properties. (Shape/Circle)

package p375_suvin;

public class p255_shape_circle_demo {
    public static void main(String[] args) {
        class Shape { String type = "Circle"; String color = "Red"; }
        class Circle extends Shape { double radius = 7.0; }
        
        Circle c = new Circle();
        System.out.println("Type: " + c.type + ", Color: " + c.color + ", Radius: " + c.radius);
    }
}

//output
//Type: Circle, Color: Red, Radius: 7.0
