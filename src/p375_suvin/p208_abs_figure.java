//208) Write an abstract class "Figure" with abstract methods "draw" and "erase". Implement it in subclasses "Rectangle" and "Circle".

package p375_suvin;

abstract class Figure {
    abstract void draw();
    abstract void erase();
}

class RectFig extends Figure {
    void draw() { System.out.println("Drawing Rectangle"); }
    void erase() { System.out.println("Erasing Rectangle"); }
}

class CircFig extends Figure {
    void draw() { System.out.println("Drawing Circle"); }
    void erase() { System.out.println("Erasing Circle"); }
}

public class p208_abs_figure {
    public static void main(String[] args) {
        Figure f = new RectFig();
        f.draw();
        f.erase();
    }
}

//output
//Drawing Rectangle
//Erasing Rectangle
