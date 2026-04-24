//220) Write an abstract class "MusicPlayer" with abstract methods "play" and "stop". Implement it in subclasses "Mp3Player" and "SpotifyPlayer".

package p375_suvin;

abstract class MusicPlayer {
    abstract void play();
    abstract void stop();
}

class Spotify extends MusicPlayer {
    void play() { System.out.println("Streaming on Spotify"); }
    void stop() { System.out.println("Spotify stopped"); }
}

public class p220_abs_music_player {
    public static void main(String[] args) {
        MusicPlayer m = new Spotify();
        m.play();
        m.stop();
    }
}

//output
//Streaming on Spotify
//Spotify stopped
