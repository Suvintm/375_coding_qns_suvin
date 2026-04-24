//178) Write a program to calculate the area of a circle using a static method.

package p375_suvin;

public class p178_static_area_circle {
    static double area(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("Area of circle (r=5): " + String.format("%.2f", area(5)));
    }
}

//output
//Area of circle (r=5): 78.54
