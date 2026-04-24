//20) Write a program to find the area and perimeter of a circle.

package p375_suvin;

public class p20_circle_area_perimeter {
    public static void main(String[] args) {
        double r = 5;
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

//output
//Area: 78.53981633974483
//Perimeter: 31.41592653589793
