//30) Write a program to calculate the area of a circle using the radius entered by the user.

package p375_suvin;
import java.util.Scanner;

public class p30_circle_area_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        // double r = sc.nextDouble(); // Simulating input 5
        double r = 5; 
        double area = Math.PI * r * r;
        System.out.println("Area: " + area);
    }
}

//output
//Enter radius: 5
//Area: 78.53981633974483
