//359) Implement a program to demonstrate thread priorities in Java.

package p375_suvin;

public class p359_thread_priorities_demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Running High Priority"));
        Thread t2 = new Thread(() -> System.out.println("Running Low Priority"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}

//output
//Running High Priority
//Running Low Priority
