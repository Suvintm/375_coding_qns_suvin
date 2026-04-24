//188) Write a program to find the area of a rectangle using a static method.

package p375_suvin;

public class p188_static_area_rectangle {
    static double area(double l, double w) {
        return l * w;
    }

    public static void main(String[] args) {
        System.out.println("Area of rectangle (12x8): " + area(12, 8));
    }
}

//output
//Area of rectangle (12x8): 96.0
