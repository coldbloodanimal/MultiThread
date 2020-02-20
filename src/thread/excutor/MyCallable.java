package thread.excutor;

import java.util.concurrent.Callable;

public class MyCallable<String> implements Callable {

    private String name;

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        return name;
    }
}
