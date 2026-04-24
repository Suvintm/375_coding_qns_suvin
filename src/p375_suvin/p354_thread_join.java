//354) Write a Java program to create multiple threads and join them.

package p375_suvin;

public class p354_thread_join {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> { try { Thread.sleep(100); } catch (Exception e) {} System.out.println("T1 Done"); });
        t1.start();
        t1.join();
        System.out.println("Main continues after T1");
    }
}

//output
//T1 Done
//Main continues after T1
