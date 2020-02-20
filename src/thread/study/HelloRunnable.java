package thread.study;

public class HelloRunnable implements Runnable {
    private String name;
    public HelloRunnable(String name){
        this.name=name;
    }

    @Override
    public void run() {
        //数字小的时候，效果不明显
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+":"+i);
        }
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new HelloRunnable("C"));
        Thread t2=new Thread(new HelloRunnable("D_____________"));
        t1.start();
        t2.start();
    }
}
