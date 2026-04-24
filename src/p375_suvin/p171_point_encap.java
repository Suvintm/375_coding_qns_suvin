//171) Create a class representing a point with private member variables (x, y) and public methods (getters and setters).

package p375_suvin;

class Point {
    private int x;
    private int y;

    public void setX(int x) { this.x = x; }
    public int getX() { return x; }
    public void setY(int y) { this.y = y; }
    public int getY() { return y; }
}

public class p171_point_encap {
    public static void main(String[] args) {
        Point p = new Point();
        p.setX(10);
        p.setY(20);
        System.out.println("Point Coordinates: (" + p.getX() + ", " + p.getY() + ")");
    }
}

//output
//Point Coordinates: (10, 20)
