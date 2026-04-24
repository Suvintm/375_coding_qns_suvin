//138) Write a program to find the area of a circle.

package p375_suvin;

public class p138_area_circle_overload {
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("Area of circle (r=5): " + String.format("%.2f", area(5.0)));
    }
}

//output
//Area of circle (r=5): 78.54
