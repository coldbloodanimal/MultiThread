package thread.excutor;

import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class RunnableThreadPoolExcuterDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(5,
        10,
         5000, SECONDS,
        new ArrayBlockingQueue<>(10), new ThreadPoolExecutor.CallerRunsPolicy());

        for(int i=0;i<10;i++){
            threadPoolExecutor.execute(new MyRunnable());
        }
        threadPoolExecutor.shutdown();

        System.out.println(threadPoolExecutor.isShutdown());
    }
}
