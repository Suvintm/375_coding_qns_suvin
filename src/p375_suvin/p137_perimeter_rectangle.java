//137) Write a program to calculate the perimeter of a rectangle.

package p375_suvin;

public class p137_perimeter_rectangle {
    public static double perimeter(double l, double w) {
        return 2 * (l + w);
    }

    public static void main(String[] args) {
        System.out.println("Perimeter of rectangle (10x5): " + perimeter(10, 5));
    }
}

//output
//Perimeter of rectangle (10x5): 30.0
