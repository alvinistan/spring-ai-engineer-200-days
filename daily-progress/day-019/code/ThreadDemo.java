package code;

public class ThreadDemo extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("Thread is Running....");
    }

    static void main(String[] args) {
        ThreadDemo thread = new ThreadDemo();
        thread.run();
        thread.start();
    }
}
