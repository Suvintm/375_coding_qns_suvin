//146) Write a program to find the area of a parallelogram.

package p375_suvin;

public class p146_area_parallelogram {
    public static double area(double base, double height) {
        return base * height;
    }

    public static void main(String[] args) {
        System.out.println("Area of parallelogram (b=10, h=5): " + area(10, 5));
    }
}

//output
//Area of parallelogram (b=10, h=5): 50.0
