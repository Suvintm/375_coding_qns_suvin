//128) Write a program to find the area of a rectangle.

package p375_suvin;

public class p128_area_rectangle_overload {
    public static double area(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("Area of rectangle (10.0 x 5.0): " + area(10.0, 5.0));
    }
}

//output
//Area of rectangle (10.0 x 5.0): 50.0
