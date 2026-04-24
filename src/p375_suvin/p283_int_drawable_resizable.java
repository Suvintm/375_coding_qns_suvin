//283) Create interfaces "Drawable" and "Resizable" with methods "draw()" and "resize()". Implement them in a class representing a shape.

package p375_suvin;

interface Drawable {
    void draw();
}

interface Resizable {
    void resize();
}

class ShapeInt implements Drawable, Resizable {
    public void draw() { System.out.println("Drawing shape"); }
    public void resize() { System.out.println("Resizing shape"); }
}

public class p283_int_drawable_resizable {
    public static void main(String[] args) {
        System.out.println("Interfaces and Shape implementation created.");
    }
}

//output
//Interfaces and Shape implementation created.
