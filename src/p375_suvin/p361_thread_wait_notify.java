//361) Implement a program to demonstrate thread communication using wait() and notify() methods.

package p375_suvin;

class Chat {
    boolean flag = false;
    synchronized void question() {
        while(flag) try { wait(); } catch(Exception e) {}
        System.out.println("Question Asked");
        flag = true; notify();
    }
    synchronized void answer() {
        while(!flag) try { wait(); } catch(Exception e) {}
        System.out.println("Answer Given");
        flag = false; notify();
    }
}

public class p361_thread_wait_notify {
    public static void main(String[] args) {
        Chat c = new Chat();
        new Thread(() -> c.question()).start();
        new Thread(() -> c.answer()).start();
    }
}

//output
//Question Asked
//Answer Given
