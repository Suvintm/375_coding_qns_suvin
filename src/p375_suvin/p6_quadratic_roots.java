//6) Write a program to find the roots of a quadratic equation.

package p375_suvin;

public class p6_quadratic_roots {
    public static void main(String[] args) {
        double a = 1, b = -5, c = 6;
        double determinant = b * b - 4 * a * c;
        double r1 = (-b + Math.sqrt(determinant)) / (2 * a);
        double r2 = (-b - Math.sqrt(determinant)) / (2 * a);
        System.out.println("Root 1: " + r1);
        System.out.println("Root 2: " + r2);
    }
}

//output
//Root 1: 3.0
//Root 2: 2.0
