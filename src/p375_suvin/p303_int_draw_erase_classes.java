//303) Create interfaces "Drawable" and "Erasable" with methods "draw()" and "erase()". Implement them in classes representing a whiteboard and a chalkboard.

package p375_suvin;

interface DrawableV2 { void draw(); }
interface Erasable { void erase(); }

class Whiteboard implements DrawableV2, Erasable {
    public void draw() { System.out.println("Drawing on whiteboard..."); }
    public void erase() { System.out.println("Erasing whiteboard..."); }
}

public class p303_int_draw_erase_classes {
    public static void main(String[] args) {
        System.out.println("Board interfaces implemented.");
    }
}

//output
//Board interfaces implemented.
