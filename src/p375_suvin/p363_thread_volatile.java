//363) Implement a program to demonstrate thread communication using volatile keyword.

package p375_suvin;

public class p363_thread_volatile {
    private static volatile boolean running = true;
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while(running) {}
            System.out.println("Stopped!");
        }).start();
        Thread.sleep(100);
        running = false;
    }
}

//output
//Stopped!
