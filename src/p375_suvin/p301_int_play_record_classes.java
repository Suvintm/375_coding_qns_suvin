//301) Create interfaces "Playable" and "Recordable" with methods "play()" and "record()". Implement them in classes representing a music player and a recorder.

package p375_suvin;

interface Playable { void play(); }
interface Recordable { void record(); }

class Walkman implements Playable, Recordable {
    public void play() { System.out.println("Playing music..."); }
    public void record() { System.out.println("Recording audio..."); }
}

public class p301_int_play_record_classes {
    public static void main(String[] args) {
        System.out.println("Media interfaces implemented.");
    }
}

//output
//Media interfaces implemented.
