//142) Write a program to find the volume of a sphere.

package p375_suvin;

public class p142_volume_sphere {
    public static double volume(double r) {
        return (4.0/3.0) * Math.PI * Math.pow(r, 3);
    }

    public static void main(String[] args) {
        System.out.println("Volume of sphere (r=3): " + String.format("%.2f", volume(3.0)));
    }
}

//output
//Volume of sphere (r=3): 113.10
