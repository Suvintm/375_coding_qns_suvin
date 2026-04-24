//362) Write a Java program to create multiple threads and use thread local variables. (Continuation)

package p375_suvin;

public class p362_thread_local_v2 {
    private static ThreadLocal<String> context = new ThreadLocal<>();
    public static void main(String[] args) {
        new Thread(() -> { context.set("Context-A"); System.out.println(context.get()); }).start();
        new Thread(() -> { context.set("Context-B"); System.out.println(context.get()); }).start();
    }
}

//output
//Context-A
//Context-B
