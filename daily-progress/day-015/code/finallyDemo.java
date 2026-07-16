package code;

public class finallyDemo {
    static void main(String[] args) {
        try{
            System.out.println(10/2);
        } finally {
            System.out.println("Closing the resources...");
        }
    }
}
