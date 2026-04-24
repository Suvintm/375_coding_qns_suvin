//191) Write a program to find the area of a parallelogram using a static method.

package p375_suvin;

public class p191_static_area_parallelogram {
    static double area(double b, double h) {
        return b * h;
    }

    public static void main(String[] args) {
        System.out.println("Area of parallelogram (10x7): " + area(10, 7));
    }
}

//output
//Area of parallelogram (10x7): 70.0
