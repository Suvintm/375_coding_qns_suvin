//314) Write a program to demonstrate interface implementation by creating objects of the thread and task classes and invoking interface methods.

package p375_suvin;

public class p314_int_run_call_demo {
    public static void main(String[] args) {
        interface MyRunnable { void run(); }
        class MyThread implements MyRunnable { public void run() { System.out.println("Thread is running..."); } }
        
        MyThread t = new MyThread();
        t.run();
    }
}

//output
//Thread is running...
