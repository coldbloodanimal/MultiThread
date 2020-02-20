package thread.study;

public class InterruptMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread();

        t.wait(1000);
       // t.interrupt();
        System.out.println(1);
    }
}
