package code;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    static void main(String[] args) throws Exception{

        ExecutorService executer = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> 100;

        Future<Integer> future = executer.submit(task);

        System.out.println(future.get());
        executer.shutdownNow();

    }
}
