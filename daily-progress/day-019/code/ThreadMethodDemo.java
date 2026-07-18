package code;

public class ThreadMethodDemo {
    static void main(String[] args) {
        Thread thread = new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
        });
        thread.setName("Worker-1");
        thread.start();
    }
}
