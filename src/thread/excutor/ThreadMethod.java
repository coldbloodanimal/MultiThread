package thread.excutor;

public class ThreadMethod {
    public static void main(String[] args) {
        Thread thread1=new Thread(new MyRunnable());
        Thread thread2=new Thread(new MyRunnable());
        Thread thread3=new Thread(new MyRunnable());
        thread1.start();
        thread1.start();
        System.out.println("zz" +
                "");
        thread2.start();
        thread3.start();
    }
}
