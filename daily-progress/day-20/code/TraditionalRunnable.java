package code;

public class TraditionalRunnable {
    static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from Traditional Java");
            }
        };

        runnable.run();
    }
}
