package code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    static void main(String[] args) {
        ExecutorService executer = Executors.newFixedThreadPool(3);

        executer.execute(()->{
            System.out.println("Task 1");
        });

        executer.execute(()->{
            System.out.println("Task 2");
        });

        executer.execute(()->{
            System.out.println("Task 3");
        });

        executer.shutdown();
    }
}
