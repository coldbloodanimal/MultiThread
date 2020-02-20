package thread.study;

public class HelloThread extends Thread{
    private String name;
    public HelloThread(String name){
        this.name=name;
    }

    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+":"+i);
        }
    }
    public static void main(String[] args) {
        HelloThread t1=new HelloThread("A");
        HelloThread t2=new HelloThread("B_____________");
        t1.start();
        t2.start();
    }
}
