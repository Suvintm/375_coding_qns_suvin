//193) Write a program to find the area of a regular polygon using a static method.

package p375_suvin;

public class p193_static_area_regular_polygon {
    static double area(int n, double s) {
        return (n * s * s) / (4.0 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        System.out.println("Area of regular octagon (side=4): " + String.format("%.2f", area(8, 4)));
    }
}

//output
//Area of regular octagon (side=4): 77.25
