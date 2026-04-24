//150) Write a program to find the area of a regular polygon.

package p375_suvin;

public class p150_area_regular_polygon {
    public static double area(int sides, double length) {
        return (sides * length * length) / (4.0 * Math.tan(Math.PI / sides));
    }

    public static void main(String[] args) {
        System.out.println("Area of regular hexagon (side=6): " + String.format("%.2f", area(6, 6)));
    }
}

//output
//Area of regular hexagon (side=6): 93.53
