package code;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable Thread...");
    }

    static void main(String[] args) {
        Thread thread = new Thread(new RunnableDemo());
        thread.start();
    }

}
