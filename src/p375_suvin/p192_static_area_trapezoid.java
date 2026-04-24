//192) Write a program to find the area of a trapezoid using a static method.

package p375_suvin;

public class p192_static_area_trapezoid {
    static double area(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }

    public static void main(String[] args) {
        System.out.println("Area of trapezoid (a=6, b=10, h=5): " + area(6, 10, 5));
    }
}

//output
//Area of trapezoid (a=6, b=10, h=5): 40.0
