//213) Write an abstract class "Game" with abstract methods "play" and "pause". Implement it in subclasses "Cricket" and "Football".

package p375_suvin;

abstract class Game {
    abstract void play();
    abstract void pause();
}

class Cricket extends Game {
    void play() { System.out.println("Playing Cricket"); }
    void pause() { System.out.println("Cricket match paused"); }
}

public class p213_abs_game {
    public static void main(String[] args) {
        Game g = new Cricket();
        g.play();
        g.pause();
    }
}

//output
//Playing Cricket
//Cricket match paused
