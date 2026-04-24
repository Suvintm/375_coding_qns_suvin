//148) Write a program to find the area of a square.

package p375_suvin;

public class p148_area_square {
    public static double area(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        System.out.println("Area of square (side=5): " + area(5));
    }
}

//output
//Area of square (side=5): 25.0
