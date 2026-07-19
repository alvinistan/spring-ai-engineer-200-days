package code;

public class LambdaRunnable {
    static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Hello from lamda...");
        };
        runnable.run();
    }
}
