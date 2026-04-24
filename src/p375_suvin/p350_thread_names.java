//350) Write a Java program to create multiple threads and display their names.

package p375_suvin;

public class p350_thread_names {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()), "Thread-Alpha");
        Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName()), "Thread-Beta");
        t1.start();
        t2.start();
    }
}

//output
//Thread-Alpha
//Thread-Beta
