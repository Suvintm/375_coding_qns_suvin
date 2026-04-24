//145) Write a program to find the area of a trapezoid.

package p375_suvin;

public class p145_area_trapezoid {
    public static double area(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }

    public static void main(String[] args) {
        System.out.println("Area of trapezoid (a=5, b=7, h=10): " + area(5, 7, 10));
    }
}

//output
//Area of trapezoid (a=5, b=7, h=10): 60.0
