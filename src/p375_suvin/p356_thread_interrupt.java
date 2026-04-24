//356) Write a Java program to create multiple threads and interrupt them.

package p375_suvin;

public class p356_thread_interrupt {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try { Thread.sleep(5000); } catch (InterruptedException e) { System.out.println("Thread Interrupted!"); }
        });
        t.start();
        t.interrupt();
    }
}

//output
//Thread Interrupted!
