//352) Write a Java program to create multiple threads and display their priorities.

package p375_suvin;

public class p352_thread_priorities_display {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {});
        Thread t2 = new Thread(() -> {});
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("T1 Priority: " + t1.getPriority());
        System.out.println("T2 Priority: " + t2.getPriority());
    }
}

//output
//T1 Priority: 10
//T2 Priority: 1
