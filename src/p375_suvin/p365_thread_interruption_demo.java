//365) Implement a program to demonstrate thread interruption in Java.

package p375_suvin;

public class p365_thread_interruption_demo {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()) {
                System.out.println("Working...");
            }
            System.out.println("Interrupted and Exiting...");
        });
        t.start();
        try { Thread.sleep(10); } catch (Exception e) {}
        t.interrupt();
    }
}

//output
//Working...
//Interrupted and Exiting...
