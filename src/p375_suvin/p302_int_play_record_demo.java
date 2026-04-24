//302) Write a program to demonstrate interface implementation by creating objects of the music player and recorder classes and invoking interface methods.

package p375_suvin;

public class p302_int_play_record_demo {
    public static void main(String[] args) {
        interface Playable { void play(); }
        class MusicPlayer implements Playable { public void play() { System.out.println("Music playing..."); } }
        
        MusicPlayer m = new MusicPlayer();
        m.play();
    }
}

//output
//Music playing...
