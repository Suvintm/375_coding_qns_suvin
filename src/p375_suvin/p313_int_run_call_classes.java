//313) Create interfaces "Runnable" and "Callable" with methods "run()" and "call()". Implement them in classes representing a thread and a task.

package p375_suvin;

interface MyRunnable { void run(); }
interface MyCallable { String call(); }

class MyTask implements MyCallable {
    public String call() { return "Task Result"; }
}

public class p313_int_run_call_classes {
    public static void main(String[] args) {
        System.out.println("Runnable and Callable interfaces implemented.");
    }
}

//output
//Runnable and Callable interfaces implemented.
