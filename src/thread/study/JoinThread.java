package thread.study;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new BaseThread();
        t.start();
        t.join();
    }
}
