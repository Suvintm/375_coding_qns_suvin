//184) Write a program to find the area of a triangle using a static method.

package p375_suvin;

public class p184_static_area_triangle {
    static double area(double b, double h) {
        return 0.5 * b * h;
    }

    public static void main(String[] args) {
        System.out.println("Area of triangle (b=10, h=5): " + area(10, 5));
    }
}

//output
//Area of triangle (b=10, h=5): 25.0
