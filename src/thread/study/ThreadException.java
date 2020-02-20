package thread.study;

public class ThreadException extends Thread {
    public static void main(String[] args) throws Exception {
        HelloThread t1=new HelloThread("A");
        Thread t2=new ThreadException();
        t1.start();
        t2.start();
        throw new Exception();
    }

    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
                throw new RuntimeException();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
