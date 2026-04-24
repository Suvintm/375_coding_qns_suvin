//139) Write a program to find the area of a triangle.

package p375_suvin;

public class p139_area_triangle_overload {
    public static double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        System.out.println("Area of triangle (b=10, h=5): " + area(10, 5));
    }
}

//output
//Area of triangle (b=10, h=5): 25.0
