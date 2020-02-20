package thread.excutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

import static java.util.concurrent.TimeUnit.SECONDS;

public class SingletonThreadPoolExcuter {
    private static volatile SingletonThreadPoolExcuter instance;
    private static ThreadPoolExecutor threadPoolExecutor;

    private ThreadPoolExecutor getThreadPoolExecutor() {
        return threadPoolExecutor;
    }

    private SingletonThreadPoolExcuter(){
        threadPoolExecutor=threadPoolExecutor=new ThreadPoolExecutor(5,
                10,
                5000, SECONDS,
                new ArrayBlockingQueue<>(10), new ThreadPoolExecutor.CallerRunsPolicy());

    }
    public static SingletonThreadPoolExcuter getInstance(){
        if(instance==null){
            synchronized (SingletonThreadPoolExcuter.class){
                if(instance==null){
                    instance=new SingletonThreadPoolExcuter();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonThreadPoolExcuter singletonThreadPoolExcuter=SingletonThreadPoolExcuter.getInstance();
    }

}
